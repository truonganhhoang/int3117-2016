package pkDemo;

public class DemoLogin {
	static String username = "sonnh58";
	static String password = "123456789";
	
	public String login(String u, String p){
		
		if ((u == "")) {
			return "Xin mời điền tên đăng nhập";
		} else if ((p == "")) {
			return "Xin mời điền mật khẩu";
		} else if ((u != username) || (p != password)){
			return "Đăng nhập thất bại";
		} 
		
		return "Đăng nhập thành công";
	}
}
