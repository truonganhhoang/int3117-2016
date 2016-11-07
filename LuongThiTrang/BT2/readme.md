#Bài toán kiểm tra năm nhuận

##Mô tả

* Chương trình viết bằng java.
* Thuật toán: Năm nhuận là năm chia hết cho 4 và không chia hết cho 100 hoặc 400.

##Hàm nhập 
* inputYear(int year)

![](https://github.com/huyendtt58/int3117-2016/blob/master/LuongThiTrang/BT2/src/leapYear/inputYear.PNG)

##Hàm kiểm tra
* checkYear(int year)

![](https://github.com/huyendtt58/int3117-2016/blob/master/LuongThiTrang/BT2/src/leapYear/checkYear.PNG)

##Không áp dụng tiêu chuẩn MCDC
Điều kiện (year%4==0 && year%100!=0) || year%400==0 ~ (C1&&C2)||C3

	| No | C1 | C2 | C3 | (C1&&C2)||C3 |
	|:---|:---|:---|:---|-------------:|
	| 1  | T  | T  | T  | T            |
	| 2  | T  | T  | F  | T            |
	| 3  | T  | F  | T  | T            |
	| 4  | T  | F  | F  | F            |
	| 5  | F  | T  | T  | T            |
	| 6  | F  | F  | T  | T            |
	| 7  | F  | T  | F  | F            |
	| 8  | F  | F  | F  | F            |

#Áp dụng tiêu chuẩn MCDC

	| No | C1 | C2 | C3 | (C1&&C2)||C3 |
	|:---|:---|:---|:---|-------------:|
	| 1  | T  | T  | T  | T            |
	| 2  | T  | T  | F  | T            |
	| 3  | T  | F  | F  | F            |
	| 4  | F  | F  | F  | F            |

*Nhận xét:* áp dụng tiêu chuẩn MCDC rút dọn được 4 test case ( loại bỏ được test case 3,5,6,7)

##Test Case và Kết quả Test

![](https://github.com/huyendtt58/int3117-2016/blob/master/LuongThiTrang/BT2/TestCase_KetQuaTest.PNG)
