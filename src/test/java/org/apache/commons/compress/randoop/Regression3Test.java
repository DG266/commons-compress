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
public class Regression3Test {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) 10);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray9);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel11 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) (byte) 120, byteArray4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.HIGH_DENSITY_NTREC;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder1 = builder0.tunedForCompressionRatio();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder3 = builder0.withMinBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder4 = builder3.tunedForSpeed();
        org.apache.commons.compress.compressors.lz77support.Parameters parameters5 = builder4.build();
        int int6 = parameters5.getNiceBackReferenceLength();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(parameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8191 + "'", int6 == 8191);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "bzip2");
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream7 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream6);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream7.write(byteArray9);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream11 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream7);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters12 = null;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream13 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream7, parameters12);
        framedSnappyCompressorOutputStream13.finish();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        boolean boolean18 = tarArchiveEntry17.isGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = tarArchiveEntry17.getExtraPaxHeaders();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil21 = new org.apache.commons.compress.compressors.FileNameUtil(strMap19, "0x5455 Zip Extra Field: Flags=0 ");
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream22 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) framedSnappyCompressorOutputStream13, strMap19);
        long long23 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream2, (long) 255, (java.io.OutputStream) framedSnappyCompressorOutputStream13);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry3.setStatusChangeTime(fileTime4);
        tarArchiveEntry3.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean12 = tarArchiveEntry3.equals(tarArchiveEntry11);
        boolean boolean13 = tarArchiveEntry3.isPaxHeader();
        boolean boolean14 = tarArchiveEntry3.isStreamContiguous();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature0 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.SPLITTING;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit3 = null;
        zipArchiveEntry2.setGeneralPurposeBit(generalPurposeBit3);
        zipArchiveEntry2.setComment("apks");
        boolean boolean7 = zipArchiveEntry2.isDirectory();
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException8 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature0, zipArchiveEntry2);
        org.junit.Assert.assertNotNull(feature0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.compress.archivers.Lister lister0 = new org.apache.commons.compress.archivers.Lister();
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("bzip2");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> strMap2 = compressorStreamFactory1.getCompressorInputStreamProviders();
        java.util.Set<java.lang.String> strSet3 = compressorStreamFactory1.getOutputStreamCompressorNames();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> strMap4 = compressorStreamFactory1.getCompressorInputStreamProviders();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream2, 508, 31);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters6 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) zstdCompressorInputStream2, deflateParameters6);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) deflateCompressorInputStream7);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        long long3 = zstdCompressorInputStream2.getCompressedCount();
        java.lang.String str4 = zstdCompressorInputStream2.toString();
        org.apache.commons.compress.utils.CountingInputStream countingInputStream5 = new org.apache.commons.compress.utils.CountingInputStream((java.io.InputStream) zstdCompressorInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream6 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) zstdCompressorInputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "bzip2");
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, 263);
        int int7 = tarArchiveInputStream6.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream8 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) tarArchiveInputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        int int2 = org.apache.commons.compress.utils.ExactMath.add((int) (byte) 48, (long) 16877);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16925 + "'", int2 == 16925);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) checksumCalculatingInputStream20, "bzip2", false);
        long long24 = checksumCalculatingInputStream20.getValue();
        long long26 = checksumCalculatingInputStream20.skip(29127L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 46947589L + "'", long24 == 46947589L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        closeShieldFilterInputStream1.close();
        org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier inputStreamByteSupplier3 = new org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) closeShieldFilterInputStream1, 128, "pack.field.attribute.");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream9 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream((java.io.InputStream) tarArchiveInputStream7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory1 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory2 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream4 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream3);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream4.write(byteArray6);
        x0016_CertificateIdForCentralDirectory2.setCentralDirectoryData(byteArray6);
        x0016_CertificateIdForCentralDirectory1.parseFromLocalFileData(byteArray6, 2, (int) (short) 100);
        long long12 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("error.gz");
        boolean boolean16 = zipEncoding14.canEncode("");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader17 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        x0017_StrongEncryptionHeader17.setCentralDirectoryData(byteArray19);
        byte[] byteArray21 = x0017_StrongEncryptionHeader17.getLocalFileDataData();
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean27 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray25, (int) (short) 10);
        x0017_StrongEncryptionHeader17.setCentralDirectoryData(byteArray25);
        java.lang.String str29 = zipEncoding14.decode(byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry32 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(strMap0, byteArray6, zipEncoding14, false, (long) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2162688L + "'", long12 == 2162688L);
        org.junit.Assert.assertNotNull(zipEncoding14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000\000\n" + "'", str29, "\000\000\n");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry3.setStatusChangeTime(fileTime4);
        tarArchiveEntry3.setUserName("unpack.progress");
        tarArchiveEntry3.setUserId((long) 29127);
        tarArchiveEntry3.setMode(263);
        tarArchiveEntry3.setUserName("error.gz");
        tarArchiveEntry3.setUserId((int) (short) 100);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.io.File file0 = null;
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.utils.IOUtils.copy(file0, (java.io.OutputStream) zipArchiveOutputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = jarMarker0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(zipShort1);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = extraFieldParsingMode0.onUnparseableExtraField(byteArray3, (int) (short) 0, 84446, true, 16877);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray3, (int) (byte) 4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse12 = org.apache.commons.compress.archivers.tar.TarUtils.parseSparse(byteArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT + "'", extraFieldParsingMode0.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT));
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNull(zipExtraField8);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory10 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream12 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream11);
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream12.write(byteArray14);
        x0016_CertificateIdForCentralDirectory10.setCentralDirectoryData(byteArray14);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = x0016_CertificateIdForCentralDirectory10.getCentralDirectoryLength();
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean23 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray21, (int) (short) 10);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, byteArray26);
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray21);
        boolean boolean30 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray21, (int) (short) 100);
        x0016_CertificateIdForCentralDirectory10.setLocalFileDataData(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = brotliCompressorInputStream9.read(byteArray21, (int) (byte) 50, (int) (byte) 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Buffer overflow: 98 > 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.nio.file.attribute.FileTime fileTime4 = x5455_ExtendedTimestamp0.getCreateFileTime();
        java.nio.file.attribute.FileTime fileTime5 = x5455_ExtendedTimestamp0.getCreateFileTime();
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNull(fileTime5);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "bzip2");
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, 263);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) deflateCompressorInputStream7, (int) (byte) 48, "pack.effort");
        tarArchiveInputStream10.mark(14);
        tarArchiveInputStream10.reset();
        boolean boolean14 = tarArchiveInputStream10.markSupported();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED;
        int int1 = zipMethod0.getCode();
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong2);
        boolean boolean4 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.util.Date date5 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipLong2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap1 = archiveStreamFactory0.getArchiveInputStreamProviders();
        java.util.Set<java.lang.String> strSet2 = archiveStreamFactory0.getInputStreamArchiveNames();
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        boolean boolean21 = sevenZArchiveEntry14.getHasWindowsAttributes();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream framedLZ4CompressorOutputStream24 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
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
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        java.io.InputStream inputStream37 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream38 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream37);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream39 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream37);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream39, 508, 31);
        long long43 = zstdCompressorInputStream39.getCompressedCount();
        java.nio.file.Path path44 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer45 = org.apache.commons.compress.archivers.examples.CloseableConsumer.CLOSING_CONSUMER;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("zip", (java.io.InputStream) zstdCompressorInputStream39, path44, closeableConsumer45);
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
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(closeableConsumer45);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        short short0 = org.apache.commons.compress.archivers.cpio.CpioConstants.FORMAT_OLD_ASCII;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 4 + "'", short0 == (short) 4);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getDeflate();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "deflate" + "'", str0, "deflate");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream2, 508, 31);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters6 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) zstdCompressorInputStream2, deflateParameters6);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData8 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = unparseableExtraFieldData8.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = unparseableExtraFieldData8.getHeaderId();
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean16 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray14, (int) (short) 10);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray14, byteArray19);
        boolean boolean22 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray19, (int) (byte) 0);
        unparseableExtraFieldData8.parseFromLocalFileData(byteArray19, (int) (byte) 0, 26128);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = deflateCompressorInputStream7.read(byteArray19, 32, 40960);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.STORED;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.STORED + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.STORED));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.utils.SkipShieldingInputStream skipShieldingInputStream11 = new org.apache.commons.compress.utils.SkipShieldingInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream deflate64CompressorInputStream12 = new org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = zipArchiveInputStream8.getNextZipEntry();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry13);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        int int3 = sevenZArchiveEntry0.getWindowsAttributes();
        boolean boolean4 = sevenZArchiveEntry0.isAntiItem();
        boolean boolean5 = sevenZArchiveEntry0.isAntiItem();
        sevenZArchiveEntry0.setCreationDate((long) 131);
        sevenZArchiveEntry0.setDirectory(true);
        long long10 = sevenZArchiveEntry0.getCrcValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
            xZCompressorOutputStream10.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        arArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode9 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray11);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = extraFieldParsingMode9.onUnparseableExtraField(byteArray12, (int) (short) 0, 84446, true, 16877);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray12, 121);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField20 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("ZipShort value: 14", byteArray12);
        arArchiveOutputStream6.write(byteArray12, 9, 1024);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream25 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream6, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode9 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT + "'", extraFieldParsingMode9.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNull(zipExtraField17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream6 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters7 = null;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream8 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2, parameters7);
        java.lang.String str9 = zstdCompressorOutputStream2.toString();
        closeableConsumer0.accept((java.io.Closeable) zstdCompressorOutputStream2);
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference backReference2 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference((-1), 504);
        int int3 = backReference2.getLength();
        int int4 = backReference2.getOffset();
        int int5 = backReference2.getOffset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 504 + "'", int3 == 504);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean9 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray7, (int) (short) 100);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray7, 511);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("cpio.gz", byteArray7);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = unicodeCommentExtraField12.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = unicodeCommentExtraField12.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(zipShort14);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = jarMarker0.getCentralDirectoryLength();
        byte[] byteArray2 = jarMarker0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = jarMarker0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = jarMarker0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = jarMarker0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipShort5);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        zipArchiveEntry1.setMethod((int) (byte) 88);
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest zipArchiveEntryRequest5 = org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry1, inputStreamSupplier4);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource6 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT;
        zipArchiveEntry1.setCommentSource(commentSource6);
        org.junit.Assert.assertNotNull(zipArchiveEntryRequest5);
        org.junit.Assert.assertTrue("'" + commentSource6 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT + "'", commentSource6.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT));
    }

