package org.testng;

/**
 * @author Nguyen Thi Cam Van
 */
public class BigInteger {

	private String value;
	private int sign;

	BigInteger() {

		value = "null";
		sign = 0;
	}

	public int getSign() {
		if (value.startsWith("-")) {
			return sign = -1;
		}

		return sign = 1;
	}

	BigInteger(long init) {

		Long temp = init;
		value = temp.toString();
	}

	BigInteger(String init) throws NumberFormatException {

		if (init.startsWith("-")) {
			sign = -1;
			init = init.substring(1);
		}

		while (init.startsWith("0")) {
			init = init.substring(1);
		}

		if (init.length() == 0) {
			init = "0";
		}
		int i = 0;
		while (i < init.length()) {
			char temp;
			temp = init.charAt(i);
			if (!Character.isDigit(temp))
				throw new NumberFormatException();
			i++;
		}
		if (sign == -1)
			init = "-" + init;
		this.value = init;
	}

	public String toString() {

		while (value.startsWith("0")) {
			value = value.substring(1);
		}

		if (value.length() == 0) {
			value = "0";
		}

		return value;
	}

	public long toLong() {

		return Long.parseLong(value);
	}

	public int compareTo(BigInteger other) {

		int sign = 0;
		int sign1 = getSign();
		int sign2 = other.getSign();

		if (sign1 < sign2)
			return -1;

		if (sign1 > sign2)
			return 1;

		int i = 0;
		if (sign1 == 1 && sign2 == 1) {
			sign = 1;
			i = 0;
		}

		if (sign1 == -1 && sign2 == -1) {
			sign = -1;
			i = 1; // ignore "-"
		}

		if (sign1 == sign2) {
			if (value.length() > other.toString().length()) {
				return 1 * sign;
			} else if (value.length() < other.toString().length()) {
				return -1 * sign;
			} else {
				int len = value.length();
				while (i < len) {
					if (Integer.parseInt(value.substring(i, i + 1)) > Integer
							.parseInt(other.toString().substring(i, i + 1))) {
						return 1 * sign;
					} else if (Integer.parseInt(value.substring(i, i + 1)) < Integer
							.parseInt(other.toString().substring(i, i + 1))) {
						return -1 * sign;
					} else {
						i++;
					}
				} // end while
			}// end else
		}// end if

		return 0;
	}

	public BigInteger add(BigInteger other) {

		String s1 = new String();
		String s2 = new String();
		s1 = value;
		s2 = other.value;

		int sign1 = getSign();
		int sign2 = other.getSign();

		if (s1.startsWith("-")) {
			s1 = s1.substring(1);
		}

		if (s2.startsWith("-")) {
			s2 = s2.substring(1);
		}

		BigInteger bigS1 = new BigInteger(s1);
		BigInteger bigS2 = new BigInteger(s2);

		if (bigS1.compareTo(bigS2) == -1) {
			String strSwap = s1;
			s1 = s2;
			s2 = strSwap;

			int intSwap = sign1;
			sign1 = sign2;
			sign2 = intSwap;
		}

		int len1 = s1.length();
		int len2 = s2.length();
		int lenMax = Math.max(len1, len2);

		while (len1 < lenMax) {
			s1 = "0" + s1;
			len1++;
		}

		while (len2 < lenMax) {
			s2 = "0" + s2;
			len2++;
		}

		String strResult = new String();

		int i = lenMax - 1;
		int temp = 0;

		while (i >= 0) {
			int num1 = Integer.parseInt(s1.substring(i, i + 1));
			int num2 = Integer.parseInt(s2.substring(i, i + 1));
			int intResult = num1 + num2 + temp;

			temp = intResult / 10;

			intResult = intResult % 10;
			strResult = Integer.toString(intResult) + strResult;
			i--;
		}

		if (temp == 1) {
			strResult = Integer.toString(temp) + strResult;
		}

		if (sign1 == -1 && sign2 == -1) {
			strResult = "-" + strResult;
		}

		if (sign1 == -1 && sign2 == 1) {
			strResult = "-" + bigS1.subtract(bigS2).toString();
		}

		if (sign1 == 1 && sign2 == -1) {
			strResult = bigS1.subtract(bigS2).toString();
		}

		return new BigInteger(strResult);
	}

	public BigInteger subtract(BigInteger other) {

		String s1 = new String();
		String s2 = new String();
		s1 = value;
		s2 = other.value;

		int sign = 0;
		int sign1 = getSign();
		int sign2 = other.getSign();

		if (s1.startsWith("-")) {
			s1 = s1.substring(1);
		}

		if (s2.startsWith("-")) {
			s2 = s2.substring(1);
		}

		BigInteger bigS1 = new BigInteger(s1);
		BigInteger bigS2 = new BigInteger(s2);

		if (bigS1.compareTo(bigS2) == -1) {
			String strSwap = s1;
			s1 = s2;
			s2 = strSwap;

			int intSwap = sign1;
			sign1 = sign2;
			sign2 = intSwap;

			sign = -1;
		}

		int len1 = s1.length();
		int len2 = s2.length();
		int lenMax = Math.max(len1, len2);

		while (len1 < lenMax) {
			s1 = "0" + s1;
			len1++;
		}

		while (len2 < lenMax) {
			s2 = "0" + s2;
			len2++;
		}

		String strResult = new String();

		int i = lenMax - 1;
		int temp = 0;

		while (i >= 0) {
			int num1 = Integer.parseInt(s1.substring(i, i + 1));
			int num2 = Integer.parseInt(s2.substring(i, i + 1));
			int intResult;
			num2 = num2 + temp;

			if (num1 < num2) {
				num1 += 10;
				temp = 1;
			} else {
				temp = 0;
			}

			intResult = num1 - num2;

			strResult = Integer.toString(intResult) + strResult;
			i--;
		}

		if (sign1 == 1 && sign2 == 1 && sign == -1) {
			strResult = "-" + strResult;
		}

		if (sign1 == -1 && sign2 == -1 && sign != -1) {
			strResult = "-" + strResult;
		}

		if (sign1 == -1 && sign2 == 1) {
			strResult = "-" + bigS1.add(bigS2).toString();
			if (sign == -1) {
				strResult = bigS1.add(bigS2).toString();
			}
		}

		if (sign1 == 1 && sign2 == -1) {
			strResult = bigS1.add(bigS2).toString();
			if (sign == -1) {
				strResult = "-" + bigS1.add(bigS2).toString();
			}
		}

		return new BigInteger(strResult);
	}

	public boolean equals(Object other) {
		return toString().equals(other.toString());
	}

	public BigInteger clone() {

		String temp = new String();
		temp = toString();
		return new BigInteger(temp);
	}

}
