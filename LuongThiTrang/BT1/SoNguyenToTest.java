package tranglt58.SNT;

import org.testng.Assert;
import org.testng.annotations.Test;

//import static org.junit.Assert.assertEquals;


public class SoNguyenToTest {
	@Test
	public void test1() {
		SoNguyenTo SNT = new SoNguyenTo();
		//boolean result = SNT.kiemTraSoNguyenTo(1);
		//assertEquals(false, result);
		Assert.assertEquals(false,SNT.kiemTraSoNguyenTo(1));
		
	}

	@Test
	public void test2() {
		SoNguyenTo SNT = new SoNguyenTo();
		//boolean result = SNT.kiemTraSoNguyenTo(2);
		//assertEquals(true, result);
		Assert.assertEquals(true,SNT.kiemTraSoNguyenTo(2));
	}

	

	@Test
	public void test3() {
		SoNguyenTo SNT = new SoNguyenTo();
		//boolean result = SNT.kiemTraSoNguyenTo(0);
		//assertEquals(false, result);
		Assert.assertEquals(false,SNT.kiemTraSoNguyenTo(0));
	}

	@Test
	public void test12() {
		SoNguyenTo SNT = new SoNguyenTo();
		//boolean result = SNT.kiemTraSoNguyenTo(11);
		//assertEquals(true, result);
		Assert.assertEquals(true,SNT.kiemTraSoNguyenTo(11));
	}
}
