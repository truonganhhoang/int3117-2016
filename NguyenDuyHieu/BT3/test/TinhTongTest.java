package bt2;

import org.junit.Test;
import static org.junit.Assert.*;

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
        TinhTong tong = new TinhTong( 3, 6, 9);        
        int sum = tong.tinhTong();
        assertEquals(1683, sum);
    }
}
