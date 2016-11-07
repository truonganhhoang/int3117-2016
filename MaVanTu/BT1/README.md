# Bài tập 1

## Mô tả bài toán
 - Tìm giá trị nhỏ nhất trong một mảng số nguyên cho trước

## Yêu cầu
 - Java SDK 1.8
 - Maven
 - Eclipse IDE
 - JUnit
 
## Hàm cần kiểm thử
```java
public int findMin(int[] arr) {
	int min = arr[0];
	int n = arr.length;
	for (int i = 0; i < n; i++) {
		if (arr[i] < min) {
			min = arr[i];
		}
	}
	return min;
}
```
## Phương pháp kiểm thử hộp đen đã áp dụng
 - Bài tập này sử dụng phương pháp kiểm thử biên (bounday-value analysis)
 - Phương pháp kiểm thử biên phù hợp vì: bài toán cần được kiểm tra các giá trị biên và cận biên thật chính xác,
 trong khi giới hạn số có thể thể hiện của java (hay bất kỳ ngôn ngữ nào khác) đều có hạn.

## Unit Test
```java
    public class TestMinClass {
	    MinClass minClass = new MinClass();

	    // Test gia tri nho nhat
	    @Test
	    public void testFindMin1() {
		    int arr[] = { 1, 3, 5, -2, 9, 4, 2, 100, 0, -2147483648 };
		    assertEquals(Integer.MIN_VALUE, minClass.findMin(arr));
	    }

	    // Test ngay tren gia tri nho nhat
	    @Test
	    public void testFindMin2() {
		    int arr[] = { 1, 3, 5, -2, 9, 4, 2, 100, 0, -2147483647 };
		    assertEquals(Integer.MIN_VALUE + 1, minClass.findMin(arr));
	    }

	    // Test gia tri binh thuong
	    @Test
	    public void testFindMin3() {
		    int arr[] = { 1, 3, 5, -2, 9, 4, 2, 100, 0, -9 };
		    assertEquals(-9, minClass.findMin(arr));
	    }

	    // Test ngay duoi gia tri lon nhat
	    @Test
	    public void testFindMin4() {
		    int arr[] = { 1, 3, 5, -2, 9, 4, 2, 100, 0, 2147483646 };
		    assertEquals(-2, minClass.findMin(arr));
	    }

	    // Test gia tri lon nhat
	    @Test
	    public void testFindMin5() {
		    int arr[] = { 1, 3, 5, -2, 9, 4, 2, 100, 0, 2147483647 };
		    assertEquals(-2, minClass.findMin(arr));
	    }
	}
```

## Kết quả
![alt text](https://github.com/tumv58/int3117-2016/blob/master/MaVanTu/BT1/TestResult/result.PNG)
### Coverage
![alt text](https://github.com/tumv58/int3117-2016/blob/master/MaVanTu/BT1/TestResult/coverage.PNG)

## Vẽ đồ thị chương trình
### Sơ đồ khối (Flowchart) này được generate tự động nhờ code2flow.com
### Kết quả
![alt text](https://github.com/tumv58/int3117-2016/blob/master/MaVanTu/BT1/TestResult/Capture.PNG)