Bài toán: Đăng nhập

Phương pháp kiểm thử : **Bảng quyết định**

### Lý do
-  Bài toán đặt ra nhiều trường hợp khác nhau.
-  Các trường hợp có thể mô tả chính xác và ngắn gọn bằng bảng.
-  Các biến đầu vào có quan hệ logic (username, password)

### Áp dụng
##### B1: Xác định các điều kiện và giá trị của chúng

Điều kiện | Giá trị
--- | ---
U1 | Tên đăng nhập trống
U2 | Tên đăng nhập sai
U3 | Tên đăng nhập đúng

Điều kiện | Giá trị
--- | ---
P1 | Mật khẩu trống
P2 | Mật khẩu sai
P3 | Mật khẩu đúng


##### B2: Xác định số luật tối đa
Số luật tối đa = 3 x 3 = 9 (luật)

##### B3: Xác định các hành động
- Xin mời điền tên đăng nhập.
- Xin mời điền mật khẩu.
- Đăng nhập thành công
- Đăng nhập thất bại

##### B4: Lập bảng và đơn giản hóa các luật
STT |  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
--- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | 
Điều kiện | U | 1 | 1 | 1 | 2 | 2 | 2 | 3 | 3 | 3 |
|| P | 1 | 2 | 3 | 1 | 2 | 3 | 1 | 2 | 3 | 1 | 2 | 3 |
Hành động | Xin mời điền tên đăng nhập | x | x | x |  |  |  |  |  |  |
|| Xin mời điền mật khẩu |  |  |  | x |  |  | x |  |  |  |
|| Đăng nhập thành công |  |  |  |  |  |  |  |  | x |
|| Đăng nhập thất bại |  |  |  |  | x | x |  | x |   |  |

### Kết quả
Pass các test case với test coverage = 100%.

![alt text](https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/NguyenHongSon/BT1/source-code-graph-demologin.PNG "Test Result")

Đồ thị cho login()

![alt text](https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/NguyenHongSon/BT1/test-coverage-BT1.PNG "Source Code Graph")