//    @Test
//    public void test1543() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1543");
//        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
//        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
//        java.lang.String str2 = x5455_ExtendedTimestamp1.toString();
//        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = x5455_ExtendedTimestamp1.getCreateTime();
//        java.io.OutputStream outputStream4 = null;
//        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream5 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream4);
//        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
//        zstdCompressorOutputStream5.write(byteArray7);
//        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream5);
//        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream5);
//        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
//        boolean boolean16 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray14, (int) (short) 10);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0 };
//        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray14, byteArray19);
//        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray14);
//        zipArchiveOutputStream10.writePreamble(byteArray21);
//        zipArchiveOutputStream10.finish();
//        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
//        cpioArchiveEntry25.setInode((long) 2048);
//        java.util.Date date28 = cpioArchiveEntry25.getLastModifiedDate();
//        cpioArchiveEntry25.setChksum(0L);
//        boolean boolean31 = zipArchiveOutputStream10.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry25);
//        boolean boolean32 = x5455_ExtendedTimestamp1.equals((java.lang.Object) boolean31);
//        org.apache.commons.compress.archivers.zip.ZipLong zipLong33 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
//        int int34 = zipLong33.getIntValue();
//        x5455_ExtendedTimestamp1.setCreateTime(zipLong33);
//        java.io.OutputStream outputStream36 = null;
//        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream37 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream36);
//        byte[] byteArray39 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
//        zstdCompressorOutputStream37.write(byteArray39);
//        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream41 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream37);
//        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream42 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream37);
//        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy43 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
//        zipArchiveOutputStream42.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy43);
//        java.io.OutputStream outputStream45 = null;
//        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream46 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream45);
//        byte[] byteArray48 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
//        zstdCompressorOutputStream46.write(byteArray48);
//        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream50 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream46);
//        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream51 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream46);
//        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
//        boolean boolean57 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray55, (int) (short) 10);
//        byte[] byteArray60 = new byte[] { (byte) 0, (byte) 0 };
//        boolean boolean61 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray55, byteArray60);
//        byte[] byteArray62 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray55);
//        zipArchiveOutputStream51.writePreamble(byteArray62);
//        zipArchiveOutputStream51.setMethod((int) (short) 1);
//        java.io.OutputStream outputStream66 = null;
//        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream67 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream66);
//        byte[] byteArray69 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
//        zstdCompressorOutputStream67.write(byteArray69);
//        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream71 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream67);
//        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream72 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream67);
//        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy73 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
//        zipArchiveOutputStream72.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy73);
//        zipArchiveOutputStream51.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy73);
//        zipArchiveOutputStream42.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy73);
//        byte[] byteArray80 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
//        boolean boolean82 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray80, (int) (short) 10);
//        byte[] byteArray85 = new byte[] { (byte) 0, (byte) 0 };
//        boolean boolean86 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray80, byteArray85);
//        byte[] byteArray87 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray80);
//        zipArchiveOutputStream42.writePreamble(byteArray80);
//        // The following exception was thrown during execution in test generation
//        try {
//            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField92 = extraFieldParsingMode0.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp1, byteArray80, 6, 5, true);
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
//        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
//        org.junit.Assert.assertNull(zipLong3);
//        org.junit.Assert.assertNotNull(byteArray7);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 0, 0]");
//        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0]");
//        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
//        org.junit.Assert.assertNotNull(byteArray21);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 0, 0]");
//        org.junit.Assert.assertNotNull(date28);
//        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 01:00:00 CET 1970");
//        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
//        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
//        org.junit.Assert.assertNotNull(zipLong33);
//        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 134695760 + "'", int34 == 134695760);
//        org.junit.Assert.assertNotNull(byteArray39);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 0, 33, 0]");
//        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy43);
//        org.junit.Assert.assertNotNull(byteArray48);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 0, 33, 0]");
//        org.junit.Assert.assertNotNull(byteArray55);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[10, 0, 0]");
//        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
//        org.junit.Assert.assertNotNull(byteArray60);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0, 0]");
//        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
//        org.junit.Assert.assertNotNull(byteArray62);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[10, 0, 0]");
//        org.junit.Assert.assertNotNull(byteArray69);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[0, 0, 33, 0]");
//        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy73);
//        org.junit.Assert.assertNotNull(byteArray80);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[10, 0, 0]");
//        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
//        org.junit.Assert.assertNotNull(byteArray85);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[0, 0]");
//        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
//        org.junit.Assert.assertNotNull(byteArray87);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[10, 0, 0]");
//    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        int int1 = dumpArchiveEntry0.getGroupId();
        boolean boolean2 = dumpArchiveEntry0.isBlkDev();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE3 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FILE;
        dumpArchiveEntry0.setType(tYPE3);
        dumpArchiveEntry0.setUserId(36864);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + tYPE3 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FILE + "'", tYPE3.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FILE));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("!<arch>\n");
        java.security.cert.Certificate[] certificateArray2 = jarArchiveEntry1.getCertificates();
        int int3 = jarArchiveEntry1.getMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource4 = jarArchiveEntry1.getNameSource();
        org.junit.Assert.assertNull(certificateArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + nameSource4 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME + "'", nameSource4.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("dump", (long) 155);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = zipArchiveInputStream8.getNextZipEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = zipArchiveInputStream8.getNextEntry();
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream13 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream8, pack200Strategy12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry10);
        org.junit.Assert.assertNull(archiveEntry11);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        boolean boolean3 = tarArchiveEntry2.isGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = tarArchiveEntry2.getExtraPaxHeaders();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil6 = new org.apache.commons.compress.compressors.FileNameUtil(strMap4, "0x5455 Zip Extra Field: Flags=0 ");
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil8 = new org.apache.commons.compress.compressors.FileNameUtil(strMap4, "ZipEightByteInteger value: 0");
        java.lang.String str10 = fileNameUtil8.getCompressedFilename("tar\000.gz");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "tar\000.gzZipEightByteInteger value: 0" + "'", str10, "tar\000.gzZipEightByteInteger value: 0");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream6, "pack.field.attribute.");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = tarArchiveInputStream9.getCurrentEntry();
        tarArchiveInputStream9.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = tarArchiveInputStream9.getCurrentEntry();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry10);
        org.junit.Assert.assertNull(tarArchiveEntry12);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray4 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray4);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel5);
        org.apache.commons.compress.archivers.tar.TarFile tarFile7 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel5);
        org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream8 = new org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream((long) (byte) 49, (long) 256, seekableByteChannel5);
        org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream9 = new org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream((long) 32, (long) (short) 12, seekableByteChannel5);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream12, 10);
        long long16 = cpioArchiveInputStream14.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream19 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = jarArchiveInputStream18.getNextEntry();
        byte[] byteArray21 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) jarArchiveInputStream18);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField22 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray21);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField23 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("pack.effort", byteArray21);
        byte[] byteArray24 = unicodeCommentExtraField23.getUnicodeName();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = boundedSeekableByteChannelInputStream9.read(byteArray24, (int) '#', 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: offset or len are out of bounds");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray4);
        org.junit.Assert.assertNotNull(seekableByteChannel5);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(archiveEntry20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[112, 97, 99, 107, 46, 101, 102, 102, 111, 114, 116]");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) gzipCompressorOutputStream5);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize7 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.K256;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters11 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize7, true, false, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream framedLZ4CompressorOutputStream12 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, parameters11);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current CPIO entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + blockSize7 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.K256 + "'", blockSize7.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.K256));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4;
        org.apache.commons.compress.compressors.lz77support.Parameters parameters1 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters2 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, parameters1);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters3 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters4 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, parameters3);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters5 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters9 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters10 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, false, false, true, parameters9);
        java.lang.String str11 = parameters10.toString();
        org.junit.Assert.assertTrue("'" + blockSize0 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4 + "'", blockSize0.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LZ4 Parameters with BlockSize M4, withContentChecksum false, withBlockChecksum false, withBlockDependency true" + "'", str11, "LZ4 Parameters with BlockSize M4, withContentChecksum false, withBlockChecksum false, withBlockDependency true");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
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
        org.junit.Assert.assertNotNull(zipShort21);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 1, false);
        boolean boolean3 = resourceAlignmentExtraField2.allowMethodChange();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = resourceAlignmentExtraField2.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = resourceAlignmentExtraField2.getLocalFileDataLength();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipShort5);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.io.DataInput dataInput0 = null;
        long long2 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(dataInput0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream5 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) cpioArchiveInputStream2);
        int int6 = brotliCompressorInputStream5.getCount();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        zip64ExtendedInformationExtraField11.setSize(zipEightByteInteger12);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = zip64ExtendedInformationExtraField11.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(zipLong3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 75, 48, 48]");
        org.junit.Assert.assertNull(zipEightByteInteger6);
        org.junit.Assert.assertNotNull(zipEightByteInteger7);
        org.junit.Assert.assertNotNull(zipEightByteInteger12);
        org.junit.Assert.assertNotNull(zipShort14);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.nio.file.Path path1 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier2 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path1);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore3 = defaultBackingStoreSupplier2.get();
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator4 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier2);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore3);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean30 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray28, (int) (short) 100);
        boolean boolean32 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray28, (int) (byte) 0);
        zipArchiveOutputStream6.writePreamble(byteArray28);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong34 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray28);
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
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "bzip2");
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, 263);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream6);
        org.apache.commons.compress.utils.SkipShieldingInputStream skipShieldingInputStream8 = new org.apache.commons.compress.utils.SkipShieldingInputStream((java.io.InputStream) tarArchiveInputStream6);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = skipShieldingInputStream8.skip((long) (byte) 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        boolean boolean6 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray3, (int) (byte) -1);
        boolean boolean8 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray3, 26370);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = null;
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit2);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData4 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory5 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream7 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream6);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream7.write(byteArray9);
        x0016_CertificateIdForCentralDirectory5.setCentralDirectoryData(byteArray9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x0016_CertificateIdForCentralDirectory5.getCentralDirectoryLength();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean18 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray16, (int) (short) 10);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray16, byteArray21);
        byte[] byteArray23 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray16);
        boolean boolean25 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray16, (int) (short) 100);
        x0016_CertificateIdForCentralDirectory5.setLocalFileDataData(byteArray16);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray16);
        org.junit.Assert.assertNull(unparseableExtraFieldData4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong0 = org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG;
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean2 = zipLong0.equals((java.lang.Object) compressorStreamFactory1);
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream4);
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream8 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) cpioArchiveInputStream5, (long) (byte) 100, (int) (short) 3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream10 = compressorStreamFactory1.createCompressorInputStream("", (java.io.InputStream) cpioArchiveInputStream5, true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.compressors.CompressorException; message: Compressor:  not found.");
        } catch (org.apache.commons.compress.compressors.CompressorException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream4 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) cpioArchiveInputStream1, (long) (byte) 100, (int) (short) 3);
        long long6 = cRC32VerifyingInputStream4.skip(0L);
        long long8 = cRC32VerifyingInputStream4.skip((long) (byte) 100);
        long long9 = cRC32VerifyingInputStream4.getBytesRemaining();
        long long11 = org.apache.commons.compress.utils.IOUtils.skip((java.io.InputStream) cRC32VerifyingInputStream4, (long) 16384);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        byte[] byteArray2 = zipArchiveEntry1.getExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        long long4 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = zipArchiveEntry1.getExtraFields(false);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = zipArchiveEntry1.getExtraFields(false);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        gzipParameters17.setModificationTime((long) 'a');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(compressorOutputStream16);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        long long2 = cpioArchiveEntry1.getGID();
        long long3 = cpioArchiveEntry1.getUID();
        cpioArchiveEntry1.setRemoteDeviceMin((long) (byte) 77);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        byte[] byteArray1 = x7875_NewUnix0.getCentralDirectoryData();
        x7875_NewUnix0.setUID(116444736000000000L);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream18 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream((java.io.InputStream) checksumCalculatingInputStream17);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0015_CertificateIdForFile0.getHashAlgorithm();
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray5, (int) (short) 10);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray10);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray5);
        boolean boolean14 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray5, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            x0015_CertificateIdForFile0.parseFromCentralDirectoryData(byteArray5, 60011, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

//    @Test
//    public void test1571() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1571");
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        java.nio.file.attribute.FileTime fileTime14 = null;
//        tarArchiveEntry13.setStatusChangeTime(fileTime14);
//        tarArchiveEntry13.setUserName("unpack.progress");
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry21 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        boolean boolean22 = tarArchiveEntry13.equals(tarArchiveEntry21);
//        java.nio.file.attribute.FileTime fileTime24 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
//        tarArchiveEntry21.setLastModifiedTime(fileTime24);
//        tarArchiveEntry8.setLastAccessTime(fileTime24);
//        java.util.Date date28 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToDate((long) 5);
//        java.nio.file.attribute.FileTime fileTime29 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date28);
//        tarArchiveEntry8.setModTime(fileTime29);
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry34 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        java.nio.file.attribute.FileTime fileTime35 = null;
//        tarArchiveEntry34.setStatusChangeTime(fileTime35);
//        tarArchiveEntry34.setUserName("unpack.progress");
//        tarArchiveEntry34.setUserId((long) 29127);
//        tarArchiveEntry34.setMode(263);
//        tarArchiveEntry34.setUserName("error.gz");
//        boolean boolean45 = tarArchiveEntry34.isGlobalPaxHeader();
//        java.nio.file.attribute.FileTime fileTime46 = tarArchiveEntry34.getLastModifiedTime();
//        tarArchiveEntry8.setLastModifiedTime(fileTime46);
//        java.nio.file.attribute.FileTime fileTime48 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            tarArchiveEntry8.setModTime(fileTime48);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Time must not be null");
//        } catch (java.lang.NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
//        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
//        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
//        org.junit.Assert.assertNotNull(fileTime24);
//        org.junit.Assert.assertNotNull(date28);
//        org.junit.Assert.assertEquals(date28.toString(), "Mon Jan 01 01:00:00 CET 1601");
//        org.junit.Assert.assertNotNull(fileTime29);
//        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
//        org.junit.Assert.assertNotNull(fileTime46);
//    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        tarArchiveEntry8.setUserName("keep");
        long long12 = tarArchiveEntry8.getLongUserId();
        tarArchiveEntry8.setUserId((long) 464);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

//    @Test
//    public void test1573() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1573");
//        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
//        sevenZArchiveEntry0.setHasLastModifiedDate(false);
//        sevenZArchiveEntry0.setCreationDate((long) 61440);
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        boolean boolean9 = tarArchiveEntry8.isPaxGNU1XSparse();
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        boolean boolean14 = tarArchiveEntry8.equals(tarArchiveEntry13);
//        tarArchiveEntry13.setUserName("keep");
//        java.lang.String str17 = tarArchiveEntry13.getLinkName();
//        java.nio.file.attribute.FileTime fileTime19 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
//        java.nio.file.attribute.FileTime fileTime20 = org.apache.commons.compress.utils.TimeUtils.truncateToHundredNanos(fileTime19);
//        long long21 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(fileTime20);
//        tarArchiveEntry13.setStatusChangeTime(fileTime20);
//        sevenZArchiveEntry0.setCreationTime(fileTime20);
//        sevenZArchiveEntry0.setHasCrc(true);
//        boolean boolean26 = sevenZArchiveEntry0.getHasCrc();
//        java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> wildcardIterable27 = sevenZArchiveEntry0.getContentMethods();
//        java.util.Date date29 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToDate((long) 5);
//        java.nio.file.attribute.FileTime fileTime30 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date29);
//        sevenZArchiveEntry0.setAccessTime(fileTime30);
//        java.nio.file.attribute.FileTime fileTime32 = sevenZArchiveEntry0.getCreationTime();
//        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
//        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
//        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
//        org.junit.Assert.assertNotNull(fileTime19);
//        org.junit.Assert.assertNotNull(fileTime20);
//        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 116444741040000000L + "'", long21 == 116444741040000000L);
//        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
//        org.junit.Assert.assertNull(wildcardIterable27);
//        org.junit.Assert.assertNotNull(date29);
//        org.junit.Assert.assertEquals(date29.toString(), "Mon Jan 01 01:00:00 CET 1601");
//        org.junit.Assert.assertNotNull(fileTime30);
//        org.junit.Assert.assertNotNull(fileTime32);
//    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = x5455_ExtendedTimestamp0.getAccessTime();
        java.nio.file.attribute.FileTime fileTime4 = x5455_ExtendedTimestamp0.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod5 = org.apache.commons.compress.archivers.zip.ZipMethod.BZIP2;
        int int6 = zipMethod5.getCode();
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) int6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getHeaderId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNull(zipLong3);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertTrue("'" + zipMethod5 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.BZIP2 + "'", zipMethod5.equals(org.apache.commons.compress.archivers.zip.ZipMethod.BZIP2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipShort8);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IRGRP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        x5455_ExtendedTimestamp0.setFlags((byte) 52);
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(fileTime16);
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.utils.IOUtils.closeQuietly((java.io.Closeable) skipShieldingInputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(archiveEntry11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = org.apache.commons.compress.archivers.zip.ZipLong.AED_SIG;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNotNull(zipLong3);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        long long12 = jarArchiveOutputStream9.getBytesWritten();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream9.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel();
        seekableInMemoryByteChannel0.close();
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
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile((java.nio.channels.SeekableByteChannel) seekableInMemoryByteChannel0, charArray9, sevenZFileOptions11);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
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
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        sevenZArchiveEntry0.setHasStream(false);
        boolean boolean5 = sevenZArchiveEntry0.getHasLastModifiedDate();
        sevenZArchiveEntry0.setHasStream(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, "pass");
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream7, "pack.pass.file.");
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = jarArchiveOutputStream7.createArchiveEntry(file11, "pack.modification.time");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.compress.archivers.StreamingNotSupportedException streamingNotSupportedException1 = new org.apache.commons.compress.archivers.StreamingNotSupportedException("apkm");
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException2 = new org.apache.commons.compress.archivers.dump.DumpArchiveException((java.lang.Throwable) streamingNotSupportedException1);
        java.lang.String str3 = streamingNotSupportedException1.getFormat();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "apkm" + "'", str3, "apkm");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        java.lang.Object obj2 = asiExtraField0.clone();
        int int3 = asiExtraField0.getGroupId();
        asiExtraField0.setGroupId(53);
        boolean boolean6 = asiExtraField0.isLink();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.lang.String str1 = org.apache.commons.compress.compressors.xz.XZUtils.getUncompressedFilename(".gz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".gz" + "'", str1, ".gz");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.LZMA;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.LZMA + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.LZMA));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.compress.archivers.zip.X0014_X509Certificates x0014_X509Certificates0 = new org.apache.commons.compress.archivers.zip.X0014_X509Certificates();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        byte[] byteArray2 = zipLong1.getBytes();
        byte[] byteArray3 = zipLong1.getBytes();
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel4 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) x0014_X509Certificates0, byteArray3, 2097655, 0, false);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type 14");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipLong1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[80, 75, 48, 48]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[80, 75, 48, 48]");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters6 = null;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream7 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, parameters6);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer8 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) framedSnappyCompressorOutputStream7);
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
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel();
        seekableInMemoryByteChannel0.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile6 = new org.apache.commons.compress.archivers.zip.ZipFile((java.nio.channels.SeekableByteChannel) seekableInMemoryByteChannel0, "", "070701", true, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Error on ZipFile ");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory1 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream3 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream2);
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream3.write(byteArray5);
        x0016_CertificateIdForCentralDirectory1.setCentralDirectoryData(byteArray5);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 4095);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock literalBlock12 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock(byteArray5, (int) (short) 100, 1);
        boolean boolean14 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray5, (int) (byte) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("z", byteArray5, 2097655, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField1 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) ' ');
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.CTIMELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.compress.archivers.sevenz.CLI cLI0 = new org.apache.commons.compress.archivers.sevenz.CLI();
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream6, "pack.field.attribute.");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = tarArchiveInputStream9.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = tarArchiveInputStream9.getCurrentEntry();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tarArchiveInputStream9.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry10);
        org.junit.Assert.assertNull(tarArchiveEntry11);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        boolean boolean3 = tarArchiveEntry2.isFIFO();
        java.lang.String str4 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setNames("apk", "never");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        boolean boolean24 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.matches(byteArray19, (int) (short) 3);
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
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = zipArchiveInputStream8.getNextZipEntry();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry10);
        org.junit.Assert.assertNull(zipArchiveEntry14);
        org.junit.Assert.assertNull(zipArchiveEntry15);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray1 = org.apache.commons.compress.utils.IOUtils.EMPTY_LINK_OPTIONS;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(path0, (java.nio.file.OpenOption[]) linkOptionArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray1);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream29 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream28);
        byte[] byteArray31 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream29.write(byteArray31);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream33 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream29);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream29);
        byte[] byteArray38 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean40 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray38, (int) (short) 10);
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean44 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray38, byteArray43);
        byte[] byteArray45 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray38);
        zipArchiveOutputStream34.writePreamble(byteArray45);
        zipArchiveOutputStream34.finish();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy48 = null;
        zipArchiveOutputStream34.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy48);
        zipArchiveOutputStream34.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode53 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
        byte[] byteArray55 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        byte[] byteArray56 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray55);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField61 = extraFieldParsingMode53.onUnparseableExtraField(byteArray56, (int) (short) 0, 84446, true, 16877);
        boolean boolean63 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray56, 121);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField64 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("ZipShort value: 14", byteArray56);
        zipArchiveOutputStream34.writePreamble(byteArray56, (int) (byte) 88, (int) (byte) 77);
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory68 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream69 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream70 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream69);
        byte[] byteArray72 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream70.write(byteArray72);
        x0016_CertificateIdForCentralDirectory68.setCentralDirectoryData(byteArray72);
        boolean boolean76 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray72, 4095);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock literalBlock79 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock(byteArray72, (int) (short) 100, 1);
        boolean boolean81 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray56, byteArray72, false);
        int int82 = pack200CompressorInputStream27.read(byteArray56);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(pack200Strategy11);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode53 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT + "'", extraFieldParsingMode53.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT));
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[80, 75, 5, 6, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[80, 75, 5, 6, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(zipExtraField61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 8 + "'", int82 == 8);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        int int1 = dumpArchiveEntry0.getGroupId();
        boolean boolean2 = dumpArchiveEntry0.isBlkDev();
        dumpArchiveEntry0.setSize((long) 16877);
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE5 = dumpArchiveEntry0.getHeaderType();
        long long6 = dumpArchiveEntry0.getSize();
        dumpArchiveEntry0.setMode(128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(sEGMENT_TYPE5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 16877L + "'", long6 == 16877L);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = new org.apache.commons.compress.archivers.zip.ZipShort((int) (byte) 75);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField1 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray2 = asiExtraField1.getLocalFileDataData();
        boolean boolean4 = org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.matches(byteArray2, 121);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField5 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("\000\000!\000.gz", byteArray2);
        long long6 = unicodeCommentExtraField5.getNameCRC32();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2747386400L + "'", long6 == 2747386400L);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray2 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray2);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray4 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray4);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel5);
        org.apache.commons.compress.archivers.tar.TarFile tarFile7 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel5);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray14, (int) (short) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray14, (int) (byte) 0);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel19 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray14);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray20 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel21 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray20);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray22 = new java.nio.channels.SeekableByteChannel[] { seekableByteChannel1, seekableByteChannel3, seekableByteChannel5, seekableInMemoryByteChannel19, seekableByteChannel21 };
        java.nio.channels.SeekableByteChannel seekableByteChannel23 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray22);
        java.nio.channels.SeekableByteChannel seekableByteChannel24 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel25 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray22);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The first ZIP split segment does not begin with split ZIP file signature");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(seekableByteChannelArray2);
        org.junit.Assert.assertNotNull(seekableByteChannel3);
        org.junit.Assert.assertNotNull(seekableByteChannelArray4);
        org.junit.Assert.assertNotNull(seekableByteChannel5);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(seekableByteChannelArray20);
        org.junit.Assert.assertNotNull(seekableByteChannel21);
        org.junit.Assert.assertNotNull(seekableByteChannelArray22);
        org.junit.Assert.assertNotNull(seekableByteChannel23);
        org.junit.Assert.assertNotNull(seekableByteChannel24);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder2 = builder0.withMaxOffset(155);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters6 = null;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream7 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, parameters6);
        zstdCompressorOutputStream1.write(256);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean15 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray13, (int) (short) 10);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, byteArray18);
        zstdCompressorOutputStream1.write(byteArray13, (int) '4', 16384);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        int int0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ_KEY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean18 = tarArchiveEntry17.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean23 = tarArchiveEntry17.equals(tarArchiveEntry22);
        tarArchiveEntry22.setUserName("keep");
        long long26 = tarArchiveEntry22.getLongUserId();
        tarArchiveEntry22.setNames("cpio", "lz4-framed");
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream9.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unrecognizedExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = x5455_ExtendedTimestamp2.getModifyTime();
        java.lang.Object obj4 = x5455_ExtendedTimestamp2.clone();
        byte[] byteArray5 = x5455_ExtendedTimestamp2.getCentralDirectoryData();
        unrecognizedExtraField0.setCentralDirectoryData(byteArray5);
        org.junit.Assert.assertNull(zipShort1);
        org.junit.Assert.assertNull(zipLong3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        long long21 = zipArchiveOutputStream6.getBytesWritten();
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3L + "'", long21 == 3L);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "pack200");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray5, (int) (short) 10);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray10);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray5);
        boolean boolean14 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray5, (int) (short) 100);
        boolean boolean16 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 3);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("lz4-block", byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 808471376, byteArray5, (int) (byte) 48, 148);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 195");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        long long1 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime((long) 3);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 116444736000030000L + "'", long1 == 116444736000030000L);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        byte[] byteArray2 = zipArchiveEntry1.getExtra();
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest zipArchiveEntryRequest4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry1, inputStreamSupplier3);
        long long5 = zipArchiveEntry1.getCompressedSize();
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(zipArchiveEntryRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, (int) (short) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel11 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray6);
        long long12 = seekableInMemoryByteChannel11.position();
        java.nio.channels.SeekableByteChannel seekableByteChannel14 = seekableInMemoryByteChannel11.position(0L);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions15 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        boolean boolean16 = sevenZFileOptions15.getUseDefaultNameForUnnamedEntries();
        boolean boolean17 = sevenZFileOptions15.getUseDefaultNameForUnnamedEntries();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel14, sevenZFileOptions15);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(seekableByteChannel14);
        org.junit.Assert.assertNotNull(sevenZFileOptions15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        tarArchiveEntry8.setUserName("keep");
        long long12 = tarArchiveEntry8.getLongUserId();
        tarArchiveEntry8.setNames("cpio", "lz4-framed");
        java.lang.String str16 = tarArchiveEntry8.getLinkName();
        int int17 = tarArchiveEntry8.getUserId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream6, "pack.field.attribute.");
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        java.nio.file.attribute.FileTime fileTime10 = tarArchiveEntry3.getCreationTime();
        tarArchiveEntry3.setGroupName("././@LongLink");
        tarArchiveEntry3.setDevMinor((int) (short) 8);
        java.util.Date date15 = tarArchiveEntry3.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Mon Jun 19 00:08:50 CEST 2023");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.INODE;
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.INODE + "'", sEGMENT_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.INODE));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 424935705, 40960, "error");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        int int1 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.chooseBlockSize((long) (byte) 54);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        java.lang.String str1 = org.apache.commons.compress.compressors.gzip.GzipUtils.getUncompressedFilename(".gz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".gz" + "'", str1, ".gz");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        pack200CompressorOutputStream16.write(3);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream22 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream16, (int) (byte) 49, true, false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        long long2 = cpioArchiveEntry1.getRemoteDeviceMaj();
        boolean boolean3 = cpioArchiveEntry1.isDirectory();
        int int5 = cpioArchiveEntry1.getHeaderPadCount((long) 263);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder6 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder7 = builder6.tunedForCompressionRatio();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder9 = builder6.withMinBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder10 = builder9.tunedForSpeed();
        org.apache.commons.compress.compressors.lz77support.Parameters parameters11 = builder10.build();
        boolean boolean12 = cpioArchiveEntry1.equals((java.lang.Object) builder10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(parameters11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile4 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray2, "pack.deflate.hint");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 10]");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer6 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, 2048, "ar");
        tarArchiveOutputStream9.setLongFileMode(8);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream13 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream((java.io.OutputStream) arArchiveOutputStream12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorOutputStream xZCompressorOutputStream14 = new org.apache.commons.compress.compressors.xz.XZCompressorOutputStream((java.io.OutputStream) arArchiveOutputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean11 = tarArchiveEntry10.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean16 = tarArchiveEntry10.equals(tarArchiveEntry15);
        tarArchiveEntry15.setUserName("keep");
        long long19 = tarArchiveEntry15.getLongUserId();
        tarArchiveEntry15.setNames("cpio", "lz4-framed");
        java.lang.String str23 = tarArchiveEntry15.getLinkName();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        closeShieldFilterInputStream1.close();
        org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier inputStreamByteSupplier3 = new org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) closeShieldFilterInputStream1);
        long long5 = deflateCompressorInputStream4.getUncompressedCount();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.DES;
        int int1 = encryptionAlgorithm0.getCode();
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.DES + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.DES));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26113 + "'", int1 == 26113);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        int int1 = gzipParameters0.getOperatingSystem();
        gzipParameters0.setModificationTime((long) 476);
        int int4 = gzipParameters0.getOperatingSystem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 255 + "'", int4 == 255);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.compress.changes.ChangeSet changeSet0 = new org.apache.commons.compress.changes.ChangeSet();
        changeSet0.deleteDir("LZ4 Parameters with BlockSize M4, withContentChecksum true, withBlockChecksum false, withBlockDependency false");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        boolean boolean1 = org.apache.commons.compress.utils.TimeUtils.isUnixTime((-1L));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = null;
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit2);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData4 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.String str5 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertNull(unparseableExtraFieldData4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream21 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream((java.io.InputStream) cpioArchiveInputStream4);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray3, (int) (short) 10);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray3, byteArray8);
        org.apache.commons.compress.archivers.tar.TarFile tarFile11 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray3, false);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("error.gz");
        boolean boolean15 = zipEncoding13.canEncode("lz4-block");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3, zipEncoding13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipEncoding13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = jarArchiveOutputStream6.createArchiveEntry(file7, "pack.keep.file.order");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        long long3 = zstdCompressorInputStream2.getCompressedCount();
        java.lang.String str4 = zstdCompressorInputStream2.toString();
        org.apache.commons.compress.utils.CountingInputStream countingInputStream5 = new org.apache.commons.compress.utils.CountingInputStream((java.io.InputStream) zstdCompressorInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            countingInputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "bzip2");
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, 263);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = deflateCompressorInputStream7.read();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        java.lang.String str1 = org.apache.commons.compress.compressors.gzip.GzipUtils.getUncompressedFilename("\000\000\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\000\000\n" + "'", str1, "\000\000\n");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = x5455_ExtendedTimestamp0.getModifyTime();
        java.lang.Object obj2 = x5455_ExtendedTimestamp0.clone();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream2, 508, 31);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters6 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) zstdCompressorInputStream2, deflateParameters6);
        long long8 = zstdCompressorInputStream2.getBytesRead();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        long long3 = zstdCompressorInputStream2.getCompressedCount();
        long long4 = zstdCompressorInputStream2.getBytesRead();
        boolean boolean5 = zstdCompressorInputStream2.markSupported();
        org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream blockLZ4CompressorInputStream6 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream((java.io.InputStream) zstdCompressorInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = blockLZ4CompressorInputStream6.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
            int int13 = deflate64CompressorInputStream12.read();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Truncated Deflate64 Stream");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) brotliCompressorInputStream9, "pass");
        long long12 = brotliCompressorInputStream9.getUncompressedCount();
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream14 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream13);
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream14.write(byteArray16);
        boolean boolean19 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray16, (int) (byte) -1);
        boolean boolean21 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray16, 29127);
        boolean boolean23 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.matches(byteArray16, 16);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = brotliCompressorInputStream9.read(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Brotli stream decoding failed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (byte) 83);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[83, 0, 0, 0]");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = dumpArchiveEntry0.getHeaderType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = dumpArchiveEntry0.isSparseRecord(808471376);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 808471376");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sEGMENT_TYPE1);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = zipArchiveInputStream8.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream8);
        long long13 = org.apache.commons.compress.utils.IOUtils.skip((java.io.InputStream) zipArchiveInputStream11, (long) (short) 0);
        long long15 = zipArchiveInputStream11.skip((long) 96);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer6 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream7 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream4 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) cpioArchiveInputStream1, (long) (byte) 100, (int) (short) 3);
        long long6 = cRC32VerifyingInputStream4.skip(0L);
        long long8 = cRC32VerifyingInputStream4.skip((long) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cRC32VerifyingInputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = tarArchiveInputStream9.getCurrentEntry();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry10);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        org.apache.commons.compress.utils.FixedLengthBlockOutputStream fixedLengthBlockOutputStream27 = new org.apache.commons.compress.utils.FixedLengthBlockOutputStream((java.nio.channels.WritableByteChannel) seekableByteChannel25, (int) (short) 8);
        fixedLengthBlockOutputStream27.close();
        java.nio.ByteBuffer byteBuffer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = fixedLengthBlockOutputStream27.write(byteBuffer29);
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
        org.junit.Assert.assertNotNull(seekableByteChannel25);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream7 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) bZip2CompressorOutputStream7, 32, 345, "bzip2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = org.apache.commons.compress.utils.IOUtils.EMPTY_LINK_OPTIONS;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 0, path1, "ISO-8859-1", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.commons.compress.changes.ChangeSet changeSet0 = new org.apache.commons.compress.changes.ChangeSet();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry1 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE2 = dumpArchiveEntry1.getHeaderType();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE3 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT;
        dumpArchiveEntry1.setType(tYPE3);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean15 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray13, (int) (byte) 0);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel18 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray13);
        java.nio.channels.SeekableByteChannel seekableByteChannel20 = seekableInMemoryByteChannel18.position(0L);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray21 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel22 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray21);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray23 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel24 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray23);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile25 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel24);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray26 = new java.nio.channels.SeekableByteChannel[] { seekableInMemoryByteChannel18, seekableByteChannel22, seekableByteChannel24 };
        java.util.ArrayList<java.nio.channels.SeekableByteChannel> seekableByteChannelList27 = new java.util.ArrayList<java.nio.channels.SeekableByteChannel>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.nio.channels.SeekableByteChannel>) seekableByteChannelList27, seekableByteChannelArray26);
        org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel29 = new org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel((java.util.List<java.nio.channels.SeekableByteChannel>) seekableByteChannelList27);
        boolean boolean30 = multiReadOnlySeekableByteChannel29.isOpen();
        multiReadOnlySeekableByteChannel29.close();
        org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream32 = new org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream((long) (byte) 83, 2162688L, (java.nio.channels.SeekableByteChannel) multiReadOnlySeekableByteChannel29);
        changeSet0.add((org.apache.commons.compress.archivers.ArchiveEntry) dumpArchiveEntry1, (java.io.InputStream) boundedSeekableByteChannelInputStream32, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = org.apache.commons.compress.archivers.ArchiveStreamFactory.detect((java.io.InputStream) boundedSeekableByteChannelInputStream32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sEGMENT_TYPE2);
        org.junit.Assert.assertTrue("'" + tYPE3 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT + "'", tYPE3.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(seekableByteChannel20);
        org.junit.Assert.assertNotNull(seekableByteChannelArray21);
        org.junit.Assert.assertNotNull(seekableByteChannel22);
        org.junit.Assert.assertNotNull(seekableByteChannelArray23);
        org.junit.Assert.assertNotNull(seekableByteChannel24);
        org.junit.Assert.assertNotNull(seekableByteChannelArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream6, "pack.field.attribute.");
        long long10 = jarArchiveInputStream6.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream13 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream((java.io.InputStream) jarArchiveInputStream6, false, 256);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        sevenZArchiveEntry0.setCreationDate((long) 61440);
        sevenZArchiveEntry0.setCrc((int) (byte) 75);
        boolean boolean7 = sevenZArchiveEntry0.getHasCrc();
        sevenZArchiveEntry0.setWindowsAttributes(16925);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(53);
        org.junit.Assert.assertNull(hashAlgorithm1);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, (int) (short) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel11 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray6);
        java.nio.channels.SeekableByteChannel seekableByteChannel13 = seekableInMemoryByteChannel11.position(0L);
        byte[] byteArray14 = seekableInMemoryByteChannel11.array();
        boolean boolean15 = seekableInMemoryByteChannel11.isOpen();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(seekableByteChannel13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        lZMACompressorOutputStream10.flush();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = x5455_ExtendedTimestamp0.getAccessTime();
        java.nio.file.attribute.FileTime fileTime4 = x5455_ExtendedTimestamp0.getModifyFileTime();
        boolean boolean5 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNull(zipLong3);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream6, "pack.field.attribute.");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = tarArchiveInputStream9.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = tarArchiveInputStream9.getCurrentEntry();
        int int12 = tarArchiveInputStream9.getCount();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry10);
        org.junit.Assert.assertNull(tarArchiveEntry11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        long long3 = zstdCompressorInputStream2.getCompressedCount();
        java.lang.String str4 = zstdCompressorInputStream2.toString();
        org.apache.commons.compress.utils.CountingInputStream countingInputStream5 = new org.apache.commons.compress.utils.CountingInputStream((java.io.InputStream) zstdCompressorInputStream2);
        long long6 = countingInputStream5.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = countingInputStream5.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

//    @Test
//    public void test1662() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1662");
//        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
//        cpioArchiveEntry1.setInode((long) 2048);
//        java.util.Date date4 = cpioArchiveEntry1.getLastModifiedDate();
//        cpioArchiveEntry1.setChksum(0L);
//        boolean boolean7 = cpioArchiveEntry1.isSocket();
//        org.junit.Assert.assertNotNull(date4);
//        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 01:00:00 CET 1970");
//        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
//    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder1 = builder0.tunedForCompressionRatio();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder3 = builder1.withMaxOffset((int) '#');
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder5 = builder1.withMaxBackReferenceLength(5);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        int int1 = dumpArchiveEntry0.getGroupId();
        boolean boolean2 = dumpArchiveEntry0.isBlkDev();
        dumpArchiveEntry0.setSize((long) 16877);
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE5 = dumpArchiveEntry0.getHeaderType();
        long long6 = dumpArchiveEntry0.getSize();
        dumpArchiveEntry0.setVolume((int) (byte) 55);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(sEGMENT_TYPE5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 16877L + "'", long6 == 16877L);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.find(345);
        org.junit.Assert.assertNotNull(pERMISSIONSet1);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        boolean boolean34 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray30, (int) (byte) 51);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unparseableExtraFieldData0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unparseableExtraFieldData0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.MILLIS_PER_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        boolean boolean1 = arjArchiveEntry0.isHostOsUnix();
        boolean boolean3 = arjArchiveEntry0.equals((java.lang.Object) "\000\000!\000");
        long long4 = arjArchiveEntry0.getSize();
        boolean boolean5 = arjArchiveEntry0.isHostOsUnix();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        boolean boolean1 = generalPurposeBit0.usesDataDescriptor();
        boolean boolean2 = generalPurposeBit0.usesUTF8ForNames();
        byte[] byteArray3 = generalPurposeBit0.encode();
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 84446, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray3, 8, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 17");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(file0, "7z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry3 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(path0, "pack.unknown.attribute", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference backReference2 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference((-1), 504);
        int int3 = backReference2.getLength();
        int int4 = backReference2.getLength();
        int int5 = backReference2.getOffset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 504 + "'", int3 == 504);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 504 + "'", int4 == 504);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        java.lang.Object obj2 = asiExtraField0.clone();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getLocalFileDataLength();
        java.lang.String str4 = zipShort3.toString();
        byte[] byteArray5 = zipShort3.getBytes();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ZipShort value: 14" + "'", str4, "ZipShort value: 14");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[14, 0]");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        boolean boolean6 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray3, (int) (byte) -1);
        boolean boolean8 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray3, 29127);
        boolean boolean10 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray3, (int) (short) 8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 83, 29127);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 83");
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
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.Closeable closeable1 = null;
        closeableConsumer0.accept(closeable1);
        org.junit.Assert.assertNotNull(closeableConsumer0);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.utils.SkipShieldingInputStream skipShieldingInputStream11 = new org.apache.commons.compress.utils.SkipShieldingInputStream((java.io.InputStream) zipArchiveInputStream8);
        long long13 = skipShieldingInputStream11.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream14 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) skipShieldingInputStream11);
        long long16 = skipShieldingInputStream11.skip((long) (-1));
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream18 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream17);
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream18.write(byteArray20);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream22 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream18);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream18);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy24 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream23.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy24);
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream27 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream26);
        byte[] byteArray29 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream27.write(byteArray29);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream31 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream27);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream27);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean38 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray36, (int) (short) 10);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean42 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray36, byteArray41);
        byte[] byteArray43 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray36);
        zipArchiveOutputStream32.writePreamble(byteArray43);
        zipArchiveOutputStream32.setMethod((int) (short) 1);
        java.io.OutputStream outputStream47 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream48 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream47);
        byte[] byteArray50 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream48.write(byteArray50);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream52 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream48);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream53 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream48);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy54 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream53.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy54);
        zipArchiveOutputStream32.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy54);
        zipArchiveOutputStream23.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy54);
        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean63 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray61, (int) (short) 10);
        byte[] byteArray66 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean67 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray61, byteArray66);
        byte[] byteArray68 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray61);
        zipArchiveOutputStream23.writePreamble(byteArray61);
        java.io.InputStream inputStream70 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream72 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream70, 10);
        long long74 = cpioArchiveInputStream72.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream76 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream72, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream78 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream72, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream79 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream78);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream80 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream78);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy81 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry85 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime86 = null;
        tarArchiveEntry85.setStatusChangeTime(fileTime86);
        tarArchiveEntry85.setUserName("unpack.progress");
        tarArchiveEntry85.setUserId((long) 29127);
        tarArchiveEntry85.setMode(263);
        tarArchiveEntry85.setUserName("error.gz");
        java.util.Map<java.lang.String, java.lang.String> strMap96 = tarArchiveEntry85.getExtraPaxHeaders();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream97 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zstdCompressorInputStream80, pack200Strategy81, strMap96);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream98 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream23, pack200Strategy81);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream99 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) skipShieldingInputStream11, pack200Strategy81);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy24);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy54);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(pack200Strategy81);
        org.junit.Assert.assertNotNull(strMap96);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor3 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(3, scatterGatherBackingStore2);
        long long4 = streamCompressor3.getCrc32();
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream5 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore0, streamCompressor3);
        long long6 = streamCompressor3.getCrc32();
        streamCompressor3.close();
        org.junit.Assert.assertNotNull(streamCompressor3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData1 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unparseableExtraFieldData1.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField3 = extraFieldParsingMode0.createExtraField(zipShort2);
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipExtraField3);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer6 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.utils.ByteUtils.toLittleEndian((org.apache.commons.compress.utils.ByteUtils.ByteConsumer) outputStreamByteConsumer6, (long) (short) 8, 16877);
        outputStreamByteConsumer6.accept((int) (byte) 2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream5 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream4);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream5.write(byteArray7);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream5);
        long long11 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream2, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream5, 36864);
        org.apache.commons.compress.compressors.xz.XZCompressorOutputStream xZCompressorOutputStream13 = new org.apache.commons.compress.compressors.xz.XZCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream5, 4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "ustar\000", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
            org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream gzipCompressorInputStream14 = new org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream((java.io.InputStream) deflate64CompressorInputStream12, false);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Truncated Deflate64 Stream");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.commons.compress.archivers.zip.Zip64RequiredException zip64RequiredException1 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException("\000\000!\000");
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException2 = new org.apache.commons.compress.archivers.dump.DumpArchiveException((java.lang.Throwable) zip64RequiredException1);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        long long0 = org.apache.commons.compress.archivers.ArchiveEntry.SIZE_UNKNOWN;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0 == (-1L));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream24.putArchiveEntry(archiveEntry25);
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
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 103, "pack.method.attribute.", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type 103");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        byte[] byteArray1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(".xz");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[46, 120, 122]");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        boolean boolean1 = generalPurposeBit0.usesDataDescriptor();
        org.apache.commons.compress.utils.Charsets charsets2 = new org.apache.commons.compress.utils.Charsets();
        boolean boolean3 = generalPurposeBit0.equals((java.lang.Object) charsets2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        gzipParameters17.setOperatingSystem(128);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(compressorOutputStream16);
    }

