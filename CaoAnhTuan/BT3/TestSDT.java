package KiemThu;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestSDT {

	@Test
	public void test0() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("09945909&"), soDienThoai.s2);
	}

	@Test
	public void test1() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("01647471456"), soDienThoai.s2);
	}
	
	@Test
	public void test2() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("01vv3564895"), soDienThoai.s2);
	}
	
	@Test
	public void test3() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("123456"), soDienThoai.s2);
	}
	
	@Test
	public void test4() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("01%23456789"), soDienThoai.s2);
	}
	
	@Test
	public void test5() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("11647471456"), soDienThoai.s2);
	}
	
	@Test
	public void test6() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("01234567895646"), soDienThoai.s2);
	}
}
