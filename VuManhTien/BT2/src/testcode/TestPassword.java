package testcode;


import org.testng.Assert;
import org.testng.annotations.Test;

import sourcecode.Password;

public class TestPassword {

	/** Test MCDC */
	
	@Test
	public void testShortPassword(){
		Assert.assertFalse(Password.check("1234567"));
		Assert.assertTrue(Password.check("12345678"));
	}
	
	@Test
	public void testLongPassword(){
		Assert.assertFalse(Password.check("123456789012345678901234567890123"));
		Assert.assertTrue(Password.check("12345678901234567890123456789012"));
	}
	
	@Test
	public void testNormalPassword(){
		Assert.assertTrue(Password.check("aaaaaaaaaAAAAAAA1111111"));
	}
	
	@Test
	public void testNormalPassword1(){
		Assert.assertTrue(Password.check("aaaaaaaaaaaaaaaaaaaaaaa"));
	
	}
	
	@Test
	public void testNormalPassword2(){
		Assert.assertTrue(Password.check("AAAAAAAAAAAAAAAAAAAAAAA"));
	}
	
	@Test
	public void testNormalPassword3(){
		Assert.assertTrue(Password.check("11111111111111111111111"));
		Assert.assertTrue(Password.check("aaaaaaaaaAAAAAAA1111111"));
	}
	
	@Test
	public void testSpecialPassword(){
		Assert.assertFalse(Password.check("aaaAAA111@@@"));
	}
	
	/** Test All DU Path */
	
	@Test
	public void testPath1() {
		Assert.assertFalse(Password.check("1234"));
		Assert.assertFalse(Password.check("1234567890123456789012345678901234"));
	}
	
	@Test
	public void testPath2() {
		Assert.assertTrue(Password.check("12345678"));
		Assert.assertTrue(Password.check("12345678901234567890123456789012"));
		Assert.assertTrue(Password.check("bbbbbbbbbbb222222222222BBBBBBBBB"));
	}
	
	@Test
	public void testPath3() {
		Assert.assertFalse(Password.check("1234@@@"));
	}
}
