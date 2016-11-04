package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisibleTest {

	@Test
	public void testDivisibleBy2And4NotBy3() {
		Range range = new Range(17, 17);
		boolean actual = range.isDivisible();
		assertEquals(true, actual);
	}
	
	@Test
	public void testDivisibleBy2NotBy3And4() {
		Range range = new Range(2, 7);
		boolean actual = range.isDivisible();
		assertEquals(false, actual);
	}

	@Test
	public void testDivisibleBy2And3NotBy4() {
		Range range = new Range(3, 4);
		boolean actual = range.isDivisible();
		assertEquals(true, actual);
	}
	
	@Test
	public void testDivisibleBy3NotBy2And4() {
		Range range = new Range(5, 8);
		boolean actual = range.isDivisible();
		assertEquals(false, actual);
	}
	
	@Test
	public void testNoForLoop() {
		Range range = new Range(6, 3);
		boolean actual = range.isDivisible();
		assertEquals(false, actual);
	}

}
