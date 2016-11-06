/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author Administrator
 */
public class BT2 {
	// Cho mot so nguyen co it nhat 5 chu so.
	// Tra ve true neu: tong cac chu so la so chan va chia het cho 3 hoac 4.
	public boolean ham(int n) {
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
		if ((tong % 3 == 0 || tong % 4 == 0) && tong % 2 == 0) {
			result = true;
		}
		return result;
	}
}
