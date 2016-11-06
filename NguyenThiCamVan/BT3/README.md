# Bài tập 3 

## Hàm cần kiểm thử:  

```java
public String checkTriangleType(double side1, double side2, double side3) {
		boolean baseCondition1 = (side1 + side2 > side3			
				&& side1 + side3 > side2 && side2 + side3 > side1);				//10
		boolean baseCondition2 = (side1 > 0 && side2 > 0 && side3 > 0);			//11

		while (baseCondition1 && baseCondition2) {		//12

			boolean condition1 = Math.sqrt(side1 * side1 + side2 * side2) == side3;		//13
			boolean condition2 = Math.sqrt(side1 * side1 + side3 * side3) == side2;		//14
			boolean condition3 = Math.sqrt(side3 * side3 + side2 * side2) == side1;		//15

			if (condition1 || condition2 || condition3) {			//16
				return RIGHT_ANGLED_TRIANGLE;						//17
			}else {													//18
				return NOT_RIGHT_ANGLED_TRIANGLE;					//19
			}
		}
		return INVALID_TRIANGLE;									//20
}

## Đồ thị chu trình  
!(https://github.com/trieudh58/int3117-2016/blob/master/NguyenThiCamVan/BT3/Process.PNG)
## Kết quả test  

![test-result] (https://github.com/trieudh58/int3117-2016/blob/master/NguyenThiCamVan/BT3/test_result/TestResult.PNG)

## Đo mức độ bao phủ  

![test-coverage] (https://github.com/trieudh58/int3117-2016/blob/master/NguyenThiCamVan/BT3/test_coverage_result/TestCoverage.PNG)  

## Nhận xét, đối sánh kết quả nhận được khi áp dụng All-DU-Path và MCDC  
* MCDC chặt chẽ hơn về bao phủ nhánh (branch), khi các điều kiện đơn chắc chắn sẽ được thực thi ít nhất một lần.  
* All-DU-Path giúp kiểm tra bao phủ dòng lệnh (statement) rất tốt, vì để sinh ra được các ca kiểm thử thì ta cần dựa vào đồ thị chu trình của chương trình.  
* All-DU-Path hỗ trợ kiểm tra cách các dòng dữ liệu chạy trong chương trình.  
* Tuy nhiên, trong bao phủ nhánh, All-DU-Path làm chưa thể chặt chẽ khi so với MCDC. Trong kết quả bao phủ đã nếu ở trên, bao phủ nhánh chỉ đạt 83.33% vì có một điều kiện đơn chưa được chạy qua.  

