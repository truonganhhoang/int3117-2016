/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

import static org.junit.Assert.*;


/**
 *
 * @author VuHongDiem
 */
public class squareTest {
    
    public void test(){
        JunitTesting test = new JunitTesting();
        int output = test.square(5);
        assertEquals(25, output);
    }
    
}
