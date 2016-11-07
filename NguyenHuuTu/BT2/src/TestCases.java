package BT2;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCases {
	
	UserName name = new UserName();
	@Test
	public void test0() {
		String s= "nht";
		String expResult= "Error! Ten dang nhap khong hop le";
		String result = name.test(s);
		assertFalse(expResult==result);
	}
	
	@Test
	public void test1() {
		String s= "1nhtu08051995";
		String expResult= "Error! Ten dang nhap khong hop le";
		String result = name.test(s);
		assertFalse(expResult==result);
	}
	
	@Test
	public void test2() {
		String s= "n123456789";
		String expResult= "Ok! Ten dang nhap hop le";
		String result = name.test(s);
		assertTrue(expResult==result);
	}
	
	@Test
	public void test3() {
		String s= "nGUYENHUUTU";
		String expResult= "Ok! Ten dang nhap hop le";
		String result = name.test(s);
		assertTrue(expResult==result);
	}
	
	@Test
	public void test4() {
		String s= "nguyenhuutu";
		String expResult= "Ok! Ten dang nhap hop le";
		String result = name.test(s);
		assertTrue(expResult==result);
	}
	
	@Test
	public void test5() {
		String s= "n#$%h&&t(";
		String expResult= "Error! Ten dang nhap khong hop le";
		String result = name.test(s);
		assertFalse(expResult==result);
	}
	
}
