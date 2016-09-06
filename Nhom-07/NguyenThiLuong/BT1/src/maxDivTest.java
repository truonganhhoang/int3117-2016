package Testing;

import static org.junit.Assert.*;

import org.junit.Test;


public class MaxDivTest {
	
	@Test
	public void test0(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(0, 0);
		 assertEquals(0, output);
	}

	@Test
	public void test1() {
		 MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(1, 0);
		 assertEquals(1, output);
	}

	@Test
	public void test2(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(-2, 0);
		 assertEquals(2, output);
	}

	@Test
	public void test3(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(10, 0);
		 assertEquals(10, output);
	}

	@Test
	public void test4(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(10, 9);
		 assertEquals(1, output);
	}

	@Test
	public void test5(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(10, 5);
		 assertEquals(5, output);
	}

	@Test
	public void test6(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(10, -1);
		 assertEquals(1, output);
	}

	@Test
	public void test7(){
		MaxDiv test = new MaxDiv();
		 int output = test.maxDiv(-10, -8);
		 assertEquals(2, output);
	}

}
