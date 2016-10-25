
package bt1_ucln;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class BT1_UCLNTest {
    
    public BT1_UCLNTest() {
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
     * Test of UCLN method, of class BT1_UCLN.
     */
    @Test
    public void testUCLN() {
        System.out.println("UCLN");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = BT1_UCLN.UCLN(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
