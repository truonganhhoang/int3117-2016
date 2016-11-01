Trong bài tập 2 này, em viết chương trình kiểm thử mật khẩu (password) dựa trên tiêu chuẩn MCDC.
Dựa vào bao phủ điều kiện và bao phủ quyết định, em đã tạo ra các ca kiểm thử với mọi điều kiện ảnh hưởng tới kết quả. Cụ thể như sau:

1.  public class Password {	
2. 	public String get_password(String s){
3.		String result = "";
4.		int i=0;
5.		while (i<s.length()){
6.			if (s.charAt(i)!='.')
7.				i++;
8.		}	
9.		if((s.length() < 6 && s.length() > 0)||s.length() >20){
10.			result="Ban chi duoc phep nhap chuoi tu 6-20 ki tu";
11.  	}
12.		else if(6 <= s.length() && s.length() <= 20){
13.			result="Dang nhap thanh cong";
14.  	}
15.		else {
16.			result="Ban hay nhap password";
17.		}
18.		return result;
19. 	}
20. }

=> Áp dụng tiêu chuẩn MCDC ta có, ta xét tất cả các đường đi mà mọi điều kiện có thể ảnh hưởng tới kết quả. Tại bước số 9, ta kiểm tra độ dài của password, nếu True thì result="Ban chi duoc phep nhap chuoi tu 6-20 ki tu", nếu False thì thực hiện bước tiếp theo. Tại bước số 12, nếu True thì result="Dang nhap thanh cong", nếu False thì thực hiện bước cuối cùng result="Ban hay nhap password". Với các đường đi như thế, ta sinh được các ca kiểm thử sau:

* STT	|---|     Input	               |---|           Output
* 1	        |---|        abc	                |---|          "Ban chi duoc phep nhap chuoi tu 6-20 ki tu"
* 2	        |---|        abc1234	            |---|           "Dang nhap thanh cong"
* 3	        |---|        nguyenvantuynh30061995	|---|      "Ban chi duoc phep nhap chuoi tu 6-20 ki tu"
* 4	        |---|        “”	                     |---|       "Ban hay nhap password"