//    @Test
//    public void test1691() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1691");
//        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
//        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
//        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
//        // The following exception was thrown during execution in test generation
//        try {
//            sevenZOutputFile2.closeArchiveEntry();
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
//        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
//        org.junit.Assert.assertNotNull(seekableByteChannel1);
//    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        java.io.File file37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry39 = zipArchiveOutputStream6.createArchiveEntry(file37, "`\n");
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
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = x5455_ExtendedTimestamp0.getAccessTime();
        java.lang.Object obj4 = x5455_ExtendedTimestamp0.clone();
        java.nio.file.attribute.FileTime fileTime5 = x5455_ExtendedTimestamp0.getModifyFileTime();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNull(zipLong3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(fileTime5);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = null;
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit2);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields(false);
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest zipArchiveEntryRequest7 = org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry1, inputStreamSupplier6);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream8 = zipArchiveEntryRequest7.getPayloadStream();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertNotNull(zipArchiveEntryRequest7);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        sevenZArchiveEntry0.setName("US-ASCII");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(fileTime28);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException unsupportedCompressionAlgorithmException1 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException(".gz.xz");
        java.lang.Throwable[] throwableArray2 = unsupportedCompressionAlgorithmException1.getSuppressed();
        java.lang.String str3 = unsupportedCompressionAlgorithmException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException: this file uses an unsupported compression algorithm: .gz.xz." + "'", str3, "org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException: this file uses an unsupported compression algorithm: .gz.xz.");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSIONLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream12.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore1 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor2 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(3, scatterGatherBackingStore1);
        long long3 = streamCompressor2.getBytesRead();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream4);
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream8 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) cpioArchiveInputStream5, (long) (byte) 100, (int) (short) 3);
        long long10 = cRC32VerifyingInputStream8.skip(0L);
        long long12 = cRC32VerifyingInputStream8.skip((long) (byte) 100);
        streamCompressor2.deflate((java.io.InputStream) cRC32VerifyingInputStream8, (int) (byte) 75);
        long long15 = streamCompressor2.getCrc32();
        org.junit.Assert.assertNotNull(streamCompressor2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_OLDNORM;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        closeShieldFilterInputStream13.close();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        long long10 = tarArchiveEntry8.getSize();
        long long11 = tarArchiveEntry8.getSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        x0016_CertificateIdForCentralDirectory0.setCentralDirectoryData(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 4095);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock literalBlock11 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock(byteArray4, (int) (short) 100, 1);
        byte[] byteArray12 = literalBlock11.getData();
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType blockType13 = literalBlock11.getType();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + blockType13 + "' != '" + org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.LITERAL + "'", blockType13.equals(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.LITERAL));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        long long10 = tarArchiveEntry8.getSize();
        tarArchiveEntry8.setGroupId((long) (byte) 48);
        tarArchiveEntry8.setName("BackReference with offset -1 and length 504.xz");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        java.nio.file.Path path36 = null;
        java.nio.file.Path path37 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(path36, path37);
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

//    @Test
//    public void test1706() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1706");
//        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
//        cpioArchiveEntry1.setInode((long) 2048);
//        java.util.Date date4 = cpioArchiveEntry1.getLastModifiedDate();
//        long long5 = cpioArchiveEntry1.getUID();
//        cpioArchiveEntry1.setInode(312829200000L);
//        cpioArchiveEntry1.setNumberOfLinks((long) 3);
//        org.junit.Assert.assertNotNull(date4);
//        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 01:00:00 CET 1970");
//        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
//    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) brotliCompressorInputStream9, "pass");
        long long12 = brotliCompressorInputStream9.getUncompressedCount();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        arArchiveOutputStream22.setLongFileMode(2);
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
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        java.lang.Object obj18 = zipArchiveEntry1.clone();
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(zipLong6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[80, 75, 48, 48]");
        org.junit.Assert.assertNull(zipEightByteInteger9);
        org.junit.Assert.assertNotNull(zipEightByteInteger10);
        org.junit.Assert.assertNotNull(zipEightByteInteger15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "pack.method.attribute.");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "pack.method.attribute.");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "pack.method.attribute.");
    }

