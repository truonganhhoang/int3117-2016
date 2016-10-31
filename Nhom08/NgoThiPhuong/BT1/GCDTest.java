package com.phuongnt58.gcd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GCDTest {

    @Test
    public void test0WithOtherNumber() throws Exception {
        GCD gcd = new GCD();
        int result = 0;
        result = gcd.getGCD(0, 5);
        assertEquals(5, result);
    }

    @Test
    public void test0WithOtherNumberReverse() throws Exception {
        GCD gcd = new GCD();
        int result = gcd.getGCD(10, 0);
        assertEquals(10, result);
    }

    @Test
    public void testNegativeAndPositiveNumber() throws Exception {
        GCD gcd = new GCD();
        int result = gcd.getGCD(-2, 5);
        assertEquals(1, result);
    }

    @Test
    public void testNegativeNumber() throws Exception {
        GCD gcd = new GCD();
        int result = gcd.getGCD(-3, -9);
        assertEquals(3, result);
    }

    @Test
    public void testDivisibleNumber() throws Exception {
        GCD gcd = new GCD();
        int result = gcd.getGCD(126, 6);
        assertEquals(6, result);
    }

    @Test
    public void testZeroAndZero() {
        GCD gcd = new GCD();
        String result;
        try {
            result = gcd.getGCD(0, 0) + "";
        } catch (Exception e) {
            result = e.getMessage();
        }
        assertEquals("Result: Extremely", result);
    }

}