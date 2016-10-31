package thangpvt58;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	
	/* Kiem tra co la tam giac hay khong */
	
	@Test
	public void test1() {
		Triangle A = new Triangle();
		boolean result = A.not(5,4,3);
		assertEquals(true, result);
		
	}
	
	/* BT3: Kiem tra bien */

	
	@Test
	public void test2() {
		Triangle A = new Triangle();
		boolean result = A.not(1,1,1);
		assertEquals(false, result);
		
	}
	
	@Test
	public void test3() {
		Triangle A = new Triangle();
		boolean result = A.not(0,0,0);
		assertEquals(false, result);
		
	}
	
	@Test
	public void test4() {
		Triangle A = new Triangle();
		boolean result = A.not(99,99,99);
		assertEquals(false, result);
		
	}
	
	@Test
	public void test5() {
		Triangle A = new Triangle();
		boolean result = A.not(1,0,0);
		assertEquals(false, result);
		
	}
	
	@Test
	public void test6() {
		Triangle A = new Triangle();
		boolean result = A.not(1,1,0);
		assertEquals(false, result);
		
	}
	
	@Test
	public void test7() {
		Triangle A = new Triangle();
		boolean result = A.not(0,0,1);
		assertEquals(false, result);
		
	}
	
	@Test
	public void test8() {
		Triangle A = new Triangle();
		boolean result = A.not(1,0,1);
		assertEquals(false, result);
		
	}
	
}
