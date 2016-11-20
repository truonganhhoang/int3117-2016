# Bài Tập 3


## Hàm cần kiểm thử:

* Tương tự như trong bài tập 2 nhưng bỏ phần sắp xếp, dữ liệu đầu vào đã được sắp xếp trước.

* Code:
```java
	public int conferResources (int[] consume, int size){						//A

		int conferred=0;														//B
		int counter =0;															//
		int index = 0;															//
		int length = consume.length;											//

		while ((index<length) && ((conferred+consume[index])<=size)){			//C
			conferred = conferred+consume[index];								//D
			if((index+1)<length && (conferred+consume[index+1])>size && (conferred-consume[index]+consume[index+1])<=size) {				//E
				conferred = conferred-consume[index];							//F
				//can use while?
				for(counter=0; counter < length-index-1; counter++ ){			//G
					if((conferred+consume[length-counter-1])<=size){			//H
						conferred = conferred+consume[length-counter-1];		//I
						index = length-counter;									//
						break;													//
					}
				}
			} else {															//J
				//smile															//
				index ++;														//
			}
		}
		return conferred;														//K
	}
```

## Đồ thị chu trình:
![Diagram](https://github.com/hungnh58/int3117-2016/blob/master/NguyenHuyHung/BT3/image/diagram.JPG)

## Xác định đường đi DU và các ca kiểm thử tương ứng:

* Biến consume[]:
  + `A --> C (p,c) --> D (c) --> E (p,c) --> F (c) --> H (p,c) --> I (c) --> K:
  + `A --> C (p,c) --> D (c) --> E (p,c) --> J --> C(p,c) --> K;
  
  Vì cosume[] là biến mảng lên một trường hợp sẽ phủ nhiều đường đi khác nhau. Dưới đây là ca kiểm thử tương ứng:
  ```java
  @Test
	public void testConsume() {
		Resources demoTest = new Resources();
		int consume[] = {3,5,7,14,20,30};
		int size = 30;
		int result = demoTest.conferResources(consume, size);
		assertEquals(29,result);
	}
  ```
 
* Biến conferred:
  + `B --> C (p,c) --> D (c) --> E (p,c) --> F (d,c) --> H (p,c) --> I (d) --> K:`
  + `B --> C (p,c) --> D (c) --> E (p,c) --> K:`
  Ca kiểm thử cho chu trình của conferred:
  ```java
  @Test
	@Test
	public void testConferred() {
		Resources demoTest = new Resources();
		int consume[] = {10,15,20,25,30};
		int size = 50;
		int result = demoTest.conferResources(consume, size);
		assertEquals(50,result);
	}
  ```

## Kết quả Test

![Test result](https://github.com/hungnh58/int3117-2016/blob/master/NguyenHuyHung/BT3/image/result.JPG)

## Độ bao phủ:

![Test result](https://github.com/hungnh58/int3117-2016/blob/master/NguyenHuyHung/BT3/image/converage.JPG)
## Nhận xét, so sánh về All-DU-Path và MCDC

- MCDC đảm bảo thực hiện tất cả các điều kiện đơn vì thế nó chặt chẽ hơn về bao phủ nhánh (branch).
- All-DU-Path dựa vào đồ thị chu trình để tạo các ca kiểm thử vì thế nó hỗ tợ kiểm tra bao phủ dòng lệnh rất tốt.
- Với bao phủ nhánh, All-DU-Path không chặt chẽ bằng MCDC.
- All-DU-Path giúp chúng ta kiểm tra dòng dữ liệu.

