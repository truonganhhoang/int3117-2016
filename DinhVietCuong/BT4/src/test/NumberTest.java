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
	 * Test trường hợp mảng không có phần tử nào
	 */
	public void testArrayWithZeroElement() {
		int a[] = {};
		Number number = new Number();
		assertEquals(0, number.search(1, a));
	}

	@Test
	/**
	 * Test trường hợp mảng có 1 phần tử, khóa tìm kiếm nhỏ hơn phần tử trong
	 * mảng
	 */
	public void testArrayWithOneElementAndKeyLessThanElement() {
		int a[] = { 10 };
		Number number = new Number();
		assertEquals(0, number.search(3, a));
	}

	@Test
	/**
	 * Test trường hợp mảng có 1 phần tử, khóa tìm kiếm lớn hơn phần tử trong
	 * mảng
	 */
	public void testArrayWithOneElementAndKeyGreaterThanElement() {
		int a[] = { 10 };
		Number number = new Number();
		assertEquals(0, number.search(20, a));
	}

	@Test
	/**
	 * Test trường hợp mảng có 1 phần tử, khóa tìm kiếm là phần tử trong mảng
	 */
	public void testArrayWithOneElementAndKeyEqualElement() {
		int a[] = { 10 };
		Number number = new Number();
		assertEquals(1, number.search(10, a));
	}

	@Test
	/**
	 * Trường hợp mảng có nhiều hơn 1 phần tử, khóa tìm kiếm có giá trị nhỏ hơn
	 * phần tử nhỏ nhất
	 */
	public void testArrayWithMoreThanOneElementsAndKeyLessThanTheSmallestElement() {
		int a[] = { 10, 15, 20, 25 };
		Number number = new Number();
		assertEquals(0, number.search(5, a));
	}

	@Test
	/**
	 * Trường hợp mảng có nhiều hơn 1 phần tử, khóa tìm kiếm có giá trị lớn hơn
	 * phần tử lớn nhất
	 */
	public void testArrayWithMoreThanOneElementsAndKeyLessThanTheLargestElement() {
		int a[] = { 10, 15, 20, 25 };
		Number number = new Number();
		assertEquals(0, number.search(30, a));
	}

	@Test
	/**
	 * Trường hợp mảng có nhiều hơn 1 phần tử, khóa tìm kiếm có giá trị nằm giữa
	 * phần tử nhỏ nhất và phần tử lớn nhất, khóa tìm kiếm không có trong mảng
	 */
	public void testArrayWithMoreThanOneElementsAndKeyRandomNotExistInArray() {
		int a[] = { 10, 15, 20, 25 };
		Number number = new Number();
		assertEquals(0, number.search(22, a));
	}

	@Test
	/**
	 * Trường hợp mảng có nhiều hơn 1 phần tử, khóa tìm kiếm là phàn tử cuối
	 * cùng
	 */
	public void testArrayWithMoreThanOneElementsAndKeyIsTheLargestElement() {
		int a[] = { 10, 15, 20, 25 };
		Number number = new Number();
		assertEquals(4, number.search(25, a));
	}

	@Test
	/**
	 * Trường hợp mảng có nhiều hơn 1 phần tử, khóa tìm kiếm là phần tử đầu tiên
	 */
	public void testArrayWithMoreThanOneElementsAndKeyIsTheSmallestElement() {
		int a[] = { 10, 15, 20, 25 };
		Number number = new Number();
		assertEquals(1, number.search(10, a));
	}

	@Test
	/**
	 * Trường hợp mảng có nhiều hơn 1 phần tử, khóa tìm kiếm có trong mảng ở vị
	 * trí bất kì, không phải lớn nhất cũng không phải nhỏ nhất
	 */
	public void testArrayWithMoreThanOneElementsAndKeyRandomExistInArray() {
		int a[] = { 10, 15, 20, 25 };
		Number number = new Number();
		assertEquals(2, number.search(15, a));
	}
}
