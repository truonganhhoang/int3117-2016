package UnitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.uet.int3117.MyStack;

public class TestMyStack {

	static MyStack myStack;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		myStack = new MyStack();
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
	public void testPushNhapVaoMotSoCoGiaTri() {
		int actual = myStack.push(10);
		int expected = 10;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testPushLaNull() {
		int actual = myStack.push(null);
		int expected = -1;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testPushVoiSoGioiHanDuong() {
		int actual = myStack.push(2147483647);
		int expected = 2147483647;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testPushVoiSoGioiHanAm() {
		int actual = myStack.push(-2147483647);
		int expected = -2147483647;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testPopVoiStackRong() {
		int actual = myStack.pop();
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testPopVoiStackKhacRong() {
		myStack.push(3);
		int actual = myStack.pop();
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testGetVoiStackRong() {
		int actual = myStack.get(0);
		int expected = -1;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testGetVoiIndexLonHonSize() {
		myStack.push(5);
		int actual = myStack.get(1);
		int expected = -1;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testGetVoiIndexLaSoAm() {
		myStack.push(5);
		int actual = myStack.get(-2);
		int expected = -1;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testGetTHKhac() {
		myStack.push(5);
		int actual = myStack.get(0);
		int expected = 5;
		Assert.assertEquals(expected, actual);
	}

}
