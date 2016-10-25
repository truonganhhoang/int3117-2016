package bt2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HuyND
 */
public class TinhTongTest {
    
    public TinhTongTest() {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:

    @Test
    public void testDUPath1() {
        TinhTong tong = new TinhTong( 2, 4, 6);
        int sum = tong.tinhTong();
        assertEquals(2450, sum);
    }
   
    @Test
    public void testDUPath2() {
        TinhTong tong = new TinhTong( 1, 3, 5);        
        int sum = tong.tinhTong();
        assertEquals(1683, sum);
    }
}
