	public int checkTrianle() {
(1)		int result = 0;
(2)		boolean condition1 = ((side1 + side2) > side3
				&& (side1 + side3) > side2 && (side2 + side3) > side1);
(3)		boolean condition2 = (side1 >= 0 && side2 >= 0 && side3 >= 0);

(4)		if (condition1 == false || condition2 == false) {
			System.out.println("Khong phai tam giac");
(5)			result = -1;
		}

(6)		while (condition1 && condition2) {
(7)			if ((side1 == side2) || (side2 == side3) || (side3 == side1)) {
				System.out.println("tam giac can!");
(8)				result = 1;
				break;
(9)			} else if (side1 == side2 && side1 == side3) {
				System.out.println("tam giac deu!");
(10)				result = 2;
				break;

(11)			} else if (((side1 == side2) && (side3 == Math.sqrt(side1 * side1
					+ side2 * side2)))
					|| ((side1 == side3) && (side2 == Math.sqrt(side1 * side1
							+ side3 * side3)))
					|| ((side2 == side3) && (side1 == Math.sqrt(side3 * side3
							+ side2 * side2)))) {
				System.out.println("tam giac vuong can!");
(12)				result = 3;
				break;

(13)			} else if ((side3 == Math.sqrt(Math.pow(side2, 2)
					+ Math.pow(side1, 2)))
					|| (side2 == Math.sqrt(Math.pow(side1, 2)
							+ Math.pow(side1, 2)))
					|| (side1 == Math.sqrt(Math.pow(side2, 2)
							+ Math.pow(side3, 2)))) {
				System.out.println("tam giac vuong!");
(14)				result = 4;
				break;

			} else {
				System.out.println("tam giac binh thuong!");
(15)				result = 5;
				break;

			}
		}
(16)		return result;

**Áp dụng All-DU-Path cho các biến trong chương trình 

1. Biểu đồ luồng dữ liệu cho biến considition1 và considition2 (do vai trò của hai biến này là như nhau)
	0, 1, 2, 3, 4, 5, 16
	0, 1, 2, 3, 4, 5 ,...

2. Biểu đồ luồng dữ liệu cho biến result
	0, 1, 2, 3, 4, 5, 16.
	0, 1, 2, 3, 4, 6, 7, 8, 16.
	0, 1, 2, 3, 4, 6, 9, 10, 16.
	0, 1, 2, 3, 4, 6, 11, 12, 16.
	0, 1, 2, 3, 4, 6, 13, 14, 16
	0, 1, 2, 3, 4, 6, 15, 16.
**So sánh kĩ thuật kiểm thử All-DU-Path và kĩ thuật MCDC trong bt2 
Giống nhau : là các kĩ thuật kiểm thử hộp trắng.

Khác nhau : -kĩ thuật All-DU-Path là kĩ thuật dựa vào luồng dữ liệu đi của các biến.
	    -so với MCDC thì kĩ thuật All-DU - Path ít ca kiểm thử hơn và nó addi được hết các trường hợp hơn so với MCDC.

	