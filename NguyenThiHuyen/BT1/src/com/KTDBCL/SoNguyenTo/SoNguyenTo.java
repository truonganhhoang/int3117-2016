package com.KTDBCL.SoNguyenTo;

public class SoNguyenTo {
	int soKT;

	public SoNguyenTo(int _soKT) {
		soKT = _soKT;
	}

	public boolean kiemTra() {
		int d = 0;
		if (soKT <= 0) {
			return false;
		} else {
			for (int i = 1; i <= soKT; i++) {
				if (soKT % i == 0)
					d++;
			}
			if (d == 2)
				return true;
			else
				return false;
		}
	}

}
