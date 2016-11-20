# Nhận xét bài tập của Nguyễn Trọng Minh Dũng

## BT1

### Được

- Bài toán có ứng dụng thực tế, tương đối phức tạp
- Giải quyết bài toán tốt: có định nghĩa các lớp rành mạch, sử dụng interface, các phương thức có mục đích rõ ràng
- Code dễ đọc: indentation ổn, có tuân theo coding convention
- 'README.md' có mô tả về bài toán và hướng làm


### Chưa được

- Code trộn giữa tiếng Anh và tiếng Việt
- 'README.md' không trình bày rõ các ca kiểm thử
- Ảnh đo độ bao phủ không hiện trong 'README.md'
- Độ bao phủ không đạt 100%

### Kiểm tra code với SonarLint (ngôn ngữ Java)

Sau khi kiểm tra code với SonarLint, phát hiện một số lỗi phổ biến như:
- Không tuân thủ coding convention, ví dụ: kiểu enum không viết hoa
- Tên biến, phương thức dài
- Lệnh if/for/while/switch/try lồng nhau quá 3 lần
- Dấu ngoặc thừa
- Khai báo biến nên tách dòng
![SonarLint](screenshots/SonarLint.png)

## BT2 và BT3 thiếu