# BÀI TẬP 2

## Hàm cần kiềm thử
Kiểm tra một chuỗi nhập vào dạng dd/mm/yyyy có phải là một ngày hay không
	- Nếu có trả về true
	- Nếu không trả về false

Điều kiện đầu vào: một chuỗ có dạng dd/mm/yyyy trong đó dd, mm, yyyy phải là định dạng được sang kiểu số nguyên

## Tìm ca kiểm thử

#### Ta có các ca kiểm thử có thể có với điều kiện của bài toán


#### Áp dung kỹ thuật MC/DC để tìm ra các ca kiểm thử quan trọng

#### Thực thi các ca kiểm thử
- Kiểm thử cho tháng 2:
	+ Năm nhuận: 29/2/2000 ==> true
	+ Năm thường: 29/2/2001 ==> false
	+ Đầu tháng: 1/2/2020 ==> true
	+ Giữa tháng: 15/2/2020 ==> true
	+ Ngày 30 : 30/2/2001 ==> false

- Kiểm thử tháng 1 đại diện cho các tháng có 31 ngày: {1,3,5,7,8,10,12}
	+ Đầu tháng: 1/1/2020 ==> true
	+ Cuối tháng: 31/1/2020 ==> true
	+ Ngoại biên: 0/1/2020 ==> false
		      32/1/2020 ==> false


- Kiểm thử tháng 4 đại diện cho các tháng có 31 ngày: {4,6,9,11}
	+ Đầu tháng: 1/4/2020 ==> true
	+ Cuối tháng: 30/4/2020 ==> true
	+ Ngoại biên: 0/4/2020 ==> false
		      31/4/2020 ==> false

- Kiểm thử ngoại biên: định dạng ngày tháng năm không thỏa mãn điều kiện
	+ Ngày: Lớn hơn 31, nhỏ hơn 1
		32/4/2020 ==> false
		-1/2/2001 ==> false
	+ Tháng: Lớn hơn 12, nhỏ hơn 1
		1/13/2020 ==> false
		1/0/2020 ==> false
	+ Năm: nhỏ hơn 1
		30/4/-124 ==> false
	


### Kết quả
#### Kết quả test bao phủ

