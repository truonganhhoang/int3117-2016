BÀI TẬP TUẦN 7 Áp dụng tiêu chuẩn kiểm thử All-DU Path cho BT2 1. Áp dụng cho biến nhansu

1->2->10->11
Bộ kiểm thử n[2] =(0,1)
1->2->3->7->8
Bộ kiểm thử n = 2;

1->2->3->4->5->6->9->5->10->11
Bộ kiểm thử n = 4


1->2->3->4->5->6->7->8
Bộ kiểm thử n = 3

Độ phức tạp: cả 2 tiêu chuẩn đều tạo ra nhiều bộ kiểm thử.
Thời gian tìm các trường hợp rẽ nhánh trong MCDC nhanh hơn so với tìm đường đi trong All-DU-Path.
Số ca kiểm thử: All-DU-Path nhiều hơn MCDC (11 so với 9).
Độ bao phủ: cả 2 tiêu chuẩn đều cho độ bao phủ bằng nhau. 5.Nhận xét
MCDC cho ít ca kiểm thử hơn và vẫn có độ bao phủ bằng All-DU-Path.
MCDC làm nhanh hơn so với All-DU-Path.
Một số trường hợp ALL-DU-Path có sự lặp lại đường đi qua các biến nên mất nhiều thời gian