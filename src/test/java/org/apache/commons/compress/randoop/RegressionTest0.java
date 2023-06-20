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
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.NTREC;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.PKWARE_IMPLODING;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.PKWARE_IMPLODING + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.PKWARE_IMPLODING));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        short short0 = org.apache.commons.compress.archivers.cpio.CpioConstants.FORMAT_NEW_CRC;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 2 + "'", short0 == (short) 2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        long long0 = org.apache.commons.compress.archivers.ArchiveEntry.SIZE_UNKNOWN;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0 == (-1L));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
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
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.GIDLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_MULTIVOLUME;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 77 + "'", byte0 == (byte) 77);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.WIN32;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISDIR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
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
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int int0 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.BASE_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES192;
        int int1 = encryptionAlgorithm0.getCode();
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES192 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES192));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26127 + "'", int1 == 26127);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 10, byteArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, -1]");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.pathBased(path0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(file0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        byte[] byteArray2 = new byte[] { (byte) 77, (byte) 77 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray2, 26127);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26134");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[77, 77]");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray5, (int) (short) 0, (int) (byte) 77, true);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type 1");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -1, 0]");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.LBLSIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.UIDLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.file.AccessDeniedException; message: ");
        } catch (java.nio.file.AccessDeniedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        long long0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.UNKNOWN;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0 == (-1L));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(file0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE cOMPRESSION_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.find((int) (byte) 77);
        org.junit.Assert.assertNull(cOMPRESSION_TYPE1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField1 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraFieldNoDefault(zipShort0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.FORMAT_OLDGNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        byte[] byteArray6 = new byte[] { (byte) 77, (byte) 1, (byte) 0, (byte) 77, (byte) 100, (byte) 77 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[77, 1, 0, 77, 100, 77]");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        short short0 = org.apache.commons.compress.archivers.cpio.CpioConstants.FORMAT_OLD_MASK;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 12 + "'", short0 == (short) 12);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.io.File file0 = null;
        char[] charArray7 = new char[] { '4', ' ', '#', '#', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(file0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 ##  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 ##  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  , #, #,  ,  ]");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.UNKNOWN;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.UNKNOWN + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.UNKNOWN));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (short) 0, (int) (short) 12, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = cpioArchiveInputStream1.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.compress.MemoryLimitException memoryLimitException2 = new org.apache.commons.compress.MemoryLimitException((long) (short) 100, (int) (byte) 77);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, sevenZFileOptions1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry tarArchiveSparseEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100]");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.BIGNUMBER_POSIX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.AMIGA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.APPLE_GS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.DIR_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.APKS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "apks" + "'", str0, "apks");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 0, byteArray3, (int) (short) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int int0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.THROW_KEY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.MAC_OS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_WRITE;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_WRITE + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_WRITE));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC2pre52;
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC2pre52 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC2pre52));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.REALSIZELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption3 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] { linkOption3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 0, path1, "hi!", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IXUSR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.PAD2LEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) (short) 12, (int) (short) 100, zipEncoding6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_SYMLINK;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 50 + "'", byte0 == (byte) 50);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_XSTAR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tar\000" + "'", str0, "tar\000");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_DIR;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 53 + "'", byte0 == (byte) 53);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0, "tar\000");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: tar?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD;
        org.junit.Assert.assertTrue("'" + commentSource0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD + "'", commentSource0.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_GNUTYPE_LONGLINK;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 75 + "'", byte0 == (byte) 75);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit11 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.parse(byteArray9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        boolean boolean1 = org.apache.commons.compress.archivers.zip.ZipUtil.isDosTime((long) (-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(2, true);
        byte[] byteArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            resourceAlignmentExtraField2.parseFromCentralDirectoryData(byteArray3, (int) 'a', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(strMap0, byteArray10, zipEncoding11, false, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.XSTAR_CTIME_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 488 + "'", int0 == 488);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.UNAMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.SOCKET;
        org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.SOCKET + "'", tYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.SOCKET));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter zipEntryWriter1 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter(scatterZipOutputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0, (int) '#', "apks");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.FORMAT_POSIX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.FILE_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32768 + "'", int0 == 32768);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_PAX_EXTENDED_HEADER_UC;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 88 + "'", byte0 == (byte) 88);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.MAGIC_OLD_BINARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 29127 + "'", int0 == 29127);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.DEFAULT_BLKSIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10240 + "'", int0 == 10240);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.compress.archivers.sevenz.CLI cLI0 = new org.apache.commons.compress.archivers.sevenz.CLI();
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        byte[] byteArray10 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray10, zipEncoding11, false, (long) 16);
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
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        short short0 = org.apache.commons.compress.archivers.cpio.CpioConstants.FORMAT_OLD_BINARY;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 8 + "'", short0 == (short) 8);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        int int0 = org.apache.commons.compress.archivers.zip.ZipExtraField.EXTRAFIELD_HEADER_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        byte[] byteArray1 = new byte[] { (byte) 50 };
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[50]");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray9);
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISFIFO;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_ANT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ustar\000" + "'", str0, "ustar\000");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray10);
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.ARJ;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "arj" + "'", str0, "arj");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        byte byte0 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.MODIFY_TIME_BIT;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 1 + "'", byte0 == (byte) 1);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_GNU;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ustar " + "'", str0, "ustar ");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.SETGUI;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.SETGUI + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.SETGUI));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException unsupportedCompressionAlgorithmException0 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException();
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
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
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int int0 = org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.LONGFILE_ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.ISEXTENDEDLEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        byte byte0 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.CREATE_TIME_BIT;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 4 + "'", byte0 == (byte) 4);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "ustar\000");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ustar?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.compress.archivers.ArchiveStreamFactory.detect((java.io.InputStream) cpioArchiveInputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 4, byteArray10, 32768);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32768");
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
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 488);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 488");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.compress.archivers.zip.Zip64RequiredException zip64RequiredException1 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException("tar\000");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        boolean boolean1 = org.apache.commons.compress.archivers.zip.ZipUtil.isDosTime((long) 488);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.GROUP_READ;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.GROUP_READ + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.GROUP_READ));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        byte[] byteArray5 = new byte[] { (byte) 88, (byte) 50, (byte) -1, (byte) 88, (byte) 75 };
        org.apache.commons.compress.archivers.tar.TarFile tarFile6 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse8 = org.apache.commons.compress.archivers.tar.TarUtils.parseSparse(byteArray5, (int) (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[88, 50, -1, 88, 75]");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.LONGFILE_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.String str0 = org.apache.commons.compress.archivers.cpio.CpioConstants.MAGIC_OLD_ASCII;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "070707" + "'", str0, "070707");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        long long0 = org.apache.commons.compress.archivers.EntryStreamOffsets.OFFSET_UNKNOWN;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0 == (-1L));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException0 = new org.apache.commons.compress.archivers.dump.DumpArchiveException();
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray2, 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16384");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.compress.archivers.Lister lister0 = new org.apache.commons.compress.archivers.Lister();
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_FIFO;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 54 + "'", byte0 == (byte) 54);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = cpioArchiveInputStream1.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.FS_UFS2_MAGIC;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 424935705 + "'", int0 == 424935705);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray10, (int) (byte) 88);
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
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray1);
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray2, (int) (byte) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 255L + "'", long3 == 255L);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException2 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 156 + "'", int0 == 156);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        byte[] byteArray10 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray10, zipEncoding11);
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
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "apks", sevenZFileOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SPARSE_HEADERS_IN_OLDGNU_HEADER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "ustar\000");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ustar?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray2, 26127);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26134");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(2, true);
        byte[] byteArray3 = resourceAlignmentExtraField2.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse5 = org.apache.commons.compress.archivers.tar.TarUtils.parseSparse(byteArray3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[2, -128]");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.TOKENIZATION;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.TOKENIZATION + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.TOKENIZATION));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT;
        org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT + "'", tYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile1 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        int int0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ_KEY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.PREFIXLEN_XSTAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 131 + "'", int0 == 131);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.XSTAR_MAGIC_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 508 + "'", int0 == 508);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.ATIMELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        long long0 = org.apache.commons.compress.archivers.tar.TarConstants.MAXID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 2097151L + "'", long0 == 2097151L);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        tarArchiveInputStream2.reset();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = tarArchiveInputStream2.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        tarArchiveInputStream2.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = tarArchiveInputStream2.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList3 = tarArchiveEntry2.getOrderedSparseHeaders();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField5, byteArray7, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = null;
        zip64ExtendedInformationExtraField5.setRelativeHeaderOffset(zipEightByteInteger12);
        byte[] byteArray14 = zip64ExtendedInformationExtraField5.getLocalFileDataData();
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray14);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray10);
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
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSIONLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator1 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator1.writeTo(zipArchiveOutputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.FORMAT_XSTAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES192;
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES192 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES192));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField0 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.OFS_MAGIC;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60011 + "'", int0 == 60011);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = cpioArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("ustar ", (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) (byte) 4);
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField12.parseFromLocalFileData(byteArray28, 100, (int) (byte) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[4, 0]");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 100, "ustar\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.RIPEND160;
        org.junit.Assert.assertTrue("'" + hashAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.RIPEND160 + "'", hashAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.RIPEND160));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.String str0 = org.apache.commons.compress.archivers.cpio.CpioConstants.CPIO_TRAILER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "TRAILER!!!" + "'", str0, "TRAILER!!!");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream6 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: unexpected EOF");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        byte[] byteArray1 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray1, 3, (int) (byte) 53, zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField11 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray9, true, unparseableExtraField11);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray9, 10240);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10240");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.String str0 = org.apache.commons.compress.archivers.ar.ArArchiveEntry.HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "!<arch>\n" + "'", str0, "!<arch>\n");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(file0, "compression method");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
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
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.S_IFMT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 61440 + "'", int0 == 61440);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = cpioArchiveEntry1.getRemoteDevice();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 103 + "'", byte0 == (byte) 103);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 10, 3, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 4096, 29127, "tar\000");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: tar?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.lang.String str0 = org.apache.commons.compress.archivers.cpio.CpioConstants.MAGIC_NEW_CRC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "070702" + "'", str0, "070702");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        boolean boolean1 = org.apache.commons.compress.archivers.zip.ZipUtil.isDosTime((long) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile4 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "arj", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.GROUP_WRITE;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.GROUP_WRITE + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.GROUP_WRITE));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.LONGNAMESLEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry1.setRemoteDevice((long) (byte) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        java.nio.file.Path path3 = null;
        java.nio.file.FileVisitOption[] fileVisitOptionArray4 = new java.nio.file.FileVisitOption[] {};
        java.util.EnumSet<java.nio.file.FileVisitOption> fileVisitOptionSet6 = java.util.EnumSet.noneOf(java.nio.file.FileVisitOption.class);
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.nio.file.FileVisitOption>) fileVisitOptionSet6, fileVisitOptionArray4);
        java.nio.file.LinkOption linkOption8 = null;
        java.nio.file.LinkOption[] linkOptionArray9 = new java.nio.file.LinkOption[] { linkOption8 };
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) cpioArchiveOutputStream2, path3, fileVisitOptionSet6, linkOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileVisitOptionArray4);
        org.junit.Assert.assertNotNull(fileVisitOptionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(linkOptionArray9);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode(2162688);
        org.junit.Assert.assertNull(encryptionAlgorithm1);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry1.setMode((long) (short) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode. Full: 8 Masked: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.BIGNUMBER_STAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.LINK;
        org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.LINK + "'", tYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.LINK));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.NAMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.NFS_MAGIC;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60012 + "'", int0 == 60012);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.LONGFILE_ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGICLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(file0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        int int1 = org.apache.commons.compress.archivers.zip.ZipUtil.signedByteToUnsignedInt((byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray9, 11);
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        java.nio.file.attribute.FileTime fileTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.setModTime(fileTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Time must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.ZIP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "zip" + "'", str0, "zip");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray21, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Zip64 extended information must contain both size values in the local file header.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = extraFieldParsingMode0.onUnparseableExtraField(byteArray3, (int) (short) -1, 64, true, 16384);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField9 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField9, byteArray11, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger16 = null;
        zip64ExtendedInformationExtraField9.setRelativeHeaderOffset(zipEightByteInteger16);
        byte[] byteArray18 = zip64ExtendedInformationExtraField9.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = zip64ExtendedInformationExtraField9.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField20 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField26 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField20, byteArray22, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger27 = null;
        zip64ExtendedInformationExtraField20.setRelativeHeaderOffset(zipEightByteInteger27);
        byte[] byteArray29 = zip64ExtendedInformationExtraField20.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField31 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray32 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray29, true, unparseableExtraField31);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField36 = extraFieldParsingMode0.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField9, byteArray29, (int) (byte) 100, 8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertNull(zipExtraField8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray32);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort0 = org.apache.commons.compress.archivers.zip.ZipShort.ZERO;
        org.junit.Assert.assertNotNull(zipShort0);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.GNU_LONGLINK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "././@LongLink" + "'", str0, "././@LongLink");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.NAMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SIZELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.SETUID;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.SETUID + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.SETUID));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 1, false);
        tarArchiveEntry3.addPaxHeader("tar\000", "");
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList7 = tarArchiveEntry3.getOrderedSparseHeaders();
        java.nio.file.attribute.FileTime fileTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.setModTime(fileTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Time must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList7);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSION_POSIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "00" + "'", str0, "00");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
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
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry31 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(strMap0, byteArray24, zipEncoding28, false, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.CHECKSUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 84446 + "'", int0 == 84446);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.OS_2;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = arArchiveOutputStream2.createArchiveEntry(file4, "070702");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED;
        int int1 = zipMethod0.getCode();
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = cpioArchiveInputStream1.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, "apks");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = tarArchiveInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.util.ArrayList<java.nio.channels.SeekableByteChannel> seekableByteChannelList1 = new java.util.ArrayList<java.nio.channels.SeekableByteChannel>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.nio.channels.SeekableByteChannel>) seekableByteChannelList1, seekableByteChannelArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel3 = new org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel((java.util.List<java.nio.channels.SeekableByteChannel>) seekableByteChannelList1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        cpioArchiveEntry1.setGID((long) 156);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry1.setRemoteDevice((long) (byte) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("zip", (long) (short) 2, 131, (int) (byte) 100, (int) (byte) 100, (long) (byte) 0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.PERM_MASK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4095 + "'", int0 == 4095);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.BLOCK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 512 + "'", int0 == 512);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray7 = new char[] { ' ', ' ', ' ', '#', '#' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "00", charArray7, sevenZFileOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "   ##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "   ##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  ,  , #, #]");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(file0, "TRAILER!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse2 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse((long) 8, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: numbytes must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField7 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(2, true);
        byte[] byteArray8 = resourceAlignmentExtraField7.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = cpioArchiveInputStream1.read(byteArray8, (int) (byte) 75, (int) (byte) 54);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[2, -128]");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry1.setMode((long) 156);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode. Full: 9c Masked: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0015_CertificateIdForFile0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField2 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField2, byteArray4, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = null;
        zip64ExtendedInformationExtraField2.setRelativeHeaderOffset(zipEightByteInteger9);
        byte[] byteArray11 = zip64ExtendedInformationExtraField2.getLocalFileDataData();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray11);
        org.apache.commons.compress.archivers.tar.TarFile tarFile14 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray12, "arj");
        // The following exception was thrown during execution in test generation
        try {
            x0015_CertificateIdForFile0.parseFromCentralDirectoryData(byteArray12, 4095, 2162688);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BZIP2;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.BZIP2 + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.BZIP2));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DELTA_FILTER;
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature3 = null;
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException4 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = unsupportedZipFeatureException4.getEntry();
        org.apache.commons.compress.MemoryLimitException memoryLimitException6 = new org.apache.commons.compress.MemoryLimitException((long) '4', 11, (java.lang.Exception) unsupportedZipFeatureException4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration7 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0, (java.lang.Object) unsupportedZipFeatureException4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DELTA_FILTER method doesn't support options of type class org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.DELTA_FILTER + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.DELTA_FILTER));
        org.junit.Assert.assertNull(zipArchiveEntry5);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.LONGFILE_POSIX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISNWK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 36864 + "'", int0 == 36864);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory1.getArchiveOutputStreamProviders();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream4);
        long long7 = cpioArchiveInputStream5.skip((long) (byte) 100);
        cpioArchiveInputStream5.mark(4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream10 = archiveStreamFactory1.createArchiveInputStream("arj", (java.io.InputStream) cpioArchiveInputStream5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: null");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISLNK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 40960 + "'", int0 == 40960);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.WORLD_EXEC;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.WORLD_EXEC + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.WORLD_EXEC));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.compress.PasswordRequiredException passwordRequiredException1 = new org.apache.commons.compress.PasswordRequiredException("");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.SEVEN_Z;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "7z" + "'", str0, "7z");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = x5455_ExtendedTimestamp3.getLocalFileDataData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipExtraField2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Jun 20 13:17:48 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1]");
        org.junit.Assert.assertNotNull(zipExtraField20);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode1 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField3 = extraFieldParsingMode1.createExtraField(zipShort2);
        byte[] byteArray5 = new byte[] { (byte) -1 };
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray5);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = extraFieldParsingMode1.onUnparseableExtraField(byteArray6, (int) (byte) 88, (int) (byte) 1, true, 10240);
        // The following exception was thrown during execution in test generation
        try {
            x0015_CertificateIdForFile0.parseFromCentralDirectoryData(byteArray6, 61440, 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipExtraField3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertNull(zipExtraField11);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField0 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField();
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.DEFAULT_LINK_PERM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 511 + "'", int0 == 511);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        cpioArchiveEntry1.setGID((long) 156);
        long long6 = cpioArchiveEntry1.getRemoteDeviceMaj();
        long long7 = cpioArchiveEntry1.getGID();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = cpioArchiveEntry1.getRemoteDevice();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 156L + "'", long7 == 156L);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        boolean boolean6 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setNames("hi!", "tar\000");
        java.lang.String str10 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setUserId((long) 36864);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "tar\000" + "'", str10, "tar\000");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.BIGNUMBER_ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, "apks");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream5 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream(inputStream0, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField4, byteArray6, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = null;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger11);
        byte[] byteArray13 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField15 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray13, true, unparseableExtraField15);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tarArchiveInputStream2.read(byteArray13, 4, 511);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        long long4 = cpioArchiveInputStream2.skip((long) (byte) 100);
        cpioArchiveInputStream2.mark(6);
        boolean boolean7 = cpioArchiveInputStream2.markSupported();
        boolean boolean8 = cpioArchiveInputStream2.markSupported();
        closeableConsumer0.accept((java.io.Closeable) cpioArchiveInputStream2);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) (byte) 4);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = cpioArchiveInputStream2.read(byteArray11, 9, (int) (byte) 103);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[4, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.compress.archivers.ArchiveStreamFactory.detect((java.io.InputStream) cpioArchiveInputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISUID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField10 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField10, byteArray12, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger17 = null;
        zip64ExtendedInformationExtraField10.setRelativeHeaderOffset(zipEightByteInteger17);
        byte[] byteArray19 = zip64ExtendedInformationExtraField10.getLocalFileDataData();
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray19);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField21 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray19);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField23 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField29 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField23, byteArray25, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger30 = null;
        zip64ExtendedInformationExtraField23.setRelativeHeaderOffset(zipEightByteInteger30);
        byte[] byteArray32 = zip64ExtendedInformationExtraField23.getLocalFileDataData();
        byte[] byteArray33 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray32);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField34 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray32);
        unicodeCommentExtraField21.setUnicodeName(byteArray32);
        byte[] byteArray36 = unicodeCommentExtraField21.getUnicodeName();
        byte[] byteArray37 = unicodeCommentExtraField21.getUnicodeName();
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray37, 12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.ISEXTENDEDLEN_GNU_SPARSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.compress.archivers.zip.ZipFile zipFile0 = null;
        org.apache.commons.compress.archivers.zip.ZipFile.closeQuietly(zipFile0);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES128;
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES128 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES128));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField2 = extraFieldParsingMode0.createExtraField(zipShort1);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField3, byteArray5, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = null;
        zip64ExtendedInformationExtraField3.setRelativeHeaderOffset(zipEightByteInteger10);
        byte[] byteArray12 = zip64ExtendedInformationExtraField3.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray12, true, unparseableExtraField14);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField20 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField(zipExtraField2, byteArray12, (int) (byte) -1, 512, true);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type 5455");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipExtraField2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, 1, 4095);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
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
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException1 = new org.apache.commons.compress.archivers.dump.DumpArchiveException("");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream3);
        arArchiveOutputStream5.finish();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream8 = archiveStreamFactory1.createArchiveOutputStream("data descriptor", (java.io.OutputStream) arArchiveOutputStream5, "");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: data descriptor not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode0 = org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility;
        org.junit.Assert.assertTrue("'" + zip64Mode0 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility + "'", zip64Mode0.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.AR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ar" + "'", str0, "ar");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.find(8);
        org.junit.Assert.assertNotNull(pERMISSIONSet1);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) -1, path1, "!<arch>\n", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        tarArchiveInputStream2.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream2.getNextTarEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        int int0 = java.util.zip.ZipEntry.STORED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption3 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] { linkOption3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 2, path1, "ar", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.String str0 = org.apache.commons.compress.archivers.ar.ArArchiveEntry.TRAILER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "`\n" + "'", str0, "`\n");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption3 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] { linkOption3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 75, path1, "compression method", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        byte[] byteArray9 = new byte[] { (byte) -1 };
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray9);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField11 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("ZipLong value: 1", byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray10, 5, 10240);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("ar", byteArray11, 2, (int) (byte) 10);
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "ZipEightByteInteger value: 0");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipEightByteInteger value: 0");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray9);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField12 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, false, unparseableExtraField12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger14 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray10);
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
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = tarArchiveEntry2.getExtraPaxHeaders();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField9 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField9, byteArray11, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger16 = null;
        zip64ExtendedInformationExtraField9.setRelativeHeaderOffset(zipEightByteInteger16);
        byte[] byteArray18 = zip64ExtendedInformationExtraField9.getLocalFileDataData();
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray18);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField20 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray18);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField22 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField22, byteArray24, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger29 = null;
        zip64ExtendedInformationExtraField22.setRelativeHeaderOffset(zipEightByteInteger29);
        byte[] byteArray31 = zip64ExtendedInformationExtraField22.getLocalFileDataData();
        byte[] byteArray32 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray31);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField33 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray31);
        unicodeCommentExtraField20.setUnicodeName(byteArray31);
        byte[] byteArray35 = unicodeCommentExtraField20.getUnicodeName();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry39 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(strMap7, byteArray35, zipEncoding36, true, (long) 61440);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:17:50 CEST 2023");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField28);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray10);
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
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_POSIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ustar\000" + "'", str0, "ustar\000");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "tar\000", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray1, (int) (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_4;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_4 + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_4));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException1 = new org.apache.commons.compress.archivers.dump.DumpArchiveException("apks");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        int int0 = org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.LONGFILE_BSD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry3 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(path0, "!<arch>\n", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField2 = extraFieldParsingMode0.createExtraField(zipShort1);
        byte[] byteArray4 = new byte[] { (byte) -1 };
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray4);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = extraFieldParsingMode0.onUnparseableExtraField(byteArray5, (int) (byte) 88, (int) (byte) 1, true, 10240);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipExtraField2);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1]");
        org.junit.Assert.assertNull(zipExtraField10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        cpioArchiveEntry1.setGID((long) 156);
        long long6 = cpioArchiveEntry1.getRemoteDeviceMaj();
        long long7 = cpioArchiveEntry1.getGID();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry1.setMode((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode. Full: 64 Masked: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 156L + "'", long7 == 156L);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_1;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_1 + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_1));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = tarArchiveInputStream2.skip((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        long long1 = org.apache.commons.compress.archivers.zip.ZipUtil.adjustToLong(84446);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 84446L + "'", long1 == 84446L);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (byte) 1);
        java.lang.String str4 = zipLong3.toString();
        zip64ExtendedInformationExtraField1.setDiskStartNumber(zipLong3);
        byte[] byteArray6 = zipLong3.getBytes();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("data descriptor", byteArray6, (-1), 29127, zipEncoding9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ZipLong value: 1" + "'", str4, "ZipLong value: 1");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 0]");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.PREFIXLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 155 + "'", int0 == 155);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(file0, "ar");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = tarArchiveEntry2.getExtraPaxHeaders();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) (byte) 4);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray9);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(strMap7, byteArray9, zipEncoding11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:17:51 CEST 2023");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[4, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 8, "ZipLong value: 11", (long) 10240);
        boolean boolean4 = cpioArchiveEntry3.isNetwork();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry3.setDeviceMin((long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.END;
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.END + "'", sEGMENT_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.END));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.ADDR;
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.ADDR + "'", sEGMENT_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.ADDR));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream8 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "ZipEightByteInteger value: 0");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipEightByteInteger value: 0");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, "apks");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = tarArchiveInputStream3.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, 2048);
        java.nio.file.Path path5 = null;
        java.nio.file.LinkOption[] linkOptionArray7 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = tarArchiveOutputStream4.createArchiveEntry(path5, "7z", linkOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64 + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit3 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.parse(byteArray1, (int) (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, 33, 0]");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IWGRP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_CHR;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 51 + "'", byte0 == (byte) 51);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_GNUTYPE_SPARSE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 83 + "'", byte0 == (byte) 83);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile4 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel0, "TRAILER!!!", "ZipLong value: 11", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipLong value: 11");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        long long7 = tarArchiveEntry5.getRealSize();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset4 = null;
        int int5 = cpioArchiveEntry3.getHeaderPadCount(charset4);
        cpioArchiveEntry3.setGID((long) 156);
        long long8 = cpioArchiveEntry3.getRemoteDeviceMaj();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.APK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "apk" + "'", str0, "apk");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField4, byteArray6, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = null;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger11);
        byte[] byteArray13 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray13);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField17 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray19 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField23 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField17, byteArray19, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger24 = null;
        zip64ExtendedInformationExtraField17.setRelativeHeaderOffset(zipEightByteInteger24);
        byte[] byteArray26 = zip64ExtendedInformationExtraField17.getLocalFileDataData();
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray26);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField28 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray26);
        unicodeCommentExtraField15.setUnicodeName(byteArray26);
        byte[] byteArray30 = unicodeCommentExtraField15.getUnicodeName();
        byte[] byteArray31 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.write(byteArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        byte[] byteArray3 = new byte[] { (byte) -1 };
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray3);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField5 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("ZipLong value: 1", byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 60012, byteArray4, (int) (byte) 54, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.io.File file0 = null;
        char[] charArray5 = new char[] { '4', '#', 'a', 'a' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray5, sevenZFileOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4#aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4#aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, #, a, a]");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "", true, true, false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        byte[] byteArray5 = new byte[] { (byte) -1 };
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray5);
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = extraFieldParsingMode0.onUnparseableExtraField(byteArray3, (int) (short) -1, 64, true, 16384);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 107");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertNull(zipExtraField8);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.JAR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "jar" + "'", str0, "jar");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.io.File file0 = null;
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
        byte[] byteArray29 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile30 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry3.setNames("", "ZipLong value: 1");
        int int7 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.setNames("apks", "arj");
        tarArchiveEntry3.setDataOffset((long) 3);
        java.lang.String str13 = tarArchiveEntry3.getName();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream3, 2048);
        long long6 = tarArchiveOutputStream5.getBytesWritten();
        java.nio.file.Path path7 = null;
        java.nio.file.FileVisitOption[] fileVisitOptionArray8 = new java.nio.file.FileVisitOption[] {};
        java.util.EnumSet<java.nio.file.FileVisitOption> fileVisitOptionSet10 = java.util.EnumSet.noneOf(java.nio.file.FileVisitOption.class);
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.nio.file.FileVisitOption>) fileVisitOptionSet10, fileVisitOptionArray8);
        java.nio.file.LinkOption linkOption12 = null;
        java.nio.file.LinkOption[] linkOptionArray13 = new java.nio.file.LinkOption[] { linkOption12 };
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) tarArchiveOutputStream5, path7, fileVisitOptionSet10, linkOptionArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fileVisitOptionArray8);
        org.junit.Assert.assertNotNull(fileVisitOptionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(linkOptionArray13);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        boolean boolean7 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode8 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = extraFieldParsingMode8.createExtraField(zipShort9);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp11.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean17 = tarArchiveEntry16.isSparse();
        tarArchiveEntry16.setMode(26127);
        java.util.Date date20 = tarArchiveEntry16.getModTime();
        x5455_ExtendedTimestamp11.setModifyJavaTime(date20);
        byte[] byteArray23 = new byte[] { (byte) -1 };
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray23);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField28 = extraFieldParsingMode8.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp11, byteArray24, 0, 32768, true);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = cpioArchiveInputStream1.read(byteArray24, (int) (byte) 1, 508);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(extraFieldParsingMode8);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Tue Jun 20 13:17:53 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1]");
        org.junit.Assert.assertNotNull(zipExtraField28);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_NORMAL;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 48 + "'", byte0 == (byte) 48);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray1);
        boolean boolean4 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier1 = null;
        parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntryRequestSupplier1);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj5 = jarArchiveEntry4.clone();
        int int6 = jarArchiveEntry4.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource7 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry4.setNameSource(nameSource7);
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable10 = parallelScatterZipCreator0.createCallable((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry4, inputStreamSupplier9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must be set on zipArchiveEntry: 070707");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "070707");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + nameSource7 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource7.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.DEFAULT_RCDSIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 512 + "'", int0 == 512);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, "ustar\000");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ustar?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setMode(26127);
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField12 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraFieldNoDefault(zipShort11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:17:53 CEST 2023");
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(zipExtraField12);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode1 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField3 = extraFieldParsingMode1.createExtraField(zipShort2);
        byte[] byteArray5 = new byte[] { (byte) -1 };
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray5);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = extraFieldParsingMode1.onUnparseableExtraField(byteArray6, (int) (byte) 88, (int) (byte) 1, true, 10240);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("ZipShort value: 21589", byteArray6, 0, (-1), zipEncoding14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipExtraField3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertNull(zipExtraField11);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = tarArchiveInputStream2.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption linkOption2 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = new java.nio.file.LinkOption[] { linkOption2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry4 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(path0, "!<arch>\n", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.setAlignment((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid value for alignment, must be power of two and no bigger than 65535 but is 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        long long7 = org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.javaTimeToNtfsTime(date6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:17:53 CEST 2023");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 133317334738600000L + "'", long7 == 133317334738600000L);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSION_GNU_SPACE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + " \000" + "'", str0, " \000");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        byte[] byteArray6 = new byte[] { (byte) -1 };
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray6);
        boolean boolean9 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, (int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarFile tarFile11 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray7, false);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream4.write(byteArray7, 511, 33188);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        byte byte1 = org.apache.commons.compress.archivers.zip.ZipUtil.unsignedIntToSignedByte(12);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 12 + "'", byte1 == (byte) 12);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.INODE;
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.INODE + "'", sEGMENT_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.INODE));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry3.setNames("", "ZipLong value: 1");
        int int7 = tarArchiveEntry3.getGroupId();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField8 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField8, byteArray10, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger15 = null;
        zip64ExtendedInformationExtraField8.setRelativeHeaderOffset(zipEightByteInteger15);
        byte[] byteArray17 = zip64ExtendedInformationExtraField8.getLocalFileDataData();
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        byte[] byteArray0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        byte[] byteArray6 = new byte[] { (byte) -1 };
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField12 = extraFieldParsingMode2.onUnparseableExtraField(byteArray7, (int) (byte) 88, (int) (byte) 1, true, 10240);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray0, false, (org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertNull(zipExtraField12);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField18 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField24 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField18, byteArray20, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger25 = null;
        zip64ExtendedInformationExtraField18.setRelativeHeaderOffset(zipEightByteInteger25);
        byte[] byteArray27 = zip64ExtendedInformationExtraField18.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField29 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray30 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray27, true, unparseableExtraField29);
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray27, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray30);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray1);
        boolean boolean4 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse6 = org.apache.commons.compress.archivers.tar.TarUtils.parseSparse(byteArray2, 488);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 488");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "tar\000", false, false, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: tar?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(file0, "ustar\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        long long4 = cpioArchiveEntry1.getUID();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry1.setDevice((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList8 = tarArchiveEntry7.getOrderedSparseHeaders();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 1, false);
        tarArchiveEntry12.addPaxHeader("tar\000", "");
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList16 = tarArchiveEntry12.getOrderedSparseHeaders();
        tarArchiveEntry7.setSparseHeaders(tarArchiveStructSparseList16);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream4.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList8);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList16);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, "apks");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream3, 11, "TRAILER!!!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: TRAILER!!!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField7 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(2, true);
        byte[] byteArray8 = resourceAlignmentExtraField7.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.write(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[2, -128]");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs hostOs0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs();
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode((int) (byte) 54);
        org.junit.Assert.assertNull(encryptionAlgorithm1);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream4.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Trying to close non-existent entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        long long4 = cpioArchiveEntry1.getDeviceMaj();
        boolean boolean5 = cpioArchiveEntry1.isDirectory();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry1.setDevice((long) (byte) 75);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 257 + "'", int0 == 257);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.IMPLODING;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.IMPLODING + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.IMPLODING));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.LONGFILE_TRUNCATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream10 = archiveStreamFactory1.createArchiveOutputStream("ZipLong value: 1", outputStream3, "070707");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: OutputStream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor2 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(2048, scatterGatherBackingStore1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        java.nio.file.attribute.FileTime fileTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setLastModifiedTime(fileTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Time must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Jun 20 13:17:55 CEST 2023");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.CHKSUMLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile1 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SPARSE_OFFSET_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        java.lang.String str7 = tarArchiveEntry2.getUserName();
        boolean boolean8 = tarArchiveEntry2.isStarSparse();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField10 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField10, byteArray12, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger17 = null;
        zip64ExtendedInformationExtraField10.setRelativeHeaderOffset(zipEightByteInteger17);
        byte[] byteArray19 = zip64ExtendedInformationExtraField10.getLocalFileDataData();
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray19);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField21 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray19);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField23 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField29 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField23, byteArray25, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger30 = null;
        zip64ExtendedInformationExtraField23.setRelativeHeaderOffset(zipEightByteInteger30);
        byte[] byteArray32 = zip64ExtendedInformationExtraField23.getLocalFileDataData();
        byte[] byteArray33 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray32);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField34 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray32);
        unicodeCommentExtraField21.setUnicodeName(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:17:55 CEST 2023");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = tarArchiveEntry2.getExtraPaxHeaders();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode8 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        byte[] byteArray10 = new byte[] { (byte) -1 };
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField16 = extraFieldParsingMode8.onUnparseableExtraField(byteArray11, (int) (short) -1, 64, true, 16384);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(strMap7, byteArray11, zipEncoding17, true, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:17:55 CEST 2023");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(extraFieldParsingMode8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1]");
        org.junit.Assert.assertNull(zipExtraField16);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        boolean boolean6 = tarArchiveEntry2.isOldGNUSparse();
        java.nio.file.attribute.FileTime fileTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setLastModifiedTime(fileTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Time must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.DOS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IXOTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.TAR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tar" + "'", str0, "tar");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.WORLD_WRITE;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.WORLD_WRITE + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.WORLD_WRITE));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        zipArchiveEntry10.setTime((long) (byte) 1);
        java.lang.String str13 = zipArchiveEntry10.toString();
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "070707" + "'", str13, "070707");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        dumpArchiveEntry2.setVolume(488);
        java.lang.String str5 = dumpArchiveEntry2.getSimpleName();
        dumpArchiveEntry2.setUserId((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "070707" + "'", str5, "070707");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        boolean boolean5 = cpioArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = cpioArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_BLK;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 52 + "'", byte0 == (byte) 52);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean1 = sevenZArchiveEntry0.getHasLastModifiedDate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.attribute.FileTime fileTime2 = sevenZArchiveEntry0.getAccessTime();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        java.nio.file.Path path4 = null;
        java.nio.file.LinkOption[] linkOptionArray6 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = arArchiveOutputStream2.createArchiveEntry(path4, "070702", linkOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray6);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = extraFieldParsingMode0.onUnparseableExtraField(byteArray3, (int) (short) -1, 64, true, 16384);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3, zipEncoding9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertNull(zipExtraField8);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, 2048);
        long long5 = tarArchiveOutputStream4.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4, (short) (byte) 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 48");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "00");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream10 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8, "apk");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: unexpected EOF");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "tar\000", false, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: tar?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC2;
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC2 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC2));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
            org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray28);
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(255L);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, 33, 0]");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
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
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile29 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, byteArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream5.setLongFileMode(0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = tarArchiveOutputStream5.createArchiveEntry(file6, "ZipShort value: 21589");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile5 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel0, (int) (short) 0, (int) (byte) 103, "data descriptor", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: data descriptor");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile1 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode0 = org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded;
        org.junit.Assert.assertTrue("'" + zip64Mode0 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded + "'", zip64Mode0.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        java.lang.String str1 = sevenZArchiveEntry0.getName();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = sevenZArchiveEntry0.getAccessDate();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IXGRP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong0 = org.apache.commons.compress.archivers.zip.ZipLong.AED_SIG;
        org.junit.Assert.assertNotNull(zipLong0);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel0, "`\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: `?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int6 = tarArchiveOutputStream5.getCount();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.VAX_VMS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        boolean boolean5 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray3, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("apks", byteArray3, 6, 12, zipEncoding8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        byte[] byteArray7 = new byte[] { (byte) -1 };
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray7);
        boolean boolean10 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray8, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.write(byteArray8, 84446, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory1.getArchiveOutputStreamProviders();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream3);
        tarArchiveInputStream5.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream7 = archiveStreamFactory1.createArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SPARSE_NUMBYTES_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile1 = null;
        java.nio.file.Path path2 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create(sevenZOutputFile1, path2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (byte) 1);
        java.lang.String str3 = zipLong2.toString();
        zip64ExtendedInformationExtraField0.setDiskStartNumber(zipLong2);
        byte[] byteArray5 = zipLong2.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 39");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZipLong value: 1" + "'", str3, "ZipLong value: 1");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0]");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean5 = tarArchiveEntry4.isSparse();
        tarArchiveEntry4.setMode(26127);
        java.util.Date date8 = tarArchiveEntry4.getModTime();
        boolean boolean9 = tarArchiveEntry4.isPaxHeader();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Tue Jun 20 13:17:58 CEST 2023");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current CPIO entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        byte[] byteArray2 = new byte[] { (byte) 51, (byte) 88 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 10, (int) (byte) 83, zipEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[51, 88]");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.BITS;
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.BITS + "'", sEGMENT_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.BITS));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, (int) (short) 0, "`\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: `?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, 2048);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4, (short) (byte) 83, (int) (byte) 12, "`\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 83");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean1 = sevenZArchiveEntry0.getHasLastModifiedDate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = sevenZArchiveEntry0.getCreationDate();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.nio.file.attribute.FileTime fileTime1 = x5455_ExtendedTimestamp0.getModifyFileTime();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        byte[] byteArray6 = new byte[] { (byte) -1 };
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray6);
        boolean boolean9 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray7, (int) (short) -1);
        jarArchiveEntry4.setExtra(byteArray7);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray7, 26127, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26127");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IWUSR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile5 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel0, 110, 8, "", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.compress.archivers.dump.UnrecognizedFormatException unrecognizedFormatException0 = new org.apache.commons.compress.archivers.dump.UnrecognizedFormatException();
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EFS_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(path0, "ZipLong value: 11", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.String str0 = org.apache.commons.compress.archivers.cpio.CpioConstants.MAGIC_NEW;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "070701" + "'", str0, "070701");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier scatterGatherBackingStoreSupplier1 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator2 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, scatterGatherBackingStoreSupplier1);
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        zipArchiveOutputStream8.flush();
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator2.writeTo(zipArchiveOutputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("never");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DUMP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dump" + "'", str0, "dump");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, "apks");
        int int4 = tarArchiveInputStream3.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.compress.archivers.ArchiveStreamFactory.detect((java.io.InputStream) tarArchiveInputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DEFAULT_COMPRESSION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE cOMPRESSION_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.find(11);
        org.junit.Assert.assertNull(cOMPRESSION_TYPE1);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IWOTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode8 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = extraFieldParsingMode8.createExtraField(zipShort9);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = jarArchiveEntry7.getExtraField(zipShort9);
        int int12 = jarArchiveEntry7.getPlatform();
        long long13 = jarArchiveEntry7.getSize();
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream14);
        long long17 = cpioArchiveInputStream15.skip((long) (byte) 100);
        cpioArchiveInputStream15.mark(6);
        boolean boolean20 = cpioArchiveInputStream15.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream15, "00");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.addRawArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry7, (java.io.InputStream) cpioArchiveInputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode8);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertNull(zipExtraField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor1 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore0);
        streamCompressor1.close();
        byte[] byteArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor1.writeCounted(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor1);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.compress.archivers.StreamingNotSupportedException streamingNotSupportedException1 = new org.apache.commons.compress.archivers.StreamingNotSupportedException("data descriptor");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.THROW;
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = unparseableExtraField0.onUnparseableExtraField(byteArray2, 257, 8, false, 36864);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Bad extra field starting at 257.  Block length of 36864 bytes exceeds remaining data of 4 bytes.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unparseableExtraField0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 33, 0]");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
            org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField33 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("apk", byteArray30, 67324752, 11);
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setMode(26127);
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = x5455_ExtendedTimestamp0.getCreateTime();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(0L);
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray13, (int) (byte) 48, (int) (byte) 83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 48");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:18:00 CEST 2023");
        org.junit.Assert.assertNull(zipLong11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 33, 0]");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        int int4 = cpioArchiveInputStream1.available();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.CTIMELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        long long4 = cpioArchiveEntry1.getDeviceMaj();
        boolean boolean5 = cpioArchiveEntry1.isDirectory();
        boolean boolean6 = cpioArchiveEntry1.isPipe();
        long long7 = cpioArchiveEntry1.getDeviceMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "00");
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(255L);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = cpioArchiveInputStream1.read(byteArray10, 60012, 32768);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 33, 0]");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(0L);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = cpioArchiveInputStream1.read(byteArray8, 2048, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 33, 0]");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (byte) 4);
        int int2 = zipLong1.getIntValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
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
        byte[] byteArray32 = unicodeCommentExtraField17.getUnicodeName();
        byte[] byteArray33 = unicodeCommentExtraField17.getUnicodeName();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream4.write(byteArray33, 155, (int) (byte) 83);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, 26127);
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
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("ZipLong value: 1", byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 32768);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32768");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        boolean boolean24 = x5455_ExtendedTimestamp3.isBit0_modifyTimePresent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = x5455_ExtendedTimestamp3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can only convert non-negative integers between [0,255] to byte: [-3]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipExtraField2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Jun 20 13:18:00 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1]");
        org.junit.Assert.assertNotNull(zipExtraField20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0015_CertificateIdForFile0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField2 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField2, byteArray4, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = null;
        zip64ExtendedInformationExtraField2.setRelativeHeaderOffset(zipEightByteInteger9);
        byte[] byteArray11 = zip64ExtendedInformationExtraField2.getLocalFileDataData();
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray11, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            x0015_CertificateIdForFile0.parseFromCentralDirectoryData(byteArray11, (int) (short) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile is too short, only 3 bytes, expected at least 4");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        zipArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode9 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = extraFieldParsingMode9.createExtraField(zipShort10);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField12 = jarArchiveEntry8.getExtraField(zipShort10);
        int int13 = jarArchiveEntry8.getPlatform();
        long long14 = jarArchiveEntry8.getSize();
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer15 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream16);
        long long19 = cpioArchiveInputStream17.skip((long) (byte) 100);
        cpioArchiveInputStream17.mark(6);
        boolean boolean22 = cpioArchiveInputStream17.markSupported();
        boolean boolean23 = cpioArchiveInputStream17.markSupported();
        closeableConsumer15.accept((java.io.Closeable) cpioArchiveInputStream17);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream25 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream17);
        int int26 = jarArchiveInputStream25.read();
        long long27 = jarArchiveInputStream25.getUncompressedCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.addRawArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry8, (java.io.InputStream) jarArchiveInputStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(zipExtraField11);
        org.junit.Assert.assertNull(zipExtraField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(closeableConsumer15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.flush();
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = cpioArchiveOutputStream1.createArchiveEntry(file3, "7z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
            org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray10, 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4096");
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.CLRI;
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.CLRI + "'", sEGMENT_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.CLRI));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISREG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32768 + "'", int0 == 32768);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SPARSE_HEADERS_IN_EXTENSION_HEADER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 21 + "'", int0 == 21);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel0, "TRAILER!!!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: TRAILER!!!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.PPMD;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.PPMD + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.PPMD));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj7 = jarArchiveEntry6.clone();
        int int8 = jarArchiveEntry6.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource9 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry6.setNameSource(nameSource9);
        java.nio.file.attribute.FileTime fileTime11 = jarArchiveEntry6.getLastModifiedTime();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "070707");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + nameSource9 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource9.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertNull(fileTime11);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        byte[] byteArray2 = new byte[] { (byte) 50, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray2, (int) (byte) 88);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 95");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[50, 10]");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.io.File file0 = null;
        char[] charArray4 = new char[] { ' ', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(file0, charArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4, a]");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        // The following exception was thrown during execution in test generation
        try {
            long long30 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray29);
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
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, -1, -1, -1, -1]");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            asiExtraField0.parseFromCentralDirectoryData(byteArray11, 36864, 36864);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36864");
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = unsupportedZipFeatureException22.getEntry();
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Jun 20 13:18:02 CEST 2023");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(zipArchiveEntry25);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.nio.file.Path path2 = null;
        java.nio.file.LinkOption linkOption4 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = new java.nio.file.LinkOption[] { linkOption4 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = cpioArchiveOutputStream1.createArchiveEntry(path2, "jar", linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 5, 29127);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField7 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField7, byteArray9, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger14 = null;
        zip64ExtendedInformationExtraField7.setRelativeHeaderOffset(zipEightByteInteger14);
        byte[] byteArray16 = zip64ExtendedInformationExtraField7.getLocalFileDataData();
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray16);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField18 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray16);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField20 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField26 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField20, byteArray22, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger27 = null;
        zip64ExtendedInformationExtraField20.setRelativeHeaderOffset(zipEightByteInteger27);
        byte[] byteArray29 = zip64ExtendedInformationExtraField20.getLocalFileDataData();
        byte[] byteArray30 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray29);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField31 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray29);
        unicodeCommentExtraField18.setUnicodeName(byteArray29);
        unicodeCommentExtraField18.setNameCRC32((long) (short) -1);
        byte[] byteArray35 = unicodeCommentExtraField18.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            int int38 = tarArchiveInputStream5.read(byteArray35, 508, 32768);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, -1, -1, -1, -1]");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_CONTIG;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 55 + "'", byte0 == (byte) 55);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "zip", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.find(508);
        org.junit.Assert.assertNotNull(pERMISSIONSet1);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = sevenZArchiveEntry0.getLastModifiedDate();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray1);
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature2 = null;
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException3 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = unsupportedZipFeatureException3.getEntry();
        org.apache.commons.compress.MemoryLimitException memoryLimitException5 = new org.apache.commons.compress.MemoryLimitException((long) 11, (int) (short) 1, (java.lang.Exception) unsupportedZipFeatureException3);
        java.lang.Class<?> wildcardClass6 = unsupportedZipFeatureException3.getClass();
        org.junit.Assert.assertNull(zipArchiveEntry4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor1 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore0);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField2 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField2, byteArray4, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = null;
        zip64ExtendedInformationExtraField2.setRelativeHeaderOffset(zipEightByteInteger9);
        byte[] byteArray11 = zip64ExtendedInformationExtraField2.getLocalFileDataData();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray11);
        org.apache.commons.compress.archivers.tar.TarFile tarFile14 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray12, "arj");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode16 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        byte[] byteArray18 = new byte[] { (byte) -1 };
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray18);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField24 = extraFieldParsingMode16.onUnparseableExtraField(byteArray19, (int) (short) -1, 64, true, 16384);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray25 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray12, true, (org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode16);
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor1.writeCounted(byteArray12, 16384, (int) (byte) 54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(extraFieldParsingMode16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1]");
        org.junit.Assert.assertNull(zipExtraField24);
        org.junit.Assert.assertNotNull(zipExtraFieldArray25);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("070707", "ustar\000");
        dumpArchiveEntry2.setNlink(155);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        int int2 = cpioArchiveEntry1.getHeaderSize();
        cpioArchiveEntry1.setGID((long) 4096);
        long long5 = cpioArchiveEntry1.getRemoteDeviceMin();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = cpioArchiveEntry1.getDevice();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer3 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream4);
        long long7 = cpioArchiveInputStream5.skip((long) (byte) 100);
        cpioArchiveInputStream5.mark(6);
        boolean boolean10 = cpioArchiveInputStream5.markSupported();
        boolean boolean11 = cpioArchiveInputStream5.markSupported();
        closeableConsumer3.accept((java.io.Closeable) cpioArchiveInputStream5);
        long long13 = cpioArchiveInputStream5.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream16 = archiveStreamFactory1.createArchiveInputStream("TRAILER!!!", (java.io.InputStream) cpioArchiveInputStream14, "070707");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: TRAILER!!! not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.WAVPACK;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.WAVPACK + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.WAVPACK));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(file0, "00");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, 2048);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.XSTAR_PREFIX_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 345 + "'", int0 == 345);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream4.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature2 = null;
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException3 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = unsupportedZipFeatureException3.getEntry();
        org.apache.commons.compress.MemoryLimitException memoryLimitException5 = new org.apache.commons.compress.MemoryLimitException((long) 11, (int) (short) 1, (java.lang.Exception) unsupportedZipFeatureException3);
        long long6 = memoryLimitException5.getMemoryNeededInKb();
        org.junit.Assert.assertNull(zipArchiveEntry4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11L + "'", long6 == 11L);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor1 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore0);
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile2 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm3 = x0015_CertificateIdForFile2.getHashAlgorithm();
        byte[] byteArray4 = x0015_CertificateIdForFile2.getLocalFileDataData();
        byte[] byteArray6 = new byte[] { (byte) -1 };
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.THROW;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray7, true, unparseableExtraField10);
        x0015_CertificateIdForFile2.parseFromLocalFileData(byteArray7, (int) (short) 0, 36864);
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor1.writeCounted(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor1);
        org.junit.Assert.assertNull(hashAlgorithm3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 255L + "'", long8 == 255L);
        org.junit.Assert.assertNotNull(unparseableExtraField10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        byte[] byteArray5 = new byte[] { (byte) 88, (byte) 50, (byte) -1, (byte) 88, (byte) 75 };
        org.apache.commons.compress.archivers.tar.TarFile tarFile6 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray5, (int) (byte) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[88, 50, -1, 88, 75]");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setLastModifiedDate((long) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = sevenZArchiveEntry0.getLastModifiedDate();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        byte[] byteArray10 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit12 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.parse(byteArray10, (int) (short) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream3);
        tarArchiveOutputStream8.setLongFileMode(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream11 = archiveStreamFactory0.createArchiveOutputStream("ustar\000", (java.io.OutputStream) tarArchiveOutputStream8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ustar? not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSION_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 263 + "'", int0 == 263);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DEFLATED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        dumpArchiveEntry2.setVolume(488);
        boolean boolean5 = dumpArchiveEntry2.isChrDev();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        int int6 = jarArchiveEntry1.getPlatform();
        byte[] byteArray7 = jarArchiveEntry1.getRawName();
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteArray7);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 55, path1, "7z", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        cpioArchiveEntry1.setGID((long) 156);
        boolean boolean6 = cpioArchiveEntry1.isDirectory();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry1.setRemoteDevice((long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.compress.archivers.ArchiveException archiveException1 = new org.apache.commons.compress.archivers.ArchiveException("00");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.find((int) (byte) 1);
        org.junit.Assert.assertNotNull(pERMISSIONSet1);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray1);
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 255L + "'", long3 == 255L);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.CHKSUM_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 148 + "'", int0 == 148);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.HIGH_DENSITY_NTREC;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.OFFSETLEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create(" \000", path2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        int int0 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.UFT8_NAMES_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.NEXT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.MAX_NAMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 31 + "'", int0 == 31);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        long long0 = org.apache.commons.compress.archivers.tar.TarConstants.MAXSIZE;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 8589934591L + "'", long0 == 8589934591L);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setDevMinor((int) (short) 2);
        java.nio.file.attribute.FileTime fileTime10 = tarArchiveEntry2.getStatusChangeTime();
        java.nio.file.attribute.FileTime fileTime11 = tarArchiveEntry2.getCreationTime();
        byte[] byteArray13 = new byte[] { (byte) -1 };
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray13);
        boolean boolean16 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray14, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray14, zipEncoding17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:18:05 CEST 2023");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertNull(fileTime11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.setLevel((int) (byte) 55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 55");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        arArchiveOutputStream2.flush();
        arArchiveOutputStream2.setLongFileMode(4095);
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField9 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(2, true);
        byte[] byteArray10 = resourceAlignmentExtraField9.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.write(byteArray10, (int) (short) 2, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[2, -128]");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
            boolean boolean30 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray28, 67324752);
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.DEFAULT_FILE_MODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 33188 + "'", int0 == 33188);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        zipArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean10 = tarArchiveEntry9.isSparse();
        tarArchiveEntry9.setUserId((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, 2048);
        long long5 = tarArchiveOutputStream4.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream4.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(path0, "apks", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_READ;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_READ + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_READ));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "`\n", sevenZFileOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        arArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, "070701");
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry3.setNames("", "ZipLong value: 1");
        int int7 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.addPaxHeader("hi!", "compression method");
        int int11 = tarArchiveEntry3.getDevMajor();
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList12 = tarArchiveEntry3.getOrderedSparseHeaders();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList12);
    }
}
