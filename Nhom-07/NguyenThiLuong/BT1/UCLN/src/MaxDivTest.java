package Testing;

import static org.junit.Assert.*;

import org.junit.Test;


public class MaxDivTest {
	
	@Test
	public void test1(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(-2, -2);
		 assertEquals(2, output);
	}

	@Test
	public void test2() {
		 MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(0, 0);
		 assertEquals(0, output);
	}

	@Test
	public void test3(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(3, 3);
		 assertEquals(3, output);
	}

	@Test
	public void test4(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(3, 0);
		 assertEquals(3, output);
	}

	@Test
	public void test5(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(3, 2);
		 assertEquals(1, output);
	}

	@Test
	public void test6(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(3, -2);
		 assertEquals(1, output);
	}

	@Test
	public void test7(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(-4, -2);
		 assertEquals(2, output);
	}

	@Test
	public void test8(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(-2, 0);
		 assertEquals(2, output);
	}

	@Test
	public void test9(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(-3, 3);
		 assertEquals(3, output);
	}

}
