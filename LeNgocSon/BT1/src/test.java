import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		baitap1 demo = new baitap1();
		int[] array = {1, 2, 3, 0, 6, 7, 5};
		int i = demo.findMax(array);
		assertEquals(7, i);
	}

}
