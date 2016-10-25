import org.junit.Test;
import static org.junit.Assert.*;
public class TuyenNhanSuTest {
    NhanSu[] nhansu; 
    public TuyenNhanSuTest() {  
    }
    
    @Test
    public void testNhanSuNull(){
        NhanSu[] nhansuNull = null;
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(0, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
    @Test
    public void testNhanSuKhongRong(){
        nhansu= new NhanSu[3];
        nhansu[0] = new NhanSu(3,2.0);
        nhansu[1] = new NhanSu(2,2.9);
        nhansu[2] = new NhanSu(1,2.0);
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(2, tuyenNS.soLuongNhanSuTuyen(nhansu));
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
    public void testDiemLonHon3(){
        nhansu= new NhanSu[3];
        nhansu[0] = new NhanSu(3,3.1);
        nhansu[1] = new NhanSu(2,3.);
        nhansu[2] = new NhanSu(1,3.6);
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(3, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
    @Test
    public void testDiemLonHon2(){
        nhansu= new NhanSu[3];
        nhansu[0] = new NhanSu(1,2.6);
        nhansu[1] = new NhanSu(2,2.3);
        nhansu[2] = new NhanSu(3,2.7);
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(3, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
     @Test
    public void testDiemNhoHon2(){
        nhansu= new NhanSu[3];
        nhansu[0] = new NhanSu(1,1.6);
        nhansu[1] = new NhanSu(2,1.3);
        nhansu[2] = new NhanSu(3,1.7);
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(0, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
    @Test
    public void testNamKinhNghiemNhoHon0(){
        nhansu= new NhanSu[3];
        nhansu[0] = new NhanSu(-1,-2.0);
        nhansu[1] = new NhanSu(-2,-2.9);
        nhansu[2] = new NhanSu(-3,-2.0);
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(0, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
    @Test
    public void testNamKinhNghiemThoaMan(){
        nhansu= new NhanSu[3];
        nhansu[0] = new NhanSu(1,2.6);
        nhansu[1] = new NhanSu(2,2.3);
        nhansu[2] = new NhanSu(3,2.7);
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(3, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
    @Test
    public void testDemBang0(){
        NhanSu[] nhansuNull = null;
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(0, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
    @Test
    public void testDemTheoUuTienDiemSo(){
        nhansu= new NhanSu[3];
        nhansu[0] = new NhanSu(3,3.1);
        nhansu[1] = new NhanSu(2,3.);
        nhansu[2] = new NhanSu(1,3.6);
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(3, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
    
    @Test
    public void testDemTheoDiemVaNamKinhNghiem(){
        nhansu= new NhanSu[3];
        nhansu[0] = new NhanSu(1,2.6);
        nhansu[1] = new NhanSu(2,2.3);
        nhansu[2] = new NhanSu(3,2.7);
        TuyenNhanSu tuyenNS = new TuyenNhanSu();
        assertEquals(3, tuyenNS.soLuongNhanSuTuyen(nhansu));
    }
}
