package chinhvm;

public class FindSpecialYear {
	int y1;
	int y2;

	public FindSpecialYear(int year1, int year2) {
		// TODO Auto-generated constructor stub
		if(year1 < 0 || year2 < 0 || year1 > year2) {
			throw new IllegalArgumentException("Invalid Input, check again!!!");
		} 
		
		this.y1 = year1;
		this.y2 = year2;
	}
	
	public int findYear() {
		int count = 0;
		
		for(int i = y1; i <= y2; i++) {
			if((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0)) {
				count++;
			}
			
			if(i % 12 == 3) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		FindSpecialYear y = new FindSpecialYear(1900, 2015);
		System.out.println(y.findYear());
	}
}