//    @Test
//    public void test1710() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1710");
//        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
//        int int1 = dumpArchiveEntry0.getGroupId();
//        boolean boolean2 = dumpArchiveEntry0.isBlkDev();
//        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE3 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FILE;
//        dumpArchiveEntry0.setType(tYPE3);
//        java.util.Date date5 = dumpArchiveEntry0.getCreationTime();
//        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry6 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
//        sevenZArchiveEntry6.setHasLastModifiedDate(false);
//        sevenZArchiveEntry6.setCreationDate((long) 61440);
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        boolean boolean15 = tarArchiveEntry14.isPaxGNU1XSparse();
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        boolean boolean20 = tarArchiveEntry14.equals(tarArchiveEntry19);
//        tarArchiveEntry19.setUserName("keep");
//        java.lang.String str23 = tarArchiveEntry19.getLinkName();
//        java.nio.file.attribute.FileTime fileTime25 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
//        java.nio.file.attribute.FileTime fileTime26 = org.apache.commons.compress.utils.TimeUtils.truncateToHundredNanos(fileTime25);
//        long long27 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(fileTime26);
//        tarArchiveEntry19.setStatusChangeTime(fileTime26);
//        sevenZArchiveEntry6.setCreationTime(fileTime26);
//        sevenZArchiveEntry6.setHasCrc(true);
//        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp32 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
//        java.lang.String str33 = x5455_ExtendedTimestamp32.toString();
//        org.apache.commons.compress.archivers.zip.ZipLong zipLong34 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
//        x5455_ExtendedTimestamp32.setModifyTime(zipLong34);
//        boolean boolean36 = x5455_ExtendedTimestamp32.isBit1_accessTimePresent();
//        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp37 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry41 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        java.nio.file.attribute.FileTime fileTime42 = null;
//        tarArchiveEntry41.setStatusChangeTime(fileTime42);
//        tarArchiveEntry41.setUserName("unpack.progress");
//        tarArchiveEntry41.addPaxHeader("dump", "ISO-8859-1");
//        java.util.Date date49 = tarArchiveEntry41.getModTime();
//        x5455_ExtendedTimestamp37.setAccessJavaTime(date49);
//        x5455_ExtendedTimestamp32.setCreateJavaTime(date49);
//        java.nio.file.attribute.FileTime fileTime52 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date49);
//        sevenZArchiveEntry6.setLastModifiedDate(date49);
//        dumpArchiveEntry0.setAccessTime(date49);
//        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
//        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
//        org.junit.Assert.assertTrue("'" + tYPE3 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FILE + "'", tYPE3.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FILE));
//        org.junit.Assert.assertNotNull(date5);
//        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 01:00:00 CET 1970");
//        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
//        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
//        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
//        org.junit.Assert.assertNotNull(fileTime25);
//        org.junit.Assert.assertNotNull(fileTime26);
//        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 116444741040000000L + "'", long27 == 116444741040000000L);
//        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str33, "0x5455 Zip Extra Field: Flags=0 ");
//        org.junit.Assert.assertNotNull(zipLong34);
//        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
//        org.junit.Assert.assertNotNull(date49);
//// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Mon Jun 19 00:09:03 CEST 2023");
//        org.junit.Assert.assertNotNull(fileTime52);
//    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader19 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        x0017_StrongEncryptionHeader19.setCentralDirectoryData(byteArray21);
        byte[] byteArray23 = x0017_StrongEncryptionHeader19.getLocalFileDataData();
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean29 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray27, (int) (short) 10);
        x0017_StrongEncryptionHeader19.setCentralDirectoryData(byteArray27);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField31 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("ISO-8859-1", byteArray27);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("error.gz");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry36 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(strMap14, byteArray27, zipEncoding33, false, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(zipEncoding33);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getUserId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getCentralDirectoryLength();
        byte[] byteArray4 = asiExtraField0.getCentralDirectoryData();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream5, 10);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream9);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream10.write(byteArray12);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream14 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream10);
        long long16 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream7, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream10, 36864);
        int int17 = cpioArchiveInputStream7.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7, 2);
        byte[] byteArray21 = org.apache.commons.compress.utils.IOUtils.readRange((java.io.InputStream) cpioArchiveInputStream7, 12);
        // The following exception was thrown during execution in test generation
        try {
            asiExtraField0.parseFromCentralDirectoryData(byteArray21, 32768, 255);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32768");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = jarArchiveInputStream6.getNextEntry();
        byte[] byteArray9 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) jarArchiveInputStream6);
        long long10 = jarArchiveInputStream6.getBytesRead();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(archiveEntry8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

//    @Test
//    public void test1714() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1714");
//        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
//        int int1 = dumpArchiveEntry0.getGroupId();
//        boolean boolean2 = dumpArchiveEntry0.isBlkDev();
//        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE3 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FILE;
//        dumpArchiveEntry0.setType(tYPE3);
//        java.util.Date date5 = dumpArchiveEntry0.getCreationTime();
//        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet6 = dumpArchiveEntry0.getPermissions();
//        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
//        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
//        org.junit.Assert.assertTrue("'" + tYPE3 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FILE + "'", tYPE3.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FILE));
//        org.junit.Assert.assertNotNull(date5);
//        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 01:00:00 CET 1970");
//        org.junit.Assert.assertNotNull(pERMISSIONSet6);
//    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        byte[] byteArray33 = null;
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray33, 11, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker18 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = jarMarker18.getCentralDirectoryLength();
        byte[] byteArray20 = jarMarker18.getLocalFileDataData();
        int int21 = checksumCalculatingInputStream17.read(byteArray20);
        byte[] byteArray23 = org.apache.commons.compress.utils.IOUtils.readRange((java.io.InputStream) checksumCalculatingInputStream17, 40960);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        jarArchiveOutputStream9.setComment("cpio.gz");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        closeShieldFilterInputStream1.close();
        org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier inputStreamByteSupplier3 = new org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) closeShieldFilterInputStream1, 128, "pack.field.attribute.");
        org.apache.commons.compress.utils.BoundedInputStream boundedInputStream9 = new org.apache.commons.compress.utils.BoundedInputStream((java.io.InputStream) tarArchiveInputStream7, (long) 36864);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = boundedInputStream9.read();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        tarArchiveEntry8.setUserName("keep");
        java.io.File file12 = tarArchiveEntry8.getFile();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(file12);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.compress.compressors.lz4.XXHash32 xXHash32_0 = new org.apache.commons.compress.compressors.lz4.XXHash32();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumVerifyingInputStream checksumVerifyingInputStream4 = new org.apache.commons.compress.utils.ChecksumVerifyingInputStream((java.util.zip.Checksum) xXHash32_0, inputStream1, (long) 29127, 116444736000000000L);
        // The following exception was thrown during execution in test generation
        try {
            checksumVerifyingInputStream4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64;
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration1 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        byte byte5 = tarArchiveEntry4.getLinkFlag();
        tarArchiveEntry4.setUserId((int) 'a');
        tarArchiveEntry4.setUserName("7z");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration10 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0, (java.lang.Object) tarArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DEFLATE64 method doesn't support options of type class org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64 + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64));
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 48 + "'", byte5 == (byte) 48);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions0 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        boolean boolean1 = sevenZFileOptions0.getUseDefaultNameForUnnamedEntries();
        boolean boolean2 = sevenZFileOptions0.getTryToRecoverBrokenArchives();
        int int3 = sevenZFileOptions0.getMaxMemoryLimitInKb();
        org.junit.Assert.assertNotNull(sevenZFileOptions0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream10 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
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
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream2, 508, 31);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters6 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) zstdCompressorInputStream2, deflateParameters6);
        // The following exception was thrown during execution in test generation
        try {
            deflateParameters6.setCompressionLevel(121);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Deflate compression level: 121");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.apache.commons.compress.changes.ChangeSet changeSet0 = new org.apache.commons.compress.changes.ChangeSet();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry1 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE2 = dumpArchiveEntry1.getHeaderType();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE3 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT;
        dumpArchiveEntry1.setType(tYPE3);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean15 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray13, (int) (byte) 0);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel18 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray13);
        java.nio.channels.SeekableByteChannel seekableByteChannel20 = seekableInMemoryByteChannel18.position(0L);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray21 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel22 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray21);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray23 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel24 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray23);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile25 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel24);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray26 = new java.nio.channels.SeekableByteChannel[] { seekableInMemoryByteChannel18, seekableByteChannel22, seekableByteChannel24 };
        java.util.ArrayList<java.nio.channels.SeekableByteChannel> seekableByteChannelList27 = new java.util.ArrayList<java.nio.channels.SeekableByteChannel>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.nio.channels.SeekableByteChannel>) seekableByteChannelList27, seekableByteChannelArray26);
        org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel29 = new org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel((java.util.List<java.nio.channels.SeekableByteChannel>) seekableByteChannelList27);
        boolean boolean30 = multiReadOnlySeekableByteChannel29.isOpen();
        multiReadOnlySeekableByteChannel29.close();
        org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream32 = new org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream((long) (byte) 83, 2162688L, (java.nio.channels.SeekableByteChannel) multiReadOnlySeekableByteChannel29);
        changeSet0.add((org.apache.commons.compress.archivers.ArchiveEntry) dumpArchiveEntry1, (java.io.InputStream) boundedSeekableByteChannelInputStream32, false);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) -1, (byte) 100 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField40 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("UTF-16LE", byteArray39);
        byte[] byteArray41 = unicodePathExtraField40.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            int int44 = boundedSeekableByteChannelInputStream32.read(byteArray41, 0, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: offset or len are out of bounds");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sEGMENT_TYPE2);
        org.junit.Assert.assertTrue("'" + tYPE3 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT + "'", tYPE3.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(seekableByteChannel20);
        org.junit.Assert.assertNotNull(seekableByteChannelArray21);
        org.junit.Assert.assertNotNull(seekableByteChannel22);
        org.junit.Assert.assertNotNull(seekableByteChannelArray23);
        org.junit.Assert.assertNotNull(seekableByteChannel24);
        org.junit.Assert.assertNotNull(seekableByteChannelArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, -9, 4, 45, 43, 85, 84, 70, 45, 49, 54, 76, 69]");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unparseableExtraFieldData0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unparseableExtraFieldData0.getHeaderId();
        byte[] byteArray3 = unparseableExtraFieldData0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = unparseableExtraFieldData0.getLocalFileDataLength();
        byte[] byteArray5 = unparseableExtraFieldData0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = unparseableExtraFieldData0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = unparseableExtraFieldData0.getHeaderId();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(zipShort7);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        org.apache.commons.compress.archivers.zip.ScatterStatistics scatterStatistics11 = parallelScatterZipCreator0.getStatisticsMessage();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable10);
        org.junit.Assert.assertNotNull(scatterStatistics11);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        int int1 = dumpArchiveEntry0.getGroupId();
        boolean boolean2 = dumpArchiveEntry0.isBlkDev();
        dumpArchiveEntry0.setSize((long) 16877);
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE5 = dumpArchiveEntry0.getHeaderType();
        long long6 = dumpArchiveEntry0.getSize();
        dumpArchiveEntry0.setMode(808471376);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(sEGMENT_TYPE5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 16877L + "'", long6 == 16877L);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
        byte[] byteArray4 = zipLong3.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile2.write(byteArray4, (int) (byte) -1, 26370);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current 7z entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(zipLong3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[80, 75, 7, 8]");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        int int3 = sevenZArchiveEntry0.getWindowsAttributes();
        boolean boolean4 = sevenZArchiveEntry0.isAntiItem();
        int int5 = sevenZArchiveEntry0.getCrc();
        sevenZArchiveEntry0.setCrcValue((long) 60012);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

//    @Test
//    public void test1731() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1731");
//        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
//        cpioArchiveEntry1.setInode((long) 2048);
//        java.util.Date date4 = cpioArchiveEntry1.getLastModifiedDate();
//        long long5 = cpioArchiveEntry1.getUID();
//        boolean boolean6 = cpioArchiveEntry1.isDirectory();
//        org.junit.Assert.assertNotNull(date4);
//        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 01:00:00 CET 1970");
//        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
//        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
//    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        int int1 = gzipParameters0.getBufferSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
    }

//    @Test
//    public void test1733() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1733");
//        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
//        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
//        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getCreateTime();
//        java.io.OutputStream outputStream3 = null;
//        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream4 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream3);
//        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
//        zstdCompressorOutputStream4.write(byteArray6);
//        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream8 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
//        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
//        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
//        boolean boolean15 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray13, (int) (short) 10);
//        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0 };
//        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, byteArray18);
//        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray13);
//        zipArchiveOutputStream9.writePreamble(byteArray20);
//        zipArchiveOutputStream9.finish();
//        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
//        cpioArchiveEntry24.setInode((long) 2048);
//        java.util.Date date27 = cpioArchiveEntry24.getLastModifiedDate();
//        cpioArchiveEntry24.setChksum(0L);
//        boolean boolean30 = zipArchiveOutputStream9.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry24);
//        boolean boolean31 = x5455_ExtendedTimestamp0.equals((java.lang.Object) boolean30);
//        org.apache.commons.compress.archivers.zip.ZipLong zipLong32 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
//        int int33 = zipLong32.getIntValue();
//        x5455_ExtendedTimestamp0.setCreateTime(zipLong32);
//        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp35 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
//        java.lang.String str36 = x5455_ExtendedTimestamp35.toString();
//        java.nio.file.attribute.FileTime fileTime37 = x5455_ExtendedTimestamp35.getAccessFileTime();
//        java.nio.file.attribute.FileTime fileTime38 = x5455_ExtendedTimestamp35.getAccessFileTime();
//        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger39 = null;
//        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger40 = null;
//        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger41 = null;
//        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger42 = null;
//        org.apache.commons.compress.archivers.zip.ZipLong zipLong43 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
//        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField44 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger40, zipEightByteInteger41, zipEightByteInteger42, zipLong43);
//        byte[] byteArray45 = zip64ExtendedInformationExtraField44.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger46 = zip64ExtendedInformationExtraField44.getCompressedSize();
//        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger47 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
//        zip64ExtendedInformationExtraField44.setRelativeHeaderOffset(zipEightByteInteger47);
//        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger50 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) (short) 0);
//        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField51 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger47, zipEightByteInteger50);
//        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger52 = null;
//        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger53 = null;
//        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger54 = null;
//        org.apache.commons.compress.archivers.zip.ZipLong zipLong55 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
//        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField56 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger52, zipEightByteInteger53, zipEightByteInteger54, zipLong55);
//        byte[] byteArray57 = zip64ExtendedInformationExtraField56.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger58 = zip64ExtendedInformationExtraField56.getCompressedSize();
//        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger59 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
//        zip64ExtendedInformationExtraField56.setRelativeHeaderOffset(zipEightByteInteger59);
//        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp61 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
//        java.lang.String str62 = x5455_ExtendedTimestamp61.toString();
//        org.apache.commons.compress.archivers.zip.ZipLong zipLong63 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
//        x5455_ExtendedTimestamp61.setModifyTime(zipLong63);
//        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField65 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger39, zipEightByteInteger50, zipEightByteInteger59, zipLong63);
//        x5455_ExtendedTimestamp35.setCreateTime(zipLong63);
//        x5455_ExtendedTimestamp0.setCreateTime(zipLong63);
//        byte[] byteArray68 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
//        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
//        org.junit.Assert.assertNull(zipLong2);
//        org.junit.Assert.assertNotNull(byteArray6);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 33, 0]");
//        org.junit.Assert.assertNotNull(byteArray13);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 0, 0]");
//        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
//        org.junit.Assert.assertNotNull(byteArray18);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
//        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
//        org.junit.Assert.assertNotNull(byteArray20);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 0, 0]");
//        org.junit.Assert.assertNotNull(date27);
//        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 01:00:00 CET 1970");
//        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
//        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
//        org.junit.Assert.assertNotNull(zipLong32);
//        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 134695760 + "'", int33 == 134695760);
//        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str36, "0x5455 Zip Extra Field: Flags=0 ");
//        org.junit.Assert.assertNull(fileTime37);
//        org.junit.Assert.assertNull(fileTime38);
//        org.junit.Assert.assertNotNull(zipLong43);
//        org.junit.Assert.assertNotNull(byteArray45);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[80, 75, 48, 48]");
//        org.junit.Assert.assertNull(zipEightByteInteger46);
//        org.junit.Assert.assertNotNull(zipEightByteInteger47);
//        org.junit.Assert.assertNotNull(zipLong55);
//        org.junit.Assert.assertNotNull(byteArray57);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[80, 75, 48, 48]");
//        org.junit.Assert.assertNull(zipEightByteInteger58);
//        org.junit.Assert.assertNotNull(zipEightByteInteger59);
//        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str62, "0x5455 Zip Extra Field: Flags=0 ");
//        org.junit.Assert.assertNotNull(zipLong63);
//        org.junit.Assert.assertNotNull(byteArray68);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[4]");
//    }

//    @Test
//    public void test1734() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1734");
//        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
//        sevenZArchiveEntry0.setHasLastModifiedDate(false);
//        long long3 = sevenZArchiveEntry0.getCrcValue();
//        java.util.Date date5 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToDate((long) 5);
//        java.nio.file.attribute.FileTime fileTime6 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date5);
//        sevenZArchiveEntry0.setCreationDate(date5);
//        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
//        org.junit.Assert.assertNotNull(date5);
//        org.junit.Assert.assertEquals(date5.toString(), "Mon Jan 01 01:00:00 CET 1601");
//        org.junit.Assert.assertNotNull(fileTime6);
//    }

//    @Test
//    public void test1735() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1735");
//        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
//        sevenZArchiveEntry0.setHasLastModifiedDate(false);
//        sevenZArchiveEntry0.setCreationDate((long) 61440);
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        boolean boolean9 = tarArchiveEntry8.isPaxGNU1XSparse();
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        boolean boolean14 = tarArchiveEntry8.equals(tarArchiveEntry13);
//        tarArchiveEntry13.setUserName("keep");
//        java.lang.String str17 = tarArchiveEntry13.getLinkName();
//        java.nio.file.attribute.FileTime fileTime19 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
//        java.nio.file.attribute.FileTime fileTime20 = org.apache.commons.compress.utils.TimeUtils.truncateToHundredNanos(fileTime19);
//        long long21 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(fileTime20);
//        tarArchiveEntry13.setStatusChangeTime(fileTime20);
//        sevenZArchiveEntry0.setCreationTime(fileTime20);
//        sevenZArchiveEntry0.setHasCrc(true);
//        boolean boolean26 = sevenZArchiveEntry0.getHasLastModifiedDate();
//        java.io.OutputStream outputStream27 = null;
//        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream28 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream27);
//        byte[] byteArray30 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
//        zstdCompressorOutputStream28.write(byteArray30);
//        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream32 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream28);
//        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream28);
//        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
//        boolean boolean39 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray37, (int) (short) 10);
//        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 0 };
//        boolean boolean43 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray37, byteArray42);
//        byte[] byteArray44 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray37);
//        zipArchiveOutputStream33.writePreamble(byteArray44);
//        zipArchiveOutputStream33.finish();
//        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry48 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
//        cpioArchiveEntry48.setInode((long) 2048);
//        java.util.Date date51 = cpioArchiveEntry48.getLastModifiedDate();
//        cpioArchiveEntry48.setChksum(0L);
//        boolean boolean54 = zipArchiveOutputStream33.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry48);
//        java.util.Date date55 = cpioArchiveEntry48.getLastModifiedDate();
//        sevenZArchiveEntry0.setCreationDate(date55);
//        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
//        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
//        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
//        org.junit.Assert.assertNotNull(fileTime19);
//        org.junit.Assert.assertNotNull(fileTime20);
//        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 116444741040000000L + "'", long21 == 116444741040000000L);
//        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
//        org.junit.Assert.assertNotNull(byteArray30);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 0, 33, 0]");
//        org.junit.Assert.assertNotNull(byteArray37);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[10, 0, 0]");
//        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
//        org.junit.Assert.assertNotNull(byteArray42);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 0]");
//        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
//        org.junit.Assert.assertNotNull(byteArray44);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[10, 0, 0]");
//        org.junit.Assert.assertNotNull(date51);
//        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 01:00:00 CET 1970");
//        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
//        org.junit.Assert.assertNotNull(date55);
//        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 01:00:00 CET 1970");
//    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference backReference2 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference((-1), 504);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType blockType3 = backReference2.getType();
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType blockType4 = backReference2.getType();
        int int5 = backReference2.getLength();
        org.junit.Assert.assertTrue("'" + blockType3 + "' != '" + org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE + "'", blockType3.equals(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE));
        org.junit.Assert.assertTrue("'" + blockType4 + "' != '" + org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE + "'", blockType4.equals(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 504 + "'", int5 == 504);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean55 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray53, (int) (short) 100);
        boolean boolean57 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray53, (int) (byte) 0);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel58 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray53);
        java.nio.channels.SeekableByteChannel seekableByteChannel60 = seekableInMemoryByteChannel58.position(0L);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray61 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel62 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray61);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray63 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel64 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray63);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile65 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel64);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray66 = new java.nio.channels.SeekableByteChannel[] { seekableInMemoryByteChannel58, seekableByteChannel62, seekableByteChannel64 };
        java.util.ArrayList<java.nio.channels.SeekableByteChannel> seekableByteChannelList67 = new java.util.ArrayList<java.nio.channels.SeekableByteChannel>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.nio.channels.SeekableByteChannel>) seekableByteChannelList67, seekableByteChannelArray66);
        org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel69 = new org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel((java.util.List<java.nio.channels.SeekableByteChannel>) seekableByteChannelList67);
        org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel70 = new org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel((java.util.List<java.nio.channels.SeekableByteChannel>) seekableByteChannelList67);
        multiReadOnlySeekableByteChannel70.close();
        java.nio.file.Path path72 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer73 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("UTF-16LE", (java.nio.channels.SeekableByteChannel) multiReadOnlySeekableByteChannel70, path72, closeableConsumer73);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: UTF-16LE not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
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
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(seekableByteChannel60);
        org.junit.Assert.assertNotNull(seekableByteChannelArray61);
        org.junit.Assert.assertNotNull(seekableByteChannel62);
        org.junit.Assert.assertNotNull(seekableByteChannelArray63);
        org.junit.Assert.assertNotNull(seekableByteChannel64);
        org.junit.Assert.assertNotNull(seekableByteChannelArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(closeableConsumer73);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort0 = org.apache.commons.compress.archivers.zip.ZipShort.ZERO;
        org.junit.Assert.assertNotNull(zipShort0);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        org.apache.commons.compress.utils.FixedLengthBlockOutputStream fixedLengthBlockOutputStream27 = new org.apache.commons.compress.utils.FixedLengthBlockOutputStream((java.nio.channels.WritableByteChannel) seekableByteChannel25, (int) (short) 8);
        org.apache.commons.compress.archivers.tar.TarFile tarFile32 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel25, 156, 504, "pack.unknown.attribute", false);
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
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream6, "pack.field.attribute.");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream10 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) brotliCompressorInputStream10, 84446, 49152, "cpio");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = tarArchiveInputStream14.getCurrentEntry();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry15);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream10, 508, 263, "lzma");
        int int15 = zstdCompressorInputStream10.getCount();
        long long17 = zstdCompressorInputStream10.skip((long) 31);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory1 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream3 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream2);
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream3.write(byteArray5);
        x0016_CertificateIdForCentralDirectory1.setCentralDirectoryData(byteArray5);
        x0016_CertificateIdForCentralDirectory0.parseFromLocalFileData(byteArray5, 2, (int) (short) 100);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray13 = asiExtraField12.getLocalFileDataData();
        boolean boolean15 = org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.matches(byteArray13, 121);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("\000\000!\000.gz", byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            x0016_CertificateIdForCentralDirectory0.parseFromLocalFileData(byteArray13, 10240, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = org.apache.commons.compress.utils.IOUtils.EMPTY_LINK_OPTIONS;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 83, path1, "BackReference with offset -1 and length 504", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        java.nio.file.Path path6 = tarArchiveEntry5.getPath();
        java.util.Date date7 = tarArchiveEntry5.getLastModifiedDate();
        sevenZArchiveEntry0.setLastModifiedDate(date7);
        java.nio.file.attribute.FileTime fileTime9 = sevenZArchiveEntry0.getLastModifiedTime();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.attribute.FileTime fileTime10 = sevenZArchiveEntry0.getCreationTime();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Jun 19 00:09:04 CEST 2023");
        org.junit.Assert.assertNotNull(fileTime9);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer6 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, 2048, "ar");
        tarArchiveOutputStream9.setLongFileMode(8);
        tarArchiveOutputStream9.finish();
        tarArchiveOutputStream9.setBigNumberMode((int) (byte) 49);
        tarArchiveOutputStream9.setLongFileMode((int) (byte) 88);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3, "bzip2");
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3, 263);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream8 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) deflateCompressorInputStream8, (int) (byte) 48, "pack.effort");
        tarArchiveInputStream11.mark(14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream14 = archiveStreamFactory0.createArchiveInputStream((java.io.InputStream) tarArchiveInputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.SNAPPY_RAW;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "snappy-raw" + "'", str0, "snappy-raw");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        x0016_CertificateIdForCentralDirectory0.setCentralDirectoryData(byteArray4);
        byte[] byteArray7 = x0016_CertificateIdForCentralDirectory0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x0016_CertificateIdForCentralDirectory0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertNotNull(zipShort8);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.PLATFORM_FAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(false);
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
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream10, 508, 263, "lzma");
        org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier inputStreamByteSupplier15 = new org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier((java.io.InputStream) zstdCompressorInputStream10);
        int int16 = inputStreamByteSupplier15.getAsByte();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream5 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream4);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream5.write(byteArray7);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream5);
        long long11 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream2, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream5, 36864);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker12 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray13 = jarMarker12.getLocalFileDataData();
        boolean boolean15 = org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.matches(byteArray13, 64);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully((java.io.InputStream) cpioArchiveInputStream2, byteArray13);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        boolean boolean1 = generalPurposeBit0.usesDataDescriptor();
        boolean boolean2 = generalPurposeBit0.usesUTF8ForNames();
        byte[] byteArray3 = generalPurposeBit0.encode();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream4, 8, "UTF-16LE");
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream7, 64, (int) (byte) 120, "pack.method.attribute.", false);
        boolean boolean13 = generalPurposeBit0.equals((java.lang.Object) (byte) 120);
        boolean boolean14 = generalPurposeBit0.usesDataDescriptor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean46 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray44, (int) (short) 10);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean50 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray44, byteArray49);
        byte[] byteArray51 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray44);
        zipArchiveOutputStream6.writePreamble(byteArray44);
        boolean boolean54 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray44, 128);
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
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream6, "pack.field.attribute.");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream10 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) brotliCompressorInputStream10, 84446, 49152, "cpio");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream15 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream((java.io.InputStream) brotliCompressorInputStream10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Brotli stream decoding failed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 51, "bzip2", (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type 51");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder2 = builder0.withMaxNumberOfCandidates(2097655);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder3 = builder0.tunedForSpeed();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder5 = builder0.withMaxNumberOfCandidates((int) (short) 4);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

//    @Test
//    public void test1758() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1758");
//        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
//        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
//        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
//        org.apache.commons.compress.archivers.tar.TarFile tarFile3 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
//        char[] charArray7 = new char[] { '#', '4', ' ' };
//        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray7);
//        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
//        cpioArchiveEntry10.setInode((long) 2048);
//        java.util.Date date13 = cpioArchiveEntry10.getLastModifiedDate();
//        cpioArchiveEntry10.setChksum(0L);
//        cpioArchiveEntry10.setNumberOfLinks((long) (byte) 53);
//        // The following exception was thrown during execution in test generation
//        try {
//            sevenZOutputFile8.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry10);
//            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry");
//        } catch (java.lang.ClassCastException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
//        org.junit.Assert.assertNotNull(seekableByteChannel1);
//        org.junit.Assert.assertNotNull(charArray7);
//        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#4 ");
//        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#4 ");
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, 4,  ]");
//        org.junit.Assert.assertNotNull(date13);
//        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 01:00:00 CET 1970");
//    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        byte[] byteArray2 = zipArchiveEntry1.getExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        long long4 = zipArchiveEntry1.getTime();
        long long5 = zipArchiveEntry1.getDiskNumberStart();
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        boolean boolean10 = tarArchiveEntry3.isPaxHeader();
        java.lang.String str12 = tarArchiveEntry3.getExtraPaxHeader("");
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream13, 10);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream18 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream17);
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream18.write(byteArray20);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream22 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream18);
        long long24 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream15, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream18, 36864);
        int int25 = cpioArchiveInputStream15.read();
        boolean boolean26 = tarArchiveEntry3.equals((java.lang.Object) int25);
        boolean boolean27 = tarArchiveEntry3.isFIFO();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) (short) 8);
        boolean boolean3 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray1, 4);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream6.finish();
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
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getZ();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "z" + "'", str0, "z");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        int int2 = zipArchiveEntry1.getVersionRequired();
        byte[] byteArray3 = zipArchiveEntry1.getExtra();
        zipArchiveEntry1.setCompressedSize((long) 808471376);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteArray3);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        java.nio.file.attribute.FileTime fileTime10 = tarArchiveEntry3.getCreationTime();
        tarArchiveEntry3.setGroupName("././@LongLink");
        tarArchiveEntry3.setDevMinor((int) (short) 8);
        tarArchiveEntry3.setDevMajor((int) (byte) 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(fileTime10);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 1, false);
        byte[] byteArray3 = resourceAlignmentExtraField2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = resourceAlignmentExtraField2.getCentralDirectoryLength();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean14 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray12, (int) (short) 100);
        boolean boolean16 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray12, 511);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("cpio.gz", byteArray12);
        resourceAlignmentExtraField2.parseFromCentralDirectoryData(byteArray12, 0, (int) (byte) 77);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 0]");
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        x0017_StrongEncryptionHeader0.setCentralDirectoryData(byteArray2);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray4, 2097655);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = x5455_ExtendedTimestamp0.getAccessTime();
        java.nio.file.attribute.FileTime fileTime4 = x5455_ExtendedTimestamp0.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
        byte[] byteArray6 = zipLong5.getBytes();
        x5455_ExtendedTimestamp0.setModifyTime(zipLong5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNull(zipLong3);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNotNull(zipLong5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[80, 75, 7, 8]");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry1.setInode((long) 2048);
        cpioArchiveEntry1.setRemoteDeviceMaj((long) 263);
        boolean boolean6 = cpioArchiveEntry1.isSocket();
        cpioArchiveEntry1.setGID((long) (byte) 2);
        int int9 = cpioArchiveEntry1.getDataPadCount();
        long long10 = cpioArchiveEntry1.getChksum();
        long long11 = cpioArchiveEntry1.getTime();
        long long12 = cpioArchiveEntry1.getSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

//    @Test
//    public void test1770() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1770");
//        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
//        sevenZArchiveEntry0.setHasLastModifiedDate(false);
//        sevenZArchiveEntry0.setCreationDate((long) 61440);
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        boolean boolean9 = tarArchiveEntry8.isPaxGNU1XSparse();
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        boolean boolean14 = tarArchiveEntry8.equals(tarArchiveEntry13);
//        tarArchiveEntry13.setUserName("keep");
//        java.lang.String str17 = tarArchiveEntry13.getLinkName();
//        java.nio.file.attribute.FileTime fileTime19 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
//        java.nio.file.attribute.FileTime fileTime20 = org.apache.commons.compress.utils.TimeUtils.truncateToHundredNanos(fileTime19);
//        long long21 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(fileTime20);
//        tarArchiveEntry13.setStatusChangeTime(fileTime20);
//        sevenZArchiveEntry0.setCreationTime(fileTime20);
//        sevenZArchiveEntry0.setHasCreationDate(true);
//        java.util.Date date26 = sevenZArchiveEntry0.getCreationDate();
//        sevenZArchiveEntry0.setCrc((int) (byte) 48);
//        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
//        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
//        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
//        org.junit.Assert.assertNotNull(fileTime19);
//        org.junit.Assert.assertNotNull(fileTime20);
//        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 116444741040000000L + "'", long21 == 116444741040000000L);
//        org.junit.Assert.assertNotNull(date26);
//        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 01:08:24 CET 1970");
//    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry3.setStatusChangeTime(fileTime4);
        tarArchiveEntry3.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean12 = tarArchiveEntry3.equals(tarArchiveEntry11);
        boolean boolean13 = tarArchiveEntry3.isPaxHeader();
        boolean boolean14 = tarArchiveEntry3.isExtended();
        boolean boolean15 = tarArchiveEntry3.isDirectory();
        tarArchiveEntry3.setGroupId((long) 49152);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp18 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str19 = x5455_ExtendedTimestamp18.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
        x5455_ExtendedTimestamp18.setModifyTime(zipLong20);
        boolean boolean22 = x5455_ExtendedTimestamp18.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp23 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime28 = null;
        tarArchiveEntry27.setStatusChangeTime(fileTime28);
        tarArchiveEntry27.setUserName("unpack.progress");
        tarArchiveEntry27.addPaxHeader("dump", "ISO-8859-1");
        java.util.Date date35 = tarArchiveEntry27.getModTime();
        x5455_ExtendedTimestamp23.setAccessJavaTime(date35);
        x5455_ExtendedTimestamp18.setCreateJavaTime(date35);
        java.nio.file.attribute.FileTime fileTime38 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date35);
        tarArchiveEntry3.setStatusChangeTime(fileTime38);
        boolean boolean40 = tarArchiveEntry3.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str19, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipLong20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Mon Jun 19 00:09:05 CEST 2023");
        org.junit.Assert.assertNotNull(fileTime38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory1 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream3 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream2);
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream3.write(byteArray5);
        x0016_CertificateIdForCentralDirectory1.setCentralDirectoryData(byteArray5);
        java.lang.String str8 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = unparseableExtraField0.onUnparseableExtraField(byteArray5, 508, (int) '#', true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unparseableExtraField0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 33, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\000!\000" + "'", str8, "\000\000!\000");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        tarArchiveEntry8.setUserName("keep");
        boolean boolean12 = tarArchiveEntry8.isSymbolicLink();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime17 = null;
        tarArchiveEntry16.setStatusChangeTime(fileTime17);
        tarArchiveEntry16.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean25 = tarArchiveEntry16.equals(tarArchiveEntry24);
        boolean boolean26 = tarArchiveEntry16.isPaxHeader();
        boolean boolean27 = tarArchiveEntry16.isExtended();
        boolean boolean28 = tarArchiveEntry16.isDirectory();
        tarArchiveEntry16.setGroupId((long) 49152);
        java.io.File file31 = tarArchiveEntry16.getFile();
        boolean boolean32 = tarArchiveEntry8.equals(tarArchiveEntry16);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry35 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        long long36 = tarArchiveEntry35.getSize();
        java.nio.file.attribute.FileTime fileTime37 = tarArchiveEntry35.getStatusChangeTime();
        boolean boolean38 = tarArchiveEntry16.isDescendent(tarArchiveEntry35);
        boolean boolean39 = tarArchiveEntry35.isStreamContiguous();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNull(fileTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer0 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.beans.PropertyChangeListener propertyChangeListener1 = null;
        packer0.removePropertyChangeListener(propertyChangeListener1);
        org.junit.Assert.assertNotNull(packer0);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream10 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream11 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream((java.io.OutputStream) lZMACompressorOutputStream10);
        blockLZ4CompressorOutputStream11.write((int) ' ');
        blockLZ4CompressorOutputStream11.write(5);
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
        // The following exception was thrown during execution in test generation
        try {
            blockLZ4CompressorOutputStream11.prefill(byteArray44, (int) '#', (int) (short) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
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
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry1.setUID((long) 128);
        long long4 = cpioArchiveEntry1.getDeviceMaj();
        long long5 = cpioArchiveEntry1.getInode();
        java.nio.file.attribute.FileTime fileTime7 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) '4');
        cpioArchiveEntry1.setTime(fileTime7);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(fileTime7);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IXOTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream10 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream11 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream((java.io.OutputStream) lZMACompressorOutputStream10);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream12 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) lZMACompressorOutputStream10);
        lZMACompressorOutputStream10.finish();
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
        zipArchiveOutputStream20.finish();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy34 = null;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy34);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean44 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray42, (int) (short) 100);
        boolean boolean46 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray42, (int) (byte) 0);
        zipArchiveOutputStream20.writePreamble(byteArray42);
        boolean boolean49 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray42, 4096);
        // The following exception was thrown during execution in test generation
        try {
            lZMACompressorOutputStream10.write(byteArray42, (int) (byte) 75, (int) (byte) 75);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
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
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer6 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, 2048, "ar");
        tarArchiveOutputStream9.setLongFileMode(8);
        tarArchiveOutputStream9.finish();
        tarArchiveOutputStream9.setBigNumberMode((int) (byte) 49);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream15, 10);
        long long19 = cpioArchiveInputStream17.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream21 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream17, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream17, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream24 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream23);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream25 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream23);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy26 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry30 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime31 = null;
        tarArchiveEntry30.setStatusChangeTime(fileTime31);
        tarArchiveEntry30.setUserName("unpack.progress");
        tarArchiveEntry30.setUserId((long) 29127);
        tarArchiveEntry30.setMode(263);
        tarArchiveEntry30.setUserName("error.gz");
        java.util.Map<java.lang.String, java.lang.String> strMap41 = tarArchiveEntry30.getExtraPaxHeaders();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream42 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zstdCompressorInputStream25, pack200Strategy26, strMap41);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream43 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) tarArchiveOutputStream9, pack200Strategy26);
        tarArchiveOutputStream9.setLongFileMode(16);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(pack200Strategy26);
        org.junit.Assert.assertNotNull(strMap41);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.apache.commons.compress.java.util.jar.Pack200.Unpacker unpacker0 = org.apache.commons.compress.java.util.jar.Pack200.newUnpacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap1 = unpacker0.properties();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        unpacker0.addPropertyChangeListener(propertyChangeListener2);
        org.junit.Assert.assertNotNull(unpacker0);
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        java.nio.file.attribute.FileTime fileTime1 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 11);
        org.junit.Assert.assertNotNull(fileTime1);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        java.io.File file37 = null;
        java.io.File file38 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("ZipShort value: 5", file37, file38);
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
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.commons.compress.archivers.dump.InvalidFormatException invalidFormatException2 = new org.apache.commons.compress.archivers.dump.InvalidFormatException((long) (byte) 2);
        org.apache.commons.compress.archivers.ArchiveException archiveException3 = new org.apache.commons.compress.archivers.ArchiveException("jar", (java.lang.Exception) invalidFormatException2);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.find((int) ' ');
        org.junit.Assert.assertNotNull(pERMISSIONSet1);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.compress.archivers.dump.UnrecognizedFormatException unrecognizedFormatException3 = new org.apache.commons.compress.archivers.dump.UnrecognizedFormatException();
        org.apache.commons.compress.MemoryLimitException memoryLimitException4 = new org.apache.commons.compress.MemoryLimitException((long) '#', (int) ' ', (java.lang.Exception) unrecognizedFormatException3);
        org.apache.commons.compress.archivers.ArchiveException archiveException5 = new org.apache.commons.compress.archivers.ArchiveException("", (java.lang.Exception) memoryLimitException4);
        java.lang.String str6 = memoryLimitException4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.compress.MemoryLimitException: 35 kb of memory would be needed; limit was 32 kb. If the file is not corrupt, consider increasing the memory limit." + "'", str6, "org.apache.commons.compress.MemoryLimitException: 35 kb of memory would be needed; limit was 32 kb. If the file is not corrupt, consider increasing the memory limit.");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, "pass");
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream7);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        java.nio.charset.Charset charset0 = org.apache.commons.compress.utils.Charsets.UTF_16LE;
        org.junit.Assert.assertNotNull(charset0);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1, 10);
        long long5 = cpioArchiveInputStream3.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream8 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream7);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = jarArchiveInputStream7.getNextEntry();
        byte[] byteArray10 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) jarArchiveInputStream7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream11 = archiveStreamFactory0.createArchiveInputStream((java.io.InputStream) jarArchiveInputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(archiveEntry9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse2 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse((long) 16384, (long) 16);
        java.lang.String str3 = tarArchiveStructSparse2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TarArchiveStructSparse{offset=16384, numbytes=16}" + "'", str3, "TarArchiveStructSparse{offset=16384, numbytes=16}");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) 128);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-128, 0, 0, 0]");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = tarArchiveInputStream17.getNextTarEntry();
        boolean boolean19 = tarArchiveInputStream17.markSupported();
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        boolean boolean1 = generalPurposeBit0.usesDataDescriptor();
        boolean boolean2 = generalPurposeBit0.usesUTF8ForNames();
        byte[] byteArray3 = generalPurposeBit0.encode();
        generalPurposeBit0.useStrongEncryption(false);
        byte[] byteArray6 = generalPurposeBit0.encode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0]");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("US-ASCII", (byte) 0);
        tarArchiveEntry2.setDataOffset(116444736002560000L);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("ustar\000.xz", (long) 424935705);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer6 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, 2048, "ar");
        tarArchiveOutputStream9.setLongFileMode(8);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = tarArchiveOutputStream9.createArchiveEntry(file13, "ustar\000.xz");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        // The following exception was thrown during execution in test generation
        try {
            int int16 = deflate64CompressorInputStream14.read();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Truncated Deflate64 Stream");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream10, 508, 263, "lzma");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = tarArchiveInputStream14.getNextTarEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = tarArchiveInputStream14.getCurrentEntry();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry15);
        org.junit.Assert.assertNull(tarArchiveEntry17);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream6, "pack.field.attribute.");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream10 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean19 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray17, (int) (short) 100);
        boolean boolean21 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray17, 511);
        org.apache.commons.compress.archivers.tar.TarFile tarFile23 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray17, true);
        boolean boolean25 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray17, 21);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = brotliCompressorInputStream10.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Brotli stream decoding failed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        int int10 = tarArchiveEntry3.getMode();
        java.lang.String str11 = tarArchiveEntry3.getGroupName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean16 = tarArchiveEntry15.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean21 = tarArchiveEntry15.equals(tarArchiveEntry20);
        tarArchiveEntry20.setUserName("keep");
        java.lang.String str24 = tarArchiveEntry20.getLinkName();
        java.nio.file.attribute.FileTime fileTime26 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        java.nio.file.attribute.FileTime fileTime27 = org.apache.commons.compress.utils.TimeUtils.truncateToHundredNanos(fileTime26);
        long long28 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(fileTime27);
        tarArchiveEntry20.setStatusChangeTime(fileTime27);
        tarArchiveEntry3.setModTime(fileTime27);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33188 + "'", int10 == 33188);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(fileTime26);
        org.junit.Assert.assertNotNull(fileTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 116444741040000000L + "'", long28 == 116444741040000000L);
    }

