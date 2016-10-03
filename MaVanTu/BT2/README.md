# Bài tập 2

## Mô tả bài toán
 - Cho một số nguyên có ít nhất 5 chữ số.
   Trả về true nếu: tổng các chữ số là số chẵn và chia hết cho 3 hoặc 5.


## Yêu cầu
 - Java SDK 1.8
 - Maven
 - Eclipse IDE
 - TestNG Plugin
## Bộ ca kiểm thử
Test Case	Tổng là số chẵn		Tổng chia hết cho 3		Tổng chia hết cho 5		Output		  N
1			True				True					True				True		45678
2			True				True					False				True		456786
3			True				False					True				True		88888
4			True				False					False				False		68888
5			False				True					True				False		688869
6			False				True					False				False		688883
7			False				False					True				False		68885
8			False				False					False				False		688861
