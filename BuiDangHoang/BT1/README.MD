# Báo cáo bài tập về nhà tuần 4

## Mô tả bài toán

- Chương trình đọc một số trong khoảng (0 - 999) bằng tiếng việt không dấu.

```java 
package main;

public class DocSo {
	private String docDonVi(int number, boolean special) {
		String result = "";
		switch (number) {
		case 0:
			result = "khong";
			break;
		case 1:
			result = "mot";
			break;
		case 2:
			result = "hai";
			break;
		case 3:
			result = "ba";
			break;
		case 4:
			result = "bon";
			break;
		case 5:
			if (special)
				result = "lam";
			else
				result = "nam";
			break;
		case 6:
			result = "sau";
			break;
		case 7:
			result = "bay";
			break;
		case 8:
			result = "tam";
			break;
		case 9:
			result = "chin";
			break;
		}
		return result;
	}

	private String docHangChuc(int number) {
		String result = "";
		switch (number) {
		case 1:
			result = "muoi";
			break;
		case 2:
			result = "hai muoi";
			break;
		case 3:
			result = "ba muoi";
			break;
		case 4:
			result = "bon muoi";
			break;
		case 5:
			result = "nam muoi";
			break;
		case 6:
			result = "sau muoi";
			break;
		case 7:
			result = "bay muoi";
			break;
		case 8:
			result = "tam muoi";
			break;
		case 9:
			result = "chin muoi";
			break;
		}
		return result;
	}

	private String docHangTram(int number) {
		String result = "";
		switch (number) {
		case 1:
			result = "mot tram";
			break;
		case 2:
			result = "hai tram";
			break;
		case 3:
			result = "ba tram";
			break;
		case 4:
			result = "bon tram";
			break;
		case 5:
			result = "nam tram";
			break;
		case 6:
			result = "sau tram";
			break;
		case 7:
			result = "bay tram";
			break;
		case 8:
			result = "tam tram";
			break;
		case 9:
			result = "chin tram";
			break;
		}
		return result;
	}

	public String docSo(int number) {
		String result = "";
		if (number < 0 || number >= 1000) {
			result = "So nam ngoai khoang doc";
		} else {
			if (number / 100 > 0) {
				result += docHangTram(number / 100);
				number = number % 100;

				if (number / 10 > 0 & number != 0) {
					result += " " + docHangChuc(number / 10);
					if (number % 10 != 0)
						result += " " + docDonVi(number % 10, true);
				} else if (number == 0) {
					result += "";
				} else {
					result += " linh " + docDonVi(number, true);
				}
			} else {
				if (number / 10 > 0) {
					result += docHangChuc(number / 10);
					number = number % 10;
					if (number % 10 != 0)
						result += " " + docDonVi(number, true);
				} else {
					result += docDonVi(number, false);
				}
			}
		}
		return result;
	}

}
```


## Refactor

- Refactor tên file
- Refactor tên lớp, tên biến, ký tự trắng, chấm câu, v.v..

## Phương pháp hộp đen đã áp dụng

- Kiểm thử biên mạnh ở các giá trị đặc biệt
- Đây là chương trình đọc một số sang tiếng việt, khả năng lỗi rất cao ở các khoảng chuyển đổi từ số có 1 -> 2 -> 3 chữ số cũng như việc đọc các số đặc biệt ("năm" - "lăm" & "linh").
- Áp dụng kiểm thử biên mạnh sẽ đạt hiệu quả cao.

## Mức độ bao phủ

- Software Testing by JUnit (Eclipse)
- Test Coverage Report by : Ecl Emma Code Coverage Tool (Eclipse)
- Test Coverage Result:
<img src="https://github.com/hoangbd58/int3117-2016/blob/master/BuiDangHoang/BT1/coverage.png"/>

## Đồ thị chương trình

<a href="https://github.com/hoangbd58/int3117-2016/blob/master/BuiDangHoang/BT1/flowChart.pdf">View as PDF</a>
