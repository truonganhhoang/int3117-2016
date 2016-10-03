/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtongdemo;

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
public class TinhTongDemoTest {
    
    public TinhTongDemoTest() {
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
     * Test of main method, of class TinhTongDemo.
     */

    /**
     * Test of TinhTong method, of class TinhTongDemo.
     */
    @Test
    public void testTinhTongGiaTriNho() {
        //System.out.println("TinhTong");
        long n = 3;
        long expResult = 2;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testTinhTongGiaTriVua() {
        //System.out.println("TinhTong");
        long n = 15;
        long expResult = 56;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }     
    @Test
    public void testTinhTongGiaTriAm() {
        //System.out.println("TinhTong");
        long n = -100;
        long expResult = 0;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
   
    @Test
    public void testTinhTongGiaTriAmTo() {
        //System.out.println("TinhTong");
        long n = -10000;
        long expResult = 0;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testTinhTongGiaTriDacBiet() {
        //System.out.println("TinhTong");
        long n = 1;
        long expResult = 0;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testTinhTongGiaTriMax() {
        //System.out.prlongln("TinhTong");
        long n = 50000;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(625025000, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
