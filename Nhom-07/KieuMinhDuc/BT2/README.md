# KTPM2016
Bài tập môn kiểm thử phần mềm 2016

## Thông tin
```
Họ và tên : Kiều Minh Đức 
Mã sinh viên : 13020121
```
## Bài tập 2
```
1. Bài toán
   Tìm các số chia hết cho 4 và ko chia hết cho 100 hoặc có thể chia hết cho 400 ( tương tự như năm nhuận ).
```
2. Hàm cần kiểm thử
```java
public boolean isLeapNumber(int n ){
	if ( ( n % 4 == 0 ) && ( n % 100 != 0) || ( n % 400 == 0 ) ){		// if ( ( a && b) || c)
		return true;			
	}else{
		return false;
	}
}
```
```
2. Tìm ca kiểm thử

   Ta có bảng các ca kiểm thử có thể có với điều kiện của bài toán : if ( a and b ) or c 
```
   ![1](http://i.imgur.com/pGHVIFK.png)
```
   Áp dụng kỹ thuật MC/DC để tìm ra các ca kiểm thử quan trọng.
```
   ![2](http://i.imgur.com/YpY1F9H.png)	

```
3. Kết quả .
   Test Coverage Result :
   
```
   ![1](http://i.imgur.com/JRToeot.png)
