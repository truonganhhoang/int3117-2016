# Bài tập tuần 7

## Mô tả bài toán

- Chương trình tìm số chia hết cho 3 và 5 hoặc 7 trong khoảng 0-1000

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


## Đồ thị chương trình
<img src="https://github.com/hoangbd58/int3117-2016/blob/master/BuiDangHoang/BT3/dothi.png" />

## Kiểm thử áp dụng All-DU-Path

### All-DU-Path của number : 

- 1-2-3-4-5-6-7-8-13-14-15-16
- 1-2-3-4-5-6-7-9-10-11-12-13-14-15-16
- 1-2-3-4-5-6-7-9-10-13-14-15-16

## Nhận xét
- Cả All-DU-Path và MCDC đều cho độ bao phủ như nhau
- Thực hiện All-Du-Path phức tạp hơn với những bài toán có nhiều biến
