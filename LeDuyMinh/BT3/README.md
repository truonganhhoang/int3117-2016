**Bài tập tuần 6**

Áp dụng tiêu chuẩn All-DU-Path cho BT2(MCDC)

Biến n:
du-path				Ca kiểm thử
2 3						-1, 1
2 4 5 6 8 9			-1, 10
2 4 8 9					2, 11
2 4 5 6 8 10 9		Không có ca kiểm thử phù hợp
2 4 8 10 9			10, 5

Biến m:
du-path				Ca kiểm thử
2 3					-1, 1
2 4 5 7 8 9 11		2, -2
2 4 8 9 11			2, 11
2 4 5 7 8 10 9 11	7, -2
2 4 8 10 9 11		10, 5

Đo mức độ bao phủ:
![Đo mức độ bao phủ](https://github.com/vutung189/int3117-2016/blob/master/LeDuyMinh/BT2/DoDoBaoPhu.png)

So sánh với MCDC

 - Độ phức tạp: cả 2 tiêu chuẩn đều mất nhiều thời gian để tính ra bộ kiểm thử. 
 - Thời gian tìm các trường hợp rẽ nhánh trong MCDC nhanh hơn so với tìm đường đi trong All-DU-Path.
 - Số ca kiểm thử: All-DU-Path nhiều hơn MCDC (6 so với 4).
 - Độ bao phủ: cả 2 tiêu chuẩn đều cho độ bao phủ bằng nhau.

Nhận xét

 - MCDC cho ít ca kiểm thử hơn và vẫn có độ bao phủ bằng All-DU-Path.
 - MCDC làm nhanh hơn một chút so với All-DU-Path.