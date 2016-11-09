# Bài toán 
Đếm số năm nhuận và năm lợn trong khoảng cách 2 năm được truyền vào
- Input: 2 năm để đếm 
- Output: gọi count là biến đếm số năm nhuận và năm lợn (giá trị lúc đầu = 0).
+ cho biến i chạy từng năm trong khoảng cách giữa 2 năm đầu vào
+ nếu i chia hết cho 400 hoặc chia hết cho 4 và không chia hết cho 100 thì count tăng lên 1.
+ nếu i chia 12 dư 3 thì là năm lợn và count cũng tăng 1.
+ kết quả count cuối cùng là số năm thỏa mãn.


# Áp dụng tiêu chuẩn All-DU-Path

- Luồng dữ liệu cho biến count
![count](https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/VuMinhChinh/BT3/images/DUPathBienCount.png)

- Luồng dữ liệu cho biến i
![variablei](https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/VuMinhChinh/BT3/images/DUPathBienI.png)

- Luồng dữ liệu cho biến y1 va y2
![variabley](https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/VuMinhChinh/BT3/images/DUPathBienY1vaY2.png)

# Test coverage
![test](https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/VuMinhChinh/BT3/images/Test.PNG)
