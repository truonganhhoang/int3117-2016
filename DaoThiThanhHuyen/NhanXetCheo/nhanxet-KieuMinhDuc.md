# Nhận xét bài tập của Kiều Minh Đức

## BT1
####1. Ổn
- Readme rõ ràng.
- SourceCode đúng chuẩn.
- Có áp dụng kỹ thuật kiểm thử biên, có nêu ưu điểm của kỹ thuật.
- TestCoverage tốt (95,4%).

####2. Chưa ổn
- Chưa có phần giới thiệu bài toán => hơi khó hiểu code.

## BT2
####1. Ổn
- File README.md trình bày tốt, dễ nhìn.
- SourceCode rõ ràng, dễ hiểu.
- Có so sánh các ca kiểm thử đầy đủ và các ca kiểm thử sử dụng MCDC, có hình ảnh minh họa.
- TestCoverage tốt (93,8%).

####2. Chưa ổn
- Bài toán là tìm các số thỏa mãn điều kiện chia hết cho 4 và không chia hết cho 100 hoặc chia hết cho 400 => trong SourceCode đếm số lượng các số thỏa mãn yêu cầu trên có là số chắn không, có trả về true, sai trả về false
=> yêu cầu bài toán chưa rõ ràng.
- Kiểm thử sai TC: Fasle - True - True với số a = 800
vì 800 % 4 == 0 (True), !(800 % 100 == 0) (False), 800 % 400 == 0 (True)
=> result: True.

## BT3
####1. Ổn
- File README.md trình bày tốt, dễ nhìn.
- SourceCode rõ ràng, dễ hiểu.
- TestCoverage tốt.
- Có so sánh All-DU-Path với MCDC

####2. Chưa ổn
- Đồ thị chương trình nên chuyển về dạng số dễ nhìn, dễ hiểu hơn.
- Đường đi DU-path thiếu trường hợp cho biến count, biến i.
- Các trường hợp kiểm thử vẫn thiếu.
