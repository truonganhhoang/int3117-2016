package chinhvm;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindDateNumberTest {
	@Test
	public void test1() {
		FindDateNumber f = new FindDateNumber(21, 2, 2004);
		assertEquals(52, f.dayInYear());
	}

	@Test
	public void test2() {
		FindDateNumber f = new FindDateNumber(21, 3, 2004);
		assertEquals(81, f.dayInYear());
	}
	
	@Test
	public void test3() {
		FindDateNumber f = new FindDateNumber(21, 2, 2005);
		assertEquals(52, f.dayInYear());
	}
	
	@Test
	public void test4() {
		FindDateNumber f = new FindDateNumber(21, 3, 2005);
		assertEquals(80, f.dayInYear());
	}
	
	@Test
	public void test5() {
		FindDateNumber f = new FindDateNumber(31, 12, 2004);
		assertEquals(365, f.dayInYear());
	}
	
	@Test
	public void test6() {
		FindDateNumber f = new FindDateNumber(31, 12, 2005);
		assertEquals(366, f.dayInYear());
	}
	
//	@Test
//	public void test7() {
//		FindDateNumber f = new FindDateNumber(30, 2, 2004);
////		assertEquals(false, f.dayInYear());
//	}
//	
//	@Test
//	public void test8() {
//		FindDateNumber f = new FindDateNumber(21, 2, 2004);
//		assertEquals(52, f.dayInYear());
//	}
}
