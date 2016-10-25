package BaiTap3;

public class baitap3 {
	public static int TinhTong(int[] a) {
		int i = 0;
		int tong = 0;
		while (i < a.length) {
			if((a[i] % 2 == 0 && a[i] >= 0) || (a[i] % 2 != 0 && a[i] < 0)) {
				tong += a[i];
			}
			i++;
		}
		return tong;
	}
}
