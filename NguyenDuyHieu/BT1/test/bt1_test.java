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
    public void testGiaTriCucTieu() {
        TinhTongSoChan tong = new TinhTongSoChan(0);
        long sum = (long) tong.getSum();
        assertEquals(0, sum);
    }

    @Test
    public void testTrenGiaTriCucTieu() {
        TinhTongSoChan tong = new TinhTongSoChan(1);
        long sum = (long) tong.getSum();
        assertEquals(0, sum);
    }

    @Test
    public void testDuoiGiaTriCucTieu() {
        TinhTongSoChan tong = new TinhTongSoChan(-1);        
        long sum = (long) tong.getSum();
        assertEquals(0, sum);
    }
    
    @Test
    public void testGiaTriCucDai() {
        TinhTongSoChan tong = new TinhTongSoChan(10000);
        long sum = (long) tong.getSum();
        assertEquals(25005000, sum);
    }

    @Test
    public void testTrenGiaTriCucDai() {
        TinhTongSoChan tong = new TinhTongSoChan(10001);
        long sum = (long) tong.getSum();
        assertEquals(0, sum);
    }

    @Test
    public void testDuoiGiaTriCucDai() {
        TinhTongSoChan tong = new TinhTongSoChan(9999);
        long sum = (long) tong.getSum();
        assertEquals(24995000, sum);
    }	
}
