#Bài tập tuần 1
- Họ và tên  : Vũ Thanh Tùng
- MSV : 13020496
- Nhóm 05

##Bài toán : Hàm tính tổng các số chẵn trong mảng.
 
- Test case 1 : tổng các số chẵn trong mảng.
- Test case 2 : tổng các số chẵn trong mảng nhưng không có số chẵn nào.
- Test case 3 : tổng các số chẵn có số âm
- Test case 4 : tổng các số chẵn đều là số âm.
Lưu đồ thuật toán:
![Lưu đồ thuật toán](https://github.com/vutung189/int3117-2016/blob/master/VuThanhTung/BT1/image/LuuDoThuatToan.png)
	
##Bài tập 1 nâng cấp : 
Kỹ thuật : kiểm thử lớp tương đương yếu.

Chia các lớp tương đương sau : 
-mảng dữ liệu có chỉ chứ số chãn
-mảng dữ liệu chỉ chứa số lẻ
-mảng dữ liệu có số chẵn và lẻ
-mảng dữ liệu rỗng
	
##Gải thích : 
-Do bài toán đưa ra đơn giản nên việc áp dụng kỹ thuật kiểm thử lớp tương đương là phù hợp vì :
-Đối với kiểm thử biên khó xác định được biên như giới hạn cực đại của mảng, các điểm tiệm cận không xác định được.
-Đối với kiểm thử bảng quyết định các điều kiện đưa ra cũng như các điều kiện của lớp tương đương tuy nhiên việc lập bảng phức tạp và sảy ra nhiều trường hợp không cần thiết, làm phức tạp thêm bài toán.
-Thay đổi một số test case  phù hợp với các lớp tương đương. 
	
##Kết quả : 
Việc áp dụng kỹ thuật lớp tương đương yếu dễ thực hiện, tốn ít thời gian, số lượng test case ít nhưng vẫn đảm bảo test đủ các trường hợp sảy ra. 

Đo độ bao phủ 
![Đo độ bao phủ](https://github.com/vutung189/int3117-2016/blob/master/VuThanhTung/BT1/image/DoMucDoBaoPhu.png)
	