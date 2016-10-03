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
	public void kiemTraSo21(){
		boolean n = ts.kiemTraSo(21);
		assertEquals(true, n);
	}
	@Test
	public void kiemTraSo3(){
		boolean n = ts.kiemTraSo(3);
		assertEquals(false, n);
	}
	@Test
	public void kiemTraSo35(){
		boolean n = ts.kiemTraSo(35);
		assertEquals(true, n);
	}
	@Test
	public void kiemTraSo25(){
		boolean n = ts.kiemTraSo(25);
		assertEquals(false, n);
	}
	@Test
	public void kiemTraSo14(){
		boolean n = ts.kiemTraSo(14);
		assertEquals(true, n);
	}
	@Test
	public void kiemTraSo11(){
		boolean n = ts.kiemTraSo(11);
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
	@Test
	public void tim1001(){
		lst = ts.tim(1001);
		List<Integer> n = new ArrayList<Integer>();
		assertEquals(n, lst);
		
	}
	@Test
	public void timAm1(){
		lst = ts.tim(-1);
		List<Integer> n = new ArrayList<Integer>();
		assertEquals(n, lst);
	}
}
