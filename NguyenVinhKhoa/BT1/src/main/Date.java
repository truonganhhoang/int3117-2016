package main;

public class Date {
	private int d;
	private int m;
	private int y;
	private int[] numOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Date(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;

		if (!isValid(d, m, y)) {
			throw new IllegalArgumentException("Values for Date are invalid");
		}
	}

	public boolean isLeapYear() {
		if (y % 4 != 0) return false;
		if (y % 100 != 0) return true;
		if (y % 400 != 0) return false;
		return true;
	}
	
	public boolean isValid(int d, int m, int y) {
		if (m < 1 || m > 12) return false;
		if (d < 1) return false;
		
		if (m != 2) {
			if (d > numOfDays[m - 1]) return false;
		} else {
			if (isLeapYear()) {
				if (d > 29) return false;
			} else {
				if (d > 28) return false;
			}
		}

		return true;
	}
	
	public boolean isEndOfMonth() {		
		if (m != 2) {
			if (d == numOfDays[m - 1]) return true;
		} else {
			if (isLeapYear()) {
				if (d == 29) return true;
			} else {
				if (d == 28) return true;
			}
		}
		
		return false;
	}
	
	public Date nextDate() {
		int d1 = d, m1 = m, y1 = y;
		
		if (isEndOfMonth()) {
			d1 = 1;
			if (m1 == 12) {
				m1 = 1;
				y1 ++;
			} else {
				m1 ++;
			}
		} else {
			d1 ++;
		}
		
		Date result = new Date(d1, m1, y1);
		return result;
	}
	
	@Override
	public boolean equals(Object date) {
		Date tempDate = (Date)date;
		if (tempDate.d == this.d && tempDate.m == this.m && tempDate.y == this.y) return true;
		else return false;
	}
}
