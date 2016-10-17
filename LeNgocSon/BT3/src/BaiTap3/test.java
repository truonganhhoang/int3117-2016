package BaiTap3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test {
	@Test
	public void test1() {
		int a[] = {-3, 2};
		int i = baitap3.TinhTong(a);
		assertEquals(-1, i);
		
	}
	
	@Test
	public void test2() {
		int a[] = {-2, 4};
		int i = baitap3.TinhTong(a);
		assertEquals(4, i);
		
	}
	
	@Test
	public void test3() {
		int a[] = {-3, 3};
		int i = baitap3.TinhTong(a);
		assertEquals(-3, i);
		
	}
	
	@Test
	public void test4() {
		int a[] = {-2, 3};
		int i = baitap3.TinhTong(a);
		assertEquals(0, i);
		
	}
}
