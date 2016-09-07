package Test2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNumbers {
// 2 so lon nhat khac nhau
	@Test
	public void test1() {
		MaxTwoNumbers testnumbers=new MaxTwoNumbers();
		int a[]={1,3,4,2,3,53};
		String result= testnumbers.TwoMax(a,6);
		assertEquals("53 4", result);
	}
// 2 so lon nhat bang nhau
	@Test
	public void test2() {
		MaxTwoNumbers testnumbers=new MaxTwoNumbers();
		int a[]={1,3,5,2,3,5};
		String result= testnumbers.TwoMax(a,6);
		assertEquals("5 5", result);
	}
// day so chua so am	
	@Test
	public void test3() {
		MaxTwoNumbers testnumbers=new MaxTwoNumbers();
		int a[]={1,-3,-4,-1,-4,-6};
		String result= testnumbers.TwoMax(a,6);
		assertEquals("1 -1", result);
	}
// day so chua cac so bang nhau
	@Test
	public void test4() {
		MaxTwoNumbers testnumbers=new MaxTwoNumbers();
		int a[]={1,1,1,1,1,1};
		String result= testnumbers.TwoMax(a,6);
		assertEquals("1 1", result);
	}
  
}
