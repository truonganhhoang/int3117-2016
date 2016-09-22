package com.KTDBCL.SoNguyenTo;

public class SoNguyenTo {

	public boolean kiemTra(int number) {
		if (number <= 1) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0)
					return false;
			}
			return true;
		}
	}
}
