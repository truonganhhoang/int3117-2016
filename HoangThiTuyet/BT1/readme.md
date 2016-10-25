MSSV: 14020524
Bài toán tìm 2 số nguyên lớn nhất trong dãy
Ngôn ngữ java sử dụng junit.

      ----------------------------------------------------
      
# BÀI TẬP TUẦN 3 nâng cấp ca kiểm thử cho bài tập tuần 1
   - Sử dụng kỹ thuật kiểm thử biên mạnh
   - Chương trình giới hạn dữ liệu đầu vào là int ( 4 byte -2147483648 đến 2147483647)
   1. Ca kiểm thư 1: dãy số có chứa giá trị biên min max  -->  đúng kết quả
   2. ca kiểm thử 2 : dãy số có chứa giá trị ngoài biên ví dụ 2147483648 --> chương trình sẽ báo lỗi error 
   -Lý do sử dụng kỹ thuật kiểm thử biên vì:
   + chương trinh giới hạn số trong kiểu nguyên int
   + chương trình chỉ so sánh min max không có các lớp tương đương hay bảng quyết định
      
      ---------------------------------------------------------
      
# BÀI TẬP TUẦN 4:

##  Phương pháp hộp đen:

Phân tích giá trị biên:
   + Bài toán tìm kiếm 2 số lớn nhất trong dãy số hoạt động chủ yếu là so sánh giá trị các số để tìm max vì vậy lỗi thường gặp là giá trị biên. 
   + Bài toán có giới hạn giá trị đầu ra và đầu vào là kiểu số nguyên 4byte.
   + Phân tích giá trị biên để tìm ra lỗi nhập giá trị đầu vào vượt quá giới hạn.  + Kiểm tra 2 phía của biên các giá trị cận biên trong và ngoài.
   
## Đo mức độ bao phủ

![Preview] (https://github.com/HoangTuyetUET/BT1/blob/master/dobaophu.png)

## Đồ thị

![Preview] (https://github.com/HoangTuyetUET/BT1/blob/master/DoThi.png)
