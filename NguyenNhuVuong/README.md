THÔNG TIN SINH VIÊN

Họ và tên : Nguyễn Như Vưong
lớp       : K58CC
MSSV      : 13020706

- Nâng cấp bài tập tuần 1: tính tổng các số chẵn trong mảng cho trước
 + sử dụng kiểm thử biên : do hàm kiểm tra không kiểm tra kiểu của các phần tử trong mảng nên khi chạy với mảng có chứa các kí tự chuỗi kiểu số 
	a = ["0", "1", "2", "3", '4', '5', '6'];
khi chạy hàm tính tổng, điều kiện if(array[i] % 2 == 0) vẫn đúng khi array[i] = "0" hoặc array[i] = "2" hoặc array[i] = "4" .............
 + sửa khi kiểm tra điều kiện thì là số chẵn thì phải kiểm tra kiểu của phần tử đó. sửa thành : if(array[i] %2 == 0 && typeOf(array[i] == 'number')