//    @Test
//    public void test1800() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1800");
//        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        boolean boolean5 = tarArchiveEntry4.isPaxGNU1XSparse();
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        boolean boolean10 = tarArchiveEntry4.equals(tarArchiveEntry9);
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        java.nio.file.attribute.FileTime fileTime15 = null;
//        tarArchiveEntry14.setStatusChangeTime(fileTime15);
//        tarArchiveEntry14.setUserName("unpack.progress");
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        boolean boolean23 = tarArchiveEntry14.equals(tarArchiveEntry22);
//        java.nio.file.attribute.FileTime fileTime25 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
//        tarArchiveEntry22.setLastModifiedTime(fileTime25);
//        tarArchiveEntry9.setLastAccessTime(fileTime25);
//        java.util.Date date29 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToDate((long) 5);
//        java.nio.file.attribute.FileTime fileTime30 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date29);
//        tarArchiveEntry9.setModTime(fileTime30);
//        boolean boolean32 = dumpArchiveEntry0.equals((java.lang.Object) fileTime30);
//        boolean boolean33 = dumpArchiveEntry0.isDeleted();
//        dumpArchiveEntry0.setGroupId(476);
//        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
//        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
//        org.junit.Assert.assertNotNull(fileTime25);
//        org.junit.Assert.assertNotNull(date29);
//        org.junit.Assert.assertEquals(date29.toString(), "Mon Jan 01 01:00:00 CET 1601");
//        org.junit.Assert.assertNotNull(fileTime30);
//        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
//        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
//    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        xZCompressorOutputStream24.finish();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong27 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        byte[] byteArray28 = zipLong27.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            xZCompressorOutputStream24.write(byteArray28, 345, 4095);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(zipLong27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[80, 75, 48, 48]");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("z", (long) (byte) 51);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(true);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        boolean boolean10 = tarArchiveEntry3.isPaxHeader();
        java.lang.String str12 = tarArchiveEntry3.getExtraPaxHeader("");
        int int13 = tarArchiveEntry3.getMode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33188 + "'", int13 == 33188);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.CODE_ATTRIBUTE_PFX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pack.code.attribute." + "'", str0, "pack.code.attribute.");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = zipArchiveInputStream8.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream lZMACompressorInputStream13 = new org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream((java.io.InputStream) zipArchiveInputStream8, 420);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry10);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory10 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory11 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream13 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream12);
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream13.write(byteArray15);
        x0016_CertificateIdForCentralDirectory11.setCentralDirectoryData(byteArray15);
        x0016_CertificateIdForCentralDirectory10.parseFromLocalFileData(byteArray15, 2, (int) (short) 100);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream22 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream21);
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream22.write(byteArray24);
        boolean boolean27 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray24, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray24, (int) (short) 0);
        x0016_CertificateIdForCentralDirectory10.setCentralDirectoryData(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = brotliCompressorInputStream9.read(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Brotli stream decoding failed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.FileNameUtil fileNameUtil2 = new org.apache.commons.compress.compressors.FileNameUtil(strMap0, "070707");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        countingOutputStream24.write((int) (byte) 49);
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
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.LONGNAMESLEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray3 = new char[] { ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions4 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "pack.segment.limit", charArray3, sevenZFileOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertNotNull(sevenZFileOptions4);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder1 = org.apache.commons.compress.compressors.lz77support.Parameters.builder(493);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: windowSize must be a power of two");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        x0017_StrongEncryptionHeader0.setCentralDirectoryData(byteArray2);
        byte[] byteArray4 = x0017_StrongEncryptionHeader0.getLocalFileDataData();
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean10 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray8, (int) (short) 10);
        x0017_StrongEncryptionHeader0.setCentralDirectoryData(byteArray8);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean18 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray16, (int) (short) 10);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray16, byteArray21);
        byte[] byteArray23 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray16);
        boolean boolean25 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray16, (int) (short) 100);
        boolean boolean27 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray16, 3);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("././@LongLink", byteArray16, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseCentralDirectoryFormat(byteArray16, 8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only 1 bytes, expected at least 12");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong0 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        byte[] byteArray1 = zipLong0.getBytes();
        byte[] byteArray2 = zipLong0.getBytes();
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel3 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray2);
        long long4 = seekableInMemoryByteChannel3.position();
        org.junit.Assert.assertNotNull(zipLong0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[80, 75, 48, 48]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[80, 75, 48, 48]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        x0017_StrongEncryptionHeader0.setCentralDirectoryData(byteArray2);
        byte[] byteArray4 = x0017_StrongEncryptionHeader0.getLocalFileDataData();
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean10 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray8, (int) (short) 10);
        x0017_StrongEncryptionHeader0.setCentralDirectoryData(byteArray8);
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm12 = x0017_StrongEncryptionHeader0.getHashAlgorithm();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(hashAlgorithm12);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
            xZCompressorOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters6 = null;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream7 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, parameters6);
        org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream9 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) framedSnappyCompressorOutputStream7, (int) (short) 3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        org.apache.commons.compress.utils.FlushShieldFilterOutputStream flushShieldFilterOutputStream13 = new org.apache.commons.compress.utils.FlushShieldFilterOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        flushShieldFilterOutputStream13.flush();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
    }

