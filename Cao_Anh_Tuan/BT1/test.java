package kiemthu2;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {
	@Test
	public void testDEM() {
		bt1 bt = new bt1();
		int u = bt.dem("kiem thu va dam bao chat luong");
		assertEquals(8, u);
	}
}
