package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisibleTest {

	@Test
	public void testDataFlowSumDivisibleBy2() {
		Range range = new Range(2, 7);
		boolean actual = range.isDivisible();
		assertEquals(false, actual);
	}

	@Test
	public void testDataFlowSumNotDivisibleBy2() {
		Range range = new Range(5, 8);
		boolean actual = range.isDivisible();
		assertEquals(false, actual);
	}

}
