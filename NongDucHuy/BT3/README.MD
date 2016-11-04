### Bài tập tuần 7.


#### Chú thích.
Chương trình của em thực hiện chủ yếu ở phần hàm tinhTong(), với không tham số đầu vào, các tham số này được gán ở hàm khởi tạo. Nên giả sử chương trình sẽ hoạt động hàm tính tổng với 3 tham số đầu vào a, b và c.

#### Code.
![Code](https://github.com/hoangbd58/int3117-2016/blob/master/NongDucHuy/BT3/img/Code.jpg)

#### Đồ thị chương trình.
![CFG](https://github.com/hoangbd58/int3117-2016/blob/master/NongDucHuy/BT3/img/CFG.jpg)

#### Áp dụng All-DU-Path.
##### Đối với biến a.
Biến a được gán ở đỉnh 1 và được dùng ở đỉnh 4 và 6. Đường đi DU-Path cho biến a sẽ là: 1-4-5-6-7-15 và 1-4-15.
Ca kiểm thử cho đường đi 1-4-5-6-7-15: đầu vào a = 2, b = 4 và c = 6.
Ca kiểm thử cho đường đi 1-4-15: đầu vào a = 1, b = 3 và c = 5.
##### Đối với biến b.
Biến c được gán ở đỉnh 1 và được dùng ở đỉnh 4 và 11. Đường đi DU-Path cho biến a sẽ là: 1-4-10-11-12-15 và 1-4-15.
Ca kiểm thử cho đường đi 1-4-1-4-10-11-12-15: đầu vào a = 2, b = 4 và c = 6.
Ca kiểm thử cho đường đi 1-4-1-4-15: đầu vào a = 1, b = 3 và c = 5.
##### Đối với biến c.
Biến c được gán ở đỉnh 1 và được dùng ở đỉnh 4. Đường đi DU-Path cho biến a sẽ là 1-4-15.
Ca kiểm thử cho đường đi 1-4-15: đầu vào a = 2, b = 4 và c = 6.

#### Nhận xét.
Việc áp dụng All-DU-Path giúp tìm ra đường đi được định nghĩa và sử dụng của các biến để viết các ca kiểm thử. Với việc đảm bảo các biến đều được kiểm tra mà lại giảm bớt các ca kiểm thử sẽ giúp kiểm thử viên kiểm thử dễ dàng hơn. Như đối với áp dụng và chương trình trên thì chỉ 2 ca kiểm thử là có thể đi qua hết các DU-Path của cả 3 biến.
