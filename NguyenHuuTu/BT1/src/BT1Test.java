/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyen Huu Tu
 */
public class BT1Test {
    
    public BT1Test() {
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


    @Test
    public void test00UCLN() {
        int a = 0;
        int b = 0;
        assertFalse(a>0);
        assertFalse(b>0);
    }
    
    @Test
    public void test01UCLN() {
        int a = 32768;
        int b = 32768;
        assertFalse(a<=32767);
        assertFalse(b<=32767);
    }

    @Test
    public void test02UCLN() {
        int a = 100;
        int b = 80;
        int expResult = 20;
        int result = BT1.UCLN(a, b);
        assertTrue(expResult==result);
    }
    
    @Test
    public void test03UCLN() {
        int a = 32767;
        int b = 32767;
        int expResult = 32767;
        int result = BT1.UCLN(a, b);
        assertTrue(expResult==result);
    }
    
    @Test
    public void test04UCLN() {
        int a = 1;
        int b = 327;
        int expResult = 1;
        int result = BT1.UCLN(a, b);
        assertTrue(expResult==result);
    }
    
    @Test
    public void test05UCLN() {
        int a = 13;
        int b = 29;
        int expResult = 1;
        int result = BT1.UCLN(a, b);
        assertTrue(expResult==result);
    }
    
    @Test
    public void test06UCLN() {
        int a = -10;
        int b = -100;
        assertFalse(a>0);
        assertFalse(b>0);
    }   
}
