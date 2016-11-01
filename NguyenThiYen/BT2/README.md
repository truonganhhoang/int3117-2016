Bài Toán: Số Nguyên Tố

Thuật Toán Điều kiện: Số nguyên tố là số tự nhiên chỉ có ước số là 1 và chính nó.

Hướng giải quyết: 

1. Có 2 lệnh if và 1 vòng lặp while.

	1.1 Điều kiện đầu tiên( lệnh "IF" thứ nhất ): Điều kiện phức, số tự nhiên nhỏ hơn 2 hoặc chia hết cho 2 và khác 2 thì trả về false 		" không phải số nguyên tố ".

	1.2 Điều kiện 2(lệnh "IF" thứ 2 ): Số tự nhiên bằng 2 hoặc bằng 3 thì trả về true" là số nguyên tố ".

	1.3 Vòng lặp while(i<Math.squart(m)) và i=2: Với điều kiện số tự nhiên đó chia hết cho i thì trả về false ngược lại tăng i lên nếu 		không thỏa mãn chia hết cho i thì trả về true.

- Độ bao phủ câu lệnh: 100% và kết quả test: passed 6  

- 6 ca kiểm thử:
	  Ca kiểm thử 1: Giá trị đầu vào (<2) là 1-> trả về kết quả false"không phải là số nguyên tố".
	  
	  Ca kiểm thử 2: Giá trị đầu vào là 2-> trả về kết quả true" là số nguyên tố ".
	  
	  Ca kiểm thử 3: Giá trị đầu vào là 0-> trả về kết quả false" không phải số nguyên tố ".
	  
	  Ca kiểm thử 4: Giá trị đầu vào (>2) là 5-> trả về kết quả true.
	  
	  Ca kiểm thử 5: Giá trị đầu vào (>2) là 6-> trả về kết quả false.
	  
	  Ca kiểm thử 6: Giá trị đầu vào là số âm cụ thể là -2-> trả về kết quả false.
