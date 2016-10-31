import static org.junit.Assert.*;

import org.junit.Test;

public class TestMinClass {
	MinClass minClass = new MinClass();

	// Test gia tri nho nhat
	@Test
	public void testFindMin1() {
		int arr[] = { 1, 3, 5, -2, 9, 4, 2, 100, 0, -2147483648 };
		assertEquals(Integer.MIN_VALUE, minClass.findMin(arr));
	}

	// Test ngay tren gia tri nho nhat
	@Test
	public void testFindMin2() {
		int arr[] = { 1, 3, 5, -2, 9, 4, 2, 100, 0, -2147483647 };
		assertEquals(Integer.MIN_VALUE + 1, minClass.findMin(arr));
	}

	// Test gia tri binh thuong
	@Test
	public void testFindMin3() {
		int arr[] = { 1, 3, 5, -2, 9, 4, 2, 100, 0, -9 };
		assertEquals(-9, minClass.findMin(arr));
	}

	// Test ngay duoi gia tri lon nhat
	@Test
	public void testFindMin4() {
		int arr[] = { 1, 3, 5, -2, 9, 4, 2, 100, 0, 2147483646 };
		assertEquals(-2, minClass.findMin(arr));
	}

	// Test gia tri lon nhat
	@Test
	public void testFindMin5() {
		int arr[] = { 1, 3, 5, -2, 9, 4, 2, 100, 0, 2147483647 };
		assertEquals(-2, minClass.findMin(arr));
	}
}
