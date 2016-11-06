package com.t3h.NamNhuan;

import static org.junit.Assert.*;

import org.junit.Test;

public class NamNhuanTest {

	@Test
	public void testkiemTra_400_4_100() {
		NamNhuan year = new NamNhuan();
		assertEquals("Nam nhuan", year.kiemTra(2000));
	}
	@Test
	public void testkiemTra_400_4_not100() {
		NamNhuan year = new NamNhuan();
		assertEquals("Nam nhuan", year.kiemTra(2016));
	}

	@Test
	public void testkiemTra_not400_4_not100() {
		NamNhuan year = new NamNhuan();
		assertEquals("Nam nhuan", year.kiemTra(2016));
	}

	@Test
	public void testkiemTra_not400_4_100() {
		NamNhuan year = new NamNhuan();
		assertEquals("Khong phai nam nhuan", year.kiemTra(1800));
	}

	

}
