# Bài toán:
Nhập điểm sinh viên từ bàn phím rồi phân loại điểm cho sinh viên, thang điểm 0-100
- 0-39: F
- 40-49: D
- 50-59: C
- 60-79: B
- 80-100: A

# Hướng giải quyết:
Bài toán được code bằng java: TinhDiem.java
- Hàm NhapDiem() nhập điểm số của sinh viên từ bàn phím
- Hàm PhanLoai(diem) phân loại điểm cho sinh viên theo các thang điểm như trên

#Test case
Test code bài toán: TinhDiemTest.java
Sử dụng test phân vùng tương đương (EQ): 0-100: Valid, trường hợp còn lại: Invalid
Sử dụng test giá trị biên (BVA):
- F: test các giá trị 0, 1, 10, 39
- D: test các giá trị 40, 41, 45, 49
- C: test các giá trị 50, 51, 55, 59
- B: test các giá trị 60, 61, 70, 79
- A: test các giá trị 80, 81, 90, 100

#Độ bao phủ
Dựa vào sơ đồ khối (controlFlow.png)
=> độ bao phủ câu lệnh: 100%