# Bài toán 
Kiểm tra tính chia hết của tổng dãy số
- Input: một dãy số
- Output: gọi sum = tổng của dãy số (nếu dãy rỗng thì sum = 0)
+ nếu sum chia hết cho cả 3 và 11 hoặc chia hết cho 7 thì trả về 1
+ nếu sum chia hết cho cả 2 và 5 hoặc 2 và 11 thì trả về 2
+ còn lại trả về false


# Áp dụng tiêu chuẩn All-DU-Path
- Luồng dữ liệu của chương trình
![general] (https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/NguyenThiTrang/BT3/images/LuongDuLieuChung.png)

- Luồng dữ liệu cho biến i
![variablei] (https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/NguyenThiTrang/BT3/images/LuongDuLieuBieni.png)

- Luồng dữ liệu cho biến sum
![variablesum] (https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/NguyenThiTrang/BT3/images/LuongDuLieuBienSum.png)

- Luồng dữ liệu cho biến arr
![variablearr] (https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/NguyenThiTrang/BT3/images/LuongDuLieuBienArr.png)

- Kết quả: 
7 test case <br>
Coverage:<br>
![coverage] (https://github.com/fiser-khoanv11/int3117-2016/blob/master/NguyenThiTrang/BT3/images/Coverage.JPG)


# So sánh và rút ra nhận xét về All-DU-Path và MCDC
- All-Du-Path cần ít test case hơn MCDC, các test case rõ ràng và ít cần phải suy luận hơn MCDC
- Nhưng với các biểu thức điều kiện phức hợp thì dùng MCDC sẽ chặt chẽ hơn so với All-DU-Path
