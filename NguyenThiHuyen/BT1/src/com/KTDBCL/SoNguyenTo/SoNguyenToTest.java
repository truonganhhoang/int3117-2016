package com.KTDBCL.SoNguyenTo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SoNguyenToTest {

	@Test
	public void testKiemTra1() {
		SoNguyenTo number = new SoNguyenTo(5);
		assertTrue(number.kiemTra());

	}

	@Test
	public void testKiemTra2() {
		SoNguyenTo number = new SoNguyenTo(6);
		assertFalse(number.kiemTra());
	}

	@Test
	public void testKiemTra3() {
		SoNguyenTo number = new SoNguyenTo(-2);
		assertFalse(number.kiemTra());
	}
}