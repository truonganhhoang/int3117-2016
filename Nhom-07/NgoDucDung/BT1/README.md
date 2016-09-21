# KTPM2016
Bài tập môn kiểm thử phần mềm 2016

/* Javascript UNIT TESTING: Jasmine Framework */

Jasmine is a behavior-driven development framework for testing JavaScript code. It does not depend on any other JavaScript frameworks. It does not require a DOM.

1. Owner:
Fullname: Duc Dung Ngo
Student ID: 13020081
Class: QHI-2013 K58CLC

2. How to run:
- main.html: template for js application and where to show test results.
- js/calculate.js: tested js code.
- jasmine/js/caculate.js: all test suites.

/* Update new test cases */

3. Áp dụng kĩ thuật kiểm thử: Kiểm thử biên mạnh
- Chỉ có một giá trị input – số phút cuộc gọi, nên không cần thiết sử dụng Lớp tương đương hoặc Bảng quyết định.
- Đơn giản, tốn ít thời gian xây dựng test case.
- Với bài toàn này cần thêm một số trường hợp kiểm thử giá trị đặc biệt (null, nhập kí tự, nhập số).

4. Chi tiết kiểm thử biên mạnh
- Điều kiện số phút > 0
- Điều kiện số phút là giá trị số
- Điều kiện số phút không phải là null hoặc empty
- Trả về undefined nếu giá trị nhập không hợp lệ
* Các ca kiểm thử và kết quả được biểu diễn khi chạy file main.html bằng trình duyệt web.

5. Kết quả khi áp dụng kiểm thử biên mạnh.
- Chặt chẽ hơn khi thêm được một số trường hợp gần và lớn hơn ở sát các giá trị biên.
- Cảm giác kiểm thử được hết các trường hợp.
