package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class TinhDiemTest {
	@Test
	public void testA() {
	    assertEquals("A", TinhDiem.PhanLoai(90));
	    assertEquals("A", TinhDiem.PhanLoai(100));
	}

	@Test
	public void testB() {
	    assertEquals("B", TinhDiem.PhanLoai(70));
	    assertEquals("B", TinhDiem.PhanLoai(60));
	}

	@Test
	public void testC() {
	    assertEquals("C", TinhDiem.PhanLoai(50));
	    assertEquals("C", TinhDiem.PhanLoai(58));
	}
	
	@Test
	public void testD() {
	    assertEquals("D", TinhDiem.PhanLoai(40));
	    assertEquals("D", TinhDiem.PhanLoai(45));
	}

	@Test
	public void testF() {
	    assertEquals("F", TinhDiem.PhanLoai(20));
	    assertEquals("F", TinhDiem.PhanLoai(10));
	}
}
