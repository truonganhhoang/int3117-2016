- Trong phần bài tập của em, trình bày kiểm thử về một hàm kiểm tra đầu vào và đầu ra kết quả của việc nhập password
- Đầu vào yêu cầu của hàm là nhập một chuỗi ký tự password có độ dài từ 6-20 kí tư
- Dựa trên yêu cầu của đầu ra, em xác định được kiểm thử lớp tương đương là phù hợp với việc kiểm thử hàm này. Ta có các lớp kiểm thử:
+ Nhập chuỗi từ 1-6 kí tự -> Lỗi. Thông báo: "Ban chi duoc phep nhap chuoi tu 6-20 ki tu"
+ Nhập chuỗi từ 6-20 kí tự. Thông báo: "Dang nhap thanh cong"
+ Nhập chuỗi lớn hơn 20 kí tự. Thông báo: "Ban chi duoc phep nhap chuoi tu 6-20 ki tu"
+ Không nhập chuỗi. Thông báo: "Ban hay nhap password"
Việc thực hiện kiểm thử bằng kĩ thuật lớp tương đương tạo được sự bao phủ các trường hợp kiểm thử và dễ dàng hơn trong việc kiểm thử.
