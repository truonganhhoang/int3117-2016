Bài toán
Bài toán tính ước số chung lớn nhất của 2 số nguyên.
Tham số đầu vào là 2 số a và b, output của bài toán là ước chung lớn nhất của a và b. Nếu a và b không có ước chung hoặc a = b = 0, bài toán sẽ trả về kết quả 0
Kiểm thử
Áp dụng tiêu chuẩn MCDC vào bài toán. Bài toán có 3 câu lệnh điều kiện if(a == 0 && b == 0) if(a == b || a != 0 && b == 0) if(b != 0 && a == 0)
Với câu lệnh điều kiện if(a == 0 && b == 0) ta có 4 bộ kiểm thử:
a = 0 và b = 0
a != 0 và b != 0
a = 0 và b != 0
a != 0 và b != 0
Với câu lệnh điều kiện if(a == b || a != 0 && b == 0) do 1 số bộ kiểm thử trùng với câu lệnh điều kiện trên nên chỉ kiểm tra thêm 1 bộ kiểm thử
a = b
Với câu lệnh điều kiện if(b != 0 && a == 0) có thể sử dụng các bộ kiểm thử ở trên
Kết quả

Độ bao phủ đo được là 100%