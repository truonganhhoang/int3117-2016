/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofwaretesting.project1;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DangThanh
 */
public class MathUtilsTest {
    
    private static MathUtils mathUtils;
    
    public MathUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        mathUtils = new MathUtils();
    }

    /**
     * Test of factorial method, of class MathUtils.
     */
    @Test
    public void testBoundaryValue1() {
        int n = 0;
        long expResult = 1;
        long result = mathUtils.factorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBoundaryValue2() {
        int n = 20;
        long expResult = 2432902008176640000L;
        long result = mathUtils.factorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInRangeValue() {
        int n = 5;
        long expResult = 120;
        long result = mathUtils.factorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLessThanBoundaryValue() {
        int n = -5;
        long expResult = 0;
        long result = mathUtils.factorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBiggerThanBoundaryValue() {
        int n = 21;
        BigDecimal expResult = new BigDecimal("51090942171709440000");
        long result = mathUtils.factorial(n);
        assertNotEquals(expResult, result);
    }
}
