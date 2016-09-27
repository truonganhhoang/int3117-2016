Nâng cấp BT1
-Kỹ thuật sử dụng : kiểm thử lớp tương đương
-Áp dụng : ta có 4 lớp tương đương sau
	+ mang A là mảng rỗng
	+ mảng A là tập hợp các phần tử chẵn
	+ mảng A là tập hợp các phẩn tử nguyên
	+ mảng A là tập hợp các phẩn tử lẻ
- Ta có 4 test case
+ testMangRong : test mang A là một mảng rỗng , kỳ vọng là 0
+ testMangSoChan : test mảng A là tập chỉ có các phần tử chẵn
+ testMangSoChanLe : test mảng A là tập có cả các phần tử chẵn và lẻ
+ testMangSoLe : test mảng A là tập chỉ có phần tử lẻ
- Kết quả :
+ testMangRong : pass
+ testMangSoChan : pass
+ testMangSoChanLe : pass
+ testMangSoLe : pass
- Sử dụng kỹ thuật này vì chỉ cần 3 test case có thể kiểm tra được hết các trường hợp có thể xảy ra