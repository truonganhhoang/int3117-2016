package KiemThu;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAllDuPath {

	SoDienThoai soDienThoai = new SoDienThoai();
	@Test
	public void test0() {
		String s= "0906130$895";
		String expResult= "Khong phai la mot so dien thoai hop le";
		String result = soDienThoai.ktraSDT(s);
		assertTrue(expResult==result);
	}
	
	@Test
	public void test1() {
		String s= "9061308956";
		String expResult= "Khong phai la mot so dien thoai hop le";
		String result = soDienThoai.ktraSDT(s);
		assertTrue(expResult==result);
	}
	
	@Test
	public void test2() {
		String s= "090613089v";
		String expResult= "Khong phai la mot so dien thoai hop le";
		String result = soDienThoai.ktraSDT(s);
		assertTrue(expResult==result);
	}
	
	@Test
	public void test3() {
		String s= "0906130895";
		String expResult= "La mot so dien thoai hop le";
		String result = soDienThoai.ktraSDT(s);
		assertTrue(expResult==result);
	}
	
	@Test
	public void test4() {
		String s= "09061v30%89";
		String expResult= "Khong phai la mot so dien thoai hop le";
		String result = soDienThoai.ktraSDT(s);
		assertTrue(expResult==result);
	}
}
