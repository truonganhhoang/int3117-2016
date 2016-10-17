## Bài toán đặt ra:
Nhập vào 2 năm (bé trước lớn sau), tìm ra tổng số năm nhuận và năm hợi trong khoảng cách giữa 2 năm nhập vào.
## Áp dụng tiêu chuẩn MCDC:
- Lập bảng tất cả các trường hợp có thể xảy ra đối với điều kiện năm nhuận và năm hợi:

STT | y % 400 == 0 | y % 4 == 0 | y % 100 == 0 | y % 12 == 3 | Đầu ra (theo case trong code) 
:----: | :----: | :----: | :----: | :----: | :----:
1 | T | x | x | T | 2
2 | T | x | x | F | 1 
3 | x | T | T | x | 2
4 | F | F | F | T | 1
5 | F | F | F | F | 0
6 | F | F | T | T | Invalid
7 | F | F | T | F | Invalid
8 | F | T | T | T | 1
9 | F | T | T | F | 0
10 | F | T | F | T | 2
11 | F | T | F | F | 1

## Kết quả

![result](https://c2.staticflickr.com/9/8275/30007529121_8772ed181b_b.jpg)
