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
    public void tongKhongCoSoChanVaSoChiaHet3KhongChiaHetCho5() {
        TinhTong TinhTong = new TinhTong();
        int n = 3;
        int tong = TinhTong.tong(n);
        assertEquals(2, tong);
    }

}