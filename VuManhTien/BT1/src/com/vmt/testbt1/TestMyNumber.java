package com.vmt.testbt1;

import org.junit.Assert;

import com.vmt.bt1.MyNumber;

public class TestMyNumber {

	@org.junit.Test
	public void testMyNumber(){
		boolean test = true;
		MyNumber myNumber = new MyNumber();
		test = test && (myNumber.tong() > 100);
		Assert.assertTrue(test);
		test = test && (myNumber.tich() > 100);
		Assert.assertTrue(test);
	}
}
