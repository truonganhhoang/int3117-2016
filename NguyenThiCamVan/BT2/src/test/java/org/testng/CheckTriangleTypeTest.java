package org.testng;

/**
 * @author Nguyen Thi Cam Van
 */

import org.testng.annotations.Test;
import org.testng.Assert;

public class CheckTriangleTypeTest {
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
	@Test
	public void CheckRightAngledTriangleTest1() {
		Triangle triangle = new Triangle();
		Assert.assertEquals(triangle.checkTriangleType(3, 4, 5),
				triangle.RIGHT_ANGLED_TRIANGLE);
	}
	@Test
	public void CheckRightAngledTriangleTest2() {
		Triangle triangle = new Triangle();
		Assert.assertEquals(triangle.checkTriangleType(5, 4, 3),
				triangle.RIGHT_ANGLED_TRIANGLE);
	}
	@Test
	public void CheckRightAngledTriangleTest3() {
		Triangle triangle = new Triangle();
		Assert.assertEquals(triangle.checkTriangleType(3, 5, 4),
				triangle.RIGHT_ANGLED_TRIANGLE);
	}
	
	@Test
	public void CheckNotRightAngledTriangleTest1() {
		Triangle triangle = new Triangle();
		Assert.assertEquals(triangle.checkTriangleType(3, 4, 2),
				triangle.NOT_RIGHT_ANGLED_TRIANGLE);
	}
	
	@Test
	public void CheckNotRightAngledTriangleTest2() {
		Triangle triangle = new Triangle();
		Assert.assertEquals(triangle.checkTriangleType(3, 4, 2),
				triangle.NOT_RIGHT_ANGLED_TRIANGLE);
	}
}
