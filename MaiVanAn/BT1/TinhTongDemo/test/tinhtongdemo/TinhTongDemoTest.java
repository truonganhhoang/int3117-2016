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
    public void testTinhTong() {
        //System.out.println("TinhTong");
        int n = 3;
        int expResult = 2;
        int result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testTinhTong2() {
        //System.out.println("TinhTong");
        int n = 15;
        int expResult = 56;
        int result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }  
    
    @Test
    public void testTinhTong3() {
        //System.out.println("TinhTong");
        int n = 4;
        int expResult = 6;
        int result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testTinhTong4() {
        //System.out.println("TinhTong");
        int n = 100;
        int expResult = 2550;
        int result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
     @Test
    public void testTinhTong5() {
        //System.out.println("TinhTong");
        int n = 1000;
        int expResult = 250500;
        int result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
     @Test
    public void testTinhTong6() {
        //System.out.println("TinhTong");
        int n = 10000;
        int expResult = 25005000;
        int result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testTinhTong7() {
        //System.out.println("TinhTong");
        int n = -100;
        int expResult = 0;
        int result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testTinhTong8() {
        //System.out.println("TinhTong");
        int n = -1000;
        int expResult = 0;
        int result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testTinhTong9() {
        //System.out.println("TinhTong");
        int n = -10000;
        int expResult = 0;
        int result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testTinhTong10() {
        //System.out.println("TinhTong");
        int n = 1;
        int expResult = 0;
        int result = TinhTongDemo.TinhTong(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
