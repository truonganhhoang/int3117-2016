+ chương trình cho phép kiểm tra password nhập vào có phải là password mạnh hay không.
+ nếu độ dài password nhỏ hơn 8 thì trả về fasle,
+ nếu password chứa các kí tự không thuộc 0-9,a-z, A-Z => trả về false
+ nếu password chưa 1 trong 3 hoặc 2 trong 3 loại mã trên (0-9;a-z;A-Z) cũng trả về false
+ password mạnh là password có độ dài từ 8 kí tự trở lên và phải chứa các kí tự nằm trong khoảng : 0-9 ; a-z ; A-Z.
	=>khi đó chương trình sẽ trả về true.

+ test : chương trình thực hiện test với trong 11 trường hợp
 - case 1 : độ dài password = 0 (password rỗng).
 - case 2 : độ dài password = 8 nhưng với các kí tự đặc biệt.
 - case 3 : 0 < độ dài password < 8.
 - case 4 : độ dài password = 8.
 - case 5 : độ dài password > 8 với các kí tự từ a-z.
 - case 6 : độ dài password > 8 với các kí tự từ A-Z.
 - case 7 : độ dài password > 8 chỉ chứa các kí tự từ a-z và A-Z (không chứa kí tự 0-9).
 - case 8 : độ dài password > 8 chỉ chứa các kí tự từ a-z và 0-9 (không chứa kí tự A-Z).
 - case 9 : độ dài password > 8 chỉ chứa các kí tự từ A-Z và 0-9 (không chứa kí tự a-z).
 - case 10 : độ dài password > 8 chỉ chứa các kí tự số (từ 0-9).
 - case 11 : test password hợp lệ có độ dài > 8 và chứa các kí tự nằm trong 3 khoảng trên.