## Bài tập tuần 4

Phương pháp hộp đen đã áp dụng là kiểm thử biên. Khi tính tổng nếu số n đủ lớn thì tổng sẽ vượt quá giới hạn của số nguyên INT trong khi n còn cách xa giới hạn đó. Vì vậy nhờ kiểm thử biên đầu ra đã giới hạn giá trị đầu vào của n.

####Mức độ bao phủ
![Test coverage output](https://github.com/hoangbd58/int3117-2016/blob/master/NongDucHuy/BT1/img/coverage1.jpg)

![Test coverage output](https://github.com/hoangbd58/int3117-2016/blob/master/NongDucHuy/BT1/img/coverage2.jpg)

####Đồ thị chương trình
![Flowchart](https://github.com/hoangbd58/int3117-2016/blob/master/NongDucHuy/BT1/img/flowchart.jpg)

## Bài tập tuần 3

Bài toán: Tính tổng các số chia hết cho 8 trong n số nguyên dương đầu tiên (n<100000).

Trong phần nâng cấp BT1 này em sử dụng phương pháp kiểm thử biên mạnh.
Vì bài toán tính tổng khá đơn giản và chỉ có 1 biến số nên phương pháp này sẽ phù hợp vì số ca kiểm thử không nhiều.
Nếu dùng phương pháp lớp tương đương, hay bảng quyết định cũng tạo được test case nhưng sẽ không đáng so với độ phức tạp của bài toán.
Khi áp dụng kiểm thử biên, những test case đầu tiên ứng với biên cực tiểu n=0 là n=0, n=1 và n=-1.
Ban đầu với miền giá trị của n là {0...MAX_INT}, nên biên thứ 2 sẽ là MAX_INT, nhưng  do là bài toán tính tổng và kiểu giá trị của tổng cũng là INT nên nếu lấy biên này chương trình sẽ bị treo do tổng lớn hơn giá trị MAX_INT. Do đó giá trị biên cực đại của chương trình sẽ được giảm xuống n=100000.
Các test case ứng với biên cực đại là n=99999, n=100000, n=100001;

Khi áp dụng phương pháp kiểm thử biên, đã phát hiện ra chương trình sẽ có lỗi nếu n quá lớn thì giá trị đầu ra tổng sẽ vượt quá biên MAX_INT, giúp sửa được lỗi này bằng việc giới hạn giá trị của n. Nếu sử dụng lớp tương đương mà chọn giá trị đại diện chưa đủ lớn thì có thể không phát hiện ra lỗi này.
