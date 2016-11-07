# Bài toán 
Đếm số năm nhuận và năm lợn trong khoảng cách 2 năm được truyền vào
- Input: 2 năm để đếm 
- Output: gọi count là biến đếm số năm nhuận và năm lợn (giá trị lúc đầu = 0).
+ cho biến i chạy từng năm trong khoảng cách giữa 2 năm đầu vào
+ nếu i chia hết cho 400 hoặc chia hết cho 4 và không chia hết cho 100 thì count tăng lên 1.
+ nếu i chia 12 dư 3 thì là năm lợn và count cũng tăng 1.
+ kết quả count cuối cùng là số năm thỏa mãn.