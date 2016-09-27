#Bài toán tìm giai thừa của 1 số

1. Bài toán
	1. Giới thiệu bài toán
		- Bài toán tính giai thừa của 1 số n cho trước
	2. Giải pháp
		- Tạo ra 1 phương thức factorial với tham số nhận vào là n, trả về giá trị kiểu long là kết quả n!.
		- Nếu giá trị đầu vào là số âm phương thức factorial sẽ trả về giá trị 0.
		- Do giới hạn của kiểu long là 9.223.372.036.854.775.807 nên khi n đủ lớn bài toán sẽ bị sai số.
		- Giới hạn n(giá trị đầu vào) của bài toán là 0<=n<=20		
	3. Đồ thị chương trình
	- Đồ thị được vẽ sử dụng công cụ hỗ trợ tại http://code2flow.com/
	
	![alt tag](https://github.com/longdt03/int3117-2016/blob/master/DangThanhLong/BT1/FlowChart.png)
	
2. Kiểm thử
	1. Áp dụng kiểm thử lớp tương đương cho bài toán này với các lớp tương đương
	D1={n | n < 0}
	D2={n | 0<=n<=20 }
	D3={n | n > 20}

	 - Từ 3 lớp tương đương trên ta có 5 TestCase:
		+ n = 0 Giá trị kỳ vọng n! = 1
		+ n = 5 Giá trị kỳ vọng n! = 120
		+ n = 20 Giá trị kỳ vọng n! = 2432902008176640000L
		+ n = -5 Giá trị kỳ vọng n! = 0
		+ n = 21 Giá trị kỳ vọng n! = 51090942171709440000
	2. Giải thích
		- Sử dụng Kiểm thử lớp tương đương cho bài toán này vì giá trị đầu vào là 1 số nguyên, dễ dàng tìm được giá trị biên của bài toán từ đó dễ xác định các lớp tương đương.
		- Bài toán không có nhiều giá trị đặc biệt nên sử dụng các lớp tương đương có thể kiểm tra được hết các trường hợp của bài toán.
	3. Kết quả kiểm thử
	
	![alt tag](https://github.com/longdt03/int3117-2016/blob/master/DangThanhLong/BT1/TestResult.PNG)
	
	4. Mức độ bao phủ(Test Coverage)
	- Sử dụng plugin JaCoCo của Netbeans để đo mức độ bao phủ của các Test case.
	
	+ Báo cáo mức độ bao phủ(100%)
	![alt tag](https://github.com/longdt03/int3117-2016/blob/master/DangThanhLong/BT1/TestCoverage_Summary.PNG)
	
	+ Chi tiết
	![alt tag](https://github.com/longdt03/int3117-2016/blob/master/DangThanhLong/BT1/TestCoverage_Detail.PNG)