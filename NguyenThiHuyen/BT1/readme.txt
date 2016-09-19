-Bài toán: kiểm tra xem một số tự nhiên lớn hơn 0 có phải là số nguyên tố không? 

-Phương pháp: Bài toán được xây dựng bằng ngôn ngữ java.
+ Hàm SoNguyenTo(number) : khởi  tạo giá trị 1 số tự nhiên cần kiểm tra
+Hàm kiemTra(): kiểm tra xem số khởi tạo có phải là số nguyên tố không. Nếu là số nguyên tố trả về True nếu không trả về false.

-Test case: sử dụng kỹ thuật  kiểm thử lớp tương đương. 
+Lý do: do bài toán kiểm tra số nguyên tố là bài toán khá đơn giản, ta có thể dễ dàng phân hoạch được miền giá trị đầu vào thành các miền con. Trong khi nếu ta sử dụng kiểm thử lớp biến thì sẽ mất nhiều thời gian hơn để xác định giá trị đặc biệt như giá trị max,... hay là kỹ thuật kiểm thử bằng bẳng quyết định.
+Áp dụng:

	Invalid	Valid
Number	-2	3, 6

Các ca kiểm thử:

STT	Number	Kết quả mong đợi
1	3	Số nguyên tố
2	6	Không phải số nguyên tố
3	-2	Không hợp lệ
