import bt1.BT1;
import org.junit.Test;
import static org.junit.Assert.*;

public class TinhTongChiaHetCho10Test {
        public TinhTongChiaHetCho10Test() {
        }

        // TODO add test methods here.
        // The methods must be annotated with annotation @Test. For example:
        //

        @Test
        public void testGiaTriCucTieu() {
            BT1 tong = new BT1(0);
            long sum = (long) tong.getSum();
            assertEquals(0, sum);
        }
    @Test
    public void testTrenGiaTriCucTieu() {
        BT1 tong = new BT1(1);
        long sum = (long) tong.getSum();
        assertEquals(0, sum);
    }

    @Test
    public void testDuoiGiaTriCucTieu() {
        BT1 tong = new BT1(-1);
        long sum = (long) tong.getSum();
        assertEquals(0, sum);
    }

    @Test
    public void testGiaTriCucDai() {
        BT1 tong = new BT1(100000);
        long sum = (long) tong.getSum();
        assertEquals(625050000, sum);
    }

    @Test
    public void testTrenGiaTriCucDai() {
        BT1 tong = new BT1(100001);
        long sum = (long) tong.getSum();
        assertEquals(0, sum);
    }

    @Test
    public void testDuoiGiaTriCucDai() {
        BT1 tong = new BT1(99999);
        long sum = (long) tong.getSum();
        assertEquals(624950000, sum);
    }
}
