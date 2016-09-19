package pkDemo;

import static org.junit.Assert.*;

public class Test {
	@org.junit.Test
	public void test1() {
		DemoTest temp = new DemoTest();
		int arr[] = {};
		int i = temp.findMin(arr);
		assertEquals(0,i);
	}
	
	@org.junit.Test
	public void test2() {
		DemoTest temp = new DemoTest();
		int arr[] = {-3,9,100};
		int i = temp.findMin(arr);
		assertEquals(0,i);
	}
	
	@org.junit.Test
	public void test3() {
		DemoTest temp = new DemoTest();
		int arr[] = {-3,49, 23, 100};
		int i = temp.findMin(arr);
		assertEquals(0,i);
	}
	
	@org.junit.Test
	public void test4() {
		DemoTest temp = new DemoTest();
		int arr[] = {49,53,5,98};
		int i = temp.findMin(arr);
		assertEquals(2,i);
	}
	
	@org.junit.Test
	public void test5() {
		DemoTest temp = new DemoTest();
		int arr[] = {49,55,5,98};
		int i = temp.findMin(arr);
		assertEquals(2,i);
	}
	
	@org.junit.Test
	public void test6() {
		DemoTest temp = new DemoTest();
		int arr[] = {Integer.MAX_VALUE,Integer.MIN_VALUE,10,0,21};
		int i = temp.findMin(arr);
		assertEquals(2,i);
	}
	
	@org.junit.Test
	public void test7() {
		DemoTest temp = new DemoTest();
		int a = Integer.MAX_VALUE+1000;
		int arr[] = {a,18,8,1995};
		int i = temp.findMin(arr);
		assertEquals(0,i);
	}
}
