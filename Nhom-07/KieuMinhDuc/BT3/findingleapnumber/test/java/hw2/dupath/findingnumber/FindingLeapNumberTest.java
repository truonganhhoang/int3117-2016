package hw2.dupath.findingnumber;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class FindingLeapNumberTest 
    extends TestCase
{
	public void testCountingLeapNumber() {		
		FindingLeapNumber findingLeapNumber = new FindingLeapNumber();
		int a = 300;
		assertEquals(true, findingLeapNumber.isCountingEvenLeapNumber(a));
	}
}
