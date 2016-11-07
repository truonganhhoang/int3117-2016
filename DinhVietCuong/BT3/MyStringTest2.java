package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.MyString;

public class MyStringTest2 {

	MyString myString = new MyString();

	@Test
	/**
	 * test case 1
	 * test trường hợp xâu là null
	 */
	public void testNull() {
		int result = myString.countLetter(null);
		assertEquals(-1, result);
	}
	
	@Test
	/**
	 * test case 2
	 * test 1 xâu phức tạp gồm chữ thường, chữ hoa, số, kí tự đặc biệt
	 */
	public void testComplexString() {
		int result = myString.countLetter("  abcd123ACb=.-%~`[]\\,'  ");
		assertEquals(8, result);
	}

	@Test
	/**
	 * test case 3
	 * test trường hợp xâu toàn kí tự không phải chữ cái
	 */
	public void testStringWithAllSpacialCharacter() {
		int result = myString.countLetter("   _?<>.,12]'=");
		assertEquals(0, result);
	}
}