//    @Test
//    public void test1819() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1819");
//        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
//        cpioArchiveEntry1.setInode((long) 2048);
//        java.util.Date date4 = cpioArchiveEntry1.getLastModifiedDate();
//        cpioArchiveEntry1.setChksum(0L);
//        cpioArchiveEntry1.setNumberOfLinks((long) (byte) 53);
//        boolean boolean9 = cpioArchiveEntry1.isSymbolicLink();
//        cpioArchiveEntry1.setInode(6L);
//        org.junit.Assert.assertNotNull(date4);
//        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 01:00:00 CET 1970");
//        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
//    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = null;
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit2);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData4 = zipArchiveEntry1.getUnparseableExtraFieldData();
        boolean boolean5 = zipArchiveEntry1.isStreamContiguous();
        java.lang.String str6 = zipArchiveEntry1.getName();
        zipArchiveEntry1.setDiskNumberStart((long) 100);
        org.junit.Assert.assertNull(unparseableExtraFieldData4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "pack.method.attribute." + "'", str6, "pack.method.attribute.");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        // The following exception was thrown during execution in test generation
        try {
            pack200CompressorOutputStream23.close();
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
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream10, 508, 263, "lzma");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = tarArchiveInputStream14.getNextTarEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = arArchiveInputStream16.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Failed to read header. Occurred at byte: 0");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry15);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream lZMACompressorInputStream19 = new org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream((java.io.InputStream) cpioArchiveInputStream5, 420);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray1 = jarMarker0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker0.getCentralDirectoryLength();
        byte[] byteArray3 = jarMarker0.getLocalFileDataData();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) 10);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray4, false);
        java.nio.file.Path path13 = null;
        expander0.expand(tarFile12, path13);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean20 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray18, (int) (short) 10);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray23);
        boolean boolean26 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray23, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarFile tarFile27 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray23);
        java.nio.file.Path path28 = null;
        expander0.expand(tarFile27, path28);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
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
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry22 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("!<arch>\n");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
        int int24 = zipLong23.getIntValue();
        boolean boolean25 = jarArchiveEntry22.equals((java.lang.Object) zipLong23);
        x5455_ExtendedTimestamp0.setAccessTime(zipLong23);
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(fileTime16);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertNotNull(zipLong23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 134695760 + "'", int24 == 134695760);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = null;
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit2);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData4 = zipArchiveEntry1.getUnparseableExtraFieldData();
        boolean boolean5 = zipArchiveEntry1.isStreamContiguous();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = zipArchiveEntry1.getExtraFields();
        boolean boolean7 = zipArchiveEntry1.isStreamContiguous();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField12 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger8, zipEightByteInteger9, zipEightByteInteger10, zipLong11);
        byte[] byteArray13 = zip64ExtendedInformationExtraField12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.tar.TarFile tarFile15 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray13, true);
        boolean boolean16 = zipArchiveEntry1.equals((java.lang.Object) byteArray13);
        org.junit.Assert.assertNull(unparseableExtraFieldData4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipLong11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[80, 75, 48, 48]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = null;
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit2);
        zipArchiveEntry1.setComment("apks");
        boolean boolean6 = zipArchiveEntry1.isDirectory();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        boolean boolean1 = dumpArchiveEntry0.isDirectory();
        int int2 = dumpArchiveEntry0.getGeneration();
        boolean boolean3 = dumpArchiveEntry0.isFifo();
        boolean boolean4 = dumpArchiveEntry0.isFifo();
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet5 = dumpArchiveEntry0.getPermissions();
        int int6 = dumpArchiveEntry0.getIno();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pERMISSIONSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory2 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false, 6);
        java.util.Set<java.lang.String> strSet3 = compressorStreamFactory2.getOutputStreamCompressorNames();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream6 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream5);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream6.write(byteArray8);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream10 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream6);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream6);
        arArchiveOutputStream11.finish();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream13 = compressorStreamFactory2.createCompressorOutputStream("jar", (java.io.OutputStream) arArchiveOutputStream11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.compressors.CompressorException; message: Compressor: jar not found.");
        } catch (org.apache.commons.compress.compressors.CompressorException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 33, 0]");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES192;
        int int1 = encryptionAlgorithm0.getCode();
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES192 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES192));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26127 + "'", int1 == 26127);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream1 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.pathBased(path0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        java.io.File[] fileArray0 = new java.io.File[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forFiles(fileArray0);
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forFiles(fileArray0);
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forFiles(fileArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel4 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(seekableByteChannel2);
        org.junit.Assert.assertNotNull(seekableByteChannel3);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0016_CertificateIdForCentralDirectory0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x0016_CertificateIdForCentralDirectory0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream5 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream4);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream5.write(byteArray7);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream5);
        long long11 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream2, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream5, 36864);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream12 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) cpioArchiveInputStream2);
        java.lang.String str13 = zstdCompressorInputStream12.toString();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        int int1 = dumpArchiveEntry0.getGroupId();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE2 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.LINK;
        dumpArchiveEntry0.setType(tYPE2);
        int int4 = dumpArchiveEntry0.getGroupId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + tYPE2 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.LINK + "'", tYPE2.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.LINK));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        boolean boolean1 = arjArchiveEntry0.isHostOsUnix();
        boolean boolean3 = arjArchiveEntry0.equals((java.lang.Object) "\000\000!\000");
        java.util.EnumSet<java.nio.file.FileVisitOption> fileVisitOptionSet4 = org.apache.commons.compress.archivers.examples.Archiver.EMPTY_FileVisitOption;
        boolean boolean5 = arjArchiveEntry0.equals((java.lang.Object) fileVisitOptionSet4);
        java.lang.String str6 = arjArchiveEntry0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fileVisitOptionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("unpack.progress", (long) 512, 0, 4, 12, 10L);
        long long7 = arArchiveEntry6.getLastModified();
        int int8 = arArchiveEntry6.getGroupId();
        boolean boolean9 = arArchiveEntry6.isDirectory();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream10, 508, 263, "lzma");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = tarArchiveInputStream14.getNextTarEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream14);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream16.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry15);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream10 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream11 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        gzipCompressorOutputStream11.flush();
        // The following exception was thrown during execution in test generation
        try {
            gzipCompressorOutputStream11.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile3 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile4.write(byteArray5, 156, 29127);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current 7z entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.nio.file.Path path0 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier1 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path0);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = defaultBackingStoreSupplier1.get();
        java.io.InputStream inputStream3 = scatterGatherBackingStore2.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream gzipCompressorInputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream(inputStream3, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Input is not in the .gz format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore2);
        org.junit.Assert.assertNotNull(inputStream3);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream10 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream11 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory12 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream14 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream13);
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream14.write(byteArray16);
        x0016_CertificateIdForCentralDirectory12.setCentralDirectoryData(byteArray16);
        boolean boolean20 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray16, 4095);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray16, (int) '4');
        pack200CompressorOutputStream9.write(byteArray16);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding1 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("error.gz");
        boolean boolean3 = zipEncoding1.canEncode("");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader4 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        x0017_StrongEncryptionHeader4.setCentralDirectoryData(byteArray6);
        byte[] byteArray8 = x0017_StrongEncryptionHeader4.getLocalFileDataData();
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean14 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray12, (int) (short) 10);
        x0017_StrongEncryptionHeader4.setCentralDirectoryData(byteArray12);
        java.lang.String str16 = zipEncoding1.decode(byteArray12);
        java.nio.ByteBuffer byteBuffer18 = zipEncoding1.encode("true");
        org.junit.Assert.assertNotNull(zipEncoding1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000\000\n" + "'", str16, "\000\000\n");
        org.junit.Assert.assertNotNull(byteBuffer18);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        x0016_CertificateIdForCentralDirectory0.setCentralDirectoryData(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 4095);
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray4, (int) '4');
        boolean boolean12 = org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.matches(byteArray4, 11);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream6, "pack.field.attribute.");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream10 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        long long11 = jarArchiveInputStream6.getBytesRead();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("never", "\000\000\n");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = dumpArchiveEntry2.isSparseRecord(61440);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 61440");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, (int) (short) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel11 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray6);
        long long12 = seekableInMemoryByteChannel11.position();
        java.nio.channels.SeekableByteChannel seekableByteChannel14 = seekableInMemoryByteChannel11.position(0L);
        boolean boolean15 = seekableInMemoryByteChannel11.isOpen();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(seekableByteChannel14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
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
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        closeShieldFilterInputStream1.close();
        org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier inputStreamByteSupplier3 = new org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) closeShieldFilterInputStream1, 128, "pack.field.attribute.");
        org.apache.commons.compress.utils.BoundedInputStream boundedInputStream9 = new org.apache.commons.compress.utils.BoundedInputStream((java.io.InputStream) tarArchiveInputStream7, (long) 36864);
        boundedInputStream9.close();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = boundedInputStream9.read();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        int int2 = zipArchiveEntry1.getVersionRequired();
        byte[] byteArray3 = zipArchiveEntry1.getExtra();
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getCreationTime();
        byte[] byteArray5 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource6 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME_WITH_EFS_FLAG;
        zipArchiveEntry1.setNameSource(nameSource6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + nameSource6 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME_WITH_EFS_FLAG + "'", nameSource6.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME_WITH_EFS_FLAG));
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        int int1 = dumpArchiveEntry0.getGroupId();
        boolean boolean2 = dumpArchiveEntry0.isBlkDev();
        dumpArchiveEntry0.setSize((long) 16877);
        int int5 = dumpArchiveEntry0.getHeaderCount();
        int int6 = dumpArchiveEntry0.getUserId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        int int2 = zipArchiveEntry1.getVersionRequired();
        byte[] byteArray3 = zipArchiveEntry1.getExtra();
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getCreationTime();
        byte[] byteArray5 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit6 = zipArchiveEntry1.getGeneralPurposeBit();
        int int7 = zipArchiveEntry1.getPlatform();
        long long8 = zipArchiveEntry1.getDataOffset();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp9 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp9.getCreateTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime15 = null;
        tarArchiveEntry14.setStatusChangeTime(fileTime15);
        tarArchiveEntry14.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean23 = tarArchiveEntry14.equals(tarArchiveEntry22);
        java.nio.file.attribute.FileTime fileTime25 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        tarArchiveEntry22.setLastModifiedTime(fileTime25);
        x5455_ExtendedTimestamp9.setModifyFileTime(fileTime25);
        java.util.Date date28 = x5455_ExtendedTimestamp9.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = x5455_ExtendedTimestamp9.getLocalFileDataLength();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort29);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNotNull(generalPurposeBit6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(fileTime25);
        org.junit.Assert.assertNull(date28);
        org.junit.Assert.assertNotNull(zipShort29);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        xXHash32_0.update(5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("pack.pass.file.", (byte) 120);
        int int3 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("jar", (byte) 0);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        int int21 = zipShort20.getValue();
        boolean boolean23 = zipShort20.equals((java.lang.Object) 504L);
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(fileTime16);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
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
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry25 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry25.setHasLastModifiedDate(false);
        long long28 = sevenZArchiveEntry25.getSize();
        sevenZArchiveEntry25.setHasStream(false);
        sevenZArchiveEntry25.setSize(116444736001000000L);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) sevenZArchiveEntry25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
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
        org.junit.Assert.assertTrue("'" + zip64Mode23 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility + "'", zip64Mode23.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        int int1 = dumpArchiveEntry0.getGroupId();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE2 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.LINK;
        dumpArchiveEntry0.setType(tYPE2);
        dumpArchiveEntry0.setDeleted(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + tYPE2 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.LINK + "'", tYPE2.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.LINK));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer6 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, 2048, "ar");
        tarArchiveOutputStream9.setLongFileMode(8);
        tarArchiveOutputStream9.finish();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray20, (int) (short) 100);
        boolean boolean24 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray20, 511);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField25 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("cpio.gz", byteArray20);
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray20, 26128);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.write(byteArray20, (int) 'a', (int) (byte) 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.lang.String str0 = org.apache.commons.compress.archivers.cpio.CpioConstants.CPIO_TRAILER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "TRAILER!!!" + "'", str0, "TRAILER!!!");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator25 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier26 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable27 = parallelScatterZipCreator25.createCallable(zipArchiveEntryRequestSupplier26);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator28 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream30 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream29);
        byte[] byteArray32 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream30.write(byteArray32);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream34 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream30);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream30);
        parallelScatterZipCreator28.writeTo(zipArchiveOutputStream35);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier37 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable38 = parallelScatterZipCreator28.createCallable(zipArchiveEntryRequestSupplier37);
        parallelScatterZipCreator25.submitStreamAwareCallable(scatterZipOutputStreamCallable38);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        zipArchiveEntry41.setMethod((int) (byte) 88);
        java.nio.file.attribute.FileTime fileTime44 = zipArchiveEntry41.getCreationTime();
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier45 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable46 = parallelScatterZipCreator25.createCallable(zipArchiveEntry41, inputStreamSupplier45);
        java.io.InputStream inputStream47 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream48 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream47);
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream51 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) cpioArchiveInputStream48, (long) (byte) 100, (int) (short) 3);
        long long53 = cRC32VerifyingInputStream51.skip(0L);
        long long55 = cRC32VerifyingInputStream51.skip((long) (byte) 100);
        org.apache.commons.compress.utils.BoundedInputStream boundedInputStream57 = new org.apache.commons.compress.utils.BoundedInputStream((java.io.InputStream) cRC32VerifyingInputStream51, (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.addRawArchiveEntry(zipArchiveEntry41, (java.io.InputStream) boundedInputStream57);
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
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable27);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable38);
        org.junit.Assert.assertNull(fileTime44);
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable46);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = null;
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit2);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields(false);
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest zipArchiveEntryRequest7 = org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry1, inputStreamSupplier6);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit8 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit8);
        generalPurposeBit8.useStrongEncryption(false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertNotNull(zipArchiveEntryRequest7);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        boolean boolean1 = generalPurposeBit0.usesDataDescriptor();
        boolean boolean2 = generalPurposeBit0.usesEncryption();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize3 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.K256;
        org.apache.commons.compress.compressors.lz77support.Parameters parameters4 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters5 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize3, parameters4);
        boolean boolean6 = generalPurposeBit0.equals((java.lang.Object) parameters5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + blockSize3 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.K256 + "'", blockSize3.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.K256));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        int int4 = tarArchiveEntry3.getMode();
        boolean boolean5 = tarArchiveEntry3.isStreamContiguous();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 33188 + "'", int4 == 33188);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        java.lang.String str1 = gzipParameters0.getFilename();
        gzipParameters0.setModificationTime((long) (byte) -1);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference backReference2 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference((-1), 504);
        int int3 = backReference2.getLength();
        int int4 = backReference2.getLength();
        int int5 = backReference2.getLength();
        int int6 = backReference2.getOffset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 504 + "'", int3 == 504);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 504 + "'", int4 == 504);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 504 + "'", int5 == 504);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean30 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray28, (int) (short) 100);
        boolean boolean32 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray28, (int) (byte) 0);
        zipArchiveOutputStream6.writePreamble(byteArray28);
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry34 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry34.setHasLastModifiedDate(false);
        long long37 = sevenZArchiveEntry34.getSize();
        sevenZArchiveEntry34.setHasStream(false);
        sevenZArchiveEntry34.setSize(116444736001000000L);
        sevenZArchiveEntry34.setLastModifiedDate((long) 14);
        boolean boolean44 = zipArchiveOutputStream6.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) sevenZArchiveEntry34);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry46 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(".gz.xz");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry46);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
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
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        boolean boolean19 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray16, (int) (byte) -1);
        boolean boolean21 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray16, 29127);
        boolean boolean23 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray16, (int) (short) 8);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray16, 12, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(encryptionAlgorithm12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getOutputStreamArchiveNames();
        java.lang.String str2 = archiveStreamFactory0.getEntryEncoding();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator1 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream3 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream2);
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream3.write(byteArray5);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream3);
        parallelScatterZipCreator1.writeTo(zipArchiveOutputStream8);
        zipArchiveOutputStream8.setFallbackToUTF8(true);
        java.nio.file.Path path12 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) zipArchiveOutputStream8, path12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 33, 0]");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        int int0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.THROW_KEY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ar", true);
        java.nio.file.attribute.FileTime fileTime3 = tarArchiveEntry2.getLastAccessTime();
        org.junit.Assert.assertNull(fileTime3);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory2 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false, 6);
        java.util.Set<java.lang.String> strSet3 = compressorStreamFactory2.getOutputStreamCompressorNames();
        java.util.Set<java.lang.String> strSet4 = compressorStreamFactory2.getInputStreamCompressorNames();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream26, "bzip2");
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream31 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) zipArchiveInputStream28, 100L, (int) '#');
        java.io.File file32 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) zipArchiveInputStream28, file32);
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream36 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream34, 10);
        java.io.OutputStream outputStream38 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream39 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream38);
        byte[] byteArray41 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream39.write(byteArray41);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream43 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream39);
        long long45 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream36, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream39, 36864);
        int int46 = cpioArchiveInputStream36.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream36, 2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream49 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream36);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream51 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream36, "xz");
        java.io.File file52 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((java.io.InputStream) cpioArchiveInputStream51, file52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.utils.SkipShieldingInputStream skipShieldingInputStream11 = new org.apache.commons.compress.utils.SkipShieldingInputStream((java.io.InputStream) zipArchiveInputStream8);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator23 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream25 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream24);
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream25.write(byteArray27);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream29 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream25);
        parallelScatterZipCreator23.writeTo(zipArchiveOutputStream30);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream32 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream30);
        jarArchiveOutputStream32.setUseLanguageEncodingFlag(false);
        jarArchiveOutputStream32.setFallbackToUTF8(true);
        java.io.OutputStream outputStream37 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream38 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream37);
        byte[] byteArray40 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream38.write(byteArray40);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream42 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream38);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream43 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream38);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy44 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream43.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy44);
        jarArchiveOutputStream32.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy44);
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy44);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6, 156, 493);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 156");
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
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy44);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.find(16384);
        org.junit.Assert.assertNotNull(pERMISSIONSet1);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        long long3 = zstdCompressorInputStream2.getCompressedCount();
        long long4 = zstdCompressorInputStream2.getBytesRead();
        boolean boolean5 = zstdCompressorInputStream2.markSupported();
        org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream blockLZ4CompressorInputStream6 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream((java.io.InputStream) zstdCompressorInputStream2);
        int int7 = blockLZ4CompressorInputStream6.getSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        boolean boolean1 = dumpArchiveEntry0.isDirectory();
        int int2 = dumpArchiveEntry0.getGeneration();
        int int3 = dumpArchiveEntry0.getHeaderCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray3, (int) (short) 10);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray3, byteArray8);
        boolean boolean11 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray8, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("error.gz");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray8, zipEncoding13, true, (long) 29127);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
        org.junit.Assert.assertNotNull(zipEncoding13);
    }

