package thangpvt58;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	
	/* Kiem tra co la tam giac hay khong */
	
	@Test
	public void test1() {
		Triangle A = new Triangle();
		boolean result = A.not(5,4,3);
		assertEquals(true, result);
		
	}

}
