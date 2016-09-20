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
	
	/* BT3 */
	
	/* kiểm thử giá trị biên */
	
	/* biên cận dưới */
	
	@org.junit.Test
	public void test1MyNumberBT3(){
		boolean test = true;
		MyNumber myNumber = new MyNumber(1);
		test = test && (myNumber.tong() == 1);
		Assert.assertTrue(test);
		test = test && (myNumber.tich() == 1);
		Assert.assertTrue(test);
	}
	
	@org.junit.Test
	public void test2MyNumberBT3(){
		boolean test = true;
		MyNumber myNumber = new MyNumber(0);
		test = test && (myNumber.tong() == 0);
		Assert.assertTrue(test);
		test = test && (myNumber.tich() == 0);
		Assert.assertTrue(test);
	}
	
	/* biên cận trên kiểu dữ liệu*/
	
	@org.junit.Test
	public void test3MyNumberBT3(){
		boolean test = true;
		MyNumber myNumber = new MyNumber(100);
		test = test && (myNumber.tong() > 100);
		test = test && (myNumber.tich() > 100);
		Assert.assertTrue(test);
	}
}
