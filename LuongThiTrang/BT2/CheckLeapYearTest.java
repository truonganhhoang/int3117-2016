package leapYear;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckLeapYearTest {
	public static String INVALID_YEAR = "Invalid year";
	public static String NOT_RIGHT_LEAP_YEAR = "Not right leap year";
	public static String RIGHT_LEAP_YEAR = "Right leap year";
  @Test
  public void testInvalidYearWithYearOver2016() {
	  
	 CheckLeapYear year = new CheckLeapYear();
	 //Assert.assertEquals(INVALID_YEAR,year.checkYear(0));
	 Assert.assertEquals(INVALID_YEAR,year.checkYear(20000));
	 
  }
  
  @Test
  public void testInvalidYearWithYearUnder0() {
	  
	 CheckLeapYear year = new CheckLeapYear();
	 Assert.assertEquals(INVALID_YEAR,year.checkYear(0));
	 //Assert.assertEquals(INVALID_YEAR,year.checkYear(20000));
	 
  }
  @Test
  public void testNotRightLeapYear() {
	  
	 CheckLeapYear year = new CheckLeapYear();
	 Assert.assertEquals(NOT_RIGHT_LEAP_YEAR,year.checkYear(2015));
	 
  }
  
  @Test
  public void testRightLeapYear4_100_n400() {
	  
	 CheckLeapYear year = new CheckLeapYear();
	 Assert.assertEquals(RIGHT_LEAP_YEAR,year.checkYear(2016));
	 
  }
  
  @Test
  public void testRightLeapYear4_100_400() {
	  
	 CheckLeapYear year = new CheckLeapYear();
	 Assert.assertEquals(RIGHT_LEAP_YEAR,year.checkYear(1600));
	 
  }
  
}




