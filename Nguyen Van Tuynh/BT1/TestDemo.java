package Demo;

import junit.framework.TestCase;


public class TestDemo extends TestCase {
	Practice pr=new Practice();
	public void test1(){
		assertEquals(16, pr.binhphuong(4));
	}
	public void test2(){
		assertTrue(pr.isEven(3));
	}
	int number[]=new int[]{5,10,3,1,45,23,34,6,21,18};
	public void test3(){
		assertEquals(1,pr.smallest(number));
	}
	public void test4(){
		assertEquals(45,pr.largest(number));
	}
}
