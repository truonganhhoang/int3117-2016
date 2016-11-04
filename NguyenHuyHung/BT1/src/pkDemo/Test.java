package pkDemo;

import static org.junit.Assert.*;

public class Test {
	@org.junit.Test
	public void testEmptyArray() {
		DemoTest demoTest = new DemoTest();
		int arr[] = {};
		int count = demoTest.countEvent(arr);
		assertEquals(0,count);
	}
	
	@org.junit.Test
	public void testNumberOutside() {
		DemoTest demoTest = new DemoTest();
		int arr[] = {-3,9,100};
		int count = demoTest.countEvent(arr);
		assertEquals(0,count);
	}
	
	@org.junit.Test
	public void testUnitsGreaterTens() {
		DemoTest demoTest = new DemoTest();
		int arr[] = {-3,49, 23, 100};
		int count = demoTest.countEvent(arr);
		assertEquals(0,count);
	}
	
	@org.junit.Test
	public void testTensGreaterUnits() {
		DemoTest demoTest = new DemoTest();
		int arr[] = {49,53,5,98};
		int count = demoTest.countEvent(arr);
		assertEquals(2,count);
	}
	
	@org.junit.Test
	public void testTensEqualUnits() {
		DemoTest demoTest = new DemoTest();
		int arr[] = {49,55,5,98};
		int count = demoTest.countEvent(arr);
		assertEquals(2,count);
	}
	
	@org.junit.Test
	public void testMaxMinValue() {
		DemoTest demoTest = new DemoTest();
		int arr[] = {Integer.MAX_VALUE,Integer.MIN_VALUE,10,0,21};
		int count = demoTest.countEvent(arr);
		assertEquals(2,count);
	}
	
	@org.junit.Test
	public void testOutsideValue() {
		DemoTest demoTest = new DemoTest();
		int a = Integer.MAX_VALUE+1000;
		int arr[] = {a,18,8,1995};
		int count = demoTest.countEvent(arr);
		assertEquals(0,count);
	}
}
