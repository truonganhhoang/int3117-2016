import static org.junit.Assert.*;

import org.junit.Test;


public class GreatestCommonDivisorTest {
	//test input
	public void inputNotInteger(){
		 GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		 int output = gcd.preprocessData("99999999999999999999999");
		 assertEquals(-1, output);
	}
	public void inputNotNumber(){
		 GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		 int output = gcd.preprocessData("not number");
		 assertEquals(-1, output);
	}
	
	public void inputNumber(){
		 GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		 int output = gcd.preprocessData("10");
		 assertEquals(10, output);
	}
	
	// test Wrap
	public void numbersWrapped(){
		 GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		 String output = gcd.wrap(10, 5);
		 assertEquals("number1 > number2 before wrap", output);
	}
	public void wrapNumber(){
		 GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		 String output = gcd.wrap(10, 5);
		 assertEquals("wrapped", output);
	}
	
	// Test Output
	@Test
	public void doubleNegatives(){
		 GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		 int output = gcd.greatestCommonDivisor("-2", "-2");
		 assertEquals(2, output);
	}

	@Test
	public void doubleZeros() {
		 GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		 int output = gcd.greatestCommonDivisor("0", "0");
		 assertEquals(0, output);
	}

	@Test
	public void doublePositive(){
		 GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		 int output = gcd.greatestCommonDivisor("3", "3");
		 assertEquals(3, output);
	}

	@Test
	public void positiveZero(){
		 GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		 int output = gcd.greatestCommonDivisor("3", "0");
		 assertEquals(3, output);
	}

	@Test
	public void twoPositives(){
		 GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		 int output = gcd.greatestCommonDivisor("3", "6");
		 assertEquals(3, output);	}

	@Test
	public void positiveNegative(){
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		 int output = gcd.greatestCommonDivisor("3", "-2");
		 assertEquals(1, output);
	}

	@Test
	public void twoNegatives(){
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		 int output = gcd.greatestCommonDivisor("-4", "-2");
		 assertEquals(2, output);
	}

	@Test
	public void NegativeZero(){
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		 int output = gcd.greatestCommonDivisor("-2", "0");		 
		 assertEquals(2, output);
	}

	@Test
	public void negativePositive(){
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		 int output = gcd.greatestCommonDivisor("-3", "3");
		 assertEquals(3, output);		 
	}

}