//    @Test
//    public void test1885() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1885");
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
//        java.util.Date date6 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToDate((long) 5);
//        java.nio.file.attribute.FileTime fileTime7 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date6);
//        tarArchiveEntry3.setStatusChangeTime(fileTime7);
//        java.nio.file.attribute.FileTime fileTime9 = tarArchiveEntry3.getLastModifiedTime();
//        boolean boolean10 = tarArchiveEntry3.isPaxGNU1XSparse();
//        boolean boolean11 = tarArchiveEntry3.isPaxGNUSparse();
//        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
//        org.junit.Assert.assertNotNull(date6);
//        org.junit.Assert.assertEquals(date6.toString(), "Mon Jan 01 01:00:00 CET 1601");
//        org.junit.Assert.assertNotNull(fileTime7);
//        org.junit.Assert.assertNotNull(fileTime9);
//        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
//        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
//    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException0 = new org.apache.commons.compress.archivers.dump.DumpArchiveException();
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        generalPurposeBit0.useUTF8ForNames(false);
        generalPurposeBit0.useDataDescriptor(true);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.io.File file0 = null;
        java.io.File file1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        boolean boolean5 = tarArchiveEntry4.isFIFO();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = tarArchiveEntry4.getExtraPaxHeaders();
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
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, (int) (short) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel11 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray6);
        java.nio.channels.SeekableByteChannel seekableByteChannel13 = seekableInMemoryByteChannel11.position(0L);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray14 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray14);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel15);
        org.apache.commons.compress.archivers.tar.TarFile tarFile17 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel15);
        char[] charArray21 = new char[] { '#', '4', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile22 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel15, charArray21);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile((java.nio.channels.SeekableByteChannel) seekableInMemoryByteChannel11, charArray21);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(seekableByteChannel13);
        org.junit.Assert.assertNotNull(seekableByteChannelArray14);
        org.junit.Assert.assertNotNull(seekableByteChannel15);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#, 4,  ]");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.nio.file.attribute.FileTime fileTime5 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        java.nio.file.attribute.FileTime fileTime6 = org.apache.commons.compress.utils.TimeUtils.truncateToHundredNanos(fileTime5);
        long long7 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(fileTime6);
        x5455_ExtendedTimestamp0.setCreateFileTime(fileTime6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(fileTime5);
        org.junit.Assert.assertNotNull(fileTime6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 116444741040000000L + "'", long7 == 116444741040000000L);
        org.junit.Assert.assertNotNull(zipShort9);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(file0, (long) 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.fileBased(file0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile3 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        char[] charArray7 = new char[] { '#', '4', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray7);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile8.write(493);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current 7z entry");
        } catch (java.lang.IllegalStateException e) {
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
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getUserId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getCentralDirectoryLength();
        byte[] byteArray4 = asiExtraField0.getCentralDirectoryData();
        int int5 = asiExtraField0.getUserId();
        int int6 = asiExtraField0.getMode();
        int int7 = asiExtraField0.getUserId();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor3 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(3, scatterGatherBackingStore2);
        long long4 = streamCompressor3.getCrc32();
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream5 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore0, streamCompressor3);
        long long6 = streamCompressor3.getCrc32();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode7 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray9);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = extraFieldParsingMode7.onUnparseableExtraField(byteArray10, (int) (short) 0, 84446, true, 16877);
        boolean boolean17 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 121);
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor3.writeCounted(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode7 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT + "'", extraFieldParsingMode7.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        java.nio.file.Path path1 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier2 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path1);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore3 = defaultBackingStoreSupplier2.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor4 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(0, scatterGatherBackingStore3);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore3);
        org.junit.Assert.assertNotNull(streamCompressor4);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        closeShieldFilterInputStream1.close();
        org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier inputStreamByteSupplier3 = new org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) closeShieldFilterInputStream1, 128, "pack.field.attribute.");
        // The following exception was thrown during execution in test generation
        try {
            long long9 = closeShieldFilterInputStream1.skip((long) 420);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 1);
        cpioArchiveEntry1.setDeviceMin((long) 4096);
        cpioArchiveEntry1.setDeviceMaj(16877L);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("z", byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        tarArchiveEntry8.setUserName("keep");
        boolean boolean12 = tarArchiveEntry8.isSymbolicLink();
        boolean boolean13 = tarArchiveEntry8.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField0 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        byte[] byteArray1 = unicodePathExtraField0.getLocalFileDataData();
        long long2 = unicodePathExtraField0.getNameCRC32();
        byte[] byteArray3 = unicodePathExtraField0.getLocalFileDataData();
        org.junit.Assert.assertNull(byteArray1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(byteArray3);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = dumpArchiveEntry0.getHeaderType();
        long long2 = dumpArchiveEntry0.getOffset();
        org.junit.Assert.assertNull(sEGMENT_TYPE1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

//    @Test
//    public void test1903() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1903");
//        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
//        java.util.Date date1 = arjArchiveEntry0.getLastModifiedDate();
//        org.apache.commons.compress.archivers.dump.UnrecognizedFormatException unrecognizedFormatException2 = new org.apache.commons.compress.archivers.dump.UnrecognizedFormatException();
//        boolean boolean3 = arjArchiveEntry0.equals((java.lang.Object) unrecognizedFormatException2);
//        org.junit.Assert.assertNotNull(date1);
//        org.junit.Assert.assertEquals(date1.toString(), "Fri Nov 30 00:00:00 CET 1979");
//        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
//    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        java.nio.file.Path path1 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier2 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path1);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore3 = defaultBackingStoreSupplier2.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor4 = org.apache.commons.compress.archivers.zip.StreamCompressor.create((int) (short) 3, scatterGatherBackingStore3);
        java.io.InputStream inputStream5 = scatterGatherBackingStore3.getInputStream();
        org.junit.Assert.assertNotNull(scatterGatherBackingStore3);
        org.junit.Assert.assertNotNull(streamCompressor4);
        org.junit.Assert.assertNotNull(inputStream5);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean9 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray7, (int) (short) 100);
        org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(0L, byteArray7, 1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray7);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, 33, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        boolean boolean1 = arjArchiveEntry0.isHostOsUnix();
        java.lang.String str2 = arjArchiveEntry0.getName();
        long long3 = arjArchiveEntry0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        int int2 = zipArchiveEntry1.getVersionRequired();
        byte[] byteArray3 = zipArchiveEntry1.getExtra();
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getCreationTime();
        byte[] byteArray5 = zipArchiveEntry1.getRawName();
        int int6 = zipArchiveEntry1.getPlatform();
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource8 = zipArchiveEntry1.getCommentSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + commentSource8 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT + "'", commentSource8.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT));
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getOutputStreamArchiveNames();
        java.util.Set<java.lang.String> strSet2 = archiveStreamFactory0.getOutputStreamArchiveNames();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, (int) (short) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray10, (int) (byte) 0);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel15 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray10);
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = seekableInMemoryByteChannel15.position(0L);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray18 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel19 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray18);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray20 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel21 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray20);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile22 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel21);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray23 = new java.nio.channels.SeekableByteChannel[] { seekableInMemoryByteChannel15, seekableByteChannel19, seekableByteChannel21 };
        java.util.ArrayList<java.nio.channels.SeekableByteChannel> seekableByteChannelList24 = new java.util.ArrayList<java.nio.channels.SeekableByteChannel>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.nio.channels.SeekableByteChannel>) seekableByteChannelList24, seekableByteChannelArray23);
        org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel26 = new org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel((java.util.List<java.nio.channels.SeekableByteChannel>) seekableByteChannelList24);
        boolean boolean27 = multiReadOnlySeekableByteChannel26.isOpen();
        java.nio.channels.SeekableByteChannel seekableByteChannel29 = multiReadOnlySeekableByteChannel26.position(134695760L);
        org.apache.commons.compress.utils.FixedLengthBlockOutputStream fixedLengthBlockOutputStream31 = new org.apache.commons.compress.utils.FixedLengthBlockOutputStream((java.nio.channels.WritableByteChannel) seekableByteChannel29, (int) (short) 8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream33 = archiveStreamFactory0.createArchiveOutputStream("", (java.io.OutputStream) fixedLengthBlockOutputStream31, "xz");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver:  not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(seekableByteChannel17);
        org.junit.Assert.assertNotNull(seekableByteChannelArray18);
        org.junit.Assert.assertNotNull(seekableByteChannel19);
        org.junit.Assert.assertNotNull(seekableByteChannelArray20);
        org.junit.Assert.assertNotNull(seekableByteChannel21);
        org.junit.Assert.assertNotNull(seekableByteChannelArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(seekableByteChannel29);
    }

//    @Test
//    public void test1909() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1909");
//        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
//        cpioArchiveEntry1.setInode((long) 2048);
//        java.util.Date date4 = cpioArchiveEntry1.getLastModifiedDate();
//        int int6 = cpioArchiveEntry1.getHeaderPadCount(6L);
//        org.junit.Assert.assertNotNull(date4);
//        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 01:00:00 CET 1970");
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
//    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        long long2 = cpioArchiveEntry1.getGID();
        long long3 = cpioArchiveEntry1.getUID();
        int int4 = cpioArchiveEntry1.getHeaderSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 110 + "'", int4 == 110);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0017_StrongEncryptionHeader0.getHashAlgorithm();
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray5, (int) (short) 10);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray10);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray5);
        boolean boolean14 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.matches(byteArray5, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray5, 16877, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 16877 > 16876");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        org.apache.commons.compress.archivers.tar.TarFile tarFile19 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray17);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray17);
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
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC2pre52;
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC2pre52 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC2pre52));
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("!<arch>\n");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
        int int3 = zipLong2.getIntValue();
        boolean boolean4 = jarArchiveEntry1.equals((java.lang.Object) zipLong2);
        byte[] byteArray5 = zipLong2.getBytes();
        org.junit.Assert.assertNotNull(zipLong2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 134695760 + "'", int3 == 134695760);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 75, 7, 8]");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        x0016_CertificateIdForCentralDirectory0.setCentralDirectoryData(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 4095);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, 60012);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry3.setStatusChangeTime(fileTime4);
        tarArchiveEntry3.setUserName("unpack.progress");
        tarArchiveEntry3.setUserId((long) 29127);
        tarArchiveEntry3.setMode(263);
        boolean boolean12 = tarArchiveEntry3.isSparse();
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList13 = tarArchiveEntry3.getOrderedSparseHeaders();
        boolean boolean14 = tarArchiveEntry3.isExtended();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        closeShieldFilterInputStream1.close();
        org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier inputStreamByteSupplier3 = new org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) closeShieldFilterInputStream1, 128, "pack.field.attribute.");
        org.apache.commons.compress.utils.BoundedInputStream boundedInputStream9 = new org.apache.commons.compress.utils.BoundedInputStream((java.io.InputStream) tarArchiveInputStream7, (long) 36864);
        boundedInputStream9.close();
        boundedInputStream9.close();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = boundedInputStream9.skip((long) (byte) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField1 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unicodePathExtraField1.getHeaderId();
        unrecognizedExtraField0.setHeaderId(zipShort2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        unrecognizedExtraField0.setHeaderId(zipShort4);
        byte[] byteArray6 = unrecognizedExtraField0.getCentralDirectoryData();
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(byteArray6);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong0 = org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG;
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean2 = zipLong0.equals((java.lang.Object) compressorStreamFactory1);
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> strMap3 = compressorStreamFactory1.getCompressorInputStreamProviders();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream6 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream5);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream6.write(byteArray8);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream10 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream6);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer12 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) zstdCompressorOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream13 = compressorStreamFactory1.createCompressorOutputStream("", (java.io.OutputStream) zstdCompressorOutputStream6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.compressors.CompressorException; message: Compressor:  not found.");
        } catch (org.apache.commons.compress.compressors.CompressorException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 33, 0]");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        byte[] byteArray2 = zipLong1.getBytes();
        byte[] byteArray3 = zipLong1.getBytes();
        org.apache.commons.compress.archivers.tar.TarFile tarFile5 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray3, "strip");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 10240, byteArray3, 420, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 65952");
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
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        boolean boolean3 = tarArchiveEntry2.isGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = tarArchiveEntry2.getExtraPaxHeaders();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil6 = new org.apache.commons.compress.compressors.FileNameUtil(strMap4, "0x5455 Zip Extra Field: Flags=0 ");
        java.lang.String str8 = fileNameUtil6.getUncompressedFilename("-       0 ");
        java.lang.String str10 = fileNameUtil6.getCompressedFilename("pack.segment.limit");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-       0 " + "'", str8, "-       0 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "pack.segment.limit0x5455 Zip Extra Field: Flags=0 " + "'", str10, "pack.segment.limit0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField1 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField2 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = unicodePathExtraField2.getHeaderId();
        unrecognizedExtraField1.setHeaderId(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        unrecognizedExtraField1.setHeaderId(zipShort5);
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean13 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray11, (int) (short) 10);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray16);
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray11);
        boolean boolean20 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray11, (int) (short) 100);
        boolean boolean22 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray11, 3);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("lz4-block", byteArray11);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean29 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray27, (int) (short) 10);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray27, byteArray32);
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray27, false);
        unrecognizedExtraField1.setCentralDirectoryData(byteArray27);
        java.io.OutputStream outputStream37 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream38 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream37);
        byte[] byteArray40 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream38.write(byteArray40);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream42 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream38);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream43 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream38);
        arArchiveOutputStream43.finish();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode46 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
        byte[] byteArray48 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        byte[] byteArray49 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray48);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField54 = extraFieldParsingMode46.onUnparseableExtraField(byteArray49, (int) (short) 0, 84446, true, 16877);
        boolean boolean56 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray49, 121);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField57 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("ZipShort value: 14", byteArray49);
        arArchiveOutputStream43.write(byteArray49, 9, 1024);
        unrecognizedExtraField1.setLocalFileDataData(byteArray49);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong.putLong((long) 4, byteArray49, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode46 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT + "'", extraFieldParsingMode46.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNull(zipExtraField54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.compress.compressors.lz4.XXHash32 xXHash32_1 = new org.apache.commons.compress.compressors.lz4.XXHash32(36864);
        org.apache.commons.compress.compressors.lz4.XXHash32 xXHash32_2 = new org.apache.commons.compress.compressors.lz4.XXHash32();
        xXHash32_2.reset();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream4, 10);
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream9 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream8);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream9.write(byteArray11);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream13 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream9);
        long long15 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream6, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream9, 36864);
        int int16 = cpioArchiveInputStream6.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream6, 2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream19 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream6, "xz");
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream22 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream((java.util.zip.Checksum) xXHash32_2, (java.io.InputStream) cpioArchiveInputStream6);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream23 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream((java.util.zip.Checksum) xXHash32_1, (java.io.InputStream) checksumCalculatingInputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream24 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) checksumCalculatingInputStream22);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
        int int15 = deflate64CompressorInputStream14.available();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = deflate64CompressorInputStream14.read();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Truncated Deflate64 Stream");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

//    @Test
//    public void test1926() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1926");
//        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
//        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
//        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getCreateTime();
//        java.io.OutputStream outputStream3 = null;
//        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream4 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream3);
//        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
//        zstdCompressorOutputStream4.write(byteArray6);
//        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream8 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
//        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
//        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
//        boolean boolean15 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray13, (int) (short) 10);
//        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0 };
//        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, byteArray18);
//        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray13);
//        zipArchiveOutputStream9.writePreamble(byteArray20);
//        zipArchiveOutputStream9.finish();
//        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
//        cpioArchiveEntry24.setInode((long) 2048);
//        java.util.Date date27 = cpioArchiveEntry24.getLastModifiedDate();
//        cpioArchiveEntry24.setChksum(0L);
//        boolean boolean30 = zipArchiveOutputStream9.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry24);
//        boolean boolean31 = x5455_ExtendedTimestamp0.equals((java.lang.Object) boolean30);
//        byte[] byteArray32 = x5455_ExtendedTimestamp0.getLocalFileDataData();
//        byte[] byteArray33 = x5455_ExtendedTimestamp0.getLocalFileDataData();
//        boolean boolean35 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray33, (int) (byte) 51);
//        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
//        org.junit.Assert.assertNull(zipLong2);
//        org.junit.Assert.assertNotNull(byteArray6);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 33, 0]");
//        org.junit.Assert.assertNotNull(byteArray13);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 0, 0]");
//        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
//        org.junit.Assert.assertNotNull(byteArray18);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
//        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
//        org.junit.Assert.assertNotNull(byteArray20);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 0, 0]");
//        org.junit.Assert.assertNotNull(date27);
//        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 01:00:00 CET 1970");
//        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
//        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
//        org.junit.Assert.assertNotNull(byteArray32);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0]");
//        org.junit.Assert.assertNotNull(byteArray33);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0]");
//        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
//    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        int int2 = zipArchiveEntry1.getVersionRequired();
        byte[] byteArray3 = zipArchiveEntry1.getExtra();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry10 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("unpack.progress", (long) 512, 0, 4, 12, 10L);
        long long11 = arArchiveEntry10.getLastModified();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = new org.apache.commons.compress.archivers.zip.ZipShort(508);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort13);
        boolean boolean15 = arArchiveEntry10.equals((java.lang.Object) zipShort13);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField16 = zipArchiveEntry1.getExtraField(zipShort13);
        byte[] byteArray17 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest zipArchiveEntryRequest19 = org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry1, inputStreamSupplier18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(zipExtraField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(zipExtraField16);
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNotNull(zipArchiveEntryRequest19);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry3.setStatusChangeTime(fileTime4);
        tarArchiveEntry3.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean12 = tarArchiveEntry3.equals(tarArchiveEntry11);
        boolean boolean13 = tarArchiveEntry3.isPaxHeader();
        long long14 = tarArchiveEntry3.getRealSize();
        boolean boolean15 = tarArchiveEntry3.isStreamContiguous();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry3.setStatusChangeTime(fileTime4);
        tarArchiveEntry3.setUserName("unpack.progress");
        tarArchiveEntry3.setUserId((long) 29127);
        tarArchiveEntry3.setMode(263);
        tarArchiveEntry3.setUserName("error.gz");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = tarArchiveEntry3.getExtraPaxHeaders();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField15 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = unicodePathExtraField16.getHeaderId();
        unrecognizedExtraField15.setHeaderId(zipShort17);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        unrecognizedExtraField15.setHeaderId(zipShort19);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean27 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray25, (int) (short) 10);
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray25, byteArray30);
        byte[] byteArray32 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray25);
        boolean boolean34 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray25, (int) (short) 100);
        boolean boolean36 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray25, 3);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("lz4-block", byteArray25);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean43 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray41, (int) (short) 10);
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray41, byteArray46);
        boolean boolean49 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray25, byteArray41, false);
        unrecognizedExtraField15.setCentralDirectoryData(byteArray41);
        byte[] byteArray51 = unrecognizedExtraField15.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding53 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("error.gz");
        boolean boolean55 = zipEncoding53.canEncode("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry57 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(strMap14, byteArray51, zipEncoding53, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[0, 0, 10]");
        org.junit.Assert.assertNotNull(zipEncoding53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean30 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray28, (int) (short) 100);
        boolean boolean32 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray28, (int) (byte) 0);
        zipArchiveOutputStream6.writePreamble(byteArray28);
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream36 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
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
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray19, 36864);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36864");
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
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        int int2 = zipArchiveEntry1.getVersionRequired();
        byte[] byteArray3 = zipArchiveEntry1.getExtra();
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getCreationTime();
        byte[] byteArray5 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit6 = zipArchiveEntry1.getGeneralPurposeBit();
        generalPurposeBit6.useEncryption(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNotNull(generalPurposeBit6);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 4, "cpio.gz", (long) (byte) 4);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
        lZMACompressorOutputStream10.write((int) (byte) 120);
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream17 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream16);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream18 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream18, 508, 31);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters22 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream23 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) zstdCompressorInputStream18, deflateParameters22);
        boolean boolean24 = deflateParameters22.withZlibHeader();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream25 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(inputStream15, deflateParameters22);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream26 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) lZMACompressorOutputStream10, deflateParameters22);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = x5455_ExtendedTimestamp0.getModifyTime();
        java.lang.Object obj2 = x5455_ExtendedTimestamp0.clone();
        byte byte3 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        java.lang.String str1 = gzipParameters0.getFilename();
        int int2 = gzipParameters0.getDeflateStrategy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
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
        boolean boolean24 = jarArchiveOutputStream9.isSeekable();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer7 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.utils.ByteUtils.toLittleEndian((org.apache.commons.compress.utils.ByteUtils.ByteConsumer) outputStreamByteConsumer7, (long) 508, 11);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "bzip2");
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream7 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) zipArchiveInputStream4, 100L, (int) '#');
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream9);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream10.write(byteArray12);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream14 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream10);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream17 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream14, (int) 'a', false);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean23 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray21, (int) (short) 10);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, byteArray26);
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray21);
        zstdCompressorOutputStream17.write(byteArray28, 1, 29127);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream17);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry36 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime37 = null;
        tarArchiveEntry36.setStatusChangeTime(fileTime37);
        tarArchiveEntry36.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry44 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean45 = tarArchiveEntry36.equals(tarArchiveEntry44);
        boolean boolean46 = zipArchiveOutputStream32.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry44);
        long long47 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cRC32VerifyingInputStream7, (long) (short) 1, (java.io.OutputStream) zipArchiveOutputStream32);
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean56 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray54, (int) (short) 100);
        boolean boolean58 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray54, 511);
        org.apache.commons.compress.archivers.tar.TarFile tarFile60 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray54, true);
        boolean boolean62 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray54, 21);
        boolean boolean64 = org.apache.commons.compress.compressors.xz.XZUtils.matches(byteArray54, (-1));
        int int65 = cRC32VerifyingInputStream7.read(byteArray54);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, "pass");
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream7);
        jarArchiveOutputStream7.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        boolean boolean1 = org.apache.commons.compress.compressors.gzip.GzipUtils.isCompressedFilename("-       0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod1 = org.apache.commons.compress.archivers.zip.ZipMethod.getMethodByCode((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + zipMethod1 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING + "'", zipMethod1.equals(org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING));
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        x0016_CertificateIdForCentralDirectory0.setCentralDirectoryData(byteArray4);
        boolean boolean8 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray4, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray4, 61440);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 61440");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        zipArchiveEntry5.setMethod((int) (byte) 88);
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry5.getCreationTime();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize9 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4;
        org.apache.commons.compress.compressors.lz77support.Parameters parameters10 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters11 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize9, parameters10);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters12 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters13 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize9, parameters12);
        boolean boolean14 = zipArchiveEntry5.equals((java.lang.Object) blockSize9);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder18 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder19 = builder18.tunedForCompressionRatio();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder21 = builder18.withMinBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder22 = builder21.tunedForSpeed();
        org.apache.commons.compress.compressors.lz77support.Parameters parameters23 = builder22.build();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters24 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize9, false, true, true, parameters23);
        int int25 = parameters23.getMaxOffset();
        int int26 = parameters23.getMaxLiteralLength();
        int int27 = parameters23.getMaxCandidates();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters28 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, true, true, true, parameters23);
        org.junit.Assert.assertTrue("'" + blockSize0 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4 + "'", blockSize0.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4));
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertTrue("'" + blockSize9 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4 + "'", blockSize9.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(parameters23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 65535 + "'", int25 == 65535);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 65535 + "'", int26 == 65535);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        byte[] byteArray1 = x7875_NewUnix0.getCentralDirectoryData();
        x7875_NewUnix0.setGID((long) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x7875_NewUnix0.getLocalFileDataLength();
        byte[] byteArray5 = x7875_NewUnix0.getCentralDirectoryData();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        int int2 = zipArchiveEntry1.getVersionRequired();
        byte[] byteArray3 = zipArchiveEntry1.getExtra();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry10 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("unpack.progress", (long) 512, 0, 4, 12, 10L);
        long long11 = arArchiveEntry10.getLastModified();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = new org.apache.commons.compress.archivers.zip.ZipShort(508);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort13);
        boolean boolean15 = arArchiveEntry10.equals((java.lang.Object) zipShort13);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField16 = zipArchiveEntry1.getExtraField(zipShort13);
        byte[] byteArray17 = zipArchiveEntry1.getRawName();
        java.nio.file.attribute.FileTime fileTime18 = zipArchiveEntry1.getLastModifiedTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(zipExtraField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(zipExtraField16);
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNull(fileTime18);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) 10);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray9);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray4);
        boolean boolean13 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray4, (int) (short) 100);
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray4, 3);
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("././@LongLink", byteArray4, (int) (short) 0, (int) (short) 1);
        boolean boolean20 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray4, 488);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        long long2 = cpioArchiveEntry1.getGID();
        long long3 = cpioArchiveEntry1.getUID();
        cpioArchiveEntry1.setNumberOfLinks((long) (byte) 100);
        long long6 = cpioArchiveEntry1.getTime();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = cpioArchiveEntry1.getRemoteDevice();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        tarArchiveEntry8.setUserName("keep");
        long long12 = tarArchiveEntry8.getDataOffset();
        tarArchiveEntry8.setModTime((long) 8191);
        boolean boolean15 = tarArchiveEntry8.isFile();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
        long long29 = pack200CompressorInputStream27.skip((long) ' ');
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean38 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray36, (int) (short) 100);
        boolean boolean40 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray36, 511);
        org.apache.commons.compress.archivers.tar.TarFile tarFile42 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray36, true);
        boolean boolean44 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray36, 21);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong45 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray36);
        int int46 = pack200CompressorInputStream27.read(byteArray36);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(pack200Strategy11);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 29L + "'", long29 == 29L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        sevenZArchiveEntry0.setHasStream(false);
        boolean boolean5 = sevenZArchiveEntry0.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime10 = null;
        tarArchiveEntry9.setStatusChangeTime(fileTime10);
        tarArchiveEntry9.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean18 = tarArchiveEntry9.equals(tarArchiveEntry17);
        java.nio.file.attribute.FileTime fileTime20 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        tarArchiveEntry17.setLastModifiedTime(fileTime20);
        sevenZArchiveEntry0.setCreationTime(fileTime20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(fileTime20);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream2, 508, 31);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) zstdCompressorInputStream2);
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream9 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) deflateCompressorInputStream6, (long) 156, (int) (short) 0);
        org.apache.commons.compress.utils.SkipShieldingInputStream skipShieldingInputStream10 = new org.apache.commons.compress.utils.SkipShieldingInputStream((java.io.InputStream) deflateCompressorInputStream6);
        long long11 = deflateCompressorInputStream6.getCompressedCount();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 8192);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        closeShieldFilterInputStream1.close();
        org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier inputStreamByteSupplier3 = new org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) closeShieldFilterInputStream1, "keep");
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream7 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream6);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream7.write(byteArray9);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream11 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream7);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer12 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) zstdCompressorOutputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream7, 2048, "ar");
        tarArchiveOutputStream15.setLongFileMode(8);
        tarArchiveOutputStream15.finish();
        tarArchiveOutputStream15.setBigNumberMode((int) (byte) 49);
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream21, 10);
        long long25 = cpioArchiveInputStream23.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream27 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream23, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream23, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream30 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream29);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream31 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream29);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy32 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry36 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime37 = null;
        tarArchiveEntry36.setStatusChangeTime(fileTime37);
        tarArchiveEntry36.setUserName("unpack.progress");
        tarArchiveEntry36.setUserId((long) 29127);
        tarArchiveEntry36.setMode(263);
        tarArchiveEntry36.setUserName("error.gz");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = tarArchiveEntry36.getExtraPaxHeaders();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream48 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zstdCompressorInputStream31, pack200Strategy32, strMap47);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream49 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) tarArchiveOutputStream15, pack200Strategy32);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry52 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        boolean boolean53 = tarArchiveEntry52.isGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap54 = tarArchiveEntry52.getExtraPaxHeaders();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream55 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) cpioArchiveInputStream5, pack200Strategy32, strMap54);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry56 = cpioArchiveInputStream5.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(pack200Strategy32);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strMap54);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream22.finish();
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
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        x0016_CertificateIdForCentralDirectory0.setCentralDirectoryData(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 4095);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock literalBlock11 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock(byteArray4, (int) (short) 100, 1);
        int int12 = literalBlock11.getLength();
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType blockType13 = literalBlock11.getType();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + blockType13 + "' != '" + org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.LITERAL + "'", blockType13.equals(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.LITERAL));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4;
        org.apache.commons.compress.compressors.lz77support.Parameters parameters1 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters2 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, parameters1);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters3 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters4 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, parameters3);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters8 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, false, false, false);
        org.junit.Assert.assertTrue("'" + blockSize0 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4 + "'", blockSize0.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4));
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        long long3 = sevenZArchiveEntry0.getCrcValue();
        sevenZArchiveEntry0.setName("apkm");
        java.lang.String str6 = sevenZArchiveEntry0.getName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "apkm" + "'", str6, "apkm");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream26, "bzip2");
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream31 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) zipArchiveInputStream28, 100L, (int) '#');
        java.io.File file32 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) zipArchiveInputStream28, file32);
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean43 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray41, (int) (short) 100);
        boolean boolean45 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray41, (int) (byte) 0);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel46 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray41);
        java.nio.channels.SeekableByteChannel seekableByteChannel48 = seekableInMemoryByteChannel46.position(0L);
        java.nio.file.Path path49 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer50 = org.apache.commons.compress.archivers.examples.CloseableConsumer.CLOSING_CONSUMER;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("LZ4 Parameters with BlockSize M4, withContentChecksum false, withBlockChecksum false, withBlockDependency true", seekableByteChannel48, path49, closeableConsumer50);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: LZ4 Parameters with BlockSize M4, withContentChecksum false, withBlockChecksum false, withBlockDependency true not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
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
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(seekableByteChannel48);
        org.junit.Assert.assertNotNull(closeableConsumer50);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) brotliCompressorInputStream9, "pass");
        int int12 = tarArchiveInputStream11.getRecordSize();
        byte[] byteArray14 = org.apache.commons.compress.utils.IOUtils.readRange((java.io.InputStream) tarArchiveInputStream11, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream16 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) tarArchiveInputStream11, "lz4-block");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.TAR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tar" + "'", str0, "tar");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        java.nio.file.attribute.FileTime fileTime2 = x5455_ExtendedTimestamp0.getAccessFileTime();
        java.nio.file.attribute.FileTime fileTime3 = x5455_ExtendedTimestamp0.getAccessFileTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger5 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger6 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField9 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger5, zipEightByteInteger6, zipEightByteInteger7, zipLong8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField9.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = zip64ExtendedInformationExtraField9.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        zip64ExtendedInformationExtraField9.setRelativeHeaderOffset(zipEightByteInteger12);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger15 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) (short) 0);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField16 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger12, zipEightByteInteger15);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger17 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger18 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger19 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField21 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger17, zipEightByteInteger18, zipEightByteInteger19, zipLong20);
        byte[] byteArray22 = zip64ExtendedInformationExtraField21.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger23 = zip64ExtendedInformationExtraField21.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger24 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        zip64ExtendedInformationExtraField21.setRelativeHeaderOffset(zipEightByteInteger24);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp26 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str27 = x5455_ExtendedTimestamp26.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong28 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
        x5455_ExtendedTimestamp26.setModifyTime(zipLong28);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField30 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger4, zipEightByteInteger15, zipEightByteInteger24, zipLong28);
        x5455_ExtendedTimestamp0.setCreateTime(zipLong28);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong32 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(fileTime3);
        org.junit.Assert.assertNotNull(zipLong8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[80, 75, 48, 48]");
        org.junit.Assert.assertNull(zipEightByteInteger11);
        org.junit.Assert.assertNotNull(zipEightByteInteger12);
        org.junit.Assert.assertNotNull(zipLong20);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[80, 75, 48, 48]");
        org.junit.Assert.assertNull(zipEightByteInteger23);
        org.junit.Assert.assertNotNull(zipEightByteInteger24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str27, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipLong28);
        org.junit.Assert.assertNull(zipLong32);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer6 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, 2048, "ar");
        tarArchiveOutputStream9.setLongFileMode(8);
        tarArchiveOutputStream9.finish();
        int int13 = tarArchiveOutputStream9.getCount();
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = tarArchiveOutputStream9.createArchiveEntry(file14, "ustar\000");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2048 + "'", int13 == 2048);
    }

