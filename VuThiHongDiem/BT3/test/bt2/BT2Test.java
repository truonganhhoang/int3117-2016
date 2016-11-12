/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;
import static org.junit.Assert.*;

import org.junit.Test;

public class BT2Test {
	BT2 b2 = new BT2();

	// N co so chu so nho hon 5
	@Test
	public void testCase0() {
		assertEquals(false, b2.ham(456));
	}

	// N co so chu so lon hon 5 voi 8 testCase
	@Test
	public void testCase1() {
		assertEquals(true, b2.ham(66789));
	}

	@Test
	public void testCase2() {
		assertEquals(true, b2.ham(67779));
	}

	@Test
	public void testCase3() {
		assertEquals(true, b2.ham(98887));
	}

	@Test
	public void testCase4() {
		assertEquals(false, b2.ham(38887));
	}

	@Test
	public void testCase5() {
		assertEquals(false, b2.ham(886645));
	}

	@Test
	public void testCase6() {
		assertEquals(false, b2.ham(87561));
	}

	@Test
	public void testCase7() {
		assertEquals(false, b2.ham(88883));
	}

	@Test
	public void testCase8() {
		assertEquals(false, b2.ham(86425));
	}
}
