# Bài tập 3

## Mô tả bài toán
 - Cho một số nguyên có ít nhất 5 chữ số.
   Trả về true nếu: tổng các chữ số là số chẵn và chia hết cho 3 hoặc 5.


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

## Tìm DU-Path cho từng biến
![alt text](https://github.com/tumv58/int3117-2016/blob/master/MaVanTu/BT3/FlowGraph/tong.PNG)
![alt text](https://github.com/tumv58/int3117-2016/blob/master/MaVanTu/BT3/FlowGraph/result.PNG)
![alt text](https://github.com/tumv58/int3117-2016/blob/master/MaVanTu/BT3/FlowGraph/i.PNG)

## Các ca kiểm thử
  - Cho biến i: N = 456, output: false
  - Cho biến tong va result: N = 45678, output: true

## Unit Test
```java
public class TestClass {
	Class cl = new Class();

	// voi bien i
	@Test
	public void testCase0() {
		assertEquals(false, cl.ham(456));
	}

	// voi bien tong va result
	@Test
	public void testCase1() {
		assertEquals(true, cl.ham(45678));
	}
}
```

## Kết quả
![alt text](https://github.com/tumv58/int3117-2016/blob/master/MaVanTu/BT3/TestResult/result.PNG)
### Coverage
![alt text](https://github.com/tumv58/int3117-2016/blob/master/MaVanTu/BT3/TestResult/coverage.PNG)

## So sánh với MCDC và nhận xét
- All-DU-Path cần số lượng test-case ít hơn, thực hiện đơn giản hơn.
- Với các điều kiện phức hợp All-DU-Path không chặt chẽ bằng MCDC, do đó test coverage có thể không bằng 100%.