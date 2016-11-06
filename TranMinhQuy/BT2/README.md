# Bài tập tuần 5

## Mô tả bài toán
Nhập vào số N, tìm số thứ N chia hết cho 2 và 3 hoặc 5.

## Ca kiểm thử theo chuẩn MC/DC
* Các điều kiện: `a = (x%2==0)`, `b = (x%3==0)` và `c = (x%5==0)`
* Nếu tính đầy đủ ra thì cần có 2^3=8 ca kiểm thử
![alt text](https://github.com/minhnt58/int3117-2016/blob/master/TranMinhQuy/BT2/IMG/select.png "Chọn case")
* Sau khi áp dụng chuẩn MC/DC, ta rút gọn được chỉ còn 4 ca kiểm thử.

## Độ bao phủ
![alt text](https://github.com/minhnt58/int3117-2016/blob/master/TranMinhQuy/BT2/IMG/coverage.png "Độ bao phủ")
