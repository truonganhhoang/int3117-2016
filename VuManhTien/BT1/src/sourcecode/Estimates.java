package sourcecode;

public class Estimates {
	
	public static int timSoLuongUoc(int number) {
		if (number < 1) return 0;
		
		int soLuongUoc = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) soLuongUoc++;
		}
		return soLuongUoc;
	}
}
