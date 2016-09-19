package bt1;

import bt1.BT1;
import org.junit.Test;
import static org.junit.Assert.*;

public class BT1Test {

    public BT1Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void testInit() {
        BT1 bt1 = new BT1(2);
        int n = bt1.n;
        assertEquals("2", n+"");
    }
    
    @Test
    public void testZeroNumber() {
        BT1 bt1 = new BT1(0);
        assertEquals("0", bt1.toString());
    }

    @Test
    public void testMinusNumber() {
        BT1 bt1 = new BT1(-3);
        assertEquals("0", bt1.toString());
    }

    @Test
    public void testN1000() {
        BT1 bt1 = new BT1(1000);
        assertEquals("250500", bt1.toString());
    }
	
	@Test
    public void testN_maxInt() {
        BT1 bt1 = new BT1(2147483647);
        assertEquals("0", bt1.toString());
    }
	
	@Test
    public void testSum_maxInt() {
        BT1 bt1 = new BT1(99999);
        assertEquals("0", bt1.toString());
    }
}
