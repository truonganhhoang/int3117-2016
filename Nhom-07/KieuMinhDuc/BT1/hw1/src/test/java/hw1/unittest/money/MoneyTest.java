package hw1.unittest.money;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



import java.math.BigDecimal;
import java.util.Collection;
import java.util.Currency;
import java.util.HashSet;

import hw1.unittest.money.Money;


/**
 * Unit test for simple App.
 */
public class MoneyTest extends TestCase {
	private final static Currency DKK = Currency.getInstance("DKK");

	private final static Currency NOK = Currency.getInstance("NOK");

	private final static Currency JPY = Currency.getInstance("JPY");

	private final static Currency XDR = Currency.getInstance("XDR");
	
	
	public void testSum() {
		assertNull(Money.sum(null)); // Null-collection should give null-result
		Collection<Money> c = new HashSet<Money>();
		assertNull(Money.sum(c)); // Empty set should give null-result
		Money m1 = new Money(new BigDecimal("5.644445"), DKK);
		c.add(m1);
		Money m2 = new Money(new BigDecimal("5.55555"), DKK);
		c.add(m2);
		Money m3 = new Money(new BigDecimal("11.20"), DKK);
		Money sum = Money.sum(c);
		assertEquals(m3, sum);
		Money m4 = new Money(new BigDecimal("3.25"), NOK);
		c.add(m4);
		try {
			Money.sum(c);
			fail("Money.sum summarized Money of different currencies.");
		} catch (IllegalArgumentException iae) {
			// OK
		}
	}
	public void testSum2() {
		assertNull(Money.sum(null)); // Null-collection should give null-result
		Collection<Money> c = new HashSet<Money>();
		assertNull(Money.sum(c)); // Empty set should give null-result
		Money m1 = new Money(new BigDecimal("1.5"), DKK);
		c.add(m1);
		Money m2 = new Money(new BigDecimal("1.25"), DKK);
		c.add(m2);
		Money m3 = new Money(new BigDecimal("2.75"), DKK);
		Money sum = Money.sum(c);
		assertEquals(m3, sum);
		Money m4 = new Money(new BigDecimal("3.25"), NOK);
		c.add(m4);
		try {
			Money.sum(c);
			fail("Money.sum summarized Money of different currencies.");
		} catch (IllegalArgumentException iae) {
			// OK
		}
	}
	
	public void testEquals() {
		Money a = new Money(BigDecimal.valueOf(1.50d), DKK);
		Money b = new Money(BigDecimal.valueOf(1.50d), DKK);
		assertEquals(a, b);
		Money c = new Money(BigDecimal.valueOf(1.5d), DKK);
		assertEquals(a, c);
		Money d = new Money(BigDecimal.valueOf(2.00d), DKK);
		if (a.equals(d))
			fail("equals claims that " + a + " equals " + b);
		if (a.equals(null))
			fail("equas claims that " + a + " equals null");
	}

	
	public void testAdd() {
		Money a = new Money(BigDecimal.valueOf(1.50d), DKK);
		Money b = new Money(BigDecimal.valueOf(1.25d), DKK);
		Money c = a.add(b);
		Money d = new Money(BigDecimal.valueOf(2.75d), DKK);
		assertEquals(d, c);
	}
	public void testAdd_currencyValidation() {
		Money a = new Money(BigDecimal.valueOf(1.50d), DKK);
		Money b = new Money(BigDecimal.valueOf(1.25d), NOK);
		a.add(b);
	}
	
	public void testSubtract() {
		Money a = new Money(BigDecimal.valueOf(1.50d), DKK);
		Money b = new Money(BigDecimal.valueOf(1.25d), DKK);
		Money c = a.subtract(b);
		Money d = new Money(BigDecimal.valueOf(0.25d), DKK);
		assertEquals(d, c);
	}
	public void testSubtract_currencyValidation() {
		Money a = new Money(BigDecimal.valueOf(1.50d), DKK);
		Money b = new Money(BigDecimal.valueOf(1.50d), NOK);
		a.subtract(b);
	}

