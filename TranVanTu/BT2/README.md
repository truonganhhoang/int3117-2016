# Bài tập tuần 5

## Mô tả bài toán

Kiểm tra 1 số bất kì có phải là số nguyên tố hay không.

## Bộ ca kiểm thử theo tiêu chuẩn MC/DC

Biểu thức điều kiện: ( %2=0 OR %3=0 OR %5=0 OR %7=0) => FALSE

Không áp dụng MC/DC: Cần 2^4=16 ca kiểm thử tất cả.

Test Case  | %2 = 0| %3 = 0 | %5 = 0 | %7=0 | OUTPUT
------------- | ------------- | ------------- | ------------- | ------------- | -------------
1  | True | True | True | True | False
2  | True | True | True | False | False
3  | True | True | False | True | False
4  | True | False | True | True | False
5  | False | True | True | True | False
6  | True | True | False | False | False
7  | True | False | True | False | False
8  | False | True | True | False | False
9  | False | False | True | True | False
10 | True | False | False | True | False
11 | False | True | False | True | False
12 | True | False | False | False | False
13 | False | True | False | False | False
14 | False | False | True | False | False
15 | False | False | False | True | False
16 | False | False | False | False | True

Áp dụng MC/DC: ta chỉ cần cả 16 ca để đảm bảo độ bao phủ tương đương việc thực hiện cả 16 ca kiểm thử trên.

## Đo mức độ bao phủ

16 Test case:

![Coverage](http://image.prntscr.com/image/87dfb5e58f2b4ae2bb8212223187bb93.png)
