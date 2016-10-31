Bài tập tuần 7:
<br>
Kiểm thử các du-path của bài tập tuần 2.
<br>
Đánh số ở dòng lệnh như hình vẽ dưới đây.
<br>
<img src="https://github.com/longdt03/int3117-2016/blob/master/MaiVanAn/BT3/code.JPG" />
<br>
Đường đi du-path của biến num như sau:
<br>
<img src="https://github.com/longdt03/int3117-2016/blob/master/MaiVanAn/BT3/var_num.JPG" />
<br>
Với đường đi all du-path của biến num, các ca kiểm thử cho nó là (có 4 ca kiểm thử tương ứng với 4 đường):
+ Ca 1: key = 5, num = 100.
+ Ca 2: key = 5, num = 101.
+ Ca 3: key = 5, num = 108.
+ Ca 4: key = 5, num = 111.
<br>

Đường đi du-path của biến key như sau:
<br>
<img src="https://github.com/longdt03/int3117-2016/blob/master/MaiVanAn/BT3/var_key.JPG" />
<br>
Với đường đi all du-path của biến key, các ca kiểm thử cho nó là (có 4 ca kiểm thử tương ứng với 4 đường):
+ Ca 1: num = 100, key = 3.
+ Ca 2: num = 100, key = 4.
+ Ca 3: num = 100, key = 5.
+ Ca 4: num = 100, key = 6.
<br>
So sánh với MCDC, phương pháp kiểm thử bằng luồng dữ liệu có thể làm giảm bớt số lượng các ca kiểm thử.