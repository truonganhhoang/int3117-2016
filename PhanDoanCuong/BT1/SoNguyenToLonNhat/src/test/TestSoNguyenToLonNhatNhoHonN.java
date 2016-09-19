package test;

import static org.junit.Assert.*;
import main.SoNguyen;

import org.junit.Test;

public class TestSoNguyenToLonNhatNhoHonN {

	@Test
	//Đầu vào chuẩn, trong phạm vi giá trị cho phép
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
	//Đầu vào lớn hơn giá trị MAX_INT
	public void testSoNguyenLon(){
		SoNguyen soNguyen = new SoNguyen(2147483648L);
		int soNTLN = soNguyen.soNguyenToLonNhatNhoHonN();
		assertEquals(soNTLN,0);
	}
	
	@Test
	//Đầu vào nhỏ hơn 1
	public void testSoNguyenAm(){
		SoNguyen soNguyen = new SoNguyen(-10);
		int soNTLN = soNguyen.soNguyenToLonNhatNhoHonN();
		assertEquals(soNTLN,0);
	}
	
}
