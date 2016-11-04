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

Áp d?ng tiêu chu?n ki?m th? All-DU-Path cho ch??ng trình ? BT2 ta có các ???ng d?n sau:
* 2->5->6
* 2->5->9
* 2->5->12
* 3->10->18
* 3->13->18
* 3->16->18
* 4->5->6->7
* 4->5->6