/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import bt1.BT1;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Huy
 */
public class BT1Test {

    public BT1Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void testInit() {
        BT1 bt1 = new BT1(8);
        int n = bt1.n;
        assertEquals("8", n+"");
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
        assertEquals("63000", bt1.toString());
    }
}
