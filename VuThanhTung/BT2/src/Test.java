/**
 * Created by Vu Tung on 9/5/2016.
 */

import static org.junit.Assert.*;

public class Test {

    @org.junit.Test
    public void TongVoiNBang0() {
        TinhTong TinhTong = new TinhTong();
        int n = 0;
        int tong = TinhTong.tong(n);
        assertEquals(0, tong);
    }

    @org.junit.Test
    public void tongKhongCoSoChanVaSoChiaHet3Va5() {
        TinhTong TinhTong = new TinhTong();
        int n = 1;
        int tong = TinhTong.tong(n);
        assertEquals(0, tong);
    }

    @org.junit.Test
    public void tongCoSoChan() {
        TinhTong TinhTong = new TinhTong();
        int n = 2;
        int tong = TinhTong.tong(n);
        assertEquals(2, tong);
    }


    @org.junit.Test
    public void tongKhongCoSoChanVaSoChiaHet3KhongChiaHetCho5() {
        TinhTong TinhTong = new TinhTong();
        int n = 3;
        int tong = TinhTong.tong(n);
        assertEquals(2, tong);
    }
    @org.junit.Test
    public void tongCoSoChanChiHet3Va5() {
        TinhTong TinhTong = new TinhTong();
        int n = 15;
        int tong = TinhTong.tong(n);
        assertEquals(71, tong);
    }
    @org.junit.Test
    public void tongKhongCoSoChanVaSoChiaHet5KhongChiaHetCho3() {
        TinhTong TinhTong = new TinhTong();
        int n = 5;
        int tong = TinhTong.tong(n);
        assertEquals(6, tong);
    }

}