package pkDemo;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test1() {
		DemoTest temp = new DemoTest();
		int arr[] = {3,40,30};
		int i = temp.findMin(arr);
		assertEquals(2,i);
	}
	
	@org.junit.Test
	public void test2() {
		DemoTest temp = new DemoTest();
		int arr[] = {3,9,100};
		int i = temp.findMin(arr);
		assertEquals(0,i);
	}
	
	@org.junit.Test
	public void test3() {
		DemoTest temp = new DemoTest();
		int arr[] = {3,10,99, 50 , 0};
		int i = temp.findMin(arr);
		assertEquals(3,i);
	}
	
	@org.junit.Test
	public void test4() {
		DemoTest temp = new DemoTest();
		int arr[] = {};
		int i = temp.findMin(arr);
		assertEquals(0,i);
	}
	
	@org.junit.Test
	public void test5() {
		DemoTest temp = new DemoTest();
		int arr[] = {Integer.MAX_VALUE,Integer.MIN_VALUE,10,0,2000};
		int i = temp.findMin(arr);
		assertEquals(1,i);
	}
}
