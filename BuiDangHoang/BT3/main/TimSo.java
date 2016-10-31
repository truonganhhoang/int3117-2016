package main;

public class TimSo {

	public boolean kiemTraSo(int number) {
		boolean result = false;
		if (number < 0 | number > 1000) {
			return false;
		} else {
			if ((number % 3 == 0 & number % 5 == 0) | number % 7 == 0) {
				return true;
			}
		}
		return result;
	}
}
