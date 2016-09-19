package pkBT1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNhan {

	@Test
	public void test() {
		Demotest demo=new Demotest();
		int i = demo.nhan(2, 4);
		assertEquals(8, i);
	}

}
