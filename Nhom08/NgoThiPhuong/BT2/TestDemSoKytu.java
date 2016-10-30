package phuongnt58.bt2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDemSoKytu {

	@Test
	public void testDemSoKytu1() {
		SoKyTu dem = new SoKyTu();
		int result = dem.demSoKyTu("");
		assertEquals(0, result);
	}
	
	@Test
	public void testDemSoKytu2() {
		SoKyTu dem = new SoKyTu();
		int result = dem.demSoKyTu("Kiem thu phan mem");
		assertEquals(14, result);
	}
	
	@Test
	public void testDemSoKytu3() {
		SoKyTu dem = new SoKyTu();
		int result = dem.demSoKyTu(" ");
		assertEquals(0, result);
	}
	
	@Test
	public void testDemSoKytu4() {
		SoKyTu dem = new SoKyTu();
		int result = dem.demSoKyTu("Tot ");
		assertEquals(3, result);
	}
	
	@Test
	public void testDemSoKytu5() {
		SoKyTu dem = new SoKyTu();
		int result = dem.demSoKyTu(" Tot");
		assertEquals(3, result);
	}
	
	@Test
	public void testDemSoKytu6() {
		SoKyTu dem = new SoKyTu();
		int result = dem.demSoKyTu("kiem thu phan mem");
		assertEquals(14, result);
	}
	
	@Test
	public void testDemSoKytu7() {
		SoKyTu dem = new SoKyTu();
		int result = dem.demSoKyTu("kieM");
		assertEquals(4, result);
	}
	
	@Test
	public void testDemSoKytu8() {
		SoKyTu dem = new SoKyTu();
		int result = dem.demSoKyTu(" Tốt");
		assertEquals(2, result);
	}
	
	@Test
	public void testDemSoKytu9() {
		SoKyTu dem = new SoKyTu();
		int result = dem.demSoKyTu("ớ");
		assertEquals(0, result);
	}
	
	public void testDemSoKytu10() {
		SoKyTu dem = new SoKyTu();
		int result = dem.demSoKyTu("KIEM THU");
		assertEquals(7, result);
	}
}
