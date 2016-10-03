package pkdm;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Ngoc Anh
 */
public class TestDaoNguoc {

	/**
	 * Test main method, class SoDaoNguoc
	 */
	@Test
	public void TestSoDaoNguoc() {
		SoDaoNguoc num = new SoDaoNguoc();
		int n = 212;
        int expected = 212;
        int result = num.DaoNguocSo(n);
        assertEquals(expected, result);
    }
	@Test
	public void TestSoDaoNguoc1() {
		SoDaoNguoc num = new SoDaoNguoc();
		int n = 123;
        int expected = 321;
        int result = num.DaoNguocSo(n);
        assertEquals(expected, result);
    }
	@Test
	public void TestSoDaoNguoc2() {
		SoDaoNguoc num = new SoDaoNguoc();
		int n = -2147483648;
        int expected = -8463847412;
        int result = num.DaoNguocSo(n);
        assertEquals(expected, result);
    }
	@Test
	public void TestSoDaoNguoc3() {
		SoDaoNguoc num = new SoDaoNguoc();
		int n = -2147483647;
        int expected = -7463847412;
        int result = num.DaoNguocSo(n);
        assertEquals(expected, result);
    }
	@Test
	public void TestSoDaoNguoc4() {
		SoDaoNguoc num = new SoDaoNguoc();
		int n = 0;
        int expected = 0;
        int result = num.DaoNguocSo(n);
        assertEquals(expected, result);
    }
	@Test
	public void TestSoDaoNguoc5() {
		SoDaoNguoc num = new SoDaoNguoc();
		int n = -1;
        int expected = -1;
        int result = num.DaoNguocSo(n);
        assertEquals(expected, result);
    }
	@Test
	public void TestSoDaoNguoc6() {
		SoDaoNguoc num = new SoDaoNguoc();
		int n = 2147483646;
        int expected = 6463847412;
        int result = num.DaoNguocSo(n);
        assertEquals(expected, result);
    }
	@Test
	public void TestSoDaoNguoc7() {
		SoDaoNguoc num = new SoDaoNguoc();
		int n = 2147483647;
        int expected = 7463847412;
        int result = num.DaoNguocSo(n);
        assertEquals(expected, result);
    }
}
