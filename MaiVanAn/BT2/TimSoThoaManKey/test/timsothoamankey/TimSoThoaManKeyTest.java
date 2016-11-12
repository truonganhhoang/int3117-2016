/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timsothoamankey;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author An
 */
public class TimSoThoaManKeyTest {

    public TimSoThoaManKeyTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of TimSo method, of class TimSoThoaManKey.
     */
    @Test
    public void testTimSoCucTieu() {
        long num = 13;
        long key = 3;
        long expResult = 14;
        long result = TimSoThoaManKey.TimSo(num, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testTimSoCanCucTieu() {
        long num = 69;
        long key = 5;
        long expResult = 70;
        long result = TimSoThoaManKey.TimSo(num, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testTimSoGiua() {
        long num = 111;
        long key = 25;
        long expResult = 825;
        long result = TimSoThoaManKey.TimSo(num, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testTimSoTrenGiua() {
        long num = 1000;
        long key = 33;
        long expResult = 1386;
        long result = TimSoThoaManKey.TimSo(num, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testTimSoCanCucDai() {
        long num = 10000;
        long key = 111;
        long expResult = 17871;
        long result = TimSoThoaManKey.TimSo(num, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testTimSoTFF() {
        long num = 100;
        long key = 25;
        long expResult = 100;
        long result = TimSoThoaManKey.TimSo(num, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testTimSoFTF() {
        long num = 96;
        long key = 25;
        long expResult = 825;
        long result = TimSoThoaManKey.TimSo(num, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testTimSoFFT() {
        long num = 92;
        long key = 25;
        long expResult = 825;
        long result = TimSoThoaManKey.TimSo(num, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testTimSoTTT() {
        long num = 18;
        long key = 3;
        long expResult = 18;
        long result = TimSoThoaManKey.TimSo(num, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testTimSoFTT() {
        long num = 18;
        long key = 4;
        long expResult = 18;
        long result = TimSoThoaManKey.TimSo(num, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testTimSoTTF() {
        long num = 20;
        long key = 5;
        long expResult = 20;
        long result = TimSoThoaManKey.TimSo(num, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testTimSoTFT() {
        long num = 15;
        long key = 5;
        long expResult = 15;
        long result = TimSoThoaManKey.TimSo(num, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testTimSoFFF() {
        long num = 22;
        long key = 5;
        long expResult = 45;
        long result = TimSoThoaManKey.TimSo(num, key);
        assertEquals(expResult, result);
    }
}
