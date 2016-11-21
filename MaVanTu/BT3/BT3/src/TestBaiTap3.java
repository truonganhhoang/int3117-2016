import static org.junit.Assert.*;

import org.junit.Test;

public class TestBaiTap3 {
	BaiTap3 cl = new BaiTap3();

	// voi bien i
	@Test
	public void testVariableI() {
		assertEquals(false, cl.ham(456));
	}

	// voi bien tong va result
	@Test
	public void testVariableTongAndResult() {
		assertEquals(true, cl.ham(45678));
	}

}
