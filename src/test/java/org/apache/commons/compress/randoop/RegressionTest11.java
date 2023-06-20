package org.apache.commons.compress.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0, "0x5455 Zip Extra Field: Flags=1001011  Access:[Thu Jan 01 01:00:01 CET 1970] ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature1 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(" \000");
        long long4 = zipArchiveEntry3.getCompressedSize();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj7 = jarArchiveEntry6.clone();
        int int8 = jarArchiveEntry6.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource9 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry6.setNameSource(nameSource9);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = jarArchiveEntry6.getExtraFields();
        jarArchiveEntry6.setExternalAttributes((long) (short) 2);
        java.lang.String str14 = jarArchiveEntry6.getName();
        jarArchiveEntry6.setExternalAttributes((long) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode17 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField19 = extraFieldParsingMode17.createExtraField(zipShort18);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp20 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp20.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean26 = tarArchiveEntry25.isSparse();
        tarArchiveEntry25.setMode(26127);
        java.util.Date date29 = tarArchiveEntry25.getModTime();
        x5455_ExtendedTimestamp20.setModifyJavaTime(date29);
        byte[] byteArray32 = new byte[] { (byte) -1 };
        byte[] byteArray33 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray32);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField37 = extraFieldParsingMode17.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp20, byteArray33, 0, 32768, true);
        java.nio.file.attribute.FileTime fileTime38 = null;
        x5455_ExtendedTimestamp20.setAccessFileTime(fileTime38);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong40 = x5455_ExtendedTimestamp20.getCreateTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry43 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = tarArchiveEntry43.getExtraPaxHeaders();
        java.nio.file.attribute.FileTime fileTime45 = tarArchiveEntry43.getLastModifiedTime();
        x5455_ExtendedTimestamp20.setModifyFileTime(fileTime45);
        java.util.zip.ZipEntry zipEntry47 = jarArchiveEntry6.setLastAccessTime(fileTime45);
        java.util.zip.ZipEntry zipEntry48 = zipArchiveEntry3.setCreationTime(fileTime45);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException49 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature1, zipArchiveEntry3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = unsupportedZipFeatureException49.getEntry();
        byte[] byteArray52 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 36864);
        int int53 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray52);
        zipArchiveEntry50.setCentralDirectoryExtra(byteArray52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 32843, byteArray52, 8, 61440);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 61447");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(feature1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "070707");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + nameSource9 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource9.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "070707" + "'", str14, "070707");
        org.junit.Assert.assertNotNull(extraFieldParsingMode17);
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertNotNull(zipExtraField19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Jun 20 13:22:32 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1]");
        org.junit.Assert.assertNotNull(zipExtraField37);
        org.junit.Assert.assertNull(zipLong40);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(fileTime45);
        org.junit.Assert.assertNotNull(zipEntry47);
        org.junit.Assert.assertEquals(zipEntry47.toString(), "070707");
        org.junit.Assert.assertNotNull(zipEntry48);
        org.junit.Assert.assertEquals(zipEntry48.toString(), " \000");
        org.junit.Assert.assertNotNull(zipArchiveEntry50);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = zip64ExtendedInformationExtraField0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(zipShort10);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = jarMarker0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker0.getLocalFileDataLength();
        byte[] byteArray3 = jarMarker0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = jarMarker0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = jarMarker0.getLocalFileDataLength();
        byte[] byteArray6 = jarMarker0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = jarMarker0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = jarMarker0.getHeaderId();
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(zipShort8);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("070707", "ustar\000");
        dumpArchiveEntry2.setOffset((long) (byte) 51);
        long long5 = dumpArchiveEntry2.getSize();
        boolean boolean6 = dumpArchiveEntry2.isSocket();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream7);
        long long10 = cpioArchiveInputStream8.skip((long) (byte) 100);
        cpioArchiveInputStream8.mark(6);
        boolean boolean13 = cpioArchiveInputStream8.markSupported();
        boolean boolean14 = cpioArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8, "arj", false, true);
        byte[] byteArray23 = new byte[] { (byte) 52, (byte) 54, (byte) 100, (byte) 51 };
        int int26 = zipArchiveInputStream18.read(byteArray23, (int) '#', (int) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream18, "always", false, false);
        boolean boolean31 = dumpArchiveEntry2.equals((java.lang.Object) false);
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry32 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean33 = sevenZArchiveEntry32.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray34 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry32.setContentMethods(sevenZMethodConfigurationArray34);
        java.nio.file.attribute.FileTime fileTime36 = null;
        sevenZArchiveEntry32.setLastModifiedTime(fileTime36);
        sevenZArchiveEntry32.setHasWindowsAttributes(false);
        long long40 = sevenZArchiveEntry32.getCrcValue();
        sevenZArchiveEntry32.setLastModifiedDate(11L);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry44 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode45 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort46 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField47 = extraFieldParsingMode45.createExtraField(zipShort46);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField48 = jarArchiveEntry44.getExtraField(zipShort46);
        java.lang.Object obj49 = jarArchiveEntry44.clone();
        java.util.Date date50 = jarArchiveEntry44.getLastModifiedDate();
        sevenZArchiveEntry32.setCreationDate(date50);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry53 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode54 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort55 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField56 = extraFieldParsingMode54.createExtraField(zipShort55);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField57 = jarArchiveEntry53.getExtraField(zipShort55);
        jarArchiveEntry53.setMethod((int) '4');
        java.util.Date date60 = jarArchiveEntry53.getLastModifiedDate();
        sevenZArchiveEntry32.setAccessDate(date60);
        dumpArchiveEntry2.setLastModifiedDate(date60);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[52, 54, 100, 51]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray34);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(extraFieldParsingMode45);
        org.junit.Assert.assertNotNull(zipShort46);
        org.junit.Assert.assertNotNull(zipExtraField47);
        org.junit.Assert.assertNull(zipExtraField48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "070707");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNotNull(extraFieldParsingMode54);
        org.junit.Assert.assertNotNull(zipShort55);
        org.junit.Assert.assertNotNull(zipExtraField56);
        org.junit.Assert.assertNull(zipExtraField57);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:59:59 CET 1970");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder0 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder2 = builder0.withMaxMemoryLimitInKb(0);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder4 = builder0.withUseDefaultNameForUnnamedEntries(false);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder6 = builder4.withUseDefaultNameForUnnamedEntries(true);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder8 = builder4.withTryToRecoverBrokenArchives(false);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions9 = builder4.build();
        int int10 = sevenZFileOptions9.getMaxMemoryLimitInKb();
        int int11 = sevenZFileOptions9.getMaxMemoryLimitInKb();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(sevenZFileOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj2 = jarArchiveEntry1.clone();
        int int3 = jarArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry1.setNameSource(nameSource4);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource6 = jarArchiveEntry1.getNameSource();
        java.lang.String str7 = jarArchiveEntry1.getName();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "070707");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + nameSource4 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource4.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertTrue("'" + nameSource6 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource6.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "070707" + "'", str7, "070707");
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        java.io.File file0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions1 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        boolean boolean2 = sevenZFileOptions1.getUseDefaultNameForUnnamedEntries();
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
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory1.getArchiveInputStreamProviders();
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory1.getInputStreamArchiveNames();
        java.util.Set<java.lang.String> strSet4 = archiveStreamFactory1.getOutputStreamArchiveNames();
        java.util.Set<java.lang.String> strSet5 = archiveStreamFactory1.getOutputStreamArchiveNames();
        java.util.Set<java.lang.String> strSet6 = archiveStreamFactory1.getInputStreamArchiveNames();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap7 = archiveStreamFactory1.getArchiveOutputStreamProviders();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset6 = null;
        int int7 = cpioArchiveEntry5.getHeaderPadCount(charset6);
        long long8 = cpioArchiveEntry5.getDeviceMaj();
        boolean boolean9 = cpioArchiveEntry5.isDirectory();
        boolean boolean10 = cpioArchiveEntry5.isPipe();
        cpioArchiveEntry5.setRemoteDeviceMaj((long) 9);
        boolean boolean13 = cpioArchiveEntry5.isPipe();
        java.nio.charset.Charset charset14 = null;
        int int15 = cpioArchiveEntry5.getHeaderPadCount(charset14);
        long long16 = cpioArchiveEntry5.getNumberOfLinks();
        cpioArchiveEntry5.setRemoteDeviceMaj((long) (byte) 12);
        long long19 = cpioArchiveEntry5.getChksum();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList23 = tarArchiveEntry22.getOrderedSparseHeaders();
        boolean boolean24 = tarArchiveEntry22.isPaxGNU1XSparse();
        tarArchiveEntry22.setNames("arj", "arj");
        tarArchiveEntry22.clearExtraPaxHeaders();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry31 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean32 = tarArchiveEntry31.isSparse();
        tarArchiveEntry31.setMode(26127);
        java.util.Date date35 = tarArchiveEntry31.getModTime();
        java.lang.String str36 = tarArchiveEntry31.getUserName();
        boolean boolean37 = tarArchiveEntry31.isSparse();
        boolean boolean38 = tarArchiveEntry22.equals(tarArchiveEntry31);
        byte byte39 = tarArchiveEntry22.getLinkFlag();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp40 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.nio.file.attribute.FileTime fileTime41 = x5455_ExtendedTimestamp40.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort42 = x5455_ExtendedTimestamp40.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong44 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 0);
        x5455_ExtendedTimestamp40.setModifyTime(zipLong44);
        java.nio.file.attribute.FileTime fileTime46 = x5455_ExtendedTimestamp40.getModifyFileTime();
        tarArchiveEntry22.setModTime(fileTime46);
        boolean boolean48 = cpioArchiveEntry5.equals((java.lang.Object) tarArchiveEntry22);
        cpioArchiveEntry5.setDeviceMin((long) 19969);
        cpioArchiveEntry5.setName("070702");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Tue Jun 20 13:22:33 CEST 2023");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 48 + "'", byte39 == (byte) 48);
        org.junit.Assert.assertNull(fileTime41);
        org.junit.Assert.assertNotNull(zipShort42);
        org.junit.Assert.assertNotNull(fileTime46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField1 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(476);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        java.lang.String str1 = arjArchiveEntry0.getName();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry4 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("070707", "ustar\000");
        boolean boolean5 = arjArchiveEntry0.equals((java.lang.Object) "ustar\000");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource6 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT;
        boolean boolean7 = arjArchiveEntry0.equals((java.lang.Object) commentSource6);
        java.util.Date date8 = arjArchiveEntry0.getLastModifiedDate();
        int int9 = arjArchiveEntry0.getUnixMode();
        boolean boolean10 = arjArchiveEntry0.isDirectory();
        boolean boolean11 = arjArchiveEntry0.isDirectory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + commentSource6 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT + "'", commentSource6.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Fri Nov 30 00:00:00 CET 1979");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
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
        org.apache.commons.compress.archivers.zip.ZipLong zipLong30 = new org.apache.commons.compress.archivers.zip.ZipLong(11);
        java.lang.String str31 = zipLong30.toString();
        x5455_ExtendedTimestamp12.setAccessTime(zipLong30);
        x5455_ExtendedTimestamp0.setAccessTime(zipLong30);
        java.lang.String str34 = x5455_ExtendedTimestamp0.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:22:33 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, -7, -117, -111, 100]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField22);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ZipLong value: 11" + "'", str31, "ZipLong value: 11");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0x5455 Zip Extra Field: Flags=1001011  Modify:[Tue Jun 20 13:22:33 CEST 2023]  Access:[Thu Jan 01 01:00:11 CET 1970] " + "'", str34, "0x5455 Zip Extra Field: Flags=1001011  Modify:[Tue Jun 20 13:22:33 CEST 2023]  Access:[Thu Jan 01 01:00:11 CET 1970] ");
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        byte[] byteArray5 = new byte[] { (byte) 88, (byte) 50, (byte) -1, (byte) 88, (byte) 75 };
        org.apache.commons.compress.archivers.tar.TarFile tarFile6 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray5);
        org.apache.commons.compress.archivers.tar.TarFile tarFile7 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray5);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry11.setNames("", "ZipLong value: 1");
        int int15 = tarArchiveEntry11.getGroupId();
        long long16 = tarArchiveEntry11.getRealSize();
        int int17 = tarArchiveEntry11.getUserId();
        java.io.InputStream inputStream18 = tarFile7.getInputStream(tarArchiveEntry11);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveEntry> tarArchiveEntryList19 = tarFile7.getEntries();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[88, 50, -1, 88, 75]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(tarArchiveEntryList19);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier scatterGatherBackingStoreSupplier1 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator2 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, scatterGatherBackingStoreSupplier1);
        org.apache.commons.compress.archivers.zip.ScatterStatistics scatterStatistics3 = parallelScatterZipCreator2.getStatisticsMessage();
        java.lang.String str4 = scatterStatistics3.toString();
        long long5 = scatterStatistics3.getCompressionElapsed();
        java.lang.String str6 = scatterStatistics3.toString();
        long long7 = scatterStatistics3.getCompressionElapsed();
        org.junit.Assert.assertNotNull(scatterStatistics3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "compressionElapsed=-1687260153286ms, mergingElapsed=0ms" + "'", str4, "compressionElapsed=-1687260153286ms, mergingElapsed=0ms");
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1687260153286L) + "'", long5 == (-1687260153286L));
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "compressionElapsed=-1687260153286ms, mergingElapsed=0ms" + "'", str6, "compressionElapsed=-1687260153286ms, mergingElapsed=0ms");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1687260153286L) + "'", long7 == (-1687260153286L));
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unrecognizedExtraField0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unrecognizedExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = unrecognizedExtraField0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp4.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean10 = tarArchiveEntry9.isSparse();
        tarArchiveEntry9.setMode(26127);
        java.util.Date date13 = tarArchiveEntry9.getModTime();
        x5455_ExtendedTimestamp4.setModifyJavaTime(date13);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = x5455_ExtendedTimestamp4.getCreateTime();
        byte[] byteArray16 = x5455_ExtendedTimestamp4.getLocalFileDataData();
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        unrecognizedExtraField0.setLocalFileDataData(byteArray16);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Jun 20 13:22:33 CEST 2023");
        org.junit.Assert.assertNull(zipLong15);
        org.junit.Assert.assertNotNull(byteArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, -7, -117, -111, 100]");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 634L + "'", long17 == 634L);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
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
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry16 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj17 = jarArchiveEntry16.clone();
        java.lang.Object obj18 = jarArchiveEntry16.clone();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry21 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        long long22 = tarArchiveEntry21.getDataOffset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 8, "ZipLong value: 11", (long) 10240);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry30 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry30.setNames("", "ZipLong value: 1");
        int int34 = tarArchiveEntry30.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry37 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean38 = tarArchiveEntry37.isSparse();
        tarArchiveEntry37.setMode(26127);
        java.nio.file.attribute.FileTime fileTime41 = tarArchiveEntry37.getLastModifiedTime();
        tarArchiveEntry30.setModTime(fileTime41);
        cpioArchiveEntry26.setTime(fileTime41);
        tarArchiveEntry21.setStatusChangeTime(fileTime41);
        java.util.zip.ZipEntry zipEntry45 = jarArchiveEntry16.setCreationTime(fileTime41);
        java.lang.String str46 = jarArchiveEntry16.getComment();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField47 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray49 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField53 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField47, byteArray49, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger54 = null;
        zip64ExtendedInformationExtraField47.setRelativeHeaderOffset(zipEightByteInteger54);
        byte[] byteArray56 = zip64ExtendedInformationExtraField47.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField58 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray59 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray56, true, unparseableExtraField58);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray60 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray56);
        byte[] byteArray61 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray60);
        jarArchiveEntry16.setExtraFields(zipExtraFieldArray60);
        byte[] byteArray63 = jarArchiveEntry16.getExtra();
        org.apache.commons.compress.archivers.tar.TarFile tarFile64 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray63);
        java.io.File file65 = null;
        expander0.expand(tarFile64, file65);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField67 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray69 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField73 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField67, byteArray69, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger74 = null;
        zip64ExtendedInformationExtraField67.setRelativeHeaderOffset(zipEightByteInteger74);
        byte[] byteArray76 = zip64ExtendedInformationExtraField67.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField78 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray79 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray76, true, unparseableExtraField78);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray80 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray76);
        byte[] byteArray81 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray80);
        byte[] byteArray82 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray80);
        org.apache.commons.compress.archivers.tar.TarFile tarFile84 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray82, true);
        java.nio.file.Path path85 = null;
        expander0.expand(tarFile84, path85);
        java.nio.file.Path path88 = null;
        java.nio.file.Path path89 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("compression method", path88, path89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(zipArchiveEntry12);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "070707");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "070707");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(fileTime41);
        org.junit.Assert.assertNotNull(zipEntry45);
        org.junit.Assert.assertEquals(zipEntry45.toString(), "070707");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField53);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray59);
        org.junit.Assert.assertNotNull(zipExtraFieldArray60);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField73);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray79);
        org.junit.Assert.assertNotNull(zipExtraFieldArray80);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[]");
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[]");
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj1 = asiExtraField0.clone();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField2 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField2, byteArray4, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = null;
        zip64ExtendedInformationExtraField2.setRelativeHeaderOffset(zipEightByteInteger9);
        byte[] byteArray11 = zip64ExtendedInformationExtraField2.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = null;
        zip64ExtendedInformationExtraField2.setSize(zipEightByteInteger12);
        byte[] byteArray14 = zip64ExtendedInformationExtraField2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            asiExtraField0.parseFromCentralDirectoryData(byteArray14, (int) (byte) 48, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: The length is too short, only 1 bytes, expected at least 14");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        long long6 = tarArchiveOutputStream5.getBytesWritten();
        tarArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        int int9 = tarArchiveOutputStream8.getCount();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse2 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse((long) 155, (long) (byte) 10);
        byte[] byteArray8 = new byte[] { (byte) 88, (byte) 50, (byte) -1, (byte) 88, (byte) 75 };
        org.apache.commons.compress.archivers.tar.TarFile tarFile9 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray8);
        org.apache.commons.compress.archivers.tar.TarFile tarFile10 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray8);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry14.setNames("", "ZipLong value: 1");
        int int18 = tarArchiveEntry14.getGroupId();
        long long19 = tarArchiveEntry14.getRealSize();
        int int20 = tarArchiveEntry14.getUserId();
        java.io.InputStream inputStream21 = tarFile10.getInputStream(tarArchiveEntry14);
        boolean boolean22 = tarArchiveStructSparse2.equals((java.lang.Object) tarFile10);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[88, 50, -1, 88, 75]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        boolean boolean7 = cpioArchiveInputStream1.markSupported();
        int int8 = cpioArchiveInputStream1.read();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "jar");
        int int11 = cpioArchiveInputStream1.read();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream12, (int) (byte) 88, 100, "compressionElapsed=-1687260027991ms, mergingElapsed=0ms", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: compressionElapsed=-1687260027991ms, mergingElapsed=0ms");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.fileBased(file0, 29127);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature0 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(" \000");
        long long3 = zipArchiveEntry2.getCompressedSize();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj6 = jarArchiveEntry5.clone();
        int int7 = jarArchiveEntry5.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource8 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry5.setNameSource(nameSource8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = jarArchiveEntry5.getExtraFields();
        jarArchiveEntry5.setExternalAttributes((long) (short) 2);
        java.lang.String str13 = jarArchiveEntry5.getName();
        jarArchiveEntry5.setExternalAttributes((long) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode16 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField18 = extraFieldParsingMode16.createExtraField(zipShort17);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp19 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp19.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean25 = tarArchiveEntry24.isSparse();
        tarArchiveEntry24.setMode(26127);
        java.util.Date date28 = tarArchiveEntry24.getModTime();
        x5455_ExtendedTimestamp19.setModifyJavaTime(date28);
        byte[] byteArray31 = new byte[] { (byte) -1 };
        byte[] byteArray32 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray31);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField36 = extraFieldParsingMode16.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp19, byteArray32, 0, 32768, true);
        java.nio.file.attribute.FileTime fileTime37 = null;
        x5455_ExtendedTimestamp19.setAccessFileTime(fileTime37);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong39 = x5455_ExtendedTimestamp19.getCreateTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry42 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        java.util.Map<java.lang.String, java.lang.String> strMap43 = tarArchiveEntry42.getExtraPaxHeaders();
        java.nio.file.attribute.FileTime fileTime44 = tarArchiveEntry42.getLastModifiedTime();
        x5455_ExtendedTimestamp19.setModifyFileTime(fileTime44);
        java.util.zip.ZipEntry zipEntry46 = jarArchiveEntry5.setLastAccessTime(fileTime44);
        java.util.zip.ZipEntry zipEntry47 = zipArchiveEntry2.setCreationTime(fileTime44);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException48 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature0, zipArchiveEntry2);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException49 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature0);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry51 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode52 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort53 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField54 = extraFieldParsingMode52.createExtraField(zipShort53);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField55 = jarArchiveEntry51.getExtraField(zipShort53);
        jarArchiveEntry51.setMethod((int) '4');
        jarArchiveEntry51.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry51);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField61 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField67 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField61, byteArray63, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger68 = null;
        zip64ExtendedInformationExtraField61.setRelativeHeaderOffset(zipEightByteInteger68);
        byte[] byteArray70 = zip64ExtendedInformationExtraField61.getLocalFileDataData();
        zipArchiveEntry60.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField61);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry72 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(zipArchiveEntry60);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException73 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature0, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry72);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry74 = unsupportedZipFeatureException73.getEntry();
        org.junit.Assert.assertNotNull(feature0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "070707");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + nameSource8 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource8.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "070707" + "'", str13, "070707");
        org.junit.Assert.assertNotNull(extraFieldParsingMode16);
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNotNull(zipExtraField18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Tue Jun 20 13:22:33 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1]");
        org.junit.Assert.assertNotNull(zipExtraField36);
        org.junit.Assert.assertNull(zipLong39);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(fileTime44);
        org.junit.Assert.assertNotNull(zipEntry46);
        org.junit.Assert.assertEquals(zipEntry46.toString(), "070707");
        org.junit.Assert.assertNotNull(zipEntry47);
        org.junit.Assert.assertEquals(zipEntry47.toString(), " \000");
        org.junit.Assert.assertNotNull(extraFieldParsingMode52);
        org.junit.Assert.assertNotNull(zipShort53);
        org.junit.Assert.assertNotNull(zipExtraField54);
        org.junit.Assert.assertNull(zipExtraField55);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField67);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[]");
        org.junit.Assert.assertNotNull(zipArchiveEntry74);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry1 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean2 = sevenZArchiveEntry1.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray3 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry1.setContentMethods(sevenZMethodConfigurationArray3);
        java.nio.file.attribute.FileTime fileTime5 = null;
        sevenZArchiveEntry1.setLastModifiedTime(fileTime5);
        sevenZArchiveEntry1.setHasWindowsAttributes(false);
        long long9 = sevenZArchiveEntry1.getCrcValue();
        sevenZArchiveEntry1.setLastModifiedDate(11L);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry13 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode14 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField16 = extraFieldParsingMode14.createExtraField(zipShort15);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = jarArchiveEntry13.getExtraField(zipShort15);
        java.lang.Object obj18 = jarArchiveEntry13.clone();
        java.util.Date date19 = jarArchiveEntry13.getLastModifiedDate();
        sevenZArchiveEntry1.setCreationDate(date19);
        x000A_NTFS0.setAccessJavaTime(date19);
        byte[] byteArray22 = x000A_NTFS0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS23 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        java.nio.file.attribute.FileTime fileTime24 = x000A_NTFS23.getAccessFileTime();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry27 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        dumpArchiveEntry27.setVolume(488);
        java.lang.String str30 = dumpArchiveEntry27.getSimpleName();
        boolean boolean31 = dumpArchiveEntry27.isSocket();
        int int32 = dumpArchiveEntry27.getHeaderHoles();
        boolean boolean33 = dumpArchiveEntry27.isBlkDev();
        java.lang.String str34 = dumpArchiveEntry27.getSimpleName();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry37 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("070707", (long) '4');
        java.lang.String str38 = arArchiveEntry37.getName();
        java.util.Date date39 = arArchiveEntry37.getLastModifiedDate();
        dumpArchiveEntry27.setLastModifiedDate(date39);
        x000A_NTFS23.setAccessJavaTime(date39);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry43 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj44 = jarArchiveEntry43.clone();
        java.lang.Object obj45 = jarArchiveEntry43.clone();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry48 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        long long49 = tarArchiveEntry48.getDataOffset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry53 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 8, "ZipLong value: 11", (long) 10240);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry57 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry57.setNames("", "ZipLong value: 1");
        int int61 = tarArchiveEntry57.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry64 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean65 = tarArchiveEntry64.isSparse();
        tarArchiveEntry64.setMode(26127);
        java.nio.file.attribute.FileTime fileTime68 = tarArchiveEntry64.getLastModifiedTime();
        tarArchiveEntry57.setModTime(fileTime68);
        cpioArchiveEntry53.setTime(fileTime68);
        tarArchiveEntry48.setStatusChangeTime(fileTime68);
        java.util.zip.ZipEntry zipEntry72 = jarArchiveEntry43.setCreationTime(fileTime68);
        x000A_NTFS23.setCreateFileTime(fileTime68);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort74 = x000A_NTFS23.getHeaderId();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry76 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        int int77 = cpioArchiveEntry76.getHeaderSize();
        cpioArchiveEntry76.setGID((long) 4096);
        long long80 = cpioArchiveEntry76.getRemoteDeviceMin();
        boolean boolean81 = cpioArchiveEntry76.isSymbolicLink();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry84 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        java.util.Map<java.lang.String, java.lang.String> strMap85 = tarArchiveEntry84.getExtraPaxHeaders();
        java.nio.file.attribute.FileTime fileTime86 = tarArchiveEntry84.getLastModifiedTime();
        cpioArchiveEntry76.setTime(fileTime86);
        x000A_NTFS23.setCreateFileTime(fileTime86);
        x000A_NTFS0.setCreateFileTime(fileTime86);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(extraFieldParsingMode14);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNotNull(zipExtraField16);
        org.junit.Assert.assertNull(zipExtraField17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "070707");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, -16, 88, 62, -43, -34, -79, -99, 1, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(fileTime24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "070707" + "'", str30, "070707");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "070707" + "'", str34, "070707");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "070707" + "'", str38, "070707");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Jun 20 13:22:33 CEST 2023");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "070707");
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "070707");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(fileTime68);
        org.junit.Assert.assertNotNull(zipEntry72);
        org.junit.Assert.assertEquals(zipEntry72.toString(), "070707");
        org.junit.Assert.assertNotNull(zipShort74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 110 + "'", int77 == 110);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(strMap85);
        org.junit.Assert.assertNotNull(fileTime86);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
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
        boolean boolean12 = cpioArchiveInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        zipArchiveOutputStream5.flush();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator9 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        java.lang.String str16 = zipArchiveOutputStream15.getEncoding();
        parallelScatterZipCreator9.writeTo(zipArchiveOutputStream15);
        zipArchiveOutputStream15.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode20 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
        zipArchiveOutputStream15.setUseZip64(zip64Mode20);
        zipArchiveOutputStream5.setUseZip64(zip64Mode20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, (short) (byte) 4, (int) '#', "ZipLong value: 0");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipLong value: 0");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF8" + "'", str16, "UTF8");
        org.junit.Assert.assertTrue("'" + zip64Mode20 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode20.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray1);
        int int3 = zipLong2.getIntValue();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField6 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 75, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = resourceAlignmentExtraField6.getHeaderId();
        short short8 = resourceAlignmentExtraField6.getAlignment();
        short short9 = resourceAlignmentExtraField6.getAlignment();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = resourceAlignmentExtraField6.getCentralDirectoryLength();
        boolean boolean11 = zipLong2.equals((java.lang.Object) zipShort10);
        byte[] byteArray12 = zipLong2.getBytes();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2162688 + "'", int3 == 2162688);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 75 + "'", short8 == (short) 75);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 75 + "'", short9 == (short) 75);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 33, 0]");
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
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
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField15 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = asiExtraField15.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = jarArchiveEntry1.getExtraField(zipShort16);
        java.nio.file.attribute.FileTime fileTime18 = jarArchiveEntry1.getLastModifiedTime();
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
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNull(zipExtraField17);
        org.junit.Assert.assertNull(fileTime18);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
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
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry21 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        java.lang.String str22 = dumpArchiveEntry21.getName();
        dumpArchiveEntry21.setName("ustar\000");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet25 = dumpArchiveEntry21.getPermissions();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE27 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.find(0);
        dumpArchiveEntry21.setType(tYPE27);
        dumpArchiveEntry2.setType(tYPE27);
        org.junit.Assert.assertNotNull(pERMISSIONSet3);
        org.junit.Assert.assertNotNull(extraFieldParsingMode6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNull(zipExtraField9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "`\n" + "'", str22, "`\n");
        org.junit.Assert.assertNotNull(pERMISSIONSet25);
        org.junit.Assert.assertTrue("'" + tYPE27 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN + "'", tYPE27.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN));
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unparseableExtraFieldData0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unparseableExtraFieldData0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = unparseableExtraFieldData0.getHeaderId();
        byte[] byteArray4 = unparseableExtraFieldData0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = unparseableExtraFieldData0.getHeaderId();
        byte[] byteArray6 = unparseableExtraFieldData0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField8 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField8, byteArray10, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger15 = null;
        zip64ExtendedInformationExtraField8.setRelativeHeaderOffset(zipEightByteInteger15);
        byte[] byteArray17 = zip64ExtendedInformationExtraField8.getLocalFileDataData();
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray17);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray17);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField21 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray23 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField27 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField21, byteArray23, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger28 = null;
        zip64ExtendedInformationExtraField21.setRelativeHeaderOffset(zipEightByteInteger28);
        byte[] byteArray30 = zip64ExtendedInformationExtraField21.getLocalFileDataData();
        byte[] byteArray31 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray30);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField32 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray30);
        unicodeCommentExtraField19.setUnicodeName(byteArray30);
        byte[] byteArray34 = unicodeCommentExtraField19.getUnicodeName();
        byte[] byteArray35 = unicodeCommentExtraField19.getUnicodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField39 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData0, byteArray35, 16, (int) (short) 3, true);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type acc1");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField27);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
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
        int int18 = jarArchiveInputStream15.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset21 = null;
        int int22 = cpioArchiveEntry20.getHeaderPadCount(charset21);
        boolean boolean23 = cpioArchiveEntry20.isBlockDevice();
        java.nio.charset.Charset charset24 = null;
        int int25 = cpioArchiveEntry20.getHeaderPadCount(charset24);
        boolean boolean26 = jarArchiveInputStream15.canReadEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry20);
        long long27 = cpioArchiveEntry20.getInode();
        boolean boolean28 = cpioArchiveEntry20.isNetwork();
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipArchiveEntry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(archiveEntry14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        java.util.Date date1 = x000A_NTFS0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        java.lang.String str3 = zipEightByteInteger2.toString();
        x000A_NTFS0.setModifyTime(zipEightByteInteger2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x000A_NTFS0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean9 = tarArchiveEntry8.isSparse();
        tarArchiveEntry8.setUserName("ZipLong value: 1");
        boolean boolean12 = tarArchiveEntry8.isStreamContiguous();
        java.util.Date date13 = tarArchiveEntry8.getLastModifiedDate();
        x000A_NTFS0.setCreateJavaTime(date13);
        java.lang.String str15 = x000A_NTFS0.toString();
        java.nio.file.attribute.FileTime fileTime16 = x000A_NTFS0.getAccessFileTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZipEightByteInteger value: 0" + "'", str3, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Jun 20 13:22:33 CEST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[2023-06-20T11:22:33.906Z] " + "'", str15, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[2023-06-20T11:22:33.906Z] ");
        org.junit.Assert.assertNull(fileTime16);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setUserId((int) ' ');
        tarArchiveEntry2.setMode((int) ' ');
        boolean boolean8 = tarArchiveEntry2.isDirectory();
        int int9 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setModTime((long) 508);
        tarArchiveEntry2.setUserId((-1687260020504L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setDevMinor((int) (short) 2);
        java.nio.file.attribute.FileTime fileTime10 = tarArchiveEntry2.getStatusChangeTime();
        java.util.Date date11 = tarArchiveEntry2.getModTime();
        int int12 = tarArchiveEntry2.getUserId();
        tarArchiveEntry2.setModTime((long) 'a');
        tarArchiveEntry2.setName("0x000A Zip Extra Field: Modify:[2023-06-20T11:20:08.338Z]  Access:[1979-11-29T23:00:00Z]  Create:[null] ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:22:33 CEST 2023");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Jun 20 13:22:33 CEST 2023");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        java.lang.String str3 = dumpArchiveEntry2.getName();
        dumpArchiveEntry2.setGeneration(1000);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "`\n" + "'", str3, "`\n");
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        int int2 = cpioArchiveEntry1.getHeaderSize();
        cpioArchiveEntry1.setGID((long) 4096);
        long long5 = cpioArchiveEntry1.getRemoteDeviceMin();
        boolean boolean6 = cpioArchiveEntry1.isSymbolicLink();
        long long7 = cpioArchiveEntry1.getInode();
        cpioArchiveEntry1.setGID((long) (byte) -128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder1 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder3 = builder1.withMaxMemoryLimitInKb(0);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder5 = builder3.withMaxMemoryLimitInKb(345);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder7 = builder3.withUseDefaultNameForUnnamedEntries(false);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions8 = builder7.build();
        boolean boolean9 = sevenZFileOptions8.getUseDefaultNameForUnnamedEntries();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, sevenZFileOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(sevenZFileOptions8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm1 = x0017_StrongEncryptionHeader0.getEncryptionAlgorithm();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm2 = x0017_StrongEncryptionHeader0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm3 = x0017_StrongEncryptionHeader0.getEncryptionAlgorithm();
        org.junit.Assert.assertNull(encryptionAlgorithm1);
        org.junit.Assert.assertNull(hashAlgorithm2);
        org.junit.Assert.assertNull(encryptionAlgorithm3);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
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
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry41 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.nio.file.attribute.FileTime fileTime42 = jarArchiveEntry41.getLastAccessTime();
        jarArchiveEntry41.setMethod(424935705);
        jarArchiveEntry41.setExternalAttributes((long) (byte) 4);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode47 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort48 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField49 = extraFieldParsingMode47.createExtraField(zipShort48);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp50 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp50.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry55 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean56 = tarArchiveEntry55.isSparse();
        tarArchiveEntry55.setMode(26127);
        java.util.Date date59 = tarArchiveEntry55.getModTime();
        x5455_ExtendedTimestamp50.setModifyJavaTime(date59);
        byte[] byteArray62 = new byte[] { (byte) -1 };
        byte[] byteArray63 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray62);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField67 = extraFieldParsingMode47.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp50, byteArray63, 0, 32768, true);
        java.nio.file.attribute.FileTime fileTime68 = null;
        x5455_ExtendedTimestamp50.setAccessFileTime(fileTime68);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong70 = x5455_ExtendedTimestamp50.getCreateTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry73 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        java.util.Map<java.lang.String, java.lang.String> strMap74 = tarArchiveEntry73.getExtraPaxHeaders();
        java.nio.file.attribute.FileTime fileTime75 = tarArchiveEntry73.getLastModifiedTime();
        x5455_ExtendedTimestamp50.setModifyFileTime(fileTime75);
        java.util.zip.ZipEntry zipEntry77 = jarArchiveEntry41.setCreationTime(fileTime75);
        x5455_ExtendedTimestamp3.setCreateFileTime(fileTime75);
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipExtraField2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Jun 20 13:22:34 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1]");
        org.junit.Assert.assertNotNull(zipExtraField20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Tue Jun 20 13:22:34 CEST 2023");
        org.junit.Assert.assertNull(zipLong35);
        org.junit.Assert.assertNotNull(byteArray36);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, -6, -117, -111, 100]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 75 + "'", byte37 == (byte) 75);
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Tue Jun 20 13:22:34 CEST 2023");
        org.junit.Assert.assertNull(fileTime42);
        org.junit.Assert.assertNotNull(extraFieldParsingMode47);
        org.junit.Assert.assertNotNull(zipShort48);
        org.junit.Assert.assertNotNull(zipExtraField49);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(date59);
