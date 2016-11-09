Mai Văn An - 13020001
Bài tập tuần 5:
- Mô tả bài toán: 
<br>
Nhập từ bàn phím 1 số ngẫu nhiên n và 1 số khóa (số ngẫu nhiên n phải lớn hơn số khóa). 
Chương trình sẽ kiểm tra và trả về số X thỏa mãn điều kiện: X chia hết cho key hoặc X đồng thời chia hết cho (key-1) và (key-2).
Vòng lặp được thực hiện sẽ tăng giá trị của số ngẫu nhiên n nếu nó chưa thỏa mãn điều kiện trên theo hai cách sau: Nếu n chia cho key, key-1 hoặc key-2 dư 1
thì sẽ tăng giá trị của n lên 1. Trong trường hợp còn lại sẽ tăng n lên (n/khóa) đơn vị.
Giới hạn vòng lặp là 100. 

- Các ca kiểm thử như sau: 	
+Kiểm thử biên sẽ chọn ra các giá trị cực tiểu, cực đại và các giá trị tương đối.
<br>
+Kiểm thử MCDC sẽ chọn ra tổ hợp các giá trị của các điều kiện như sau: 
<br>
(True || False && False) viết tắt là (T||F&&F); (F||T&F) và các hoán vị của chúng (8 hoán vị).

							


Độ bao phủ dòng lệnh:
<br>
<img src="https://github.com/longdt03/int3117-2016/blob/master/MaiVanAn/BT2/coverage.JPG" />

<br>
<img src="https://github.com/longdt03/int3117-2016/blob/master/MaiVanAn/BT2/coverage_report.JPG" />

