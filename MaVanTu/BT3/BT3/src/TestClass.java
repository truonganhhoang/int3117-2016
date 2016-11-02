import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {
	Class cl = new Class();

	// voi bien i
	@Test
	public void testCase0() {
		assertEquals(false, cl.ham(456));
	}

	// voi bien tong va result
	@Test
	public void testCase1() {
		assertEquals(true, cl.ham(45678));
	}

}
