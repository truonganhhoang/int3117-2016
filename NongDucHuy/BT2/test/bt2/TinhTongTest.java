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

    /// if ( (A && B) || C)...
    @Test
    public void testMCDC1() {
        // A true, B true and C true
        TinhTong tong = new TinhTong( 2, 4, 6);
        int sum = tong.tinhTong();
        assertEquals(2450, sum);
    }
    
    @Test
    public void testMCDC2() {
        // A true, B true and C false
        TinhTong tong = new TinhTong( 2, 4, 5);
        int sum = tong.tinhTong();
        assertEquals(2450, sum);
    }
    
    @Test
    public void testMCDC3() {
        // A true, B false and C true
        // or A false, B true and C true
        TinhTong tong1 = new TinhTong( 2, 3, 6);
        TinhTong tong2 = new TinhTong( 1, 4, 6);
        int sum1 = tong1.tinhTong();
        int sum2 = tong1.tinhTong();
        assertEquals(2450, sum1);
        assertEquals(2450, sum2);
    }
    
    @Test
    public void testMCDC4() {
        // A true, B false and C false
        // A false, B true and C false
        TinhTong tong1 = new TinhTong( 2, 3, 5);
        TinhTong tong2 = new TinhTong( 1, 4, 5);
        int sum1 = tong1.tinhTong();
        int sum2 = tong2.tinhTong();
        assertEquals(1683, sum1);
        assertEquals(1200, sum2);
    }
    
    @Test
    public void testMCDC5() {
        // A false, B false and C true
        TinhTong tong = new TinhTong( 1, 3, 6);        
        int sum = tong.tinhTong();
        assertEquals(4950, sum);
    }
    
    @Test
    public void testMCDC6() {
        // A false, B false and C false
        TinhTong tong = new TinhTong( 1, 3, 5);        
        int sum = tong.tinhTong();
        assertEquals(1683, sum);
    }
}
