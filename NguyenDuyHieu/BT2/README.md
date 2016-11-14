## Bài tập tuần 5.

Bài toán: Cho 3 số a,b,c nguyên dương tùy ý (a,b < 100). Nếu cả a và b đều chia hết cho 3 hoặc c chia hết cho 3 thì tính tổng các số chia hết cho a, không thì tính tổng các số chia hết cho b, giới hạn trong 100 số đầu tiên.

Code:

![Codel](https://github.com/hoangbd58/int3117-2016/blob/master/NguyenDuyHieu/BT2/img/Code.jpg)

## Bộ ca kiểm thử theo tiêu chuẩn MC/DC

Biểu thức điều kiện: (%3=0 AND %3=0) OR %3=0 hoặc rút gọn thành (A && B ) || C   
Không áp dụng MC/DC: Cần 2^3=8 ca kiểm thử tất cả.

Test Case  | A | B | C | OUTPUT
------------- | ------------- | ------------- | ------------- | -------------
1  | True | True | True | True
2  | True | True | False | True
3  | True | False | True | True
4  | True | False | False | False
5  | False | True | True | True
6  | False | True | False | False
7  | False | False | True | True
8  | False | False | False | False

Áp dụng MC/DC: ta chỉ cần 4 ca kiểm thử 3,4,2,6 để đảm bảo độ bao phủ tương đương việc thực hiện cả 8 ca kiểm thử trên.   
Lý giải: Mỗi điều kiện (condition) đều ảnh hưởng độc lập đến kết quả (decision)   
3: A True, B False, C True -> OUTPUT True   
4: A True, B False, C False -> OUTPUT False Thay 1 mình C => Output thay đổi   
2: A True, B True, C False -> OUTPUT True Thay đổi 1 mình B => Output thay đổi   
6: A False, B True, C False -> OUTPUT False Thay đổi 1 mình A => Output thay đổi   
  
Kết quả: Chỉ cần 4 ca kiểm thử trên cũng có coverage 100%

![Test coverage overview](https://github.com/hoangbd58/int3117-2016/blob/master/NguyenDuyHieu/BT2/img/CoverageOverview.jpg)




