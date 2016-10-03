# Bài tập tuần 5

## Mô tả bài toán

- Chương trình tìm số chia hết cho 3 và 5 hoặc 7 trong khoảng 0-1000

## Bộ ca kiểm thử theo tiêu chuẩn MC/DC

Condition: (%3=0 AND %5=0) OR %7=0

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
