package com.uet.int3117;

public class MyTriangle {
	private double side1, side2, side3;

	public MyTriangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public int checkTrianle() {
		int result = 0;
		boolean condition1 = ((side1 + side2) > side3
				&& (side1 + side3) > side2 && (side2 + side3) > side1);
		boolean condition2 = (side1 > 0 && side2 > 0 && side3 > 0);

		if (condition1 == false || condition2 == false) {
			System.out.println("Khong phai tam giac");
			result = -1;
		}

		while (condition1 && condition2) {
			if ((side1 == side2) || (side2 == side3) || (side3 == side1)) {
				System.out.println("tam giac can!");
				result = 1;
				break;
			} else if (side1 == side2 && side2 == side3) {
				System.out.println("tam giac deu!");
				result = 2;
				break;

			} else if (((side1 == side2) && (side3 == Math.sqrt(side1 * side1
					+ side2 * side2)))
					|| ((side1 == side3) && (side2 == Math.sqrt(side1 * side1
							+ side3 * side3)))
					|| ((side2 == side3) && (side1 == Math.sqrt(side3 * side3
							+ side2 * side2)))) {
				System.out.println("tam giac vuong can!");
				result = 3;
				break;

			} else if ((side3 == Math.sqrt(Math.pow(side2, 2)
					+ Math.pow(side1, 2)))
					|| (side2 == Math.sqrt(Math.pow(side1, 2)
							+ Math.pow(side1, 2)))
					|| (side1 == Math.sqrt(Math.pow(side2, 2)
							+ Math.pow(side3, 2)))) {
				System.out.println("tam giac vuong!");
				result = 4;
				break;

			} else {
				System.out.println("tam giac binh thuong!");
				result = 5;
				break;

			}
		}
		return result;

	}

}
