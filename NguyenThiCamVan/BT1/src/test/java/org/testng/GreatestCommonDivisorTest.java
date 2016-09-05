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
    Assert.assertEquals(gcd.greatestCommonDivisor(Integer.MAX_VALUE, 1), 1);
    Assert.assertEquals(gcd.greatestCommonDivisor(1, Integer.MAX_VALUE), 1);
  }
  @Test
  public void testGCDWithNegativeNumber() {
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();
    Assert.assertEquals(gcd.greatestCommonDivisor(-6, 2), 2);
    Assert.assertEquals(gcd.greatestCommonDivisor(2, -6), 2);
  }
}
