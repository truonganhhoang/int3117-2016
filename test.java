package kiemthu2;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void testBP() {
		bt1 bt = new bt1();
		int i = bt.binhphuong(2);
		assertEquals(4, i);
	}
	@Test
	public void testDEM() {
		bt1 bt = new bt1();
		int u = bt.dem("kiem thu");
		assertEquals(1, u);
	}
}
