package test;

import static org.junit.Assert.*;

import org.junit.Test;

import baitap2.tue.Function;

public class TestFunction {

	@Test
	public void testCase1() {
		Function func = new Function();
		int[] mang ={2,-1};
		int a=func.TinhTong(mang);
		assertEquals(2, a);
	}
	
	@Test
	public void testCase2() {
		Function func = new Function();
		int[] mang ={2,-2};
		int a=func.TinhTong(mang);
		assertEquals(1, a);
	}
	
	@Test
	public void testCase3() {
		Function func = new Function();
		int[] mang ={2,3};
		int a=func.TinhTong(mang);
		assertEquals(2, a);
	}
	
	@Test
	public void testCase4() {
		Function func = new Function();
		int[] mang ={};
		int a=func.TinhTong(mang);
		assertEquals(0, a);
	}
	
	@Test
	public void testCase5() {
		Function func = new Function();
		int[] mang ={0,-2,-1};
		int a=func.TinhTong(mang);
		assertEquals(1, a);
	}
	
	@Test
	public void testCase6() {
		Function func = new Function();
		int[] mang ={0,-2};
		int a=func.TinhTong(mang);
		assertEquals(0, a);
	}

}