//    @Test
//    public void test1966() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1966");
//        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
//        boolean boolean1 = dumpArchiveEntry0.isDirectory();
//        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
//        cpioArchiveEntry3.setInode((long) 2048);
//        java.util.Date date6 = cpioArchiveEntry3.getLastModifiedDate();
//        long long7 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(date6);
//        dumpArchiveEntry0.setCreationTime(date6);
//        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
//        org.junit.Assert.assertNotNull(date6);
//        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 01:00:00 CET 1970");
//        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 116444736000000000L + "'", long7 == 116444736000000000L);
//    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator23 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream25 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream24);
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream25.write(byteArray27);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream29 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream25);
        parallelScatterZipCreator23.writeTo(zipArchiveOutputStream30);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream32 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream30);
        jarArchiveOutputStream32.setUseLanguageEncodingFlag(false);
        jarArchiveOutputStream32.setFallbackToUTF8(true);
        java.io.OutputStream outputStream37 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream38 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream37);
        byte[] byteArray40 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream38.write(byteArray40);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream42 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream38);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream43 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream38);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy44 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream43.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy44);
        jarArchiveOutputStream32.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy44);
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy44);
        java.io.File file48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry50 = zipArchiveOutputStream6.createArchiveEntry(file48, "arj");
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
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy44);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
        long long23 = multiReadOnlySeekableByteChannel22.position();
        multiReadOnlySeekableByteChannel22.close();
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        tarArchiveEntry8.setUserName("keep");
        long long12 = tarArchiveEntry8.getLongUserId();
        tarArchiveEntry8.setNames("cpio", "lz4-framed");
        java.lang.String str16 = tarArchiveEntry8.getLinkName();
        tarArchiveEntry8.setDataOffset((long) (byte) 2);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray19 = tarArchiveEntry8.getDirectoryEntries();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray19);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder1 = builder0.tunedForCompressionRatio();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder3 = builder0.withLazyMatching(true);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder5 = builder0.withMaxOffset(65535);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2, 10);
        long long6 = cpioArchiveInputStream4.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = jarArchiveInputStream8.getNextEntry();
        byte[] byteArray11 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) jarArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray11);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField13 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("pack.effort", byteArray11);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = unicodeCommentExtraField13.getHeaderId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(archiveEntry10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(zipShort14);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer0 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.beans.PropertyChangeListener propertyChangeListener1 = null;
        packer0.addPropertyChangeListener(propertyChangeListener1);
        org.junit.Assert.assertNotNull(packer0);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream2, 508, 31);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters6 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) zstdCompressorInputStream2, deflateParameters6);
        // The following exception was thrown during execution in test generation
        try {
            deflateParameters6.setCompressionLevel(508);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Deflate compression level: 508");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0017_StrongEncryptionHeader0.getHashAlgorithm();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream3 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream2);
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream3.write(byteArray5);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream3);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream7, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream11 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream7);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream13 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream11, (int) (byte) 83);
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader14 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        x0017_StrongEncryptionHeader14.setCentralDirectoryData(byteArray16);
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray16);
        pack200CompressorOutputStream11.write(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray16, 263, (int) (short) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0, 0, 0, 0, 0, 10]");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 88, (byte) 55, (byte) 48, (byte) 0, (byte) 55 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("bzip2", byteArray7);
        byte[] byteArray9 = unicodeCommentExtraField8.getLocalFileDataData();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 88, 55, 48, 0, 55]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 72, -122, 16, -23, 98, 122, 105, 112, 50]");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getUserId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getCentralDirectoryLength();
        byte[] byteArray4 = asiExtraField0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField11 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger7, zipEightByteInteger8, zipEightByteInteger9, zipLong10);
        byte[] byteArray12 = zip64ExtendedInformationExtraField11.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, 420, (int) (byte) 4, byteArray12, 1024, (int) (short) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 420");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipLong10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[80, 75, 48, 48]");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getOutputStreamArchiveNames();
        java.util.Set<java.lang.String> strSet2 = archiveStreamFactory0.getOutputStreamArchiveNames();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap3 = archiveStreamFactory0.getArchiveInputStreamProviders();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
        org.apache.commons.compress.utils.FixedLengthBlockOutputStream fixedLengthBlockOutputStream28 = new org.apache.commons.compress.utils.FixedLengthBlockOutputStream((java.io.OutputStream) cpioArchiveOutputStream26, (int) (byte) 88);
        boolean boolean29 = fixedLengthBlockOutputStream28.isOpen();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

//    @Test
//    public void test1979() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1979");
//        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
//        boolean boolean5 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray3, (int) (short) 10);
//        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0 };
//        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray3, byteArray8);
//        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray3);
//        boolean boolean12 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray3, (int) (short) 100);
//        org.apache.commons.compress.archivers.tar.TarFile tarFile14 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray3, false);
//        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
//        boolean boolean19 = tarArchiveEntry18.isPaxGNU1XSparse();
//        java.util.Date date21 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToDate((long) 5);
//        java.nio.file.attribute.FileTime fileTime22 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date21);
//        tarArchiveEntry18.setStatusChangeTime(fileTime22);
//        java.nio.file.attribute.FileTime fileTime24 = tarArchiveEntry18.getLastModifiedTime();
//        boolean boolean25 = tarArchiveEntry18.isStreamContiguous();
//        tarArchiveEntry18.setUserName("keep");
//        java.io.InputStream inputStream28 = tarFile14.getInputStream(tarArchiveEntry18);
//        boolean boolean29 = tarArchiveEntry18.isGNULongNameEntry();
//        org.junit.Assert.assertNotNull(byteArray3);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 0, 0]");
//        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
//        org.junit.Assert.assertNotNull(byteArray8);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
//        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
//        org.junit.Assert.assertNotNull(byteArray10);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0]");
//        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
//        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
//        org.junit.Assert.assertNotNull(date21);
//        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 01 01:00:00 CET 1601");
//        org.junit.Assert.assertNotNull(fileTime22);
//        org.junit.Assert.assertNotNull(fileTime24);
//        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
//        org.junit.Assert.assertNotNull(inputStream28);
//        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
//    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        byte[] byteArray1 = x7875_NewUnix0.getCentralDirectoryData();
        x7875_NewUnix0.setGID((long) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x7875_NewUnix0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x7875_NewUnix0.getCentralDirectoryLength();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream6, 10);
        long long10 = cpioArchiveInputStream8.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream15 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream14);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream16 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream14);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy17 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry21 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime22 = null;
        tarArchiveEntry21.setStatusChangeTime(fileTime22);
        tarArchiveEntry21.setUserName("unpack.progress");
        tarArchiveEntry21.setUserId((long) 29127);
        tarArchiveEntry21.setMode(263);
        tarArchiveEntry21.setUserName("error.gz");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = tarArchiveEntry21.getExtraPaxHeaders();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream33 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zstdCompressorInputStream16, pack200Strategy17, strMap32);
        boolean boolean34 = x7875_NewUnix0.equals((java.lang.Object) pack200CompressorInputStream33);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(pack200Strategy17);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        long long9 = jarArchiveInputStream6.skip((long) 3);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry10 = jarArchiveInputStream6.getNextJarEntry();
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream11 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream((java.io.InputStream) jarArchiveInputStream6);
        long long13 = closeShieldFilterInputStream11.skip((long) 8);
        closeShieldFilterInputStream11.close();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(jarArchiveEntry10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.apache.commons.compress.java.util.jar.Pack200.Unpacker unpacker0 = org.apache.commons.compress.java.util.jar.Pack200.newUnpacker();
        java.beans.PropertyChangeListener propertyChangeListener1 = null;
        unpacker0.addPropertyChangeListener(propertyChangeListener1);
        org.junit.Assert.assertNotNull(unpacker0);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, (int) (short) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel11 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray6);
        java.nio.channels.SeekableByteChannel seekableByteChannel13 = seekableInMemoryByteChannel11.position(0L);
        byte[] byteArray14 = seekableInMemoryByteChannel11.array();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray14, (int) (byte) 76);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 83");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(seekableByteChannel13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, 10, 1, 100, 10]");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        int int2 = zipArchiveEntry1.getVersionRequired();
        byte[] byteArray3 = zipArchiveEntry1.getExtra();
        byte[] byteArray4 = zipArchiveEntry1.getRawName();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getCreationTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNull(fileTime5);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        zipArchiveEntry1.setMethod((int) (byte) 88);
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getCreationTime();
        long long5 = zipArchiveEntry1.getDataOffset();
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.utils.SkipShieldingInputStream skipShieldingInputStream11 = new org.apache.commons.compress.utils.SkipShieldingInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream deflate64CompressorInputStream12 = new org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        byte[] byteArray14 = org.apache.commons.compress.utils.IOUtils.readRange((java.io.InputStream) zipArchiveInputStream8, (int) (short) 12);
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream15 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer6 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, 2048, "ar");
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean15 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray13, (int) (short) 10);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, byteArray18);
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray13);
        boolean boolean22 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray13, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.write(byteArray13, 2, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        boolean boolean24 = sevenZArchiveEntry0.getHasCrc();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp25 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str26 = x5455_ExtendedTimestamp25.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong27 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
        x5455_ExtendedTimestamp25.setModifyTime(zipLong27);
        boolean boolean29 = x5455_ExtendedTimestamp25.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp30 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry34 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime35 = null;
        tarArchiveEntry34.setStatusChangeTime(fileTime35);
        tarArchiveEntry34.setUserName("unpack.progress");
        tarArchiveEntry34.addPaxHeader("dump", "ISO-8859-1");
        java.util.Date date42 = tarArchiveEntry34.getModTime();
        x5455_ExtendedTimestamp30.setAccessJavaTime(date42);
        x5455_ExtendedTimestamp25.setCreateJavaTime(date42);
        java.nio.file.attribute.FileTime fileTime45 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date42);
        sevenZArchiveEntry0.setLastModifiedTime(fileTime45);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(fileTime19);
        org.junit.Assert.assertNotNull(fileTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 116444741040000000L + "'", long21 == 116444741040000000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str26, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipLong27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Mon Jun 19 00:09:26 CEST 2023");
        org.junit.Assert.assertNotNull(fileTime45);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = zipArchiveInputStream8.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream8);
        byte[] byteArray12 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) zipArchiveInputStream8);
        int int13 = zipArchiveInputStream8.getCount();
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream16 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream15);
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream16.write(byteArray18);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream20 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream16);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters21 = null;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream22 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream16, parameters21);
        java.lang.String str23 = zstdCompressorOutputStream16.toString();
        long long25 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) zipArchiveInputStream8, (long) 808471376, (java.io.OutputStream) zstdCompressorOutputStream16, (int) '4');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile3 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.utils.FixedLengthBlockOutputStream fixedLengthBlockOutputStream6 = new org.apache.commons.compress.utils.FixedLengthBlockOutputStream((java.nio.channels.WritableByteChannel) seekableByteChannel1, (int) (byte) 0);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean12 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray10, (int) (short) 10);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray15);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        boolean boolean19 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray10, (int) (short) 100);
        boolean boolean21 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray10, 3);
        // The following exception was thrown during execution in test generation
        try {
            fixedLengthBlockOutputStream6.write(byteArray10, (int) (short) 8, (int) (byte) 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.apache.commons.compress.MemoryLimitException memoryLimitException2 = new org.apache.commons.compress.MemoryLimitException((long) 49152, 0);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
        xXHash32_0.reset();
        long long19 = xXHash32_0.getValue();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 46947589L + "'", long19 == 46947589L);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        long long19 = cpioArchiveInputStream4.skip((long) (short) 10);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4;
        org.apache.commons.compress.compressors.lz77support.Parameters parameters1 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters2 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, parameters1);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters3 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters4 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, parameters3);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters5 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters6 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        zipArchiveEntry8.setMethod((int) (byte) 88);
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry8.getCreationTime();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize12 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4;
        org.apache.commons.compress.compressors.lz77support.Parameters parameters13 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters14 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize12, parameters13);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters15 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters16 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize12, parameters15);
        boolean boolean17 = zipArchiveEntry8.equals((java.lang.Object) blockSize12);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder21 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder22 = builder21.tunedForCompressionRatio();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder24 = builder21.withMinBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder25 = builder24.tunedForSpeed();
        org.apache.commons.compress.compressors.lz77support.Parameters parameters26 = builder25.build();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters27 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize12, false, true, true, parameters26);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters28 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, parameters26);
        org.junit.Assert.assertTrue("'" + blockSize0 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4 + "'", blockSize0.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4));
        org.junit.Assert.assertNull(fileTime11);
        org.junit.Assert.assertTrue("'" + blockSize12 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4 + "'", blockSize12.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(parameters26);
    }

//    @Test
//    public void test1995() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1995");
//        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
//        dumpArchiveEntry0.setOffset((long) 11);
//        int int3 = dumpArchiveEntry0.getGroupId();
//        boolean boolean4 = dumpArchiveEntry0.isSocket();
//        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry5 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
//        sevenZArchiveEntry5.setHasLastModifiedDate(false);
//        long long8 = sevenZArchiveEntry5.getSize();
//        sevenZArchiveEntry5.setHasStream(false);
//        sevenZArchiveEntry5.setSize(116444736001000000L);
//        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
//        cpioArchiveEntry14.setInode((long) 2048);
//        java.util.Date date17 = cpioArchiveEntry14.getLastModifiedDate();
//        long long18 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(date17);
//        sevenZArchiveEntry5.setCreationDate(date17);
//        dumpArchiveEntry0.setAccessTime(date17);
//        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
//        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
//        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
//        org.junit.Assert.assertNotNull(date17);
//        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 01:00:00 CET 1970");
//        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 116444736000000000L + "'", long18 == 116444736000000000L);
//    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        tarArchiveEntry3.setUserId((int) (byte) 100);
        long long6 = tarArchiveEntry3.getDataOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        java.nio.file.Path path26 = null;
        java.nio.file.LinkOption[] linkOptionArray28 = org.apache.commons.compress.utils.IOUtils.EMPTY_LINK_OPTIONS;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = arArchiveOutputStream22.createArchiveEntry(path26, "ustar\000.xz", linkOptionArray28);
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
        org.junit.Assert.assertNotNull(linkOptionArray28);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
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
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean32 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray30, (int) (short) 100);
        boolean boolean34 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray30, (int) (byte) 0);
        zipArchiveOutputStream8.writePreamble(byteArray30);
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry36 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry36.setHasLastModifiedDate(false);
        long long39 = sevenZArchiveEntry36.getSize();
        sevenZArchiveEntry36.setHasStream(false);
        sevenZArchiveEntry36.setSize(116444736001000000L);
        sevenZArchiveEntry36.setLastModifiedDate((long) 14);
        boolean boolean46 = zipArchiveOutputStream8.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) sevenZArchiveEntry36);
        java.io.File file47 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("keep", (java.io.OutputStream) zipArchiveOutputStream8, file47);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: keep not found.");
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
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("never", "\000\000\n");
        dumpArchiveEntry2.setGroupId(0);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException1 = new org.apache.commons.compress.archivers.dump.DumpArchiveException("");
    }
}