	public void testDivideEvenlyIntoParts_DKK() {
		Money _3point33 = new Money(new BigDecimal("3.33"), DKK);
		Money _3point34 = new Money(new BigDecimal("3.34"), DKK);

		Money m = new Money(BigDecimal.TEN, DKK);
		Money[] res = m.divideEvenlyIntoParts(3);
		assertEquals(_3point33, res[0]);
		assertEquals(_3point34, res[1]);
		assertEquals(_3point33, res[2]);

		m = new Money(new BigDecimal(20), DKK);
		res = m.divideEvenlyIntoParts(6);
		assertEquals(_3point33, res[0]);
		assertEquals(_3point34, res[1]);
		assertEquals(_3point33, res[2]);
		assertEquals(_3point33, res[3]);
		assertEquals(_3point34, res[4]);
		assertEquals(_3point33, res[5]);

		m = new Money(new BigDecimal("10.01"), DKK);
		res = m.divideEvenlyIntoParts(3);
		assertEquals(_3point34, res[0]);
		assertEquals(_3point33, res[1]);
		assertEquals(_3point34, res[2]);
	}

	
	// JPY have 0 decimals places
	public void testDivideEvenlyIntoParts_JPY() {
		Money _3 = new Money(new BigDecimal(3), JPY);
		Money _4 = new Money(new BigDecimal(4), JPY);

		Money m = new Money(BigDecimal.TEN, JPY);
		Money[] res = m.divideEvenlyIntoParts(3);
		assertEquals(_3, res[0]);
		assertEquals(_4, res[1]);
		assertEquals(_3, res[2]);

		m = new Money(new BigDecimal(20), JPY);
		res = m.divideEvenlyIntoParts(6);
		assertEquals(_3, res[0]);
		assertEquals(_4, res[1]);
		assertEquals(_3, res[2]);
		assertEquals(_3, res[3]);
		assertEquals(_4, res[4]);
		assertEquals(_3, res[5]);
	}

	
	// XDR has no specific number of decimal places.
	public void testDivideEvenlyIntoParts_XDR() {
		Money _3 = new Money(new BigDecimal("3.333333"), XDR);
		Money _4 = new Money(new BigDecimal("3.333334"), XDR);

		Money m = new Money(BigDecimal.TEN, XDR);
		Money[] res = m.divideEvenlyIntoParts(3);
		assertEquals(_3, res[0]);
		assertEquals(_4, res[1]);
		assertEquals(_3, res[2]);

		m = new Money(new BigDecimal(20), XDR);
		res = m.divideEvenlyIntoParts(6);
		assertEquals(_3, res[0]);
		assertEquals(_4, res[1]);
		assertEquals(_3, res[2]);
		assertEquals(_3, res[3]);
		assertEquals(_4, res[4]);
		assertEquals(_3, res[5]);

		m = new Money(new BigDecimal("10.000001"), XDR);
		res = m.divideEvenlyIntoParts(3);
		assertEquals(_4, res[0]);
		assertEquals(_3, res[1]);
		assertEquals(_4, res[2]);
	}
	public void testNegate() {
		Money m1 = new Money(BigDecimal.TEN, DKK);
		
		Money m2 = m1.newgate();
		assertEquals(m1, m2.newgate());
	}

	public void testAbs() {
		Money m1 = new Money(new BigDecimal(10), DKK);
		Money m2 = new Money(new BigDecimal(-10), DKK);
		assertEquals(m1, m2.abs());
	}

	
	public void testIsZero() {
		Money m = new Money(new BigDecimal(10), DKK);
		assertFalse(m.isZero());
		m = new Money(new BigDecimal(0), DKK);
		assertTrue(m.isZero());
		m = new Money(new BigDecimal(-10), DKK);
		assertFalse(m.isZero());
	}

	
	public void testIsNegative() {
		Money m = new Money(new BigDecimal(10), DKK);
		assertFalse(m.isNegative());
		m = new Money(new BigDecimal(0), DKK);
		assertFalse(m.isNegative());
		m = new Money(new BigDecimal(-10), DKK);
		assertTrue(m.isNegative());
	}

	
	public void testIsPositive() {
		Money m = new Money(new BigDecimal(10), DKK);
		assertTrue(m.isPositive());
		m = new Money(new BigDecimal(0), DKK);
		assertFalse(m.isPositive());
		m = new Money(new BigDecimal(-10), DKK);
		assertFalse(m.isPositive());
	}

	
	public void testCompareTo() {
		Money a = new Money(BigDecimal.valueOf(1.00d), DKK);
		Money b = new Money(BigDecimal.valueOf(2.00d), DKK);
		Money c = new Money(BigDecimal.valueOf(2.00d), DKK);
		assertEquals(-1, a.compareTo(b));
		assertEquals(0, b.compareTo(c));
		assertEquals(1, b.compareTo(a));
	}
	public void testCompareTo_currencyValidation() {
		Money a = new Money(BigDecimal.valueOf(1.50d), DKK);
		Money b = new Money(BigDecimal.valueOf(1.50d), NOK);
		a.compareTo(b);
	}

}
