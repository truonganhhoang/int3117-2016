# Bài toán 
Thay đổi mật khẩu của người dùng
- Input: input, pwd, newPass
- Output:
+ nếu (input == email hoặc input == username) và (pwd == password) và (pwd != newPass) thì trả về thay đổi mật khẩu thành công
+ nếu thay đổi mật khẩu thất bại quá ba lần thì trả về người dùng bị khóa

# Áp dụng tiêu chuẩn All-DU-Path
- Luồng dữ liệu của chương trình
![general] (https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/NguyenHongSon/BT3/images/patch-full.png)

- Luồng dữ liệu cho biến input/pwd/newPwd
![variablei] (https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/NguyenHongSon/BT3/images/patch.png)

- Luồng dữ liệu cho biến username/email/password
![variablesum] (https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/NguyenHongSon/BT3/images/patch1.png)

- Luồng dữ liệu cho biến countAttempts
![variablearr] (https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/NguyenHongSon/BT3/images/patch2.png)

- Luồng dữ liệu cho biến totalAttemps
![variablearr] (https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/NguyenHongSon/BT3/images/patch3.png)

- Kết quả: 
4 test case <br>
Coverage:<br>



# So sánh và rút ra nhận xét về All-DU-Path và MCDC
- All-Du-Path cần ít test case hơn MCDC, các test case rõ ràng và ít cần phải suy luận hơn MCDC
- Nhưng với các biểu thức điều kiện phức hợp thì dùng MCDC sẽ chặt chẽ hơn so với All-DU-Path
