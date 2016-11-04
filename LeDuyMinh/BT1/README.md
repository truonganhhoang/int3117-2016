**Báo cáo tuần 4**

 - Đo độ bao phủ
 ![đo độ bao phủ](https://github.com/vutung189/int3117-2016/blob/master/LeDuyMinh/BT1/DoDoBaoPhu.png)
 
 - Đồ thị chương trình
![đồ thị chương trình](https://github.com/vutung189/int3117-2016/blob/master/LeDuyMinh/BT1/SoDoKhoi.JPG)

**Báo cáo tuần 3**

 - Kĩ thuật sử dụng: Kiểm thử lớp tương đương yếu
 - Áp dụng:
	Ta phân ra 3 lớp tương đương theo yêu cầu bài toán như sau:
	(1) n < 1
	(2) 0 < n < 101
	(3) n > 100
	Từ đó ta có 3 test case tương ứng với 3 lớp tương đương.
	VD:
	Input: n = -10, n = 5, n = 110
	Output: "Khong hop le", "0 1 1 2 3", "So qua lon"

 - Giải thích:
	So sánh với kĩ thuật khác:
	+ Với kiểm thử biên, ta cần đến 5 test case hoặc 7 test case với kiểm thử biên mạnh. Trong khi 
	kiểm thử lớp tương đương yếu chỉ cần có 3 test case là có thể kiểm tra được hết các trường hợp.
	+ Với kĩ thuật kiểm thử bằng bảng quyết định, ta sẽ có 3 điều kiện là: n nhỏ hơn 1, n hợp lệ, 
	n lớn hơn 100. Từ đó ta cũng có 3 test case bằng với kiểm thử lớp tương đương yếu nhưng việc 
	lập bảng là không cần thiết và phức tạp hơn.
	=> Dùng phương pháp kiểm thử lớp tương đương yếu là phù hợp nhất.

 - Kết quả: Việc kiểm thử lớp tương đương yếu tốn ít thời gian và số test case ít nhất.

**Báo cáo tuần 1**

 - Mô tả: Chương trình in ra n số Fibonacci đầu tiên với n nguyên dương và n <= 100.
 - Chương trình:
	 + Fib.java: hàm printFirstNFib nhận tham số n kiểu int, trả về xâu chứa n số Fibonacci đầu tiên.
	 + FibTest.java: có 3 testcase tương ứng với 3 trường hợp có thể xảy ra khi truyền tham sô cho hàm printFirstNFib.