// flaky:         org.junit.Assert.assertEquals(date59.toString(), "Tue Jun 20 13:22:34 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-1]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-1]");
        org.junit.Assert.assertNotNull(zipExtraField67);
        org.junit.Assert.assertNull(zipLong70);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNotNull(fileTime75);
        org.junit.Assert.assertNotNull(zipEntry77);
        org.junit.Assert.assertEquals(zipEntry77.toString(), "070707");
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean1 = sevenZArchiveEntry0.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray2 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray2);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList7 = tarArchiveEntry6.getOrderedSparseHeaders();
        boolean boolean8 = tarArchiveEntry6.isPaxGNU1XSparse();
        tarArchiveEntry6.setNames("arj", "arj");
        tarArchiveEntry6.clearExtraPaxHeaders();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean16 = tarArchiveEntry15.isSparse();
        tarArchiveEntry15.setMode(26127);
        java.util.Date date19 = tarArchiveEntry15.getModTime();
        java.lang.String str20 = tarArchiveEntry15.getUserName();
        boolean boolean21 = tarArchiveEntry15.isSparse();
        boolean boolean22 = tarArchiveEntry6.equals(tarArchiveEntry15);
        byte byte23 = tarArchiveEntry6.getLinkFlag();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp24 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp24.setFlags((byte) 75);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField28 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField34 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField28, byteArray30, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger35 = null;
        zip64ExtendedInformationExtraField28.setRelativeHeaderOffset(zipEightByteInteger35);
        byte[] byteArray37 = zip64ExtendedInformationExtraField28.getLocalFileDataData();
        byte[] byteArray38 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray37);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField39 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray37);
        boolean boolean40 = x5455_ExtendedTimestamp24.equals((java.lang.Object) unicodeCommentExtraField39);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort41 = x5455_ExtendedTimestamp24.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry44 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        long long45 = tarArchiveEntry44.getDataOffset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 8, "ZipLong value: 11", (long) 10240);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry53 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry53.setNames("", "ZipLong value: 1");
        int int57 = tarArchiveEntry53.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry60 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean61 = tarArchiveEntry60.isSparse();
        tarArchiveEntry60.setMode(26127);
        java.nio.file.attribute.FileTime fileTime64 = tarArchiveEntry60.getLastModifiedTime();
        tarArchiveEntry53.setModTime(fileTime64);
        cpioArchiveEntry49.setTime(fileTime64);
        tarArchiveEntry44.setStatusChangeTime(fileTime64);
        x5455_ExtendedTimestamp24.setModifyFileTime(fileTime64);
        tarArchiveEntry6.setLastModifiedTime(fileTime64);
        sevenZArchiveEntry0.setCreationTime(fileTime64);
        boolean boolean71 = sevenZArchiveEntry0.getHasWindowsAttributes();
        sevenZArchiveEntry0.setHasCrc(true);
        sevenZArchiveEntry0.setAccessDate(1687259938L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray2);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Tue Jun 20 13:22:34 CEST 2023");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 48 + "'", byte23 == (byte) 48);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(zipShort41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(fileTime64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet3 = dumpArchiveEntry2.getPermissions();
        int int4 = dumpArchiveEntry2.getHeaderHoles();
        dumpArchiveEntry2.setGroupId(0);
        dumpArchiveEntry2.setGeneration(488);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry12.setNames("", "ZipLong value: 1");
        int int16 = tarArchiveEntry12.getGroupId();
        tarArchiveEntry12.setGroupName("apk");
        java.util.Date date19 = tarArchiveEntry12.getModTime();
        dumpArchiveEntry2.setLastModifiedDate(date19);
        org.junit.Assert.assertNotNull(pERMISSIONSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Tue Jun 20 13:22:34 CEST 2023");
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setUserName("ZipLong value: 1");
        boolean boolean6 = tarArchiveEntry2.isStreamContiguous();
        boolean boolean7 = tarArchiveEntry2.isStreamContiguous();
        long long8 = tarArchiveEntry2.getDataOffset();
        boolean boolean9 = tarArchiveEntry2.isFile();
        boolean boolean10 = tarArchiveEntry2.isFIFO();
        boolean boolean11 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        java.nio.file.Path path0 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier1 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path0);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = defaultBackingStoreSupplier1.get();
        java.nio.file.Path path3 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier4 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path3);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore5 = defaultBackingStoreSupplier4.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor6 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore5);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream7 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore2, streamCompressor6);
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor8 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore2);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore2);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore5);
        org.junit.Assert.assertNotNull(streamCompressor6);
        org.junit.Assert.assertNotNull(streamCompressor8);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
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
        byte[] byteArray28 = unicodeCommentExtraField12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = unicodeCommentExtraField12.getHeaderId();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort29);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration1 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0);
        java.lang.Object obj2 = sevenZMethodConfiguration1.getOptions();
        java.lang.Object obj3 = sevenZMethodConfiguration1.getOptions();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry7.setNames("", "ZipLong value: 1");
        int int11 = tarArchiveEntry7.getGroupId();
        tarArchiveEntry7.addPaxHeader("hi!", "compression method");
        java.lang.String str15 = tarArchiveEntry7.getName();
        boolean boolean16 = sevenZMethodConfiguration1.equals((java.lang.Object) str15);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = tarArchiveEntry19.getExtraPaxHeaders();
        boolean boolean21 = sevenZMethodConfiguration1.equals((java.lang.Object) strMap20);
        java.lang.Object obj22 = null;
        boolean boolean23 = sevenZMethodConfiguration1.equals(obj22);
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream1 = null;
        java.nio.file.Path path2 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create(archiveOutputStream1, path2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 75, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = resourceAlignmentExtraField2.getHeaderId();
        short short4 = resourceAlignmentExtraField2.getAlignment();
        byte[] byteArray5 = resourceAlignmentExtraField2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField6 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField12 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField6, byteArray8, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger13 = null;
        zip64ExtendedInformationExtraField6.setRelativeHeaderOffset(zipEightByteInteger13);
        byte[] byteArray15 = zip64ExtendedInformationExtraField6.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField17 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray15, true, unparseableExtraField17);
        // The following exception was thrown during execution in test generation
        try {
            resourceAlignmentExtraField2.parseFromCentralDirectoryData(byteArray15, 76, 1687260065);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 76");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 75 + "'", short4 == (short) 75);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[75, -128]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = tarArchiveEntry2.getExtraPaxHeaders();
        tarArchiveEntry2.setGroupId(257);
        boolean boolean10 = tarArchiveEntry2.isGNUSparse();
        java.nio.file.attribute.FileTime fileTime11 = tarArchiveEntry2.getLastModifiedTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:22:34 CEST 2023");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fileTime11);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] { seekableByteChannel0 };
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray1);
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray1);
        org.junit.Assert.assertNotNull(seekableByteChannelArray1);
        org.junit.Assert.assertNull(seekableByteChannel2);
        org.junit.Assert.assertNull(seekableByteChannel3);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier scatterGatherBackingStoreSupplier1 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator3 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, scatterGatherBackingStoreSupplier1, 6);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier4 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable5 = parallelScatterZipCreator3.createCallable(zipArchiveEntryRequestSupplier4);
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable5);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0016_CertificateIdForCentralDirectory0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm2 = x0016_CertificateIdForCentralDirectory0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm3 = x0016_CertificateIdForCentralDirectory0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix4 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        x7875_NewUnix4.setGID((long) 'a');
        byte[] byteArray7 = x7875_NewUnix4.getLocalFileDataData();
        x0016_CertificateIdForCentralDirectory0.parseFromCentralDirectoryData(byteArray7, 2, 40960);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNull(hashAlgorithm2);
        org.junit.Assert.assertNull(hashAlgorithm3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 2, -24, 3, 1, 97]");
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(2048);
        org.apache.commons.compress.archivers.tar.TarFile tarFile3 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray1, true);
        tarFile3.close();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 8]");
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream3);
        arArchiveOutputStream5.finish();
        arArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream5, "070701");
        org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream11 = archiveStreamFactory1.createArchiveOutputStream("tar", (java.io.OutputStream) cpioArchiveOutputStream9, "UTF8");
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) archiveOutputStream11);
        arArchiveOutputStream12.setLongFileMode(493);
        arArchiveOutputStream12.setLongFileMode((int) (byte) 75);
        arArchiveOutputStream12.setLongFileMode(26113);
        arArchiveOutputStream12.finish();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = tarArchiveEntry22.getExtraPaxHeaders();
        tarArchiveEntry22.setGroupId(420);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream12.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry22);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveOutputStream11);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
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
        long long14 = zipArchiveOutputStream5.getBytesWritten();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry17 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("070707", (long) '4');
        long long18 = arArchiveEntry17.getLastModified();
        boolean boolean19 = zipArchiveOutputStream5.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) arArchiveEntry17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + zip64Mode11 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode11.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1687260154L + "'", long18 == 1687260154L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        boolean boolean6 = arArchiveOutputStream2.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry5);
        boolean boolean7 = tarArchiveEntry5.isLink();
        boolean boolean8 = tarArchiveEntry5.isFIFO();
        int int9 = tarArchiveEntry5.getGroupId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
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
        byte[] byteArray54 = zipEntry53.getExtra();
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
        org.junit.Assert.assertNotNull(byteArray54);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[85, 84, 5, 0, 2, -6, -117, -111, 100, 10, 0, 32, 0, 0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, -16, -75, -48, -126, 105, -93, -39, 1, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0017_StrongEncryptionHeader0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm2 = x0017_StrongEncryptionHeader0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm3 = x0017_StrongEncryptionHeader0.getEncryptionAlgorithm();
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray4, 2147483647, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNull(hashAlgorithm2);
        org.junit.Assert.assertNull(encryptionAlgorithm3);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
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
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore11 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor12 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore11);
        streamCompressor12.close();
        long long14 = streamCompressor12.getTotalBytesWritten();
        long long15 = streamCompressor12.getCrc32();
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream16 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore2, streamCompressor12);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream17);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream19 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream17);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream17, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        java.lang.String str23 = zipArchiveOutputStream22.getEncoding();
        zipArchiveOutputStream22.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream22, "070701");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode28 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
        zipArchiveOutputStream22.setUseZip64(zip64Mode28);
        java.lang.String str30 = zipArchiveOutputStream22.getEncoding();
        zipArchiveOutputStream22.setUseLanguageEncodingFlag(false);
        scatterZipOutputStream16.writeTo(zipArchiveOutputStream22);
        java.lang.String str34 = zipArchiveOutputStream22.getEncoding();
        org.junit.Assert.assertNotNull(scatterGatherBackingStore2);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore5);
        org.junit.Assert.assertNotNull(streamCompressor6);
        org.junit.Assert.assertNotNull(streamCompressor9);
        org.junit.Assert.assertNotNull(streamCompressor12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTF8" + "'", str23, "UTF8");
        org.junit.Assert.assertTrue("'" + zip64Mode28 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode28.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTF8" + "'", str30, "UTF8");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTF8" + "'", str34, "UTF8");
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean1 = sevenZArchiveEntry0.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray2 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray2);
        sevenZArchiveEntry0.setHasWindowsAttributes(false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 1, false);
        tarArchiveEntry9.addPaxHeader("tar\000", "");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean16 = tarArchiveEntry15.isStarSparse();
        java.util.Date date17 = tarArchiveEntry15.getModTime();
        tarArchiveEntry9.setModTime(date17);
        sevenZArchiveEntry0.setCreationDate(date17);
        long long20 = sevenZArchiveEntry0.getCrcValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Jun 20 13:22:34 CEST 2023");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 75, true);
        short short3 = resourceAlignmentExtraField2.getAlignment();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = resourceAlignmentExtraField2.getLocalFileDataLength();
        byte[] byteArray5 = resourceAlignmentExtraField2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("splitting");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5, zipEncoding7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 75 + "'", short3 == (short) 75);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[75, -128]");
        org.junit.Assert.assertNotNull(zipEncoding7);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("TarArchiveStructSparse{offset=155, numbytes=10}", true);
    }
}
