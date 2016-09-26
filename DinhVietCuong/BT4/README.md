Bài toán tìm kiếm nhị phân
Sử dụng phương pháp kiểm thử lớp tương đương vì:
- Kiểm thử lớp tương đương: chia thành từng lớp tương đương 0, 1 và >1 với số phần tử của dãy
- Không có các giá trị biên cho nhập liệu nên không sử dụng được kiểm thử binee.
- Không có kết hợp nhiều điều kiện tìm kiếm nên không áp dụng bảng quyết định
Các trường hợp:
- Mảng không có phần tử nào.
- Mảng có 1 phần tử. Khóa tìm kiếm có giá trị 
•	lớn hơn phần tử đó
•	nhỏ hơn phần tử đó
•	bằng đúng phần tử đó
- Mảng có nhiều hơn 1 phần tử.
       Trường hợp khóa tìm kiếm không có trong mảng: giá trị của khóa tìm kiếm:
•	lớn hơn phần tử lớn nhất
•	nhỏ hơn phần tử nhỏ nhất
•	nằm giữa giá trị lớn nhất và nhỏ nhất
      Trường hợp khóa tìm kiếm có trong mảng: giá trị của khóa tìm kiếm
•	là phần tử lớn nhất (vị trí đầu tiên)
•	là phần tử nhỏ nhất (vị trí cuối cùng)
•	là phần tử bất kì
Số lượng phần tử	Mảng 	Khóa tìm kiếm	Vị trí	Pass/Fail
0	{}	1	0	P
1	{10}	3	0	P
1	{10}	20	0	P
1	{10}	10	1	P
4	{10, 15, 20, 25}	5	0	P
4	{10, 15, 20, 25}	30	0	P
4	{10, 15, 20, 25}	22	0	P
4	{10, 15, 20, 25}	25	4	P
4	{10, 15, 20, 25}	10	1	P
4	{10, 15, 20, 25}	15	2	P


Sơ đồ thuật toán:
 
Đo bao phủ:
 
