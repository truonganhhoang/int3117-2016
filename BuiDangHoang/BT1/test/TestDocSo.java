package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.DocSo;

public class TestDocSo {
	DocSo ds = new DocSo();

	@Test
	public void testDocDonVi() {
		assertEquals("mot", ds.docDonVi(1));
		assertEquals("hai", ds.docDonVi(2));
		assertEquals("ba", ds.docDonVi(3));
		assertEquals("bon", ds.docDonVi(4));
		assertEquals("nam", ds.docDonVi(5));
		assertEquals("sau", ds.docDonVi(6));
		assertEquals("bay", ds.docDonVi(7));
		assertEquals("tam", ds.docDonVi(8));
		assertEquals("chin", ds.docDonVi(9));
	}

	@Test
	public void testDocHangChuc() {
		String i = ds.docHangChuc(5);
		assertEquals("nam muoi", i);
	}

	@Test
	public void testDocSo() {
		String i = ds.docSo(22);
		assertEquals("hai muoi hai", i);
	}

	@Test
	public void testTinhTong() {
		int i = ds.tinhTong("chan", 6);
		assertEquals(12, i);
	}
}
