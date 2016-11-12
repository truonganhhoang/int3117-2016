package UnitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.uet.int3117.SoChan;

public class TestSoChan {
	static SoChan soChan;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		soChan = new SoChan();
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
	public void testSoChanRong() throws Exception {
		int values[] = null;
		String actual = soChan.soChan(values);
		String expected = "null";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testSoChan_lengthBangKhong() throws Exception {
		int values[] = new int[0];
		String actual = soChan.soChan(values);
		String expected = "-1";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testSoChan() throws Exception {
		int values[] = { 1, 2, 3, 4, 5, 6 };
		String actual = soChan.soChan(values);
		String expected = "2 4 6";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSoChan0() throws Exception {
		int values[] = { 1, 2, 3, 4, 5, 6, 2147483646, 2147483647 };
		String actual = soChan.soChan(values);
		String expected = "2 4 6 2147483646 ";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSoChan1() throws Exception {
		int values[] = {-2147483647, -2147483648, 1, 2, 3, 4, 5, 6};
		String actual = soChan.soChan(values);
		String expected = "-2147483648 2 4 6 ";
		Assert.assertEquals(expected, actual);
	}
	
	

}
