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

Áp dụng tiêu chuẩn kiểm thử All-DU-Path cho chương trình BT2 ta có các đườnng dẫn sau:
+ Đối với biến s thì ta có các đường dẫn sau:
* 2(define)->5(use)->6(use)
* 2(define)->5(use)->9(use)
* 2(define)->5(use)->12(use)
+ Đối với biến result thì ta có các đường dẫn sau:
* 3(define)->10(use)->18(use)
* 3(define)->13(use)->18(use)
* 3(define)->16(use)->18(use)
+ Đối với biến i thì ta có các đường dẫn sau:
* 4(define)->5(use)->6(use)->7(use)
* 4(define)->5(use)->6(use)

=>Từ đó ta sẽ có các bộ kiểm thử sau:
* STT	   |     Input	               |           Output
* 1	        |        abc	                 |           "Ban chi duoc phep nhap chuoi tu 6-20 ki tu"
* 2	        |        abc1234	             |           "Dang nhap thanh cong"
* 3	        |        nguyenvantuynh30061995	|        "Ban chi duoc phep nhap chuoi tu 6-20 ki tu"
* 4	        |        “”	                     |       "Ban hay nhap password"
