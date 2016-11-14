# Bài tập 3

## Mô tả bài toán
Nhập vào số N, tìm số thứ N chia hết cho 2 và 3 hoặc 5 (code đã có trong BT2).

## Phương pháp
Áp dụng phương pháp kiểm thử luồng dữ liệu theo chuẩn All-du-paths.

![alt text](https://github.com/minhnt58/int3117-2016/blob/master/TranMinhQuy/BT3/flow.png "All-du-paths")

##Nhận xét
* Chung:
	* Cả 2 đều hỗ trợ quá trình tạo test cases khá thuận lợi.
	* Độ bao phủ của cả 2 đều tương tự nhau.
	* Cả 2 đều chưa quét qua trường hợp boolean.
* Ưu thế của MCDC:
	* Dùng MCDC sẽ kiểm soát được các câu lệnh điệu kiện tốt hơn.
	* Quá trình sinh test cases sẽ quét hết trường hợp.
* Ưu thế của All-du-Path:
	* Sinh test cases theo luồng đồ thị nên rành mạch và dễ dàng hơn.
	* Có thể phủ qua một số trường hợp câu lệnh điều kiện trên đường đi qua của thị.