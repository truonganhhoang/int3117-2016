package Testing;

import static org.junit.Assert.*;

import org.junit.Test;


public class MaxDivTest {
	
	@Test
	public void doubleNegatives(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(-2, -2);
		 assertEquals(2, output);
	}

	@Test
	public void doubleZeros() {
		 MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(0, 0);
		 assertEquals(0, output);
	}

	@Test
	public void doublePositive(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(3, 3);
		 assertEquals(3, output);
	}

	@Test
	public void positiveZero(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(3, 0);
		 assertEquals(3, output);
	}

	@Test
	public void twoPositives(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(3, 2);
		 assertEquals(1, output);
	}

	@Test
	public void positiveNegative(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(3, -2);
		 assertEquals(1, output);
	}

	@Test
	public void twoNegatives(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(-4, -2);
		 assertEquals(2, output);
	}

	@Test
	public void NegativeZero(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(-2, 0);
		 assertEquals(2, output);
	}

	@Test
	public void negativePositive(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(-3, 3);
		 assertEquals(3, output);
	}

}
