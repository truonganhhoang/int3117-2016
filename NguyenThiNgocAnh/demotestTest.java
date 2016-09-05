package pkdm;

import static org.junit.Assert.*;

import org.junit.Test;

public class demotestTest {

	@Test
	public void test() {
		demotest demo = new demotest();
		int k = demo.tongdayso(5);
		assertEquals(15, k);
	}

}