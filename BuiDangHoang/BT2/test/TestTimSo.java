package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.TimSo;

public class TestTimSo {
	TimSo ts = new TimSo();
	List<Integer> lst = new ArrayList<Integer>();

	@Test
	public void kiemTraSo30() {
		int n = ts.specialCalculator(30);
		assertEquals(180, n);
	}

	@Test
	public void kiemTraSo15() {
		int n = ts.specialCalculator(15);
		assertEquals(315, n);
	}

	@Test
	public void kiemTraSo10() {
		int n = ts.specialCalculator(10);
		assertEquals(450, n);
	}

	@Test
	public void kiemTraSo13() {
		int n = ts.specialCalculator(13);
		assertEquals(0, n);
	}

	@Test
	public void kiemTraSoAm1() {
		int n = ts.specialCalculator(-1);
		assertEquals(0, n);
	}

	@Test
	public void kiemtraSo101() {
		int n = ts.specialCalculator(101);
		assertEquals(0, n);
	}

}
