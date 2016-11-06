package testmain;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Triange;

public class TriangTestCase {
	Triange triange = new Triange(false);
	
	@Test
	public void testTriange1() {
		boolean condition = triange.testTriange(-1, 2, 3);
		assertFalse(condition);
	}
	
	@Test
	public void testTriange2() {
		boolean condition = triange.testTriange(1, -2, 3);
		assertFalse(condition);
	}
	
	@Test
	public void testTriange3() {
		boolean condition = triange.testTriange(1, 2, -3);
		assertFalse(condition);
	}
	
	@Test
	public void testTriange4() {
		boolean condition = triange.testTriange(1, 2, 3);
		assertFalse(condition);
	}
	
	@Test
	public void testTriange5() {
		boolean condition = triange.testTriange(3, 2, 1);
		assertFalse(condition);
	}
	
	@Test
	public void testTriange6() {
		boolean condition = triange.testTriange(2, 1, 3);
		assertFalse(condition);
	}
	
	@Test
	public void testTriange7() {
		boolean condition = triange.testTriange(2, 3, 1);
		assertFalse(condition);
	}
	
	@Test
	public void testTriange8() {
		boolean condition = triange.testTriange(3, 4, 5);
		assertTrue(condition);
	}
	
	@Test
	public void testCheckTriange1() {
		String expected = triange.checkTypeTriange(3, 4, 5);
		String actual = "square";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCheckTriange2() {
		String expected = triange.checkTypeTriange(3, 4, 6);
		String actual = "general";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCheckTriange3() {
		String expected = triange.checkTypeTriange(3, 2, 1);
		String actual = "fail";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCheckTriange4() {
		String expected = triange.checkTypeTriange(3, 3, 3);
		String actual = "equilateral";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCheckTriange5() {
		String expected = triange.checkTypeTriange(3, 3, 4);
		String actual = "isosceles";
		assertEquals(expected, actual);
	}
	
	

}
