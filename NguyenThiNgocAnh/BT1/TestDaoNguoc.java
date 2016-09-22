package pkdm;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDaoNguoc {

	@Test
	public void test() {
		
		SoDaoNguoc num = new SoDaoNguoc();
		//test ham doa nguoc so
		//so doi xung
		int k = num.DaoNguocSo(121);
		assertEquals(121, k);
		//so khong doi xung
		int s = num.DaoNguocSo(123);
		assertEquals(321, s);
		//test ham so sanh
		//so doi xung
		int e = num.SoSanh(22022, num.DaoNguocSo(22022));
		assertEquals(1, e);
		//so khong doi xung
		int t = num.SoSanh(132, num.DaoNguocSo(132));
		assertEquals(0, t);
		//gt nho nhat
		int a = num.SoSanh(-2147483648, num.DaoNguocSo(-2147483648));
		assertEquals(0, a);
		//gt ngay tren nho nhat
		int b = num.SoSanh(-2147483647, num.DaoNguocSo(-2147483647));
		assertEquals(0, b);
		//mot so gt binh thuong
		//so 0
		int i = num.SoSanh(0, num.DaoNguocSo(0));
		assertEquals(1, i);
		//so -1
		int j = num.SoSanh(-1, num.DaoNguocSo(-1));
		assertEquals(1, j);
		
		//gt ngay duoi gt lon nhat
		int c = num.SoSanh(2147483646, num.DaoNguocSo(2147483646));
		assertEquals(0, c);
		//gt lon nhat
		int d = num.SoSanh(2147483647, num.DaoNguocSo(2147483647));
		assertEquals(0, d);
	}

}
