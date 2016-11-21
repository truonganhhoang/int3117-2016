# Google JavaScript Style Guide

## Mục lục


* 1. Giới thiệu
  * 1.1	Chú thích thuật ngữ
  * 1.2	Chú thích hướng dẫn
* 2.	Tập tin mã nguồn cơ bản
  * 2.1	Tên thư mục
  * 2.2	Mã hoá thư mục: UTF – 8
  * 2.3	Các kí tự đặc biệt
* 3.	Cấu trúc tập tin
  * 3.1	Giấy phép hoặc bản quyền thông tin (Nếu có)
  * 3.2	@fileoverview JSDoc (Nếu có)
  * 3.3	Câu lệnh goog.module
  * 3.4	Các câu lệnh goog.require
  * 3.5	Hệ thống xử lí tập tin
* 4.	Định dạng
  * 4.1	Các dấu ngoặc
  * 4.2	Lùi dòng: +2 khoảng cách
  * 4.3	Các câu lệnh
  * 4.4	 Giới hạn cột: 80
  * 4.5	Xuống dòng
  * 4.6	Khoảng trắng
  * 4.7	Nhóm dấu ngoặc đơn: Khuyến cáo
  * 4.8	Các Bình Luận
* 5.	Các đặc trưng ngôn ngữ
  * 5.1	Khai báo biến cục bộ
  * 5.2	Mảng kí tự
  * 5.3	Đối tượng kí tự
  * 5.4	Các lớp
  * 5.5	Các Hàm
  * 5.6	Chuỗi kí tự
  * 5.7	Số kí tự
  * 5.8	Cấu trúc điều khiển
  * 5.9	This
  * 5.10	Tính năng không cho phép
* 6.	Đặt tên
  * 6.1	Quy định chung cho tất cả định danh
  * 6.2	Quy định theo loại định danh
  * 6.3	Camel Case: Được xác định
* 7.	JSDoc
  * 7.1	Dạng tổng quát
  * 7.2	Markdown
  * 7.3	Các thẻ (tag) Jsdoc
  * 7.4	Xuống dòng
  * 7.5	Chú thích tại top/file level
  * 7.6	Chú thích lớp
  * 7.7	Chú thích Enum và Typedef
  * 7.8	Chú thích phương thức và hàm
  * 7.9 Chú thích theo đặc tính
  * 7.10 Loại chú thích
  * 7.11 Chú thích
* 8.	Nguyên tắc, chính sách
  * 8.1	Các vấn đề không nói tới bởi Google Style: Nhất quán
  * 8.2	Cảnh báo trình biên dịch
  * 8.3	Deprecation
  * 8.4	Code không nằm trong Google Style
  * 8.5	Quy tắc Style cục bộ
  * 8.6	tạo mã: Được miễn
* 9.	Phụ Lục
  * 9.1	Tag Tham Khảo
  * 9.2	Những quy tắc kiểu thường bị hiểu lầm
  * 9.3	Các Tool liên quan

## 1. Giới thiệu

Tài liệu này định nghĩa hoàn chỉnh các tiêu chuẩn mã hoá của Google cho mã nguồn trong ngôn ngữ lập trình JavaScript. Một tập tin mã nguồn JavaScript được coi là đúng chuẩn Google Style khi và chỉ khi nó tuân thủ những quy tắc trong tài liệu này.
Giống như những hướng dẫn về phong cách lập trình khác, các vấn đề bao quát không chỉ là vấn đề thẩm mĩ định dạng mà còn nằm ở quy ước và tiêu chuẩn mã hoá. Tuy nhiên, tài liệu này tập trung chủ yếu vào các tiêu chuẩn bất di bất dịch mà chúng ta theo đuổi ở bậc đại học và tránh đưa ra những lời tư vấn không rõ ràng hoặc không khả thi (dù là con người hay công cụ).

  - [ ] 1.1 Chú thích thuật ngữ
Trong tài liệu này, trừ trường hợp làm rõ, ta quy ước:
    -	Những thuật ngữ nhận xét luôn để cập tới sự bổ sung nhận xét. Chúng tôi không sử dụng những bình luận cụm từ tham khảo, thay vì sử dụng thuật ngữ chung “JSDoc” cho cả chú thích văn bản thô lẫn thuật ngữ máy tính trong /**… */.
    -	Hướng dẫn Style này sử dụng thuật ngữ RFC 2119 khi sử dụng các cụm từ phải, không được, nên, không nên và có thể. Các thuật ngữ ưa thích và cần tránh tương ứng lần lượt với nên và không nên. Các câu lệnh khai báo không điều kiện là quy tắc phải được thoả mãn.
    -	Các ghi chú khác sẽ thỉnh thoảng được xuất hiện trong tài liệu














- [ ] Demo checklist 1
- [ ] Demo checklist 2
