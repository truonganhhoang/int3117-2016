package com.uet.stringhandling.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.uet.stringhandling.main.MyString;

public class StringTesting {

	private MyString myString;

	@Test
	/**
	 * Case 2 in README.txt
	 */
	public void test2() {
		myString = new MyString();
		String result = myString.countLetter("0A-a}");
		assertEquals(result,"Aa");
	}
	
	@Test
	/**
	 * Case 1 in README.txt
	 */
	
	public void test1(){
		myString = new MyString();
		String result = myString.countLetter(null);
		assertEquals(result,"");
	}
	
	@Test
	/**
	* Case 3 in README.txt
	*/
	public void test3(){
		myString = new MyString();
		String result = myString.countLetter("123{}");
		assertEquals(result,"");
	}

}
