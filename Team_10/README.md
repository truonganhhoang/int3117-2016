# Jasmine Unit Testing for Javascript
## Giới thiệu
### BDD là gì?
BDD (Behavior Driven Development) là môt quá trình phát triển phần mềm dựa trên thử nghiệm hướng phát triển. BDD quy định rằng các developer và product owner cần hợp tác và xác định các hành vi của người sử dụng, nó sinh ra hướng tới các feature test mà người dùng thực hiện là các Acceptance Tester.
-	Thay vì chờ đợi sản phẩm hoàn thành và kiểm thử, người tester/analyst tham gia vào quá trình xây dựng mã nguồn với vai trò phân tích và xây dựng hệ thống kịch bản kiểm thử dưới góc độ ngôn ngữ tự nhiên dễ hiểu từ các yêu cầu (requirement).
-	Đồng thời, họ giúp đỡ developer trong việc giải thích và đưa ra các phương án xây dựng mã nguồn mang tính thực tiễn với người dùng ngay trước khi ta bắt đầu xây dựng.
-	Người developer liên hệ mật thiết với người tester và xây dựng mã nguồn với những phương án mà tester cung cấp.
-	Kịch bản kiểm thử được phân chia làm 2 lớp: Lớp chấp nhận (feature/acceptance test) và lớp đơn vị (unit test).
-	Theo đó, kịch bản kiểm thử lớp đơn vị mang thuần tính thiết kế và phục vụ cho việc kiểm thử lớp đơn vị (Unit test) còn kịch bản kiểm thử lớp chấp nhận có thể được tái sử dụng cho quá trình kiểm thử hồi quy về sau (regession test).

### Jasmine là gì?
Jasmine là một framework mã nguồn mở sử dụng để test code cho javascript theo mô hình BDD. Nó không phụ thuộc vào bất kỳ framework nào của Javascript. Nó không đòi hỏi một DOM và nó có một cú pháp rõ ràng và sạch sẽ để bạn có thể viết các test case.
