package tranglt58.songuyento;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SoNguyenToTest {
	@Test
	public void test2() {
		SoNguyenTo SNT = new SoNguyenTo();
		boolean result = SNT.kiemTraSoNguyenTo(2);
		assertEquals(true, result);
	}

	@Test
	public void test1() {
		SoNguyenTo SNT = new SoNguyenTo();
		boolean result = SNT.kiemTraSoNguyenTo(1);
		assertEquals(false, result);
	}

	@Test
	public void test0() {
		SoNguyenTo SNT = new SoNguyenTo();
		boolean result = SNT.kiemTraSoNguyenTo(0);
		assertEquals(false, result);
	}

	@Test
	public void test11() {
		SoNguyenTo SNT = new SoNguyenTo();
		boolean result = SNT.kiemTraSoNguyenTo(11);
		assertEquals(true, result);
	}
}