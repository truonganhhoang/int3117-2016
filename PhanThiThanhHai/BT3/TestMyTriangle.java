package TestUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.uet.int3117.MyTriangle;

public class TestMyTriangle {

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
	public void testNoTamGiac1() {
		MyTriangle myTriangle = new MyTriangle(1, 3, 4);
		int actual = myTriangle.checkTrianle();
		int expected =-1;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testNoTamGiac2() {
		MyTriangle myTriangle = new MyTriangle(0, 3, 4);
		int actual = myTriangle.checkTrianle();
		int expected = -1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testNoTamGiac3() {
		MyTriangle myTriangle = new MyTriangle(-1, 3, 4);
		int actual = myTriangle.checkTrianle();
		int expected = -1;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testTamGiaDeu() {
		MyTriangle myTriangle = new MyTriangle(3, 3, 3);
		int actual = myTriangle.checkTrianle();
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testTamGiaCan() {
		MyTriangle myTriangle = new MyTriangle(3, 3, 4);
		int actual = myTriangle.checkTrianle();
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testTamGiaVuong() {
		MyTriangle myTriangle = new MyTriangle(3, 4, 5);
		int actual = myTriangle.checkTrianle();
		int expected = 4;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testTamGiaVuongCan1() {
		MyTriangle myTriangle = new MyTriangle(10, 10, Math.sqrt(200));
		int actual = myTriangle.checkTrianle();
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testTamGiacBT() {
		MyTriangle myTriangle = new MyTriangle(2, 5, 6);
		int actual = myTriangle.checkTrianle();
		int expected = 5;
		Assert.assertEquals(expected, actual);
	}

}
