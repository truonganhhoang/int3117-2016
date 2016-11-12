package main;
public class TimSo {
	public int specialCalculator(int number) {
		int sum = 0;
		if (number < 0 | number > 100) {
			return 0;
		} else {
			if ((number % 2 == 0 & number % 3 == 0) | number % 5 == 0) {
				int i = 0;
				while (i < 100) {
					if (i % number == 0) {
						sum += i;
					}
					i++;
				}
				return sum;
			}
		}
		return 0;
	}
}
