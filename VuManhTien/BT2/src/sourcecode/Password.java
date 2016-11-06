package sourcecode;

public class Password {
	public static boolean check(String pass) {
		
		if (pass.length() < 8 || pass.length() > 32) {
			return false;
		}
		
		for (int i = 0; i < pass.length(); i++) {
			if (!(('0' <= pass.charAt(i) && pass.charAt(i) <= '9')
					|| ('a' <= pass.charAt(i) && pass.charAt(i) <= 'z')
					|| ('A' <= pass.charAt(i) && pass.charAt(i) <= 'Z'))) {
				return false;
			}	
		}
		
		return true;
	}
}
