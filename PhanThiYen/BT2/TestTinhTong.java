package TestUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.int3117.TinhTong;

public class TestTinhTong {

	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		TinhTong tong = new TinhTong();
		int actual = tong.tinhTong(-1);
		int expected = -1;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		TinhTong tong = new TinhTong();
		int actual = tong.tinhTong(0);
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test3() {
		TinhTong tong = new TinhTong();
		int actual = tong.tinhTong(4);
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test4() {
		TinhTong tong = new TinhTong();
		int actual = tong.tinhTong(10);
		int expected = 10;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test5() {
		TinhTong tong = new TinhTong();
		int actual = tong.tinhTong(100);
		int expected = 550;
		Assert.assertEquals(expected, actual);
	}

}
