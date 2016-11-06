package main;

public class Range {
	
	private int startIndex;
	private int endIndex;
	
	Range(int startIndex, int endIndex) {
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}
	
	public boolean isDivisible() {
		int sum = 0;
		for (int i = startIndex; i <= endIndex; i++) {
			sum += i;
		}
		
		if (sum % 2 == 0) {
			sum ++;
		} else {
			sum --;
		}

		if (sum % 2 == 0 && sum % 3 == 0 || sum % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
