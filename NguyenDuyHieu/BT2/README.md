## Bài tập tuần 5.

Bài toán: Cho 3 số a,b,c nguyên dương tùy ý (a,b < 100). Nếu cả a và b đều chia hết cho 3 hoặc c chia hết cho 3 thì tính tổng các số chia hết cho a, không thì tính tổng các số chia hết cho b. 
Giới hạn trong 100 số đầu tiên.



Biểu thức điều kiện: (%3=0 AND %3=0) OR %3=0 Không áp dụng MC/DC: Cần 2^3=8 ca kiểm thử tất cả.
Test Case  | %3 = 0 | %3 = 0 | %3=0 | OUTPUT
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

Kết quả: Sau khi tiến hành đo độ bao phủ, các test case đã bao phủ toàn bộ các nhánh, các dòng.

![Test coverage overview](https://github.com/hoangbd58/int3117-2016/blob/master/NguyenDuyHieu/BT2/img/CoverageOverview.jpg)

![Test coverage detail](https://github.com/hoangbd58/int3117-2016/blob/master/NguyenDuyHieu/BT2/img/CoverageDetail.jpg)


