package com.KTDBCL.SoNguyenTo;

public class SoNguyenTo {
	int number;

	public SoNguyenTo(int number) {
		this.number = number;
	}

	public boolean kiemTra() {
		if (number <= 1) {
			return false;
		} else {
			for (int i = 2; i <= number/2; i++) {
				if (number % i == 0)
					return false;
			}
			return true;
		}
	}
}
