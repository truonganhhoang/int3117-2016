import static org.junit.Assert.*;

import org.junit.Test;

public class TestDemo {

	@Test
	public void testNormalNumber1() {
		assertEquals(CheckPrime.isPrime(13), true);
	}
	
	@Test
	public void testNormalNumber2() {
		assertEquals(CheckPrime.isPrime(20), false);
	}
	
	@Test
	public void testNegativeNumber() {
		assertEquals(CheckPrime.isPrime(-3), false);
	}
	
	@Test
	public void testNumberZero() {
		assertEquals(CheckPrime.isPrime(0), false);
	}
	
	@Test
	public void testNumberOne() {
		assertEquals(CheckPrime.isPrime(1), false);
	}
	
	@Test
	public void testNumberTwo() {
		assertEquals(CheckPrime.isPrime(2), true);
	}
}
