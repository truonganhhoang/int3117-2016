# Bài tập 2

## Mô tả bài toán
 - Cho một số nguyên có ít nhất 5 chữ số. Trả về true nếu: tổng các chữ số là số chẵn và chia hết cho 3 hoặc 5.

## Yêu cầu
 - Java SDK 1.8
 - Maven
 - Eclipse IDE
 - JUnit 

## Hàm cần kiểm thử
```java
	public boolean ham(int n) {
		int tong = 0;
		int i = 0;
		while (n > 0) {
			tong += n % 10;
			n = n / 10;
			i++;
		}
		boolean result = false;
		// neu n khong du 5 chu so tra ve gia tri false
		if (i < 5)
			return result;
		if ((tong % 3 == 0 || tong % 5 == 0) && tong % 2 == 0) {
			result = true;
		}
		return result;
	}
```

## Bộ ca kiểm thử
![alt text](https://github.com/tumv58/int3117-2016/blob/master/MaVanTu/BT2/TestResult/TestCase.PNG)

## Unit Test
```java
public class TestClass {
	Class cl = new Class();

	// N co so chu so nho hon 5
	@Test
	public void testCase0() {
		assertEquals(false, cl.ham(456));
	}

	// N co so chu so lon hon 5 voi 8 testCase
	@Test
	public void testCase1() {
		assertEquals(true, cl.ham(45678));
	}

	@Test
	public void testCase2() {
		assertEquals(true, cl.ham(456786));
	}

	@Test
	public void testCase3() {
		assertEquals(true, cl.ham(88888));
	}

	@Test
	public void testCase4() {
		assertEquals(false, cl.ham(68888));
	}

	@Test
	public void testCase5() {
		assertEquals(false, cl.ham(688869));
	}

	@Test
	public void testCase6() {
		assertEquals(false, cl.ham(688883));
	}

	@Test
	public void testCase7() {
		assertEquals(false, cl.ham(68885));
	}

	@Test
	public void testCase8() {
		assertEquals(false, cl.ham(688861));
	}
}
```
## Kết quả
![alt text](https://github.com/tumv58/int3117-2016/blob/master/MaVanTu/BT2/TestResult/result.PNG)
### Coverage
![alt text](https://github.com/tumv58/int3117-2016/blob/master/MaVanTu/BT2/TestResult/coverage.PNG)