package testmcdc;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuyenDangNhapTestADP {
	String ten = "nguyen van chung", mk = "12345", sochungminh = "987";

	@Test
	public void TestADPsolannhapquyendangnhapTTT() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		qdn.dangnhap(ten, mk, sochungminh);
		assertEquals(3, qdn.solannhap);
		assertTrue(qdn.dangnhap(ten, mk, sochungminh));
	}

	@Test
	public void TestADPsolannhapquyendangnhapTTF() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		qdn.dangnhap(ten, "13", "11");
		assertEquals(2, qdn.solannhap);
		assertFalse(qdn.dangnhap(ten, "13", "11"));
	}

	@Test
	public void TestADPsolannhapquyendangnhapTFT() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		qdn.dangnhap(ten, "13", sochungminh);
		assertEquals(2, qdn.solannhap);
		assertFalse(qdn.dangnhap(ten, "13", sochungminh));
	}

	@Test
	public void TestADPsolannhapquyendangnhapTFF() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		qdn.dangnhap(ten, "13", "23");
		assertEquals(2, qdn.solannhap);
		assertFalse(qdn.dangnhap(ten, "13", "23"));
	}

	@Test
	public void TestADPsolannhapquyendangnhapFTT() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		qdn.dangnhap("do mai nhung", mk, sochungminh);
		assertEquals(2, qdn.solannhap);
		assertFalse(qdn.dangnhap("do mai nhung", mk, sochungminh));
	}

	@Test
	public void TestsolannhapquyendangnhapFTF() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		qdn.dangnhap("do mai nhung", mk, "23");
		assertEquals(2, qdn.solannhap);
		assertFalse(qdn.dangnhap("do mai nhung", mk, "23"));
	}

	@Test
	public void TestADPsolannhapquyendangnhapFFT() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		qdn.dangnhap("nguyen van an", "13", sochungminh);
		assertEquals(2, qdn.solannhap);
		assertFalse(qdn.dangnhap("nguyen van an", "13", sochungminh));
	}

	@Test
	public void TestADPsolannhapquyendangnhapFFF() {
		QuyenDangNhap qdn = new QuyenDangNhap();
		qdn.dangnhap("robinson", "13", "23");
		assertEquals(2, qdn.solannhap);
		assertFalse(qdn.dangnhap("robinson", "13", "23"));
	}

}
