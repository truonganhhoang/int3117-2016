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
	public void kiemTraSo7() {
		int n = ts.specialCalculator(7);
		assertEquals(0, n);
	}

	@Test
	public void kiemtraSo101() {
		int n = ts.specialCalculator(101);
		assertEquals(0, n);
	}

}
