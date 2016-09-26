package org.testng;

import org.testng.annotations.Test;

public class GreatestCommonDivisorTest {
  @Test
  public void testGCDWithOneZeroNumber() {
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();
    Assert.assertEquals(gcd.greatestCommonDivisor(0, 20), 20);
    Assert.assertEquals(gcd.greatestCommonDivisor(20, 0), 20);
  }

  @Test
  public void testGCDWithMaxIntNumber() {
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();
    Assert.assertEquals(gcd.greatestCommonDivisor(Integer.MAX_VALUE, 85), 1);
    Assert.assertEquals(gcd.greatestCommonDivisor(85, Integer.MAX_VALUE), 1);
  }
   
  @Test
  public void testGCDWithMaxNumber() {
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();
    Assert.assertEquals(gcd.greatestCommonDivisor(Integer.MAX_VALUE-1, 4563), 9);
    Assert.assertEquals(gcd.greatestCommonDivisor(4563, Integer.MAX_VALUE-1), 9);
  }
  
  @Test
  public void testGCDWithNegativeNumber() {
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();
    Assert.assertEquals(gcd.greatestCommonDivisor(-999999999, 456), 3);
    Assert.assertEquals(gcd.greatestCommonDivisor(456, -999999999), 3);
    Assert.assertEquals(gcd.greatestCommonDivisor(-999999999, -456), 3);
    Assert.assertEquals(gcd.greatestCommonDivisor(-456, -999999999), 3);
  }
}
