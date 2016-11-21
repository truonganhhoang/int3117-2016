#Bài tập tuần 6 : Áp dụng tiêu chuẩn All-DU-Path. 
##Sơ đồ 	
![Sơ đồ](https://github.com/vutung189/int3117-2016/blob/master/VuThanhTung/BT3/image/SoDo.png)
	
##Phân tích đường đi và ca kiểm thử
- Đối với biến n.
	Đường đi : 1, 3      => ca kiểm thử  n = 0
	Đường đi : 1, 3, 5   => ca kiểm thử  n = 1
	
- Đối với biến tổng.
	Đường đi : 2, 12     => ca kiểm thử  n = 1
	Đường đi : 2, 7, 12  => ca kiểm thử  n = 3
	
- Đối với biến i.
	Đường đi : 4, 5, 6, 7, 9 => ca kiểm thử n = 3
	Đường đi : 4             => ca kiểm thử không tồn tại
	
##Nhận xét : tổng hợp các ca kiểm thử trùng chỉ còn lại 3 ca kiểm thử
- Độ bao phủ dòng lệnh đạt 100%
- Số ca kiểm thử ít hơn (MCDC có 6 ca kiểm thử)
- So với MCDC phân tích đường đi phức tạp hơn tốn nhiều thời gian hơn caanf loại bỏ những ca kiểm thử trùng.
- Áp dụng tiêu chuẩn All-DU-Path có thể loại bỏ những ca kiểm thử trùng nhưng vẫn đảm bảo được độ bao phủ.
	
##Kết quả 
Đo độ bảo phủ	
![Đo độ bao phủ](https://github.com/vutung189/int3117-2016/blob/master/VuThanhTung/BT3/image/DoBaoPhu.png)
