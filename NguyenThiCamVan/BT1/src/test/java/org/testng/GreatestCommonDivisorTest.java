package org.testng;

/**
 * @author Nguyen Thi Cam Van 
 * Unit test for finding the greatest common divisor of 2 integer number function
 */
import org.testng.annotations.Test;

public class GreatestCommonDivisorTest {

  @Test
  public void testIsNotIntegerNumber() {
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();
    Assert.assertEquals(gcd.greatestCommonDivisor("99999999999999999999999", "200"), -1);
    Assert.assertEquals(gcd.greatestCommonDivisor("200", "99999999999999999999999"), -1);
  }

  @Test
  public void testGCDWithOneZeroNumber() {
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();
    Assert.assertEquals(gcd.greatestCommonDivisor("0", "200"), 200);
    Assert.assertEquals(gcd.greatestCommonDivisor("200", "0"), 200);
  }

  @Test
  public void testGCDWithMaxIntNumber() {
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();
    Assert.assertEquals(gcd.greatestCommonDivisor(Integer.toString(Integer.MAX_VALUE), "85"), 1);
    Assert.assertEquals(gcd.greatestCommonDivisor("85", Integer.toString(Integer.MAX_VALUE)), 1);
  }

  @Test
  public void testGCDWithUnderBoundaryMaxNumber() {
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();
    Assert.assertEquals(gcd.greatestCommonDivisor(Integer.toString(Integer.MAX_VALUE - 1), "4563"),
        9);
    Assert.assertEquals(gcd.greatestCommonDivisor("4563", Integer.toString(Integer.MAX_VALUE - 1)),
        9);
  }

  @Test
  public void testGCDWithUpperBoundaryMaxNumber() {
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();
    Assert.assertEquals(
        gcd.greatestCommonDivisor((String) (Integer.toString(Integer.MAX_VALUE) + 1), "4533"), -1);
    Assert.assertEquals(
        gcd.greatestCommonDivisor("4533", (String) (Integer.toString(Integer.MAX_VALUE) + 1)), -1);
  }

  @Test
  public void testGCDWithNegativeNumber() {
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();
    Assert.assertEquals(gcd.greatestCommonDivisor("-999999999", "456"), 3);
    Assert.assertEquals(gcd.greatestCommonDivisor("456", "-999999999"), 3);
    Assert.assertEquals(gcd.greatestCommonDivisor("-999999999", "-456"), 3);
    Assert.assertEquals(gcd.greatestCommonDivisor("-456", "-999999999"), 3);
  }
}
