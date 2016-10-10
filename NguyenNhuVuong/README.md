#THÔNG TIN SINH VIÊN
___
* Họ và tên : Nguyễn Như Vưong
- lớp       : K58CC
+ MSSV      : 13020706
___
Update bài tập tuần 3

* Sử dụng phương phảp kiểm thử biên mạnh
- Tính tổng các số chẵn trong một mảng cho trước
+ Sử dụng các giá trị array[i] < 0; array[i] > 0; array[i] = 0; array[i] vô cùng lớn, array[i] là số kiểu chuỗi "0", "1", "2"...

Phương pháp hộp đen: 
* Duyệt các phần tử của mảng từ đầu đến cuối mảng
+ Nếu array[i] %2 == 0 và typeOf(array[i] == 'number') thì cộng thêm số đó vào tổng 

Sơ đồ khối 




























![alt text][logo]
[logo]:https://github.com/longdt03/int3117-2016/blob/master/NguyenNhuVuong/sodo.png
___
- Nâng cấp bài tập tuần 1: tính tổng các số chẵn trong mảng cho trước
 + sử dụng kiểm thử biên : do hàm kiểm tra không kiểm tra kiểu của các phần tử trong mảng nên khi chạy với mảng có chứa các kí tự chuỗi kiểu số 
	a = ["0", "1", "2", "3", '4', '5', '6'];
khi chạy hàm tính tổng, điều kiện if(array[i] % 2 == 0) vẫn đúng khi array[i] = "0" hoặc array[i] = "2" hoặc array[i] = "4" .............
 + sửa khi kiểm tra điều kiện thì là số chẵn thì phải kiểm tra kiểu của phần tử đó. sửa thành : if(array[i] %2 == 0 && typeOf(array[i] == 'number')
