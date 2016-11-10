# Bài tập tuần 5

## Mô tả bài toán

- Chương trình kiểm tra một số chia hết cho 2 và 3 hoặc 5 rồi tính tổng các số chia hết cho số đó trong khoảng 0-100

## Code 
```java
package main;
public class TimSo {
	public int specialCalculator(int number) {
		int sum = 0;
		if (number < 0 | number > 100) {
			return 0;
		} else {
			if ((number % 2 == 0 & number % 3 == 0) | number % 5 == 0) {
				int i = 0;
				while (i < 100) {
					if (i % number == 0) {
						sum += i;
					}
					i++;
				}
				return sum;
			}
		}
		return 0;
	}
}

```

## Bộ ca kiểm thử theo tiêu chuẩn MC/DC

Biểu thức điều kiện: (%2=0 AND %3=0) OR %5=0
Không áp dụng MC/DC: Cần 2^3=8 ca kiểm thử tất cả.

Test Case  | %2 = 0 | %3 = 0 | %5=0 | OUTPUT
------------- | ------------- | ------------- | ------------- | -------------
1  | True | True | True | True
2  | True | True | False | True
3  | True | False | True | True
4  | True | False | False | False
5  | False | True | True | True
6  | False | True | False | False
7  | False | False | True | True
8  | False | False | False | False

Áp dụng MC/DC: ta chỉ cần 4 ca kiểm thử 1,5,7,8 để đảm bảo độ bao phủ tương đương việc thực hiện cả 8 ca kiểm thử trên.

## Đo mức độ bao phủ

4 Test case MC/DC:
<img src="https://github.com/hoangbd58/int3117-2016/blob/master/BuiDangHoang/BT2/4TestCase.png"/>
