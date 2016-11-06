package main;

public class MyString {
	/**
	 * Đếm số kí tự là chữ cái trong 1 xâu nhập vào
	 * 
	 * @param str
	 *            xâu nhập vào
	 * @return số kí tự là chữ cái có trong xâu. -1 nếu xâu rỗng
	 */
	public int countLetter(String str) {
		int result = 0;
		if (str == null || str.length() == 0) {
			return -1;
		} else {
			while (str.length() != 0) {
				int i = 0;
				char letter = str.charAt(i);
				if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122)) {
					result++;
				}
				str = str.substring(i + 1);
				i++;				
			}
		}
		return result;
	}
}
