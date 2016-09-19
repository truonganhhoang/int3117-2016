package btvn1.unittest.money;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



import java.math.BigDecimal;
import java.util.Collection;
import java.util.Currency;
import java.util.HashSet;


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
		Money m1 = new Money(new BigDecimal("1.50"), DKK);
		c.add(m1);
		Money m2 = new Money(new BigDecimal("1.75"), DKK);
		c.add(m2);
		Money m3 = new Money(new BigDecimal("3.25"), DKK);
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

	
	

	
	public void testSubtract() {
		Money a = new Money(BigDecimal.valueOf(1.50d), DKK);
		Money b = new Money(BigDecimal.valueOf(1.25d), DKK);
		Money c = a.subtract(b);
		Money d = new Money(BigDecimal.valueOf(0.25d), DKK);
		assertEquals(d, c);
	}


	public void testNegate() {
		Money m1 = new Money(BigDecimal.TEN, DKK);
		Money m2 = m1.negate();
		assertEquals(m1, m2.negate());
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


}
