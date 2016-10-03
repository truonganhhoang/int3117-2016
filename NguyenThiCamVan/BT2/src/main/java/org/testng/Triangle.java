package org.testng;

/**
 * @author Nguyen Thi Cam Van
 */

public class Triangle {

	public static String NOT_RIGHT_ANGLED_TRIANGLE = "Not right angled triangle";
	public static String INVALID_TRIANGLE = "Invalid Triangle";
	public static String RIGHT_ANGLED_TRIANGLE = "Right angled triangle";

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
}
