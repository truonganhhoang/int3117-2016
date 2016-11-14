package main;

public class Number {
	public static long MAX_INT = 2147483647L;
	private int number;

	public Number(int n) {
		number = n;
	}

	public Number(long n) {
		if (n >= MAX_INT)
			number = 0;
		else
			number = (int) n;
	}

	/**
	 * Find max prime number less than N
	 * @return max prime number less than N if prime number be found. 0 if prime number not be found
	 */
	public int findPrimeNumberLessThanN() {
		int result = 0;
		for (result = number - 1; result > 1; result--) {
			if (isPrimeNumber(result))
				break;
		}
		if (result <= 1)
			result = 0;
		return result;
	}

	/**
	 * Check prime number
	 * 
	 * @param n
	 *            is a whole number
	 * @return true if n is prime number
	 */
	public boolean isPrimeNumber(int n) {
		if (n < 2)
			return false;
		else if (n == 2)
			return true;
		else {
			boolean result = true;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					result = false;
					break;
				}
			}
			return result;
		}
	}

}
