import static org.junit.Assert.*;

import org.junit.Test;

public class TestBaiTap2 {
	BaiTap2 cl = new BaiTap2();

	// N co so chu so nho hon 5
	@Test
	public void testNLess5() {
		assertEquals(false, cl.ham(456));
	}

	// N co so chu so lon hon 5 voi 8 testCase
	@Test
	public void testCase1() {
		assertEquals(true, cl.ham(45678));
	}

	@Test
	public void testCase2() {
		assertEquals(true, cl.ham(456786));
	}

	@Test
	public void testCase3() {
		assertEquals(true, cl.ham(88888));
	}

	@Test
	public void testCase4() {
		assertEquals(false, cl.ham(68888));
	}

	@Test
	public void testCase5() {
		assertEquals(false, cl.ham(688869));
	}

	@Test
	public void testCase6() {
		assertEquals(false, cl.ham(688883));
	}

	@Test
	public void testCase7() {
		assertEquals(false, cl.ham(68885));
	}

	@Test
	public void testCase8() {
		assertEquals(false, cl.ham(688861));
	}
}
