#Giải thuật
![result](https://github.com/phuongnt58/int3117-2016/blob/master/Nhom08/NgoThiPhuong/BT3/Demsokytu.png)

##All-DU-PATH
- 1-2-3-4-5-14 : while false 
@test: a = '', len = 0


- 1-2-3-4-5-6-7-10-12-14 (6,7 true)
@test: a='phuong' => len = 6; total = 6


- 1-2-3-4-5-6-8-9-10-12-14 (6 false 8,9 true)
@test: a=' phuong' => len = 7; total = 6


- 1-2-3-4-5-6-12-14(if false)
@test: a=';*' => len = 2; total = 0


- 1-2-3-4-5-6-7-8-9-10-12-14(6 true; 7 false; 8,9 true )

##So sánh: All-Du-Path và MCDC

- Giống: Phương pháp kiểm thử hộp trắng

- Khác: 
+ MCDC cho phép kiểm kiểm thử với các đường đi (dòng điều khiển) từ đó đưa ra các ca kiểm thử tương ứng. Nhưng nếu chỉ áp dụng thì chưa đủ để phát hiện tất cả các lỗi tiềm ẩn trong chương trình.

+ All-Du-Path cho phép kiểm tra được các lỗi tiềm ẩn trong chương trình mà MCDC không kiểm soát được hết
	

