# BT2
## Bài Toán:
Xác thực một mật khẩu có hợp lệ không (một mật khẩu hợp lệ phải có ít nhất 1 ký tự chữ cái, một ký tự chữ số, không bao gồm các ký tự đặc biệt và có độ dài lớn hơn 8.
## Bảng test case theo chuẩn MCDC:

+ Biểu thức điều kiện: C1 = **(password[i] >= 'A' && password[i] <= 'Z') || (password[i] >='a' && password[i] <= 'z')**.

| Test case | password[i] >= 'A' && password[i] <= 'Z' | password[i] >='a' && password[i] <= 'z' | C2 |
|:---------:|:----------------------------------------:|:---------------------------------------:|:--:|
| 1 | T | T | T |
| 2 | T | F | T |
| 3 | F | T | T |
| 4 | F | F | F |

+ Biểu thức điều kiện: C2 = **password[i] >= '0' && password[i] <= '9'**.

| Test case | password[i] >= '0' && password[i] <= '9' |
|:---------:|:----------------------------------------:|
| 1 | T | 
| 2 | F |

	
+ Biểu thức điều kiện: C3 = **flag1 && flag2 && password.length > 8**.

| Test case | flag1 | flag2 | password.length > 8 | C3 |
|:---------:|:-----:|:-----:|:-------------------:|:--:|
| 1 | T | T | T | T |
| 2 | T | T | F | F |
| 3 | T | F | T | F |
| 4 | T | F | F | F |
| 5 | F | T | T | F |
| 6 | F | T | F | F |
| 7 | F | F | T | F |
| 8 | F | F | F | F |

## Đo độ bao phủ
<img src="https://github.com/chinhlv95/int3117-2016/blob/master/NguyenNgocTu/BT2/Image/Cover.png">
