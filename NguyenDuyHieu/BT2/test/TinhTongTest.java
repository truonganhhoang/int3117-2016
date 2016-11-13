package bt2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TinhTongTest {
    
    public TinhTongTest() {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:

    /// if ( (A && B) || C)...

    @Test
    public void testMCDC1() {
        // A true, B false and C true => OUTPUT true 
        TinhTong tong = new TinhTong( 3, 4, 6);
        int sum = tong.tinhTong();
        assertEquals(1683, sum);
    }
    
    @Test
    public void testMCDC2() {
        // A true, B false and C false => OUTPUT false       
        TinhTong tong = new TinhTong( 3, 4, 5);      
        int sum = tong.tinhTong();     
        assertEquals(1200, sum);      
    }

    @Test
    public void testMCDC3() {
        // A true, B true and C false => OUTPUT true
        TinhTong tong = new TinhTong( 3, 6, 5);
        int sum = tong.tinhTong();
        assertEquals(1683, sum);
    }
    
    @Test
    public void testMCDC4() {
        // A false, B true and C false => OUTPUT false
        TinhTong tong = new TinhTong( 1, 3, 5);
        int sum = tong.tinhTong();
        assertEquals(1683, sum);
    }

}
