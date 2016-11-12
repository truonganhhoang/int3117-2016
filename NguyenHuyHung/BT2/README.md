# Bài Tập 2


## Hàm cần kiểm thử:

* Mô tả hàm: Hàm cấp phát tài nguyên! Ưu tiên cấp cho nhiều tiến trình sử dụng nhất có thể, ưu tiên cho các tiến trình dùng ít tài nguyên hơn (trừ tiến trình cuối cùng để tối ưu hóa tài nguyên, tiến trình cuối cùng được chọn có yêu cầu tài nguyên lớn nhất có thể được đáp ứng)! Hàm nhận vào kích cỡ hiện có và mảng các yêu cầu sử dụng tài nguyên của các tiến trình. Hàm này trả về lượng tài được cung cấp theo như ý tưởng đã trình bày!

* Code:
```java
	public int conferResources (int[] consume, int size){

		int conferred=0;
		int swap;
		int counter =0;
		int index = 0;
		int length = consume.length;
		//sort
		for(counter=0;counter<length-1; counter++){
			for(index=0; index<length-counter-1; index++){
				if(consume[index]>consume[index+1]){
					swap = consume[index];
					consume[index]=consume[index+1];
					consume[index+1]=swap;
				}
			}
		}
		
		
		index = 0;
		counter = 0;
		while ((index<length) && ((conferred+consume[index])<=size)){
			conferred = conferred+consume[index];
			if((index+1)<length && (conferred+consume[index+1])>size && (conferred-consume[index]+consume[index+1])<=size) {
				conferred = conferred-consume[index];
				//can use while?
				for(counter=0; counter < length-index-1; counter++ ){
					if((conferred+consume[length-counter-1])<=size){
						conferred = conferred+consume[length-counter-1];
						index = length-counter;
						break;
					}
				}
			} else {
				//smile
				index ++;
			}
		}
		return conferred;
	}
```

## Áp dụng MCDC:
Phương pháp kiểm thử MCDC là chọn ra một số hữu hạn các ca kiểm thử sao cho có thể bao phủ (coverage) được các điều kiện đơn lẻ (condition) và cả cả các nhánh điều kiện (decision).
Áp dụng MCDC vào hàm trên ta chọn lựa được 4 ca kiểm thử phù hợp là:
- consume = {9,5,3,5,10}; size = 20;
- consume = {8,15,6,11,22}; size = 70;
- consume = {7,20,5,30,3,14}; size = 30;
- consume = {15,10,20,30,25}; size = 50;

Chỉ với 4 ca kiểm thử như vậy đã có thể bao phủ được gần như toàn bộ các dòng lệnh, tất cả các trường hợp của từng điều kiện đơn cũng như các nhánh điều kiện, đường đi của chương trình!

## Các ca kiểm thử:

Ca kiểm thử có lượng yêu cầu lớn hơn kích thước:
```java
	@Test
	public void testConsumeBiggerSize() {
		Resources demoTest = new Resources();
		int consume[] = {9,5,3,5,10};
		int size = 20;
		int result = demoTest.conferResources(consume, size);
		assertEquals(18,result);
	}
```

Ca kiểm thử có kích thước lớn hơn lượng yêu cầu:
```java
	@Test
	public void testSizeBiggerConsume() {
		Resources demoTest = new Resources();
		int consume[] = {8,15,6,11,22};
		int size = 70;
		int result = demoTest.conferResources(consume, size);
		assertEquals(62,result);
	}
```

Ca Kiểm thử có giá trị yêu cầu sau index hợp lệ lớn (túc là không thế cấp phát dc, index ở đây với mảng đã dc sắp xếp): 
```java
	@Test
	public void testAfterIndexIsBig() {
		Resources demoTest = new Resources();
		int consume[] = {7,20,5,30,3,14};
		int size = 30;
		int result = demoTest.conferResources(consume, size);
		assertEquals(29,result);
	}
```
Ca kiểm thử có giá trị yêu cầu lớn nhất không được cấp phát:
```java
	@Test
	public void testLastIsIncorrect() {
		Resources demoTest = new Resources();
		int consume[] = {15,10,20,30,25};
		int size = 50;
		int result = demoTest.conferResources(consume, size);
		assertEquals(50,result);
	}
```

## Kết quả Test

![Test result](https://github.com/trieudh58/int3117-2016/blob/master/NguyenHuyHung/BT2/image/ketqua.png)

Chi tiết các ca kiểm thử:

![Test result](https://github.com/trieudh58/int3117-2016/blob/master/NguyenHuyHung/BT2/image/chitiet.PNG)

## Độ bao phủ:

![Test result](https://github.com/trieudh58/int3117-2016/blob/master/NguyenHuyHung/BT2/image/coverage.PNG)
