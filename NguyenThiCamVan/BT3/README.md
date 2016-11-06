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

## Độ 
## Kết quả test  

![test-result] ()  

## Đo mức độ bao phủ  

![test-coverage] ()


