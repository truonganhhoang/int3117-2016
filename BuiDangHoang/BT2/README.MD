# Bài tập tuần 5

## Mô tả bài toán

- Chương trình tìm số chia hết cho 3 và 5 hoặc 7 trong khoảng 0-1000

## Bộ ca kiểm thử theo tiêu chuẩn MC/DC

Biểu thức điều kiện: (%3=0 AND %5=0) OR %7=0
Không áp dụng MC/DC: Cần 2^3=8 ca kiểm thử tất cả.

Test Case  | %3 = 0 | %5 = 0 | %7=0 | OUTPUT
------------- | ------------- | ------------- | ------------- | -------------
1  | True | True | True | True
2  | True | True | False | True
3  | True | False | True | True
4  | True | False | False | False
5  | False | True | True | True
6  | False | True | False | False
7  | False | False | True | True
8  | False | False | False | False

Áp dụng MC/DC: ta chỉ cần 4 ca kiểm thử 1,5,7,8 để đảm bảo độ bao phủ tương đương việc thực hiện cả 8 ca kiểm thử trên.

## Đo mức độ bao phủ

Full 8 test case : 
<img src="https://github.com/hoangbd58/int3117-2016/blob/master/BuiDangHoang/BT2/fullTestCase.png"/>
4 Test case MC/DC:
<img src="https://github.com/hoangbd58/int3117-2016/blob/master/BuiDangHoang/BT2/4TestCase.png"/>
