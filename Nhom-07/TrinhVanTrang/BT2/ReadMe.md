#Bài tập kiểm thử phần mềm 2
Họ tên : Trịnh Vân Trang
Mssv: 13020453

Bài tập 2
1. Mô tả bài toán:
- Tính số ngày trong tháng
- Bài toán gồm 3 lệnh điều kiện và trong đó có lệnh điều kiện phức hợp
2. Áp dụng bao phủ điều kiện phức MD/DC
- Lệnh if(month == 1 || month == 3 || month == 5 || month == 7 ||month ==8|| month ==11 || month ==12)
sẽ có 7 ca kiểm thử
- Lệnh if (month == 4||month ==6 || month == 9|| month==11) có 3 ca kiểm thử
- Lệnh if (year %400 ==0||(year %4 == 0 && year %100 !=0)) sẽ có 4 ca kiểm thử cho tháng 2 và một tháng bất kì trong năm thường và năm nhuận
