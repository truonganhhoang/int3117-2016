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
        long n = -100;
        long expResult = 0;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testT
    /**
     * Test of main method, of class TinhTongDemo.
     */

    /**
     * Test of TinhTong method, of class TinhTongDemo.
     */
    @Test
    public void testTinhTong() {
        //System.out.prlongln("TinhTong");
        long n = 3;
        long expResult = 2;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testTinhTong2() {
        //System.out.prlongln("TinhTong");
        long n = 15;
        long expResult = 56;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }  
    
    @Test
    public void testTinhTong3() {
        //System.out.prlongln("TinhTong");
        long n = 4;
        long expResult = 6;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testTinhTong4() {
        //System.out.prlongln("TinhTong");
        long n = 100;
        long expResult = 2550;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
     @Test
    public void testTinhTong5() {
        //System.out.prlongln("TinhTong");
        long n = 1000;
        long expResult = 250500;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
     @Test
    public void testTinhTong6() {
        //System.out.prlongln("TinhTong");
        long n = 10000;
        long expResult = 25005000;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testTinhTong7() {
        //System.out.prlongln("TinhTong");
inhTong8() {
        //System.out.prlongln("TinhTong");
        long n = -1000;
        long expResult = 0;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testTinhTong9() {
        //System.out.prlongln("TinhTong");
        long n = -10000;
        long expResult = 0;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testTinhTong10() {
        //System.out.prlongln("TinhTong");
        long n = 1;
        long expResult = 0;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
	@Test
    public void testTinhTong11() {
        //System.out.prlongln("TinhTong");
        long n = 100000;
        long expResult = 2500050000;
        long result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
	
	
}
