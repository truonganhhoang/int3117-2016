package Demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PhuongTrinhBac2Test {

	@Test
	public void GiaiPTKhiTatCaHeSoBangKhong() {
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(0, 0, 0); 
		assertEquals("Phuong trinh co vo so nghiem",x);
	}
	
	@Test
	public void GiaiPTKhiHeSo_B_KhacKhong() {
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(0, 4, 0); 
		assertEquals("Phuong trinh co nghiem duy nhat "+0.0,x);
	}
	
	@Test
	public void GiaiPTKhiHeSo_C_KhacKhong(){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(0, 0, 4);
		assertEquals("Phuong trinh vo nghiem",x);			
	}
	
	@Test
	public void GiaiPTKhiHeSo_A_KhacKhong(){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(4, 0, 0);
		assertEquals("Phuong trinh co nghiem kep x1= x2= "+-0.0,x);			
	}
	
	@Test
	public void GiaiPTKhiHeSoThoaMan_Delta_LonHonKhong(){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(-1, 2, 3);
		assertEquals("X1= " +-1.0+ "X2= " +3.0,x);			
	}
	
	@Test
	public void GiaiPTKhiHeSoThoaMan_Delta_NhoHonKhong(){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(1, 2, 3);
		assertEquals("Phuong trinh vo nghiem",x);			
	}
	
	@Test
	public void GiaiPTKhiHeSo_a_BangKhong (){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(0, 2, 4);
		assertEquals("Phuong trinh co nghiem duy nhat "+-2.0 ,x);
	}
	
	@Test
	public void GiaiPTKhiHeSo_b_BangKhong(){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(2, 0, 4);
		assertEquals("Phuong trinh vo nghiem",x);
	}
	
	@Test
	public void GiaiPTKhiHeSo_c_BangKhong (){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(1, 1, 0);
		assertEquals("X1= " +0.0+ "X2= " +-1.0 ,x);
	}
	
	@Test
	public void GiaiPTKhiHeSoThoaMan_Delta_BangKhong(){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(1, 2, 1);
		assertEquals("Phuong trinh co nghiem kep x1= x2= "+-1.0,x);			
	}
	
	@Test
	public void GiaiPTKhiHeSoLaSoThuc(){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(-1.5, 2.5, 1.0);
		assertEquals("X1= " +-0.33333333333333333+"X2= "+2.0,x);			
	}

}
