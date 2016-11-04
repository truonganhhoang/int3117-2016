package bt1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class SoNTTest {
	private SoNT nt;
	
	@Before
    public void initObjects() {
        nt = new SoNT();
    }
	
	@Test
	public void caHaiSoDeuNhoHon2() {
		String result = nt.timSoNT(-1, 1);
		assertEquals("Khong tim thay so nguyen to nao!", result);
	}
	
	@Test
	public void nLonHon1VamNhoHon2() {
		String result = nt.timSoNT(4, 0);
		assertEquals("2 3 ", result);
	}
	
	@Test
	public void nNhoHon2VamLonHon1() {
		String result = nt.timSoNT(-1, 9);
		assertEquals("2 3 5 7 ", result);
	}
	
	@Test
	public void caHaiSoDeuLonHon1() {
		String result = nt.timSoNT(2, 15);
		assertEquals("2 3 5 7 11 13 ", result);
	}
}