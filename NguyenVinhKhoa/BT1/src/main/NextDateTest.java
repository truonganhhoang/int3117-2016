package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class NextDateTest {
	/*
	 * Cac testcase duoc danh so theo mo ta trong file README
	 */

	// Thang co 30 ngay, 1 <= ngay <= 29
	@Test
	public void test1() {
		Date date = new Date(25, 6, 2004);
		assertEquals(new Date(26, 6, 2004), date.nextDate());
	}
	
	// Thang co 30 ngay, ngay 30 
	@Test
	public void test2() {
		Date date = new Date(30, 6, 2000);
		assertEquals(new Date(1, 7, 2000), date.nextDate());
	}
	
	// Thang co 30 ngay, ngay 31
	@Test(expected=IllegalArgumentException.class)
	public void test3() {
		Date date = new Date(31, 6, 2000);
		assertEquals(new Date(26, 6, 2000), date.nextDate());
	}
	
	// Thang co 31 ngay khong phai thang 12, 1 <= ngay <= 30 
	@Test
	public void test4() {
		Date date = new Date(25, 7, 2002);
		assertEquals(new Date(26, 7, 2002), date.nextDate());
	}
	
	// Thang co 31 ngay khong phai thang 12, ngay 31
	@Test
	public void test5() {
		Date date = new Date(31, 7, 2000);
		assertEquals(new Date(1, 8, 2000), date.nextDate());
	}
	
	// Thang 12, 1 <= ngay <= 30
	@Test
	public void test6() {
		Date date = new Date(25, 12, 2000);
		assertEquals(new Date(26, 12, 2000), date.nextDate());
	}
	
	// Thang 12, ngay 31
	@Test
	public void test7() {
		Date date = new Date(31, 12, 2000);
		assertEquals(new Date(1, 1, 2001), date.nextDate());
	}
	
	// Thang 2, 1 <= ngay <= 27
	@Test
	public void test8() {
		Date date = new Date(25, 2, 2001);
		assertEquals(new Date(26, 2, 2001), date.nextDate());
	}
	
	// Thang 2, ngay 28, nam nhuan
	@Test
	public void test9() {
		Date date = new Date(28, 2, 2000);
		assertEquals(new Date(29, 2, 2000), date.nextDate());
	}
	
	// Thang 2, ngay 28, nam thuong
	@Test
	public void test10() {
		Date date = new Date(28, 2, 1900);
		assertEquals(new Date(1, 3, 1900), date.nextDate());
	}
	
	// Thang 2, ngay 29, nam nhuan
	@Test
	public void test11() {
		Date date = new Date(29, 2, 2004);
		assertEquals(new Date(1, 3, 2004), date.nextDate());
	}
	
	// Thang 2, ngay 29, nam thuong
	@Test(expected=IllegalArgumentException.class)
	public void test12() {
		Date date = new Date(29, 2, 2001);
	}
	
	// Thang 2, 30 <= ngay <= 31
	@Test(expected=IllegalArgumentException.class)
	public void test13() {
		Date date = new Date(30, 2, 2000);
	}
}
