package com.robert.BT1;

import static org.junit.Assert.*;
import org.junit.*;

public class CommonCardTest {
	CommonCard card1, card2;
	
	@Before
	public void setUp(){
		card1 = new CommonCard(3, CommonCard.Suit.spades, 1);
	}
	
	@Test
	public void testToString(){
		assertEquals("3 Bich", card1.toString());
	}
}
