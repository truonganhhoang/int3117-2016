package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.DocSo;

public class TestDocSo {
	DocSo ds = new DocSo();

	@Test
	public void doc0() {
		String n = ds.docSo(0);
		assertEquals("khong", n);
	}
	@Test
	public void doc1() {
		String n = ds.docSo(1);
		assertEquals("mot", n);
	}
	@Test
	public void doc10() {
		String n = ds.docSo(10);
		assertEquals("muoi", n);
	}
	@Test
	public void doc11() {
		String n = ds.docSo(11);
		assertEquals("muoi mot", n);
	}
	@Test
	public void doc15() {
		String n = ds.docSo(15);
		assertEquals("muoi lam", n);
	}
	@Test
	public void doc20() {
		String n = ds.docSo(20);
		assertEquals("hai muoi", n);
	}
	@Test
	public void doc21() {
		String n = ds.docSo(21);
		assertEquals("hai muoi mot", n);
	}
	@Test
	public void doc25() {
		String n = ds.docSo(25);
		assertEquals("hai muoi lam", n);
	}
	@Test
	public void doc99() {
		String n = ds.docSo(99);
		assertEquals("chin muoi chin", n);
	}
	@Test
	public void doc100() {
		String n = ds.docSo(100);
		assertEquals("mot tram", n);
	}
	@Test
	public void doc101() {
		String n = ds.docSo(101);
		assertEquals("mot tram linh mot", n);
	}
	@Test
	public void doc110() {
		String n = ds.docSo(110);
		assertEquals("mot tram muoi", n);
	}
	@Test
	public void doc111() {
		String n = ds.docSo(111);
		assertEquals("mot tram muoi mot", n);
	}
	@Test
	public void doc125() {
		String n = ds.docSo(125);
		assertEquals("mot tram hai muoi lam", n);
	}
	@Test
	public void doc901() {
		String n = ds.docSo(901);
		assertEquals("chin tram linh mot", n);
	}
	@Test
	public void doc999() {
		String n = ds.docSo(999);
		assertEquals("chin tram chin muoi chin", n);
	}
	@Test
	public void doc1000() {
		String n = ds.docSo(1000);
		assertEquals("So nam ngoai khoang doc", n);
	}
	
}
