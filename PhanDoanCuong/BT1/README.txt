+Bài tập nhỏ tìm số nguyên tố lớn nhất nhỏ hơn số N.
 +Input: Số N
 +Output: X là số nguyên tố lớn nhất nhỏ hơn số N.
 +Cài đặt:
 ++Hàm kiểm tra một số có phải là số nguyên tố không.
 ++Hàm trả về số nguyên tố ứng với giá trị đầu vào.
 ++Chương trình sử dụng JUnitTest.
 
BT tuần 3:
- Sử dụng phương pháp kiểm thử lớp tương đương yếu với các lớp tương đương sau: 
 + Lớp A1: các số nguyên nhỏ hơn 1.
 + Lớp A2: các số nguyên lớn hơn MAX_INT
 + Lớp A3: các số nguyên trong khoảng từ 1 đến MAX_INT.
 Từ 3 lớp tương đương trên, ta có 3 test case tương ứng là các giá trị đại diện của 3 lớp tương đương.
 - Sử dụng phương pháp kiểm thử này là phù hợp vì nó bao hàm được phạm vi của input, không dư thừa và hiệu quả tốt. Đặc biệt hữu ích hơn so với kiểm thử biên và bảng quyết định vì:
 + Kiểm thử biên: Trong bài toán tìm số nguyên tố thì biên là không rõ ràng. Hơn nữa không kiểm tra được trường hợp hợp lệ của đầu vào.
 + Kiểm thử bằng bảng quyết định: Output chỉ là in ra 1 số nào đó nên chỉ có 1 hành động duy nhất. Do vậy bảng quyết định sẽ không phù hợp vì chỉ có 1 hành động.
 + Ngoài ra, bài toán cũng chỉ có 1 biến nên khó dùng lớp tương đương mạnh.
 
 Sau khi áp dụng phương pháp kiểm thử trên, chương trình đã xử lý được các trường hợp đầu vào là số nguyên. 
 
