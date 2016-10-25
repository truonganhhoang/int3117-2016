## Bài tập tuần 5.

Bài toán: Cho 3 số a,b,c dương tùy ý (a,b < 100). Nếu cả a và b đều chẵn hoặc c chẵn thì tính tổng các số chia hết cho a, không thì tính tổng các số chia hết cho b trong 100 số đầu tiên.

####Cách tạo ca kiểm thử (Test case).
Tạm gọi điều kiện là if ((A & B) || C)
 - Test case đầu tiên cho cả 3 điều kiện A, B, C đều đúng.
 - Test case thứ 2 cho A và B đúng, C sai.
 - Test case thứ 3 cho A hoặc B sai, C đúng.
 - Test case thứ 4 cho A hoặc B sai, C sai.
 - Test case thứ 5 cho A và B sai, C đúng.
 - Test case thứ 6 cho A và B sai, C sai.

Kết quả: Sau khi tiến hành đo độ bao phủ, các test case đã bao phủ toàn bộ các nhánh, các dòng.

![Test coverage overview](https://github.com/hoangbd58/int3117-2016/blob/master/NongDucHuy/BT2/img/CoverageOverview.jpg)

![Test coverage detail](https://github.com/hoangbd58/int3117-2016/blob/master/NongDucHuy/BT2/img/CoverageDetail.jpg)

####Thảo luận:
Theo em thì  chương trình của em có thế sử dụng bao phủ C1 là có thể tương đương MC/DC ở độ bao phủ về nhánh và các dòng lệnh.
