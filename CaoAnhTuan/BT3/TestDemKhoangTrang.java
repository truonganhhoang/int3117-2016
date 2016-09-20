package kiemthu;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDemKhoangTrang {
	@Test
	public void TestDem() {
		DemKhoangTrang dkt = new DemKhoangTrang();
		int kq = dkt.Dem("kiem thu va dam bao chat luong phan mem");
		//kiem thu gia tri bien
		assertEquals(0, kq);
		assertEquals(1, kq);
		assertEquals(8, kq);
		assertEquals(9, kq);
		assertEquals(10, kq);
	}
}
