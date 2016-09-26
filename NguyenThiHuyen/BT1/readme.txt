Bài toán: kiểm tra xem một số có phải là số nguyên tố không? 

-Phương pháp: Bài toán được xây dựng bằng ngôn ngữ java.
+Hàm SoNguyenTo: hàm khởi tạo số number
+Hàm kiemTra(): kiểm tra xem số  number có phải là số nguyên tố không. Nếu là số nguyên tố trả về true nếu không trả về false.

-Test case: sử dụng kỹ thuật  kiểm thử lớp tương đương. 

+Lý do: do bài toán kiểm tra số nguyên tố là bài toán khá đơn giản, ta có thể dễ dàng phân hoạch được miền giá trị đầu vào thành các miền con. Trong khi nếu ta sử dụng kiểm thử lớp biến thì sẽ mất nhiều thời gian hơn để xác định giá trị đặc biệt như giá trị max,... hay là kỹ thuật kiểm thử bằng bẳng quyết định.

+Áp dụng:
Valid: các số nguyên lớn hơn hoặc bằng 2.
Invalid: các số nhỏ hơn 2.

Các ca kiểm thử:
5 => số nguyên tố
-3 => không hợp lệ
6 => không phải số nguyên tố
1=> không là số nguyên tố
...

+ Độ bao phủ: Dựa vào đồ thị chương trình
=> độ bao phủ theo câu lênh: 2
=> độ bao phủ theo nhánh: 3
