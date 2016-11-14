
## BÀI TẬP 1:
## Mô tả bài toán:
 * Tìm số lượng ước của một số n cho trước.
 * Input: là một số nguyên n.
 * Output: là số lượng các ước của số n.

## Phương thức cần kiểm thử:

```java
public static int timSoLuongUoc(int number) {
		if (number < 1) return 0;
		
		int soLuongUoc = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) soLuongUoc++;
		}
		return soLuongUoc;
	}

```

## Kỹ thuật kiểm thử: Kiểm thử biên
 * kỹ thuật kiểm thử biên giúp rà soát hết các trường hợp kiểm thử cho chương trình ưu thế so với các kỹ thuật khác
 * kỹ thuật kiểm thử lớp tương đương không thể hiện ưu thế vì chương trình không có các lớp output
 * kỹ thuật kiểm thử bảng quyết định không sử dụng được vì chương trình có output trải dài vô hạn.

## Unit Test cho các ca kiểm thử

```java
	@Test
	public void testTimSoUoc() {
		Assert.assertEquals(1, Estimates.timSoLuongUoc(1));
		Assert.assertEquals(2, Estimates.timSoLuongUoc(2));
		Assert.assertEquals(3, Estimates.timSoLuongUoc(9));
		Assert.assertEquals(4, Estimates.timSoLuongUoc(10));
	}
	
	@Test
	public void testTimSoUocAdvance() {
		Assert.assertEquals(0, Estimates.timSoLuongUoc(-2));
		Assert.assertEquals(0, Estimates.timSoLuongUoc(-1));
		Assert.assertEquals(0, Estimates.timSoLuongUoc(0));
		Assert.assertEquals(1, Estimates.timSoLuongUoc(1));
		Assert.assertEquals(2, Estimates.timSoLuongUoc(2));
		Assert.assertEquals(3, Estimates.timSoLuongUoc(9));
		Assert.assertEquals(4, Estimates.timSoLuongUoc(10));
	}
```
## Kết quả: BT1/BT1 - test result.png
![co_incode](https://github.com/ducanhk58uet/int3117-2016/blob/master/VuManhTien/BT1/BT1%20-%20test%20result.png)
## Sơ đồ khối: BT1/BT1 - flowchart draw.io
![co_incode](https://github.com/ducanhk58uet/int3117-2016/blob/master/VuManhTien/BT1/BT1%20-%20%20flowchart%20-%20draw.io.png)

## Cải thiện: 
 * chương trình được kiểm tra kỹ hơn khi áp dụng kỹ thuật kiểm thử biên
 * trước: chỉ tập trung vào các số tự nhiên theo cảm tính
 * sau: mở rộng test cho các số 0 và số nguyên âm, bao phủ toàn bộ các input hợp lệ.

______________________________________________________________________________________________________________

## BÀI TẬP 2:
## Mô tả bài toán:
* Kiểm tra tính hợp lệ của mật khẩu: có độ dài từ 8 đến 32 kí tự, chỉ chứa chữ thường, chữ hoa và số.
* Input: mật khẩu là chuỗi ký tự (String).
* Ouput: là giá trị true hoặc false.

## Phương thức cần kiểm thử:

```java
	public static boolean check(String pass) {
		
		if (pass.length() < 8 || pass.length() > 32) {
			return false;
		}
		
		for (int i = 0; i < pass.length(); i++) {
			if (!(('0' <= pass.charAt(i) && pass.charAt(i) <= '9')
				|| ('a' <= pass.charAt(i) && pass.charAt(i) <= 'z')
				|| ('A' <= pass.charAt(i) && pass.charAt(i) <= 'Z'))) {
			return false;
			}	
		}
		
		return true;
	 }
```

## Áp dụng tiêu chuẩn MCDC
* Phân tích: ta thấy chương trình trên có 2 vị trí đặt lệnh if 
	* với lệnh if thứ nhất ta có tổ hợp 2 điều kiện con (pass.length() < 8) và (pass.length() > 32)
	* với lệnh if thứ hai ta có tổ hợp 3 điều kiện phức như ở đoạn mã trên.

* Ta có bảng sau:
* C1: (pass.length() < 8)
* C2: (pass.length() > 32)
* C3: ('0' <= pass.charAt(i) && pass.charAt(i) <= '9')
* C4: ('a' <= pass.charAt(i) && pass.charAt(i) <= 'z')
* C5: ('A' <= pass.charAt(i) && pass.charAt(i) <= 'Z')

\#  | C1 | C2 | C3 | C4 | C5 | output
----|----|----|----|----|----|------------
TC1 | T  | -  | -  | -  | -  | F
TC2 | T  | -  | -  | -  | -  | F
TC3 | F  | F  | T  | -  | -  | T
TC4 | F  | F  | -  | T  | -  | T
TC5 | F  | F  | -  | -  | T  | T


## Unit Test cho các ca kiểm thử
```java
	@Test
	public void testShortPassword(){
		Assert.assertFalse(Password.check("1234567"));
		Assert.assertTrue(Password.check("12345678"));
	}
	
	@Test
	public void testLongPassword(){
		Assert.assertFalse(Password.check("123456789012345678901234567890123"));
		Assert.assertTrue(Password.check("12345678901234567890123456789012"));
	}
	
	@Test
	public void testNormalPassword(){
		Assert.assertTrue(Password.check("aaaaaaaaaAAAAAAA1111111"));
	}
	
	@Test
	public void testNormalPassword1(){
		Assert.assertTrue(Password.check("aaaaaaaaaaaaaaaaaaaaaaa"));
	
	}
	
	@Test
	public void testNormalPassword2(){
		Assert.assertTrue(Password.check("AAAAAAAAAAAAAAAAAAAAAAA"));
	}
	
	@Test
	public void testNormalPassword3(){
		Assert.assertTrue(Password.check("11111111111111111111111"));
		Assert.assertTrue(Password.check("aaaaaaaaaAAAAAAA1111111"));
	}
	
	@Test
	public void testSpecialPassword(){
		Assert.assertFalse(Password.check("aaaAAA111@@@"));
	}
```
* Với chương trình này thì dùng bao phủ cạnh đồ thị đường đi cho độ bao phủ tương đương.

## Kết quả: BT2/BT2 - test result.png
![co_incode](https://github.com/ducanhk58uet/int3117-2016/blob/master/VuManhTien/BT2/BT2%20-%20test%20result.png)

## Test Coverage: BT2/BT2 - test coverage.png
![co_incode](https://github.com/ducanhk58uet/int3117-2016/blob/master/VuManhTien/BT2/BT2%20-%20test%20coverage.png)

______________________________________________________________________________________________________________

## BÀI TẬP 3:
## Mô tả bài toán: bài toán ở BT2

## Phương thức cần kiểm thử:

```java
	1. public static boolean check(String pass) {
	2.	
	3.	if (pass.length() < 8 || pass.length() > 32) {
	4.		return false;
	5.	}
	6.	
	7.	for (int i = 0; i < pass.length(); i++) {
	8.		if (!(('0' <= pass.charAt(i) && pass.charAt(i) <= '9')
	9.			|| ('a' <= pass.charAt(i) && pass.charAt(i) <= 'z')
	10.			|| ('A' <= pass.charAt(i) && pass.charAt(i) <= 'Z'))) {
	11.		return false;
	12.		}	
	13.	}
	14.	
	15.	return true;
	16. }
```

## Áp dụng tiêu chuẩn kiểm thử All-DU-Path
* Phân tích dựa trên biểu đồ BT3/BT3 - All DU Path - biến pass.png
![co_incode](https://github.com/ducanhk58uet/int3117-2016/blob/master/VuManhTien/BT3/BT3%20-%20All%20DU%20Path%20-%20bi%E1%BA%BFn%20pass.png)

* Các đường đi cho biến pass:
* Path 1: 1-3-4-16
* Path 2: 1-3-7-15-16
* Path 3: 1-3-7-8-11-16

## Unit test cho các ca kiểm thử
```java
	@Test
	public void testPath1() {
		Assert.assertFalse(Password.check("1234"));
		Assert.assertFalse(Password.check("1234567890123456789012345678901234"));
	}
	
	@Test
	public void testPath2() {
		Assert.assertTrue(Password.check("12345678"));
		Assert.assertTrue(Password.check("12345678901234567890123456789012"));
		Assert.assertTrue(Password.check("bbbbbbbbbbb222222222222BBBBBBBBB"));
	}
	
	@Test
	public void testPath3() {
		Assert.assertFalse(Password.check("1234@@@"));
	}
```
## Kết quả: BT3/BT3 - test result.png
![co_incode](https://github.com/ducanhk58uet/int3117-2016/blob/master/VuManhTien/BT3/BT3%20-%20test%20result.png)

## Nhận xét: giữa All DU Path và MCDC có sự khác nhau về cách thực hiện qua đó cũng mang lại hiệu quả khác nhau
* Với MCDC tất cả các trường đều được test có nghĩa là khi đó tất cả các đường đi đều được bao phủ.
	* Phải thực hiện nhiều ca kiểm thử để hoàn thành tiêu chuẩn này.
* Với All DU Path thì tập trung vào test cho đường đi của một biến.
	* Cần thực hiện các ca kiểm thử ít hơn với mục tiêu cụ thể.


______________________________________________________________________________________________________________