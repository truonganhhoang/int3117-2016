package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class NextDateTest {

	@Test
	public void test1() {
		Date date = new Date(25, 6, 2004);
		assertEquals(new Date(26, 6, 2004), date.nextDate());
	}
	
	@Test
	public void test2() {
		Date date = new Date(30, 6, 2000);
		assertEquals(new Date(1, 7, 2000), date.nextDate());
	}
	
//	@Test
//	public void test3() {
//		Date date = new Date(31, 6, 2000);
//		assertEquals(new Date(26, 6, 2000), date.nextDate());
//	}
	
	@Test
	public void test4() {
		Date date = new Date(25, 7, 2002);
		assertEquals(new Date(26, 7, 2002), date.nextDate());
	}
	
	@Test
	public void test5() {
		Date date = new Date(31, 7, 2000);
		assertEquals(new Date(1, 8, 2000), date.nextDate());
	}
	
	@Test
	public void test6() {
		Date date = new Date(25, 12, 2000);
		assertEquals(new Date(26, 12, 2000), date.nextDate());
	}
	
	@Test
	public void test7() {
		Date date = new Date(31, 12, 2000);
		assertEquals(new Date(1, 1, 2001), date.nextDate());
	}
	
	@Test
	public void test8() {
		Date date = new Date(25, 2, 2000);
		assertEquals(new Date(26, 2, 2000), date.nextDate());
	}
	
	@Test
	public void test9() {
		Date date = new Date(28, 2, 2000);
		assertEquals(new Date(29, 2, 2000), date.nextDate());
	}
	
	@Test
	public void test10() {
		Date date = new Date(28, 2, 2001);
		assertEquals(new Date(1, 3, 2001), date.nextDate());
	}
	
	@Test
	public void test11() {
		Date date = new Date(29, 2, 2000);
		assertEquals(new Date(1, 3, 2000), date.nextDate());
	}
	
//	@Test
//	public void test12() {
//		Date date = new Date(29, 2, 2001);
//	}
	
//	@Test
//	public void test13() {
//		Date date = new Date(30, 2, 2000);
//	}
}
