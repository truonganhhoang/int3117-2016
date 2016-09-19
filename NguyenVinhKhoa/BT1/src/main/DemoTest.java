package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

	@Test
	public void testCase1() {
		int[] array = {1, -3, -5, 2, -4};
		Demo d = new Demo(array);
		assertEquals(2, d.findMax());
	}
	
	@Test
	public void testCase2() {
		int[] array = {6, 3, -5, -2, 4};
		Demo d = new Demo(array);
		assertEquals(6, d.findMax());
	}
	
	@Test
	public void testCase3() {
		int[] array = {1, -3, 5, 2, 8};
		Demo d = new Demo(array);
		assertEquals(8, d.findMax());
	}
	
	@Test
	public void testCase4() {
		int[] array = {7, 5, 2, 4, 1};
		Demo d = new Demo(array);
		assertEquals(1, d.findMin());
	}
	
	@Test
	public void testCase5() {
		int[] array = {-5, 5, 2, 4, 1};
		Demo d = new Demo(array);
		assertEquals(-5, d.findMin());
	}
	
	@Test
	public void testCase6() {
		int[] array = {7, 5, 0, 4, 1};
		Demo d = new Demo(array);
		assertEquals(0, d.findMin());
	}
}
