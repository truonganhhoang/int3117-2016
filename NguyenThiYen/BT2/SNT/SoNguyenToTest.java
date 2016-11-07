package yen.SNT;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoNguyenToTest {
	@Test
	public void testNumber1() {
		SoNguyenTo SNT = new SoNguyenTo();
		boolean result = SNT.KiemTraSoNguyenTo(1);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testNumber2() {
		SoNguyenTo SNT = new SoNguyenTo();
		boolean result = SNT.KiemTraSoNguyenTo(2);
		Assert.assertEquals(true, result);
	}

	

	@Test
	public void testNumber0() {
		SoNguyenTo SNT = new SoNguyenTo();
		boolean result = SNT.KiemTraSoNguyenTo(0);
		Assert.assertEquals(false, result);
	}

	@Test
	public void test5() {
		SoNguyenTo SNT = new SoNguyenTo();
		boolean result = SNT.KiemTraSoNguyenTo(5);
		Assert.assertEquals(true, result);
	}
	@Test
	public void testNumber6() {
		SoNguyenTo SNT = new SoNguyenTo();
		boolean result = SNT.KiemTraSoNguyenTo(6);
		Assert.assertEquals(false, result);
	}
	@Test
	public void testNumberbellow0() {
		SoNguyenTo SNT = new SoNguyenTo();
		boolean result = SNT.KiemTraSoNguyenTo(-2);
		Assert.assertEquals(false, result);
	}
}
