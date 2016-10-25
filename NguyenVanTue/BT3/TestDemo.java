package test;

import static org.junit.Assert.*;

import org.junit.Test;

import baitaptuan1.Demo;

public class TestDemo {

	@Test
	public void testDemSoLe1() {
		Demo demo = new Demo();
		int[] mang={-2,2,4,-8};
		int a=demo.DemSoLe(mang);
		assertEquals(0, a);
	}
	
	@Test
	public void testDemSoLe2() {
		Demo demo = new Demo();
		int[] mang={-1,2,3,5,-6,-8};
		int a=demo.DemSoLe(mang);
		assertEquals(3, a);
	}
	
	@Test
	public void testDemSoLe3() {
		Demo demo = new Demo();
		int[] mang={1,2,3,5,8};
		int a=demo.DemSoLe(mang);
		assertEquals(3, a);
	}
	
	@Test
	public void testDemSoLe4() {
		Demo demo = new Demo();
		int[] mang={2,4,6,8};
		int a=demo.DemSoLe(mang);
		assertEquals(0, a);
	}
	
	@Test
	public void testDemSoLe5() {
		Demo demo = new Demo();
		int[] mang={};
		int a=demo.DemSoLe(mang);
		assertEquals(0, a);
	}
}	
