/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App1;

//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Chung
 */
public class SinhVienTest {
    
    public SinhVienTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testGetten() {
        System.out.println("getten");
        SinhVien sv = new SinhVien();
        String expResult = "Nguyen Van Chung";
        String result = sv.getten();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setten method, of class SinhVien.
     */
    @Test
    public void testSetten() {
        System.out.println("setten");
        String ten = "Chung";
        SinhVien sv = new SinhVien();
        sv.setten(ten);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getmasv method, of class SinhVien.
     */
    @Test
    public void testGetmasv() {
        System.out.println("getmasv");
        SinhVien sv = new SinhVien();
        String expResult = "123";
        String result = sv.getmasv();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setmasv method, of class SinhVien.
     */
    @Test
    public void testSetmasv() {
        System.out.println("setmasv");
        String ma = "123";
        SinhVien sv = new SinhVien();
        sv.setmasv(ma);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
