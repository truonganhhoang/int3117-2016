package org.testng;

import org.testng.annotations.Test;

/**
 * Unit test for BigInteger class
 */
public class BigIntegerTest
{
    @Test
    public void testCreateNegativeBigIntegerFromInt()
    {
        BigInteger bigInt = new BigInteger(-10);
        Assert.assertEquals("-10", bigInt.toString());
    }
    
    @Test
    public void testCreateNegativeBigIntegerFromStringWithLeadingZero()
    {
        BigInteger bigInt = new BigInteger("-010");
        Assert.assertEquals("-10", bigInt.toString());
    }

    @Test
    public void testCreateNegativeBigIntegerFromStringWithAllButUnitZeros()
    {
        BigInteger bigInt = new BigInteger("-001");
        Assert.assertEquals("-1", bigInt.toString());
    }

    @Test
    public void testConvertToLongWhenNotOverRange()
    {
        BigInteger bigInt = new BigInteger("-10");
        Assert.assertEquals(-10L, bigInt.toLong());
    }
    
    @Test
    public void testEquality()
    {
        BigInteger bigInt1 = new BigInteger(-10);
        BigInteger bigInt2 = new BigInteger(-10);
        BigInteger bigInt3 = new BigInteger("-10");
                
        Assert.assertEquals(bigInt1, bigInt2);
        Assert.assertEquals(bigInt1, bigInt3);
    }
    
    @Test
    public void testUnEquality()
    {
        BigInteger bigInt1 = new BigInteger(-10);
        BigInteger bigInt2 = new BigInteger(-12);
        BigInteger bigInt3 = new BigInteger(10);
                
        Assert.assertFalse(bigInt1.equals(bigInt2));
        Assert.assertFalse(bigInt1.equals(bigInt3));
    }
    
    @Test
    public void testAdditionTwoNegativeValue()
    {
        BigInteger bigInt1 = new BigInteger("-111111111111111111111");
        BigInteger bigInt2 = new BigInteger("-1");
        BigInteger bigInt3 = new BigInteger("-9");
        BigInteger sum1 = bigInt1.add(bigInt2);
        BigInteger sum2 = bigInt1.add(bigInt3);
        
        Assert.assertEquals(new BigInteger("-111111111111111111112"), sum1, "Addition without carry on");
        Assert.assertEquals(new BigInteger("-111111111111111111120"), sum2, "Addition with carry on");
    }
    
	@Test
    public void testAdditionWithGreaterIsNegativeValue()
    {
    	BigInteger bigInt1 = new BigInteger("-111111111111111111111");
        BigInteger bigInt2 = new BigInteger("1");
        BigInteger bigInt3 = new BigInteger("9");
        BigInteger sum1 = bigInt1.add(bigInt2);
        BigInteger sum2 = bigInt1.add(bigInt3);
         
        Assert.assertEquals(new BigInteger("-111111111111111111110"), sum1, "Addition without carry on");
        Assert.assertEquals(new BigInteger("-111111111111111111102"), sum2, "Addition with carry on");
    }
    
	@Test
    public void testAdditionWithSmallerIsNegativeValue()
    {
    	BigInteger bigInt1 = new BigInteger("111111111111111111111");
        BigInteger bigInt2 = new BigInteger("-1");
        BigInteger bigInt3 = new BigInteger("-9");
        BigInteger sum1 = bigInt1.add(bigInt2);
        BigInteger sum2 = bigInt1.add(bigInt3);
         
        Assert.assertEquals(new BigInteger("111111111111111111110"), sum1, "Addition without carry on");
        Assert.assertEquals(new BigInteger("111111111111111111102"), sum2, "Addition with carry on");	
    }
	
    @Test
    public void testSubtractionTwoNegativeValue()
    {
    	  BigInteger bigInt1 = new BigInteger("-111111111111111111111");
          BigInteger bigInt2 = new BigInteger("-1");
          BigInteger bigInt3 = new BigInteger("-9");
          BigInteger diff1 = bigInt1.subtract(bigInt2);
          BigInteger diff2 = bigInt1.subtract(bigInt3);
          
          Assert.assertEquals(new BigInteger("-111111111111111111110"), diff1, "Subtraction without carry on");
          Assert.assertEquals(new BigInteger("-111111111111111111102"), diff2, "Subtraction with carry on");
    }
    
    @Test
    public void testSubtractionWithGreaterIsNegativeValue()
    {
    	 BigInteger bigInt1 = new BigInteger("-111111111111111111111");
         BigInteger bigInt2 = new BigInteger("1");
         BigInteger bigInt3 = new BigInteger("9");
         BigInteger diff1 = bigInt1.subtract(bigInt2);
         BigInteger diff2 = bigInt1.subtract(bigInt3);
         
         Assert.assertEquals(new BigInteger("-111111111111111111112"), diff1, "Subtraction without carry on");
         Assert.assertEquals(new BigInteger("-111111111111111111120"), diff2, "Subtraction with carry on");
    }
    
    @Test
    public void testSubtractionWithSmallerIsNegativeValue()
    {

   	 	BigInteger bigInt1 = new BigInteger("111111111111111111111");
        BigInteger bigInt2 = new BigInteger("-1");
        BigInteger bigInt3 = new BigInteger("-9");
        BigInteger diff1 = bigInt1.subtract(bigInt2);
        BigInteger diff2 = bigInt1.subtract(bigInt3);
        
        Assert.assertEquals(new BigInteger("111111111111111111112"), diff1, "Subtraction without carry on");
        Assert.assertEquals(new BigInteger("111111111111111111120"), diff2, "Subtraction with carry on");
    }
	
	@Test
	public void testCompareNegativeValue() 
	{
		BigInteger bigInt1 = new BigInteger("-111111111111111111111111");
        BigInteger bigInt2 = new BigInteger("-111111111111111111111111");
		BigInteger bigInt3 = new BigInteger("-111111111111111111111112");
		BigInteger bigInt4 = new BigInteger("111111111111111111111112");
                
        Assert.assertEquals(bigInt1.compareTo(bigInt2), 0, "If bigInt1 equals bigInt2 return 0");
        Assert.assertEquals(bigInt1.compareTo(bigInt3), 1, "If bigInt1 is greater than bigInt3 return 1");
		Assert.assertEquals(bigInt3.compareTo(bigInt1), -1, "If bigInt3 is smaller than bigInt1 return -1");
		Assert.assertEquals(bigInt3.compareTo(bigInt4), -1, "If bigInt3 is smaller than bigInt4 return -1");
	}
	
	@Test
	public void testCloneNegativeValue()
	{
		BigInteger bigInt = new BigInteger(-10);
		BigInteger clone = new BigInteger();
		clone = bigInt.clone();
		Assert.assertEquals(clone, bigInt, "bigInt.clone()");
	}
}
