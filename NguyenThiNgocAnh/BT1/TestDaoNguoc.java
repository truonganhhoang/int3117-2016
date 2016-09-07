package pkdm;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDaoNguoc {

	@Test
	public void test() {
		
		SoDaoNguoc num = new SoDaoNguoc();
		//SoDaoNguoc num2 = new SoDaoNguoc();
		//test hàm đảo ngược số
		//số đối xứng
		int k = num.DaoNguocSo(121);
		assertEquals(121, k);
		//số không đối xứng
		int d = num.DaoNguocSo(123);
		assertEquals(321, d);
		//test hàm so sánh
		//số đối xứng thì có số đảo ngược bằng chính nó
		int e = num.SoSanh(22022, num.DaoNguocSo(22022));
		assertEquals(1, e);
		//số không đối xứng không bằng số đảo ngược
		int t = num.SoSanh(132, num.DaoNguocSo(132));
		assertEquals(0, t);
	}

}
