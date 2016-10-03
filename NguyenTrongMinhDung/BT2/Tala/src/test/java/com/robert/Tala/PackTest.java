package com.robert.Tala;

import static org.junit.Assert.*;
import org.junit.*;
import com.robert.Tala.CommonCard.Suit;

public class PackTest {
	/*
	@Test
	public void testAllCards(){
		Pack.printConsole();
	}
	*/
	
	@Test
	public void testFirstCard() {
		assertTrue(Pack.getCardAt(0).equals(new CommonCard(2, Suit.spades)));
	}
	
	@Test
	public void testFirstCard2() {
		assertTrue(Pack.getFirst().equals(new CommonCard(2, Suit.spades)));
	}
}