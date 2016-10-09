package test;

import static org.junit.Assert.*;
import main.SoNguyen;

import org.junit.Test;

public class TestSoNguyenToLonNhatNhoHonN {

	@Test
	public void test() {
		SoNguyen soNguyen = new SoNguyen(15);
		int soNTLN = soNguyen.soNguyenToLonNhatNhoHonN();
		assertEquals(soNTLN, 13);
	}
	
	@Test 
	public void testFail(){
		SoNguyen soNguyen = new SoNguyen(15);
		int soNTLN = soNguyen.soNguyenToLonNhatNhoHonN();
		assertNotEquals(soNTLN, 5);
	}

	@Test
	public void testSoNguyenLon(){
		SoNguyen soNguyen = new SoNguyen(100000);
		int soNTLN = soNguyen.soNguyenToLonNhatNhoHonN();
		assertEquals(soNTLN,99991);
	}
	
	@Test
	public void testSoNguyenAm(){
		SoNguyen soNguyen = new SoNguyen(-10);
		int soNTLN = soNguyen.soNguyenToLonNhatNhoHonN();
		assertEquals(soNTLN,0);
	}
	
	@Test
	public void testSoNguyenDauTien(){
		SoNguyen soNguyen = new SoNguyen(3);
		int soNTLN = soNguyen.soNguyenToLonNhatNhoHonN();
		assertEquals(soNTLN,2);
	}
	
}
