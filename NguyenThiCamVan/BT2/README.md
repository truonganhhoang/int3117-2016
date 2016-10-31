# Bài tập 2  

## Hàm cần kiểm thử:  

```java
public String checkTriangleType(double side1, double side2, double side3) {
		boolean baseCondition1 = (side1 + side2 > side3
				&& side1 + side3 > side2 && side2 + side3 > side1);
		boolean baseCondition2 = (side1 > 0 && side2 > 0 && side3 > 0);

		while (baseCondition1 && baseCondition2) {

			boolean condition1 = Math.sqrt(side1 * side1 + side2 * side2) == side3;
			boolean condition2 = Math.sqrt(side1 * side1 + side3 * side3) == side2;
			boolean condition3 = Math.sqrt(side3 * side3 + side2 * side2) == side1;

			if (condition1 || condition2 || condition3) {
				return RIGHT_ANGLED_TRIANGLE;
			}else {
				return NOT_RIGHT_ANGLED_TRIANGLE;
			}
		}
		return INVALID_TRIANGLE;
}
```  

Biểu thức điều kiện: `Branch = ((baseCondition1 && baseCondition2) && (condition1 || condition2 || condition3)`  

## Nếu không áp dụng MCDC  

Thông thường, nếu không áp dụng MCDC, ta cần test đủ cả 32 ca kỉểm thử như bảng dưới đây:  

\# | baseCondition1 | baseCondition2 | condition1 | condition2 | Branch
---- | --- | --- | --- | --- | --- | ---
1. | T | T | T | T | T | T
2. | T | T | T | T | F | T
3. | T | T | T | F | T | T
4. | T | T | F | T | T | T
5. | T | T | T | F | F | T
6. | T | T | F | T | F | T
7. | T | T | F | F | T | T
8. | T | F | T | T | T | F
9. | T | F | T | T | F | F
10. | T | F | T | F | T | F
11. | T | F | F | T | T | F
12. | T | F | T | F | F | F
13. | T | F | F | T | F | F
14. | T | F | F | F | T | F
15. | T | T | F | F | F | F
16. | F | T | T | T | T | F
17. | F | T | T | T | F | F
18. | F | T | T | F | T | F
19. | F | T | F | T | T | F
20. | F | T | T | F | F | F
21. | F | T | F | T | F | F
22. | F | T | F | F | T | F
23. | T | F | F | F | F | F
24. | F | T | F | F | F | F
25. | F | F | T | T | T | F
26. | F | F | T | T | F | F
27. | F | F | T | F | T | F
28. | F | F | F | T | T | F
29. | F | F | T | F | F | F
30. | F | F | F | T | F | F
31. | F | F | F | F | T | F
32. | F | F | F | F | F | F  

## Áp dụng MCDC  

Khi áp dụng phương pháp kiểm thử MCDC, ta chọn được một số hữu hạn các ca kiểm thử sao cho các ca kiểm thử đó có thể bao phủ (coverage) được cả các điều kiện đơn lẻ (condition) và cả cả 2 nhánh điều kiện (decision) của chương trình.

Áp dụng vào bài trên, ta chọn được các trường hợp cần để xây dựng bộ (ca) kiểm thử là: 5 - 6 - 7 - 15 - 23 - 32.  

Chỉ cần xây dựng 6 ca kiểm thử tương ứng với 6 trường hợp trên, ta có thể cover được cả 32 trường hợp, tiết kiệm được rất nhiều công sức.  

## Xây dựng các ca kiểm thử  

Ca kiểm thử \#5 T - T - T - F - F  => True Branch  

```java  
@Test
	public void CheckRightAngledTriangleTest1() {
		Triangle triangle = new Triangle();
		Assert.assertEquals(triangle.checkTriangleType(3, 4, 5),
				triangle.RIGHT_ANGLED_TRIANGLE);
	}
```  

Ca kiểm thử \#6 T - T - F - T - F  => True Branch  

```java  
@Test
	public void CheckRightAngledTriangleTest2() {
		Triangle triangle = new Triangle();
		Assert.assertEquals(triangle.checkTriangleType(5, 4, 3),
				triangle.RIGHT_ANGLED_TRIANGLE);
	}
```  

Ca kiểm thử \#7 T - T - F - F - T  => True Branch    

```java  
@Test
	public void CheckRightAngledTriangleTest3() {
		Triangle triangle = new Triangle();
		Assert.assertEquals(triangle.checkTriangleType(3, 5, 4),
				triangle.RIGHT_ANGLED_TRIANGLE);
	}
```  
  
Ca kiểm thử \#15 T - T - F - F - F => False Branch  

```java  
@Test
	public void CheckNotRightAngledTriangleTest1() {
		Triangle triangle = new Triangle();
		Assert.assertEquals(triangle.checkTriangleType(3, 4, 2),
				triangle.NOT_RIGHT_ANGLED_TRIANGLE);
	}
```  

Ca kiểm thử \#23 T - F - F - F - F  => False Branch   

```java  
@Test
	public void CheckNotRightAngledTriangleTest2() {
		Triangle triangle = new Triangle();
		Assert.assertEquals(triangle.checkTriangleType(3, 4, 2),
				triangle.NOT_RIGHT_ANGLED_TRIANGLE);
	}
```  

Ca kiểm thử \#32 F - F - F - F - F => False Branch  

```java  
@Test
	public void CheckInvalidTriangleTest() {
		Triangle triangle = new Triangle();
		Assert.assertEquals(triangle.checkTriangleType(-1, 3, 9),
				triangle.INVALID_TRIANGLE);
		Assert.assertEquals(triangle.checkTriangleType(-1, -3, -9),
				triangle.INVALID_TRIANGLE);
		Assert.assertEquals(triangle.checkTriangleType(-1, -3, 9),
				triangle.INVALID_TRIANGLE);
	}
```  

## Kết quả test  

![test-result] (https://github.com/trieudh58/int3117-2016/blob/master/NguyenThiCamVan/BT2/test_result/TestResult.PNG)  

## Đo mức độ bao phủ  

![test-coverage] (https://github.com/trieudh58/int3117-2016/blob/master/NguyenThiCamVan/BT2/test_coverage_result/TestCoverage.PNG)


