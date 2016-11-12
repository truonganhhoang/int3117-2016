package KiemThu;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestAllDuPath {
	@Test
	public void test0() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("0906130$895"), soDienThoai.s2);
	}

	@Test
	public void test1() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("9061308956"), soDienThoai.s2);
	}
	
	@Test
	public void test2() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("090613089v"), soDienThoai.s2);
	}
	
	@Test
	public void test3() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("0906130895"), soDienThoai.s2);
	}
	
	@Test
	public void test4() {
		SoDienThoai soDienThoai = new SoDienThoai();
		Assert.assertEquals(soDienThoai.ktraSDT("09061v30%89"), soDienThoai.s2);
	}
}
