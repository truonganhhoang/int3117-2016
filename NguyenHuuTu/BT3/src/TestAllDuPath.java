package BT2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAllDuPath {

	UserName name = new UserName();
	@Test
	public void test0() {
		String s= "nguyen";
		String expResult= "Ok! Ten dang nhap hop le";
		String result = name.test(s);
		assertTrue(expResult==result);
	}
	
	@Test
	public void test1() {
		String s= "n1g2u3y4";
		String expResult= "Ok! Ten dang nhap hop le";
		String result = name.test(s);
		assertTrue(expResult==result);
	}
	
	@Test
	public void test2() {
		String s= "nguyenhuutu";
		String expResult= "Ok! Ten dang nhap hop le";
		String result = name.test(s);
		assertTrue(expResult==result);
	}
	
	@Test
	public void test3() {
		String s= "n#guyen%huu@tu";
		String expResult= "Error! Ten dang nhap khong hop le";
		String result = name.test(s);
		assertTrue(expResult==result);
	}
	
	@Test
	public void test4() {
		String s= "1nguyenhuutu";
		String expResult= "Error! Ten dang nhap khong hop le";
		String result = name.test(s);
		assertTrue(expResult==result);
	}

}
