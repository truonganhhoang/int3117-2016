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

/* Upgrade from BT1 */

3. Giả sử đang sử dụng nhà mạng Viettel. Người dùng có thể lựa chọn sử dụng một trong hai gói cước nội mạng sau:
-  Gói DK3: miễn phí 20 phút gọi nội mạng
- Gói KM100: miễn phí 100 phút gọi nội mạng

4. Sử dụng MC/DC testing để đưa ra các test case sau
- Người dùng đăng kí gói DK3
- Người dùng đăng kí gói KM100
- Người dùng không sử dụng gói cước nào cả (mặc định)

- Người dùng không nhập phút, coi như chưa tính thời gian gọi
- Số phút bằng null, coi như chưa tính thời gian gọi
- Trường hợp phút hợp lệ, tính toán bình thường

- Số phút lớn hơn 200
- Số phút nhỏ hơn 200
- Số phút lớn hơn 50 và nhỏ hơn 200
- Số phút nhỏ hơn 50

