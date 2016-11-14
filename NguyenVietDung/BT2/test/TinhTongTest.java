package BT2;

import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by DUNG on 13/11/2016.
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
        TinhTong tong = new TinhTong( 5, 10, 15);
        int sum = tong.tinhTong();
        assertEquals(2450, sum);
    }
    @Test
    public void testMCDC2() {
        // A true, B true and C false
        TinhTong tong = new TinhTong( 5, 10, 14);
        int sum = tong.tinhTong();
        assertEquals(2450, sum);
    }

    @Test
    public void testMCDC3() {
        // A true, B false and C true
        // or A false, B true and C true
        TinhTong tong1 = new TinhTong( 5, 9, 15);
        TinhTong tong2 = new TinhTong( 3, 10, 15);
        int sum1 = tong1.tinhTong();
        int sum2 = tong1.tinhTong();
        assertEquals(2450, sum1);
        assertEquals(2450, sum2);
    }
    @Test
    public void testMCDC4() {
        // A true, B false and C false
        // A false, B true and C false
        TinhTong tong1 = new TinhTong( 5, 9, 15);
        TinhTong tong2 = new TinhTong( 3, 10, 15);
        int sum1 = tong1.tinhTong();
        int sum2 = tong2.tinhTong();
        assertEquals(1683, sum1);
        assertEquals(1200, sum2);
    }

    @Test
    public void testMCDC5() {
        // A false, B false and C true
        TinhTong tong = new TinhTong( 4, 9, 14);
        int sum = tong.tinhTong();
        assertEquals(4950, sum);
    }
    @Test
    public void testMCDC6() {
        // A false, B false and C false
        TinhTong tong = new TinhTong( 4, 9, 14);
        int sum = tong.tinhTong();
        assertEquals(1683, sum);
    }
}
