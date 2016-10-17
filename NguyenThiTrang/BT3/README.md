# Bài toán 
Kiểm tra tính chia hết của tổng dãy số
- Input: một dãy số
- Output: gọi sum = tổng của dãy số (nếu dãy rỗng thì sum = 0)
+ nếu sum chia hết cho cả 3 và 11 hoặc chia hết cho 7 thì trả về 1
+ nếu sum chia hết cho cả 2 và 5 hoặc 2 và 11 thì trả về 2
+ còn lại trả về false


# Áp dụng tiêu chuẩn All-DU-Path
- Luồng dữ liệu của chương trình

- Luồng dữ liệu cho biến i

- Luồng dữ liệu cho biến sum

- Luồng dữ liệu cho biến arr


- Kết quả: 
7 test case
coverage


# So sánh và rút ra nhận xét về All-DU-Path và MCDC
- All-Du-Path cần ít test case hơn MCDC, các test case rõ ràng và ít cần phải suy luận hơn MCDC
- Nhưng với các biểu thức điều kiện phức hợp thì dùng MCDC sẽ chặt chẽ hơn so với All-DU-Path