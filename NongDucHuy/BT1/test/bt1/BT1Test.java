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
    public void testMinimumBoundary() {
        BT1 bt1 = new BT1(0);
        long sum = (long) bt1.sum;
        assertEquals(0, sum);
    }

    @Test
    public void testGTMinimumBoundary() {
        BT1 bt1 = new BT1(1);
        long sum = (long) bt1.sum;
        assertEquals(0, sum);
    }

    @Test
    public void testLTMinimumBoundary() {
        BT1 bt1 = new BT1(-1);        
        long sum = (long) bt1.sum;
        assertEquals(0, sum);
    }
    
//    @Test
    public void testMaximumBoundary() {
        BT1 bt1 = new BT1(100000);
        long sum = (long) bt1.sum;
        assertEquals(62495000, sum);
    }

    @Test
    public void testGTMaximumBoundary() {
        BT1 bt1 = new BT1(100001);
        long sum = (long) bt1.sum;
        assertEquals(0, sum);
    }

    @Test
    public void testLTMaximumBoundary() {
        BT1 bt1 = new BT1(99999);
        long sum = (long) bt1.sum;
        assertEquals(624950000, sum);
    }
}
