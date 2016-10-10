import org.junit.Test;
import static org.junit.Assert.*;
public class TestTuyenNhanSu {
    NhanSu[] nhansu; 
    public TestTuyenNhanSu() {  
    }
    
    @Test
    public void testNull(){
        NhanSu[] nhansuNull = null;
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(0, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
    @Test
    public void testSoNamKinhNghiemKhongHopLe(){
        nhansu= new NhanSu[3];
        nhansu[0] = new NhanSu(-1,2.0);
        nhansu[1] = new NhanSu(-2,-2.0);
        nhansu[2] = new NhanSu(-3,3.0);
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(0, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
    @Test
    public void testDiemKhongHopLe(){
        nhansu= new NhanSu[3];
        nhansu[0] = new NhanSu(3,-1.0);
        nhansu[1] = new NhanSu(2,-2.0);
        nhansu[2] = new NhanSu(1,0.0);
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(0, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
    @Test
    public void testDauVaoHopLe(){
        nhansu= new NhanSu[3];
        nhansu[0] = new NhanSu(31,2.0);
        nhansu[1] = new NhanSu(2,2.9);
        nhansu[2] = new NhanSu(1,2.0);
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(2, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
    @Test
    public void testDiemHopLe(){
        nhansu= new NhanSu[3];
        nhansu[0] = new NhanSu(0,3.1);
        nhansu[1] = new NhanSu(1,3.3);
        nhansu[2] = new NhanSu(3,3.5);
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(3, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
    @Test
    public void testUuTienNamKinhNghiemDiemThoaMan(){
        nhansu= new NhanSu[3];
        nhansu[0] = new NhanSu(3,2.0);
        nhansu[1] = new NhanSu(2,2.4);
        nhansu[2] = new NhanSu(4,2.3);
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(3, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
    @Test
    public void testUuTienNamKinhNghiemDiemThoaMan1(){
        nhansu= new NhanSu[3];
        nhansu[0] = new NhanSu(2,2.9);
        nhansu[1] = new NhanSu(3,2.5);
        nhansu[2] = new NhanSu(4,2.7);
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(3, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
    @Test
    public void testUuTienDiemNamKinhNghiemThoaMan(){
        nhansu= new NhanSu[3];
        nhansu[0] = new NhanSu(1,2.5);
        nhansu[1] = new NhanSu(0,2.8);
        nhansu[2] = new NhanSu(1,2.9);
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(3, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
    @Test
    public void testUuTienNamKinhNghiemDiemKhongThoaMan(){
        nhansu= new NhanSu[3];
        nhansu[0] = new NhanSu(2,1.0);
        nhansu[1] = new NhanSu(3,1.8);
        nhansu[2] = new NhanSu(2,1.3);
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(0, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
}
