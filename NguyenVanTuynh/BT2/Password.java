package bt2;

public class Password {
	
	public String get_password(String s){
		String result = "";
		int i=0;
		while (i<s.length()){
			if (s.charAt(i)!='.')
				i++;
		}
		
		if((s.length() < 6 && s.length() > 0)||s.length() >20){
			result="Ban chi duoc phep nhap chuoi tu 6-20 ki tu";
		}
		else if(6 <= s.length() && s.length() <= 20){
			result="Dang nhap thanh cong";
		}
		else {
			result="Ban hay nhap password";
		}
		return result;
	}
}
