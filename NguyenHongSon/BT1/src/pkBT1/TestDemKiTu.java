package pkBT1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDemKiTu {

	@Test
	public void test() {
		Demotest demo=new Demotest();
		int c = demo.demKiTu("Nguyen Hong Son", 'o');
		assertEquals(2, c);
	}
}
