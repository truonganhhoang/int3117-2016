package com.KTDBCL.SoNguyenTo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SoNguyenToTest {

	@Test
	public void testKiemTra_So5() {
		SoNguyenTo number = new SoNguyenTo(5);
		assertTrue(number.kiemTra());

	}

	@Test
	public void testKiemTra_So6() {
		SoNguyenTo number = new SoNguyenTo(6);
		assertFalse(number.kiemTra());
	}

	@Test
	public void testKiemTra_So1() {
		SoNguyenTo number = new SoNguyenTo(1);
		assertFalse(number.kiemTra());
	}
	
	@Test
	public void testKiemTra_SoAm() {
		SoNguyenTo number = new SoNguyenTo(-2);
		assertFalse(number.kiemTra());
	}
}