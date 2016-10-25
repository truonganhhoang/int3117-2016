Trong bài tập 2 này, em viết chương trình kiểm thử mật khẩu (password) dựa trên tiêu chuẩn MCDC.
Dựa vào bao phủ điều kiện và bao phủ quyết định, em đã tạo ra các ca kiểm thử với mọi điều kiện ảnh hưởng tới kết quả. Cụ thể như sau:
    if((s.length() < 6 && s.length() > 0)||s.length() >20){
			result="Ban chi duoc phep nhap chuoi tu 6-20 ki tu";
		}
		else if(6 <= s.length() && s.length() <= 20){
			result="Dang nhap thanh cong";
		}
		else {
			result="Ban hay nhap password";
		}
    
   
