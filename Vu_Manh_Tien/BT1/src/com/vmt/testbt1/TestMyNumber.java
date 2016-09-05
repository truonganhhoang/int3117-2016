package com.vmt.testbt1;

import com.vmt.bt1.MyNumber;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestMyNumber {

	@Test
	public void testMyNumber(){
		boolean test = true;
		MyNumber myNumber = new MyNumber();
		test = test && (myNumber.tong() > 100);
		Assert.assertTrue(test);
	}
}
