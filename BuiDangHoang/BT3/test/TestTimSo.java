package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.TimSo;

public class TestTimSo {
	TimSo ts = new TimSo();
	List<Integer> lst = new ArrayList<Integer>();
	
	@Test
	public void kiemTraSo105() {
		boolean n = ts.kiemTraSo(105);
		assertEquals(true, n);
	}
	@Test
	public void kiemTraSo15(){
		boolean n = ts.kiemTraSo(15);
		assertEquals(true, n);
	}
	@Test
	public void kiemTraSo7(){
		boolean n = ts.kiemTraSo(7);
		assertEquals(true, n);
	}
	@Test
	public void kiemTraSo1(){
		boolean n = ts.kiemTraSo(1);
		assertEquals(false, n);
	}
	
	@Test
	public void kiemTraSoAm1(){
		boolean n = ts.kiemTraSo(-1);
		assertEquals(false,n);
	}
	@Test
	public void kiemtraSo1001(){
		boolean n = ts.kiemTraSo(1001);
		assertEquals(false, n);
	}

}
