Bài toán: Cho biết một ngày, tìm ngày tiếp theo.

Phương pháp kiểm thử được sử dụng: **Bảng quyết định**.

### Lý do
-  Bài toán đặt ra nhiều trường hợp khác nhau cần xem xét.
-  Yêu cầu logic phức tạp, có thể mô tả chính xác và ngắn gọn bằng bảng.
-  Các biến đầu vào có quan hệ logic (ngày, tháng, năm).

### Áp dụng
#### B1: Xác định các điều kiện và giá trị của chúng

Điều kiện | Giá trị
--- | ---
M1 | Tháng có 30 ngày
M2 | Tháng có 31 ngày & không phải tháng 12
M3 | Tháng 12
M4 | Tháng 2

Điều kiện | Giá trị
--- | ---
D1 | 1 < =ngày < =27
D2 | Ngày 28
D3 | Ngày 29
D4 | Ngày 30
D5 | Ngày 31

Điều kiện | Giá trị
--- | ---
Y1 | Năm nhuận
Y2 | Năm thường

#### B2: Xác định số luật tối đa
Số luật tối đa = 4 x 5 x 2 = 40 (luật).

#### B3: Xác định các hành động
- Tăng số ngày lên 1.
- Tăng số tháng lên 1, ngày = 1.
- Tăng sốnăm lên 1, ngày = tháng = 1.
- Không thể xảy ra.

#### B4: Lập bảng và đơn giản hóa các luật
STT |  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13
--- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | 
Điều kiện | M | 1 | 1 | 1 | 2 | 2 | 3 | 3 | 4 | 4 | 4 | 4 | 4 | 4
|| D | 1-3 | 4 | 5 | 1-4 | 5 | 1-4 | 5 | 1 | 2 | 2 | 3 | 3 | 4-5
|| Y | - | - | - | - | - | - | - | - | 1 | 2 | 1 | 2 | -
Hành động|d++|x|||x||x||x|x|
||m++, d=1||x|||x|||||x|x|
||y++, d=m=1|||||||x|
||Không xảy ra|||x|||||||||x|x|

### Kết quả
Sau khi test và chỉnh sửa lại code: pass 13/13 test case với độ bao phủ cho class `Date` là 97.4% và phương thức `nextDate()` là 100%.

![alt text](http://i.imgur.com/c1gDyJ8.png "Test Result")

Đồ thị cho `nextDate()`.

![alt text](http://i.imgur.com/sBC8vIH.png "Source Code Graph")