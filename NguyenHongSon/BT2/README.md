## Bài toán đặt ra:
Thay đổi mật khẩu người dùng
## Cách làm:
- MC/DC coverage

Lập bảng điều kiện đầy đủ

STT | username/email | password | new password | Đầu ra
:----: | :----: | :----: | :----: | :----:
1 | T | T | T | T 
2 | T | T | F | F 
3 | T | F | T | F 
4 | T | F | F | F 
5 | F | T | T | F
6 | F | F | F | F 
7 | F | F | T | F 
8 | F | T | F | F 

Lấy ra các điều kiện ảnh hưởng độc lập tới kết quả

STT | username/email | password | new password | Đầu ra
:----: | :----: | :----: | :----: | :----:
1 | T | T | T | T 
5 | F | T | T | F
3 | T | F | T | F 
2 | T | T | F | F 

## Kết quả

![result](https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/NguyenHongSon/BT2/result.JPG)
