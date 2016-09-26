package Demo;

public class Practice {
	//String s=new String();
	public String password(String s){
		String result;
		if(s.length()<6&&s.length()>0){
			result="Ban chi duoc phep nhap chuoi tu 6-20 ki tu";
		}
			else if(6<=s.length()&&s.length()<=20){
				result="Dang nhap thanh cong";
			}
				else if (s.length()==0){
					result="Ban hay nhap password";
				}
				else {
					result="Ban chi duoc phep nhap chuoi tu 6-20 ki tu";
				}
		
				
		return result;
	}
}
