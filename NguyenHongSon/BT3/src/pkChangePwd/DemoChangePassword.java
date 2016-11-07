package pkChangePwd;
import java.util.Scanner;

public class DemoChangePassword {

	static String username = "sonnh";
	static String email = "sonnh@gmail.com";
	static String password = "123456789";
	
	public boolean changePwd(String input, String pwd, String newPwd) {
		if((username.equals(input) || email.equals(input)) && password.equals(pwd) && !password.equals(newPwd) ) {
			return true;
		}
		return false;
	}
	
	@SuppressWarnings("resource")
	public static void main (String [] args){
		 
		 Scanner scan = new Scanner (System.in);
		 int countAttempts = 0;
		 int totalAttemps = 3;
		 
		 do {
			 System.out.print("Nhập tên đăng nhập/email: ");
             String input = scan.nextLine();
             
			 System.out.print("Nhập mật khẩu cũ: ");
             String pwd = scan.nextLine();
             
             System.out.print("Nhập mật khẩu mới: ");
             String newPwd = scan.nextLine();
             
             if ((username.equals(input) || email.equals(input)) && password.equals(pwd) && !password.equals(newPwd)){
            	 System.out.println("Thay đổi mật khẩu thành công");
            	 break;
             } else {
            	 System.out.println("Thay đổi mật khẩu thất bại");
            	 countAttempts++;
             }
         } while (countAttempts < totalAttemps);
		 
		 if (countAttempts == totalAttemps) {
			   System.out.println("Chức năng thay đổi mật khẩu bị khóa");
		 }
	 }
 }

