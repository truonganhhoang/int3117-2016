
# Báo cáo bài tập 2

## Function cần test 
* Mô tả: đếm số số nguyên dương có 2 chữ số mà có chữ số hàng chục lớn hơn hoặc bằng chữ số hàng đơn vị trong mảng được nhập vào.

VD: findMin(3,10,99,50,0) = 3  
*code:

```java
public int findMin (int arr[]){
	int result =0;
	int units = 0;
	int tens = 0;
	if (arr.length==0){
		return 0;
	}
	for(int i=0; i<arr.length; i++){
			
		if(arr[i]>9 && arr[i]<100){
			units = arr[i]%10;
			tens = arr[i]/10;
			if(tens>units){
				result ++;
			}
		}
	}
	return result;
}
```
	
## Phương pháp kiểm thử:
* Phương pháp: kiểm thử miền giá trị.
* Lý do: Bài toán này dễ dàng để cho ta xác định các miền giá trị. Trong khi đó với hàm này và dùng kiểm thử biên sẽ có khá nhiều test case, trong khi chỉ cần kiểm thử miền là đã phủ được toàn bộ các trường hợp. Bên cạnh đó nó dễ xác định hơn nhiều so với phuong pháp lập bảng.
* Mô tả các miền:
	- Số đó không phải số có hai chữ số!
	- Số đó là số có hai chữ số! Nhưng chữ số hàng đơn vị lớn hơn chữ số hàng chục.
	- Số đó là số có hai chữ số! Chữ số hàng chục bằng chữ số hàng đơn vị.
	- Số đó là số có hai chữ số! Chữ số hàng chục lớn hơn chữ số hàng đơn vị.

## Kết quả kiểm thử: 
* Test Case:
```java
import static org.junit.Assert.*;

public class Test {
	@org.junit.Test
	public void test1() {
		DemoTest temp = new DemoTest();
		int arr[] = {};
		int i = temp.findMin(arr);
		assertEquals(0,i);
	}
	
	@org.junit.Test
	public void test2() {
		DemoTest temp = new DemoTest();
		int arr[] = {-3,9,100};
		int i = temp.findMin(arr);
		assertEquals(0,i);
	}
	
	@org.junit.Test
	public void test3() {
		DemoTest temp = new DemoTest();
		int arr[] = {-3,49, 23, 100};
		int i = temp.findMin(arr);
		assertEquals(0,i);
	}
	
	@org.junit.Test
	public void test4() {
		DemoTest temp = new DemoTest();
		int arr[] = {49,53,5,98};
		int i = temp.findMin(arr);
		assertEquals(2,i);
	}
	
	@org.junit.Test
	public void test5() {
		DemoTest temp = new DemoTest();
		int arr[] = {49,55,5,98};
		int i = temp.findMin(arr);
		assertEquals(2,i);
	}
	
	@org.junit.Test
	public void test6() {
		DemoTest temp = new DemoTest();
		int arr[] = {Integer.MAX_VALUE,Integer.MIN_VALUE,10,0,21};
		int i = temp.findMin(arr);
		assertEquals(2,i);
	}
	
	@org.junit.Test
	public void test7() {
		DemoTest temp = new DemoTest();
		int a = Integer.MAX_VALUE+1000;
		int arr[] = {a,18,8,1995};
		int i = temp.findMin(arr);
		assertEquals(0,i);
	}
}
```

* Kết quả:
![Test result](https://github.com/trieudh58/int3117-2016/blob/master/NguyenHuyHung/BT1/image/Ketqua.PNG)

- Ta thấy có lỗi tại testcase 5! Các test case còn lại đều pass.

# Phân tích
Lỗi ở đây là do trong mảng đưa vào của testcase 5 có số 55. Số này là hợp lệ vì là số có 2 chữ số và có chữ số hàng chục bằng chữ số hàng đơn vị. Vì thế trong mảng {49,55,5,98} kết quả trả về phải là 2 (55,98). 

Nhưng nhìn vào hàm code ta thấy "if(tens>units)" nên hàm đã chỉ tính số mà có chữ số hàng chục lớn hơn hàng đơn vị, nên kết quả trả về chỉ là 1 (98). Dẫn tới testcase 5 fail!

======

# Bài tập tuần 1
## Description
Test hàm java bằng junit

## Prerequisities
Java SDK 1.8  
Eclipse IDE  
Junit

## Mô tả hàm: 
- Hàm thực hiện đếm số các số nguyên dương có hai chữ số trong mảng được đưa vào!

* Code:
```java
public class DemoTest {
	public int findMin (int arr[]){
		int result =0;
		if (arr.length==0){
			return 0;
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]>9 && arr[i]<100){
				result ++;
			}
		}
		return result;
	}
}
```

## Các Test Case:
```java
public class Test {

	@org.junit.Test
	public void test1() {
		DemoTest temp = new DemoTest();
		int arr[] = {3,40,30};
		int i = temp.findMin(arr);
		assertEquals(2,i);
	}
	
	@org.junit.Test
	public void test2() {
		DemoTest temp = new DemoTest();
		int arr[] = {3,9,100};
		int i = temp.findMin(arr);
		assertEquals(0,i);
	}
	
	@org.junit.Test
	public void test3() {
		DemoTest temp = new DemoTest();
		int arr[] = {3,10,99, 50 , 0};
		int i = temp.findMin(arr);
		assertEquals(3,i);
	}
	
	@org.junit.Test
	public void test4() {
		DemoTest temp = new DemoTest();
		int arr[] = {};
		int i = temp.findMin(arr);
		assertEquals(0,i);
	}
	
	@org.junit.Test
	public void test5() {
		DemoTest temp = new DemoTest();
		int arr[] = {Integer.MAX_VALUE,Integer.MIN_VALUE,10,0,2000};
		int i = temp.findMin(arr);
		assertEquals(1,i);
	}
}
```

* Kết quả: Các testcase đều pass.
