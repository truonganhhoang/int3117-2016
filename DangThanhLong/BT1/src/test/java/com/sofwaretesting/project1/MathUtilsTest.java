/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofwaretesting.project1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
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
    public void testCase1() {
        System.out.println("Test Case 1");
        int n = 0;
        long expResult = 1;
        long result = mathUtils.factorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCase2() {
        System.out.println("Test Case 2");
        int n = 5;
        long expResult = 120;
        long result = mathUtils.factorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCase3() {
        System.out.println("Test Case 3");
        int n = 20;
        long expResult = 2432902008176640000L;
        long result = mathUtils.factorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCase4() {
        System.out.println("Test Case 4");
        int n = -5;
        long expResult = 0;
        long result = mathUtils.factorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCase5() {
        System.out.println("Test Case 5");
        int n = 30;
        long expResult = 0;
        long result = mathUtils.factorial(n);
        //=> Test Out range of value
        assertEquals(expResult, result);
    }
}
