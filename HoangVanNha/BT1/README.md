# Hoàng Văn Nhã K58-CC 13020311

## Tuần 1 + Tuần 2
### Mô tả bài toán
- Bài toán tìm giá trị lớn nhất trong các List số integer
- Chương trình cho phép nhập vào mảng các phần tử là integer kết quả ra của chương trình là phần tử integer lớn nhất.


## Tuần 3

### Chọn phướng pháp kiểmm thử biên và biên mạnh
+ Phương pháp: nếu a<= y <= b thì chọn các ca test: a, a+1, a+b/2, b-1, b
+ Kiểm thử mạnh thì chọn thêm 2 ca test với a-1 và b +1 để kiểm tra truờng hợp xấu nhất
+ Phương pháp này là phù hợp nhất là vì: dây là phương pháp dễ dàng, dễ thực hiện, tạo dược các test, tự động
+ Chỉ việc sử dụng các kiến thức cơ bản với hàm  xác định miền giá trị từ đó xác dịnh các ca kiểm thử
+ Phương pháp này hiệu quả với chương trình này vì các giá trị đầu vào là độc lập và biểu diễn các giá trị vật lý là bị chặn
	
#### Các ca kiểm thử
- 1. Mảng phần tử gồm: 1, 4, 2, 19, 34, 12 output: 34
- 2. Mảng phần tử gồm: MAX_INT, 34, 432424, 1, 0 ; output: MAX_INT
- 3. Mảng phần tử gồm: MAX_INT + 1, 34, 432424, 1, 0 output: 432424
- 4. Mảng phần tử gồm: MAX_INT - 1, 34, 432424, 1, 0; output: MAX_INT - 1
- 4. Mảng phần tử gồm: MIN_INT , -34, - 432424, 1, 0; output: 1
- 4. Mảng phần tử gồm: MAX_INT - 1, 34, 432424, 1, 0; output: 432424

### kết quả: 
+ Từ kết quả test thấy được chương trình còn nhiều lỗi
+ Ví dụ: Chưa xử lý các giá trị ngoại lệ
+ Giúp cải thiện chương trình


## Tuần 4
- Phương pháp kiểm thử hộp đen là phương pháp kiểm thử hướng dữ liệu và hướng vào ra
- Phương pháp này không quan tâm đến cấu trúc của chương trình
- Chỉ quan tâm đến các trương hợp mà phần mềm không thực hiện theo đúng đặc tả vì thế dữ liệu kiểm thử xuất phát từ đắc tả

- Dựa vào đặc tả của chương trình là tìm giá trị lớn nhất của dãy số nguyên int thì tìm được dữ dãy dữ liệu để kiểm thử chương trình: mảng chủa cả số âm và số dương, mảng có sô nguyển lớn hơn MAX_INT, số âm nhỏ hơn MIN_INT
	
###Test độ bao phủ (coverage)
- Dùng plugin Emma code Coverage của intellij để test độ bao phủ
- Sau khi test thì kết quả được là 100%

- Sơ đồ Graph
- 	![alt text](https://raw.githubusercontent.com/truonganhhoang/int3117-2016/master/HoangVanNha/BT1/image/Graph-code2flow.png "Source Code Graph")
- 	
	![alt text](https://raw.githubusercontent.com/truonganhhoang/int3117-2016/master/HoangVanNha/BT1/image/Coverage-2.png "Source Code Graph")