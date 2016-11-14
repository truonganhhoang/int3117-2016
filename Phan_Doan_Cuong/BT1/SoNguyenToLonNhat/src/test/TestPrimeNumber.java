package test;

import static org.junit.Assert.*;
import main.Number;

import org.junit.Test;

public class TestPrimeNumber {

	@Test
	/**
	 * input is correct.
	 */
	public void test() {
		Number number = new Number(15);
		int result = number.findPrimeNumberLessThanN();
		assertEquals(result, 13);
	}

	@Test
	/**
	 * input  is the number which is out of bound (input > MAX_INT)
	 */
	public void testNumberIsOutOfBound(){
		Number number = new Number(2147483648L);
		int result = number.findPrimeNumberLessThanN();
		assertEquals(result,0);
	}
	
	@Test
	/**
	 * input is the number of vowels
	 */
	public void testNumberOfVowels(){
		Number number = new Number(-10);
		int result = number.findPrimeNumberLessThanN();
		assertEquals(result,0);
	}
	
	@Test
	/**
	 * input is the first prime number
	 */
	public void testTheFirstPrimeNumber(){
		Number number = new Number(2);
		int result = number.findPrimeNumberLessThanN();
		assertEquals(result,0);
	}
	
	@Test
	/**
	 * 
	 */
	public void testTheSecondPrimeNumber(){
		Number number = new Number(3);
		int result = number.findPrimeNumberLessThanN();
		assertEquals(result,2);
	}
	
}
