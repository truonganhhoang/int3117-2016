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
	public void doc2() {
		String n = ds.docSo(2);
		assertEquals("hai", n);
	}
	@Test
	public void doc3() {
		String n = ds.docSo(3);
		assertEquals("ba", n);
	}
	@Test
	public void doc4() {
		String n = ds.docSo(4);
		assertEquals("bon", n);
	}
	@Test
	public void doc5() {
		String n = ds.docSo(5);
		assertEquals("nam", n);
	}
	@Test
	public void doc6() {
		String n = ds.docSo(6);
		assertEquals("sau", n);
	}
	@Test
	public void doc7() {
		String n = ds.docSo(7);
		assertEquals("bay", n);
	}
	@Test
	public void doc8() {
		String n = ds.docSo(8);
		assertEquals("tam", n);
	}@Test
	public void doc9() {
		String n = ds.docSo(9);
		assertEquals("chin", n);
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
	public void doc30() {
		String n = ds.docSo(30);
		assertEquals("ba muoi", n);
	}
	@Test
	public void doc45() {
		String n = ds.docSo(45);
		assertEquals("bon muoi lam", n);
	}
	@Test
	public void doc50() {
		String n = ds.docSo(50);
		assertEquals("nam muoi", n);
	}
	@Test
	public void doc60() {
		String n = ds.docSo(60);
		assertEquals("sau muoi", n);
	}
	@Test
	public void doc70() {
		String n = ds.docSo(70);
		assertEquals("bay muoi", n);
	}
	@Test
	public void doc80() {
		String n = ds.docSo(80);
		assertEquals("tam muoi", n);
	}
	@Test
	public void doc90() {
		String n = ds.docSo(90);
		assertEquals("chin muoi", n);
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
	public void doc200() {
		String n = ds.docSo(200);
		assertEquals("hai tram", n);
	}
	@Test
	public void doc300() {
		String n = ds.docSo(300);
		assertEquals("ba tram", n);
	}
	@Test
	public void doc400() {
		String n = ds.docSo(400);
		assertEquals("bon tram", n);
	}
	@Test
	public void doc500() {
		String n = ds.docSo(500);
		assertEquals("nam tram", n);
	}
	@Test
	public void doc600() {
		String n = ds.docSo(600);
		assertEquals("sau tram", n);
	}
	@Test
	public void doc700() {
		String n = ds.docSo(700);
		assertEquals("bay tram", n);
	}
	@Test
	public void doc800() {
		String n = ds.docSo(800);
		assertEquals("tam tram", n);
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
