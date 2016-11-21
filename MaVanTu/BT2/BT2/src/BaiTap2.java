
public class BaiTap2 {
	// Cho mot so nguyen co it nhat 5 chu so.
	// Tra ve true neu: tong cac chu so la so chan va chia het cho 3 hoac 5.
	public boolean kiemTraTongCacChuSo(int n) {
		int tong = 0;
		int i = 0;
		while (n > 0) {
			tong += n % 10;
			n = n / 10;
			i++;
		}
		boolean result = false;
		// neu n khong du 5 chu so tra ve gia tri false
		if (i < 5)
			return result;
		if ((tong % 3 == 0 || tong % 5 == 0) && tong % 2 == 0) {
			result = true;
		}
		return result;
	}
}
