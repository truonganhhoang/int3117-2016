package pkdm2;

import java.util.*;

public class NamNhuan {

	public int TimNamNhuan(int nam) {

		if ((nam % 400 == 0) || (nam % 100 != 0 && nam % 4 == 0)) {
			int x = nam % 19;
			if (x == 0 || x == 3 || x == 6 || x == 8 || x == 11 || x == 14 || x == 17) {

				return 0;
			} else
				return 1;
		} else
			return 2;
	}

	public static void main(String[] args) {
		NamNhuan nam = new NamNhuan();
		System.out.println(nam.TimNamNhuan(1900));
		// 0: la nam nhuan ca am lich va duong lich;
		// 1: la nam nhuan duong lich;
		// 2: khong phai la nam nhuan;
	}
}
