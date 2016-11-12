# Nhận xét bài tập của Nguyễn Thị Lương

## Nhận xét BT1
- Ổn:
  + `README.md` có mô tả về hàm cần kiểm thử và hàm kiểm thử.
  + Có các ảnh về: độ bao phủ, mô tả phương pháp kiểm thử (lớp tương đương), đồ thị chu trình.
  + Mã nguồn khá ổn, trừ một số chỗ nhỏ spacing và style chưa ổn lắm (line 9, 16, 19, 23, 41-42, 44-49 của file `GreatestCommonDivisor.java`)
  + Số lượng ca kiểm thử khá nhiều và kỹ
  + Có xử lý ngoại lệ
  
- Chưa ổn:
  + `REAME.md` thừa `.txt` nên không hiển thị được trên github
  + Chưa cập nhật báo cáo bài tập tuần 3 (lựa chọn phương pháp kiểm thử biên/lớp tương đương, kết quả kiểm thử và phân tích lỗi)
  + Chưa cập nhật báo cáo bài tập tuần 4 (đo mức độ bao phủ cho phương pháp đã chọn ở bài tập 3, vẽ đồ thị chu trình)

## Nhận xét BT2
- Ổn:
  + Có ảnh đo độ bao phủ
  + Số lượng ca kiểm thử khá đầy đủ.
  + `README.md` có mô tả về hàm cần kiểm thử và hàm kiểm thử.
  + Code khá dễ đọc.
  
- Chưa ổn:
  + Viết REAME chưa chuẩn hình thức lắm (tách biệt các phần, xuống dòng, viết hoa,...)
  + Thừa file `README.txt`
  + Chưa mô tả cách áp dụng MCDC và xây dựng các ca kiểm thử dựa trên phương pháp MCDC.
  + Kết quả bao phủ còn thấp - 61.2% (do chưa áp dụng đúng phương pháp?)
  + Một số chỗ trong mã nguồn có spacing chưa chuẩn, cần refactor lại.
  + Nên sử dụng **setUp/tearDown** thay vì một hàm static để khởi tạo điều kiện kiểm thử (hàm `initialData()` trong file `BinarySearTreeTest.java`)
  
## Nhận xét BT3
- Ổn:
  + Có vẽ đồ thị chu trình, tuy nhiên chưa rõ ràng (ảnh một nơi mô tả một nơi, sao không để chung vào 1 file `README.md` ?)
  + Có DU-path và sinh các ca kiểm thử
  
- Chưa ổn:
  + Chưa cập nhật mã nguồn BT3
  + Cần thay thế 2 file `.txt` thành `.md` để github có thể hiển thị được
