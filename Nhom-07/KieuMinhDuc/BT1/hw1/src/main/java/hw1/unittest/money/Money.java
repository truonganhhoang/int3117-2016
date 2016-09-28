package hw1.unittest.money;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;

/**
 * Money
 *
 */
public class Money 
{
	public static final RoundingMode DEFAULT_ROUNDING_MODE = RoundingMode.UNNECESSARY;

	private BigDecimal amount;
	private Currency currency;

	private Money() {
	}

	public Money(BigDecimal amount, Currency currency) {
		this(amount, currency, DEFAULT_ROUNDING_MODE);
	}

	public Money(BigDecimal amount, Currency currency, RoundingMode roundingMode) {
		int scale = currency.getDefaultFractionDigits();
		if (scale < 0)
			scale = 6;
		this.amount = amount.setScale(scale, roundingMode);
		this.currency = currency;
	}

	
	BigDecimal getAmount() {
		return amount;
	}

	public String getCurrencyCode() {
		return currency.getCurrencyCode();
	}

	
	private void checkCurrency(Money other) {
		if (other.currency != currency)
			throw new IllegalArgumentException(
					"Amounts must have same currency.");
	}

	
	public static Money sum(Collection<Money> monies) {
		if (monies == null || monies.size() == 0)
			return null;
		Iterator<Money> iter = monies.iterator();
		Money money = iter.next();
		BigDecimal sum = money.amount;
		Currency currency = money.currency;
		while (iter.hasNext()) {
			money = iter.next();
			if (money.currency != currency) {
				throw new IllegalArgumentException(
						"Amounts must have same currency.");
			}
			sum = sum.add(money.amount);
		}
		return new Money(sum, currency);
	}
	public Money[] divideEvenlyIntoParts(int parts) {
		Money[] res = new Money[parts];
		final BigDecimal bdParts = new BigDecimal(parts);
		final MathContext mc = MathContext.DECIMAL128;
		BigDecimal sumOfPreviousParts = BigDecimal.ZERO;
		for (int i = 0; i < parts; i++) {
			Money part = new Money();
			BigDecimal sumOfParts = amount.multiply(new BigDecimal(i + 1));
			sumOfParts = sumOfParts.divide(bdParts, mc);
			sumOfParts = sumOfParts.setScale(amount.scale(), mc
					.getRoundingMode());
			part.amount = sumOfParts.subtract(sumOfPreviousParts);
			sumOfPreviousParts = sumOfParts;
			part.currency = currency;
			res[i] = part;
		}
		return res;
	}

	
	public Money add(Money augend) {
		checkCurrency(augend);
		return new Money(amount.add(augend.amount), currency);
	}

	
	public Money subtract(Money subtrahend) {
		checkCurrency(subtrahend);
		return new Money(amount.subtract(subtrahend.amount), currency);
	}

	
	public Money newgate() {
		Money newMoney = new Money();
		newMoney.amount = amount.negate();
		newMoney.currency = currency;
		return newMoney;
	}

	
	public Money abs() {
		if (amount.compareTo(BigDecimal.ZERO) >= 0)
			return this;
		return newgate();
	}

	public boolean isZero() {
		return (amount.compareTo(BigDecimal.ZERO) == 0);
	}

	public boolean isNegative() {
		return (amount.compareTo(BigDecimal.ZERO) < 0);
	}

	public boolean isPositive() {
		return (amount.compareTo(BigDecimal.ZERO) > 0);
	}

	
	public int compareTo(Money val) {
		checkCurrency(val);
		return amount.compareTo(val.amount);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Money other = (Money) obj;
		if (other.currency != currency)
			return false;
		return amount.compareTo(other.amount) == 0;
	}

}
