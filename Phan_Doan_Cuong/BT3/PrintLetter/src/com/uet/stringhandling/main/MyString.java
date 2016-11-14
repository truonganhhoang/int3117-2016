package com.uet.stringhandling.main;

public class MyString {
	
	private String mString;
	
	public MyString(String str){
		mString = str;
	}
	
	/**
	 * Print all letter in string
	 * @param str is String input
	 * @return String result
	 */
	public String countLetter() {
		String result = "";
		if (mString == null || mString.length() == 0) {
			return result;
		} else {
			while (mString.length() != 0) {
				int i = 0;
				char letter = mString.charAt(i);
				if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122)) {
					result += letter;
				}
				mString = mString.substring(i + 1);
				i++;				
			}
		}
		return result;
	}
}
