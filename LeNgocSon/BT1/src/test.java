import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test1() {
		int n = 10;
		int i = baitap1.BinhPhuong(n);
		assertEquals(100, i);
		
	}
	@Test
	public void test2() {
		int n = 11;
		int i = baitap1.BinhPhuong(n);
		assertEquals(121, i);
		
	}
	
	@Test
	public void test3() {
		int n = 20;
		int i = baitap1.BinhPhuong(n);
		assertEquals(400, i);	
	}
	
	@Test
	public void test4() {
		int n = 99;
		int i = baitap1.BinhPhuong(n);
		assertEquals(9801, i);	
	}
	
	@Test
	public void test5() {
		int n = 100;
		int i = baitap1.BinhPhuong(n);
		assertEquals(10000, i);	
	}
	
	@Test
	public void test6() {
		int n = 9;
		int i = baitap1.BinhPhuong(n);
		assertEquals(0, i);	
	}
	
	@Test
	public void test7() {
		int n = 101;
		int i = baitap1.BinhPhuong(n);
		assertEquals(0, i);	
	}

}
