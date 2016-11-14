package com.uet.stringhandling.main;

public class MyString {
	
	public MyString(){
	}
	
	/**
	 * Print all letter in string
	 * @param str is String input
	 * @return String result
	 */
	public String countLetter(String source) {
		String result = "";
		if (source == null || source.length() == 0) {
			return result;
		} else {
			while (source.length() != 0) {
				int i = 0;
				char letter = source.charAt(i);
				if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122)) {
					result += letter;
				}
				source = source.substring(i + 1);
				i++;				
			}
		}
		return result;
	}
}
