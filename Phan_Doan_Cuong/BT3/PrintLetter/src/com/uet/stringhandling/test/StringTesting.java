package com.uet.stringhandling.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.uet.stringhandling.main.MyString;

public class StringTesting {

	private MyString myString;

	@Test
	/**
	 * Test all cases in one
	 */
	public void testAllInOne() {
		myString = new MyString("0A-a}");
		String result = myString.countLetter();
		assertEquals(result,"Aa");
	}
	
	@Test
	/**
	 * Test null
	 */
	
	public void testNull(){
		myString = new MyString(null);
		String result = myString.countLetter();
		assertEquals(result,"");
	}

}
