import static org.junit.Assert.*;

import org.junit.Test;

public class TestTamGiac {
	public TamGiac tamgiac =new TamGiac();
	public String result;
	@Test
	public void testItHon3PT() {
		int a[]={2,4};
		result= tamgiac.DemTamGiac(a, 2);
		assertEquals("0 Tam giac thuong, 0 Tam giac can, 0 Tam giac deu, 0 Tam giac vuong !", result);
	}

	@Test
	public void testGiaTriAm() {
		int a[]={-1,3,-3,4,-2};
		result= tamgiac.DemTamGiac(a, 5);
		assertEquals("0 Tam giac thuong, 0 Tam giac can, 0 Tam giac deu, 0 Tam giac vuong !", result);
	}
	@Test
	public void testKhongTG() {
		int a[]={1,3,2,5,1};
		result= tamgiac.DemTamGiac(a, 5);
		assertEquals("0 Tam giac thuong, 0 Tam giac can, 0 Tam giac deu, 0 Tam giac vuong !", result);
	}
	
	@Test
	public void testTGThuong() {
		int a[]={3,6,4};
		result= tamgiac.DemTamGiac(a,3 );
		assertEquals("1 Tam giac thuong, 0 Tam giac can, 0 Tam giac deu, 0 Tam giac vuong !", result);
	}
	@Test
	public void testTGCanDeu() {
		int a[]={3,3,5,3,3};
		result= tamgiac.DemTamGiac(a, 5);
		assertEquals("0 Tam giac thuong, 6 Tam giac can, 4 Tam giac deu, 0 Tam giac vuong !", result);
	}
	
	@Test
	public void testTGVuong1() {
		int a[]={3,4,5};
		result= tamgiac.DemTamGiac(a, 3);
		assertEquals("0 Tam giac thuong, 0 Tam giac can, 0 Tam giac deu, 1 Tam giac vuong !", result);
	}
	@Test
	public void testTGVuong2() {
		int a[]={3,5,4};
		result= tamgiac.DemTamGiac(a, 3);
		assertEquals("0 Tam giac thuong, 0 Tam giac can, 0 Tam giac deu, 1 Tam giac vuong !", result);
	}
	@Test
	public void testTGVuong3() {
		int a[]={5,4,3};
		result= tamgiac.DemTamGiac(a, 3);
		assertEquals("0 Tam giac thuong, 0 Tam giac can, 0 Tam giac deu, 1 Tam giac vuong !", result);
	}

}
