package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.MyString;

public class MyStringTest {
	MyString myString = new MyString();

	@Test
	/**
	 * test trường hợp xâu là null
	 */
	public void testNull() {
		int result = myString.countLetter(null);
		assertEquals(-1, result);
	}

	@Test
	/**
	 * test trường hợp xâu rỗng
	 */
	public void testEmptyString() {
		int result = myString.countLetter("");
		assertEquals(-1, result);
	}

	@Test
	/**
	 * test trường hợp xâu 1 kí tự là chữ thường
	 */
	public void testStringWithOneCharacterLowerCase() {
		int result = myString.countLetter("a");
		assertEquals(1, result);
	}

	@Test
	/**
	 * test trường hợp xâu 1 kí tự là chữ hoa
	 */
	public void testStringWithOneCharacterUpperCase() {
		int result = myString.countLetter("A");
		assertEquals(1, result);
	}

	@Test
	/**
	 * test trường hợp xâu 1 kí tự không phải là chữ cái
	 */
	public void testStringWithOneCharacter() {
		int result = myString.countLetter("1");
		assertEquals(0, result);
	}

	@Test
	/**
	 * test 1 xâu phức tạp gồm chữ thường, chữ hoa, số, kí tự đặc biệt
	 */
	public void testComplexString() {
		int result = myString.countLetter("  bhd@13./[]~  ?_ABC");
		assertEquals(6, result);
	}

	@Test
	/**
	 * test trường hợp xâu toàn chữ thường
	 */
	public void testStringWithAllCharacterLowerCase() {
		int result = myString.countLetter("abcdefghijkl");
		assertEquals(12, result);
	}

	@Test
	/**
	 * test trường hợp xâu toàn chữ in hoa
	 */
	public void testStringWithAllCharacterUpperCase() {
		int result = myString.countLetter("ABCDEFGHIJKL");
		assertEquals(12, result);
	}

	@Test
	/**
	 * test trường hợp xâu toàn kí tự không phải chữ cái
	 */
	public void testStringWithAllSpacialCharacter() {
		int result = myString.countLetter("_?<>.,12]'=");
		assertEquals(0, result);
	}
}
