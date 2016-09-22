package com.KTDBCL.SoNguyenTo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SoNguyenToTest {

	@Test
	public void testKiemTra_So5() {
		SoNguyenTo number = new SoNguyenTo();
		assertTrue(number.kiemTra(5));

	}

	@Test
	public void testKiemTra_So6() {
		SoNguyenTo number = new SoNguyenTo();
		assertFalse(number.kiemTra(6));
	}

	@Test
	public void testKiemTra_So1() {
		SoNguyenTo number = new SoNguyenTo();
		assertFalse(number.kiemTra(1));
	}
	
	@Test
	public void testKiemTra_SoAm() {
		SoNguyenTo number = new SoNguyenTo();
		assertFalse(number.kiemTra(-2));
	}
}