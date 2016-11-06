# Bài tập tuần 7

## Áp dụng tiêu chuẩn kiểm thử All-DU-Path cho chương trình ở BT2.
* CFG của hàm *neigbors*
![cfg](https://github.com/ducanhk58uet/int3117-2016/blob/master/LeDucAnh/BT3/screenshots/cfg.PNG)

* c-use toàn cục cho biến dx: đỉnh 10 (được gán ở đỉnh 2)
* Đường đi đơn giản: 2-3-4-10
* Đường đi thỏa mãn All-defs cho biến dx:
 - 1-2-3-4-5-6-7-8-5-10-3-11
 - Với p-uses 1-2-3-11

* Đường đi với tiêu chuẩn All-DU-Paths cho biến dx:
 - 2-3-4-5-10
 - 2-3-4-5-6-7
 
* Áp dụng tiêu chuẩn trên, với w=100; h=100, ta ước lượng được giá trị Point(20,30) đi qua các đỉnh.

## So sánh và rút ra nhận xét về All-DU-Path và MCDC.
### So sánh
Ta có bảng so sánh sau:

\#       | Tiêu chí | MCDC | All-DU-Paths 
-------- |------|------|-----
1.       | Ý tưởng | Mục tiêu bao phủ thông qua các luồng điều khiển | Quan trọng tới việc lựa chọn đường đi với mục tiêu bao phủ các cặp gán (definition) và dùng (use) dữ liệu. Sử dụng thông tin def-use và tiêu chuẩn cụ thể để nhận được các đường đi cụ thể trong đồ thị CFG, từ đó xác định các ca kiểm thử
2.       | Định nghĩa       | Mỗi điểm đầu vào và đầu ra trong chương trình đã được gọi ít nhất một lần, mọi điều kiện quyết định trong chương trình đã thực hiện tất cả các kết quả có thể ít nhất một lần, và mỗi điều kiện đã được chứng minh là ảnh hưởng đến kết quả đó ra quyết định một cách độc lập. | Với mọi v, T gồm các đường đi dc-Path từ mọi đỉnh gán của v đến mọi đỉnh dùng của v và đến đỉnh tiếp theo của mối use(v,n) và các đường đi này hoặc là lặp một lần hoặc không lặp.
3.       | Hình thức         | Hoàn toàn sắp xếp lại cú pháp của quyết định (phá vỡ chúng thành một số điều kiện đánh giá độc lập sử dụng các biến tạm thời, các giá trị của mà sau đó được sử dụng trong các quyết định) mà không thay đổi ngữ nghĩa của chương trình sẽ giảm đáng kể những khó khăn trong việc thu thập hoàn tất bao phủ của MC/DC. Điều này là do MC/DC không xem xét các dataflow đến với nhau trong một quyết định, nhưng nó được điều khiển bởi các cú pháp chương trình. | Tạo các test case và ca kiểm thử dựa vào đường đi sinh ra tương ứng với các biến.


### Nhận xét
* Quy trình để tạo luồng kiểm thử tổng quát:
 - vẽ đồ thị luồng dữ liệu cho chương trình (CFG)
 - chọn tiêu chuẩn kiểm thử luồng dữ liệu.
 - xác định các đường đi trong đồ thị để thỏa mãn tiêu chuẩn lựa chọn
 - Tạo các ca kiểm thử cho các đường đi đã xác định.

<-- Sẽ cập nhật thêm -->
