package chinhvm;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindSpecialYearTest {
	@Test
	/*
	 * y la cac so thuoc khoang y1 > y > y2
	 * 
	 * case1: y % 400 == 0, y % 12 == 3
	 * case2: y % 400 == 0, y % 12 != 3
	 * case3: y % 4 == 0, y % 100 == 0 => y % 400 == 0 (giong truong hop 1 va 2)
	 * case4: y % 400 != 0, y % 4 != 0, y % 100 != 0, y % 12 == 3
	 * case5: y % 400 != 0, y % 4 != 0, y % 100 != 0, y % 12 != 3 
	 * case6: y % 400 != 0, y % 4 != 0, y % 100 == 0, y % 12 == 3 (khong co)
	 * case7: y % 400 != 0, y % 4 != 0, y % 100 == 0, y % 12 != 3 (khong co) 
	 * case8: y % 400 != 0, y % 4 == 0, y % 100 == 0, y % 12 == 3
	 * case9: y % 400 != 0, y % 4 == 0, y % 100 == 0, y % 12 != 3
	 * case10: y % 400 != 0, y % 4 == 0, y % 100 != 0, y % 12 == 3
	 * case11: y % 400 != 0, y % 4 == 0, y % 100 != 0, y % 12 != 3
	 * 
	 * 
	 */
	public void checkAllCondition() {
		FindSpecialYear case1 = new FindSpecialYear(1599, 1600);
		assertEquals(2, case1.findYear());

		FindSpecialYear case2 = new FindSpecialYear(1600, 1601);
		assertEquals(1, case2.findYear());

		FindSpecialYear case3 = new FindSpecialYear(1599, 1601);
		assertEquals(2, case3.findYear());

		FindSpecialYear case4 = new FindSpecialYear(1598, 1599);
		assertEquals(1, case4.findYear());

		FindSpecialYear case5 = new FindSpecialYear(1597, 1598);
		assertEquals(0, case5.findYear());

		FindSpecialYear case8 = new FindSpecialYear(1500, 1503);
		assertEquals(1, case8.findYear());

		FindSpecialYear case9 = new FindSpecialYear(1500, 1502);
		assertEquals(0, case9.findYear());

		FindSpecialYear case10 = new FindSpecialYear(1503, 1504);
		assertEquals(2, case10.findYear());

		FindSpecialYear case11 = new FindSpecialYear(1504, 1505);
		assertEquals(1, case11.findYear());
	}
	
	@Test
	public void lowRangeAndNoYearFit() {
		FindSpecialYear y = new FindSpecialYear(1000, 1002);
		assertEquals(0, y.findYear());
	}
	
	@Test
	public void lowRangeHaveLeapYear() {
		FindSpecialYear y = new FindSpecialYear(1000, 1005);
		assertEquals(1, y.findYear());	
	}
	
	@Test
	public void lowRangeHaveLeapYearAndSpecialYear() {
		FindSpecialYear y = new FindSpecialYear(999, 1005);
		assertEquals(2, y.findYear());	
	}
	
	@Test
	public void highRange() {
		FindSpecialYear y = new FindSpecialYear(1900, 2015);
		assertEquals(37, y.findYear());	
	}
	
}
