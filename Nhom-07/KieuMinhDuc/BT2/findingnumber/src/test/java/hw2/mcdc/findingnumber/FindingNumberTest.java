package hw2.mcdc.findingnumber;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class FindingNumberTest extends TestCase {
	
	public void testTrueTrueFalse() {
		FindingNumber findingNumber = new FindingNumber();
		int a = 4;
		assertEquals(true, findingNumber.isValidate(a));
	}

	public void testTrueFalseFalse() {
		FindingNumber findingNumber = new FindingNumber();
		int a = 100;
		assertEquals(true, findingNumber.isValidate(a));
	}

	public void testFalseTrueTrue() {
		FindingNumber findingNumber = new FindingNumber();
		int a = 800;
		assertEquals(true, findingNumber.isValidate(a));
	}

	public void testFalseTrueFalse() {
		FindingNumber findingNumber = new FindingNumber();
		int a = 300;
		assertEquals(true, findingNumber.isValidate(a));
	}
	public void testCountingNumber() {		
		FindingNumber findingNumber = new FindingNumber();
		int a = 400;
		assertEquals(true, findingNumber.isCountingEvenNumber(a));
	}
}
