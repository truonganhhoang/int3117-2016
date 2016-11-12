package testmcdc;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuyenDangNhapTest {
	String ten = "nguyen van chung", mk = "12345", sochungminh = "987";

	@Test
	public void testTTT() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		assertTrue(qdn.dangnhap(ten, mk, sochungminh));
	}

	@Test
	public void testTTF() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		assertFalse(qdn.dangnhap(ten, "13", "11"));
	}

	@Test
	public void testTFT() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		assertFalse(qdn.dangnhap(ten, "13", sochungminh));
	}

	@Test
	public void testTFF() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		assertFalse(qdn.dangnhap(ten, "13", "23"));
	}

	@Test
	public void testFTT() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		assertFalse(qdn.dangnhap("do mai nhung", mk, sochungminh));
	}

	@Test
	public void testFTF() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		assertFalse(qdn.dangnhap("do mai nhung", mk, "23"));
	}

	@Test
	public void testFFT() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		assertFalse(qdn.dangnhap("nguyen van an", "13", sochungminh));
	}

	@Test
	public void testFFF() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		assertFalse(qdn.dangnhap("robinson", "13", "23"));
	}
	
	@Test
	public void testvonglap1lan() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		qdn.dangnhap("chung","12","43");
		assertEquals(2,qdn.solannhap);
	}
	
	@Test
	public void testvonglap2lan() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		qdn.dangnhap("chung","12","43");
		qdn.dangnhap(ten, mk, sochungminh);
		assertEquals(1,qdn.solannhap);
	}

}
