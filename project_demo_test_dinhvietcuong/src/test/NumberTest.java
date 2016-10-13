package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Number;

/**
 * 
 * @author Viet Cuong Dinh
 *
 */
public class NumberTest {

	@Test
	/**
	 * Test trường hợp số cần tìm nằm đầu tiên
	 */
	public void test1() {
		int a[] = { 1, 2, 3, 4, 5 };
		Number number = new Number();
		assertEquals(1, number.search(1, a));
	}

	@Test
	/**
	 * Test trường hợp số cần tìm nằm chính giữa trong dãy
	 */
	public void test2() {
		int a[] = { 1, 2, 3, 4, 5 };
		Number number = new Number();
		assertEquals(3, number.search(3, a));
	}

	@Test
	/**
	 * Test trường hợp số cần tìm nằm cuối dãy
	 */
	public void test3() {
		int a[] = { 1, 2, 3, 4, 5 };
		Number number = new Number();
		assertEquals(5, number.search(5, a));
	}

	@Test
	/**
	 * Test trường hợp số cần tìm không có trong dãy
	 */
	public void test4() {
		int a[] = { 1, 2, 3, 4, 5 };
		Number number = new Number();
		assertEquals(0, number.search(6, a));
	}

}
