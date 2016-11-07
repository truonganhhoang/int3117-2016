package chinhvm;

public class FindDateNumber {
	private int d;
	private int m;
	private int y;
	
	private int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	
	public FindDateNumber(int day, int month, int year) {
		// TODO Auto-generated constructor stub
		if(!checkValid(day, month, year)) {
			throw new IllegalArgumentException("Nhap sai");
		}
		
		this.d = day;
		this.m = month;
		this.y = year;
	}
	
	public boolean checkValid(int day, int month, int year) {
		if(month < 1 || month > 12) return false;
		if(day < 1 || day > 31) return false;
		
		if(month == 2) {
			if(checkLeapYear(year)) {
				if(day > 29) return false;
			} else {
				if(day > 28) return false;
			}
		} else {
			if(day > days[month - 1]) return false;
		}
			
		return true;
	}
	
	public boolean checkLeapYear(int year) {
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) return true;
		return false;
	}
	
	
	public int dayInYear() {
		int result = d;
		for(int i = 1; i < m; i++) {
			result += days[i-1]; 
		}
		
		if(m > 2 && checkLeapYear(y)) {
			result += 1;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		FindDateNumber f = new FindDateNumber(31, 12, 2004);
		System.out.println(f.dayInYear());
	}
}
