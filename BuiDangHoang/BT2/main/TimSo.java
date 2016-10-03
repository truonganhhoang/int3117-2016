package main;

import java.util.ArrayList;
import java.util.List;

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

	public List<Integer> tim(int number) {
		List<Integer> result = new ArrayList<Integer>();
		int n = 0;
		while (n < number) {
			if (0 < n | n > 1000) {
				return result;
			} else {
				if (kiemTraSo(number)) {
					result.add(n);
				}
			}
			n++;
		}
		return result;
	}
}
