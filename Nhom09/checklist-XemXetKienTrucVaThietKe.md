# Checklist: Xem xét lại kiến trúc và thiết kế
Link: [Checklist: Architecture and Design Review](https://msdn.microsoft.com/en-us/library/ff647464.aspx)

Nâng cao bảo mật ứng dụng web: Các mối đe dọa và các biện pháp đối phó.

Ứng dụng cho:
- Ứng dụng web
- ASP.Net
- .Net framework.

Danh sách xem xét lại kiến trúc và bản thiết kế bao gồm các khía cạnh của kiến trúc và thiết kế vòng đời phát triển của dự án, bao gồm:  
- Xác thực đầu vào.
- Xác thực.
- Cấp quyền.
- Quản lý cấu hình.
- Dữ liệu nhạy cảm.
- Quản lý phiên session.
- Mã hóa.
- Điều khiển các thông số.
- Quản lý ngoại lệ.
- Kiểm tra và lưu trữ lại.

Cách sử dụng Checklist:
- Sử dụng danh sách kiểm tra giúp bạn thực thi kiển trúc và xem xét lại bản thiết kế để đánh giá mức độ bảo mật của ứng dụng web và để thực thi hướng dẫn thiết thế.
- Danh sách kiểm tra nên được phát triển sựa trên kinh nghiệm bạn thu được tù việc thực thi xem xét lại. Bạn có lẽ cũng muốn thực hiện các kiểm tra theo cá nhân mà được được dựa trên khía cạnh đặc tả kiến trúc hay thiết kế của bạn để đảm bảo cho môi trường triển khai của bạn.

## 1. Triển khai và xem xét cơ sở hạ tầng

- [ ] Bản thiết kế được xác định, được hiểu và tuân theo chính sách bảo mật của công ty.
- [ ] Những hạn chế phải được xác định rõ trong khuôn khổ an ninh cở sở hạ tầng (bao gồm các dịch vụ có sẵn, các giao thức, các hạn chế tường lửa).
- [ ] Bản thiết kế phải được xác định và tuân theo các hạn chế bị áp đặt bởi các môi trường lưu trữ (bao gồm các yêu cầu cô lập ứng dụng)
- [ ] "The target environment code-access-security trust level is known."</br>
Mức độ tin cậy cuả bảo mật truy cập mã trong môi trường mục tiêu được hiểu biết đến.
- [ ] Bản thiết kế xác định các yêu cầu triển khai cơ sở hạ tầng và cấu hình triển khác ứng dụng.
- [ ] Xác định rõ miền cấu trúc, máy chủ ứng dụng từ xa và cơ sở dữ liệu.
- [ ] Bản thiết kế xác định các yêu cầu thành từ nhóm.
- [ ] Bản thiết kế phải xác định được các điểm bảo trì cấu hình ứng dụng (ví dụ như những gì cần phải có để cấu hình ứng dụng và những công cụ gì có sẵn cho IDC admin).
- [ ] Các đặc tính giao tiếp an toàn phải được cung cấp bởi các nền tảng và các ứng dụng phải được biết đến.
- [ ] Bản thiết kế phải đánh địa chỉ Web farm (trang web được lưu trữ trên nhiều máy chủ) bao gồm: quản lý trạng thái session, máy mã hóa khóa,  Secure Sockets Layer (SSL)- tiêu chuẩn an ninh công nghệ toàn cầu, triển khai chứng chỉ và cấu hình chuyển vùng.
- [ ] Bản thiết kế xác định xác thực danh tính (CA) được sử dụng để cung cấp SSL.
- [ ] Bản thiết kế giải quyết khả năng mở rộng và tiêu chuẩn hiệu suất.

## 2. Các vấn đề cần được xem xét trong thiết kế và cấu trúc ứng dụng.

### 2.1. Kiểm tra đầu vào

- [ ] Các tiêu chuẩn đầu vào và các biên để dữ liệu và việc thực thi chương trình là đúng phải được xác định trong abnr thiết kế.
- [ ] Kiểm tra đầu vào được áp dụng bất cứ khi nào đầu vào được nhận từ biên đúng hiện tại ở bên ngoài.
- [ ] Bản thiết kế giả thiết được trường hợp nhập vào từ người dùng là có độc hại.
- [ ] Kiểm tra đầu vào tập trung được sử dụng ở các trường hợp đặc trưng
- [ ] Chiến lược kiểm tra đầu vào khi được các ứng dụng thông qua phải được mô hình hóa và thống nhất.
- [ ] Kiểm tra tiếp cận là để hạn chế, từ chối và thanh lọc đầu vào (tìm kiếm đầu vào an toàn, hợp lệ và xác định là dễ dàng hơn tìm kiếm đầu vào đọc hại và nguy hiểm)
- [ ] Dữ liệu được kiểm tra về kiểu dữ liệu, độ dài, định dạng và phạm vi.
- [ ] Bản thiết kế giải quyết các vấn đề chuẩn hóa.
- [ ] Tên tập tin và đường dẫn đầu vào phải được phòng tránh mọi nơi có thể.
- [ ] Bản thiết kế giải quyết các vấn đề SQL injection (kỹ thuật lợi dụng các  lỗ hổng của việc kiểm tra dữ liệu đầu vào trong các ứng dụng web và các thông báo lỗi của hệ quản trị cơ sở dữ liệu trả về để inject (tiêm vào) và thi hành các câu lệnh SQL bất hợp pháp) tiềm ẩn.
- [ ] Bản thiết kế giải quyết các vấn đề cross-site scripting (kiểu tấn công cho phép các hacker chèn những đoạn script đọc hại vào website)
- [ ] Bản thiết kế không dựa vào xác nhận từ phía người dùng client.
- [ ] Bản thiết kế áp dụng các biện pháp phòng trừ về chiều sâu để chiến lược kiểm nhận đầu vào bằng cách cung cấp xác nhận đầu vào thông qua ....
- [ ] Đầu ra mà bao gồm đầu vào được mã hóa bằng cách sử dụng HtmlEncoded và UrltEncode

### 2.2. Xác thực

- [ ] Xác định các bên tin cậy được xác định bởi bản thiết kế.
- [ ] Bản thiết kế xác định danh tính được sử dụng để truy cập tài nguyên qua biên tin tưởng.
- [ ] Bản thiết kế phân vùng các trang web thành các vùng chung và vùng hạn chế bằng cách sử dụng các thư mục riêng biệt.
- [ ] Bản thiết kế xác định các yêu cầu tài khoản dịch vụ
- [ ] Bản thiết kế xác định các thông tin được lưu trữ an toàn được chấp nhận từ phía người dùng.
- [ ] Bản thiết kế xác định cơ chế để bảo vệ thông tin trên các bức điện tín(SSL, IPSec, mã hóa vv)
- [ ] Chính sách quản lý tài khoản đều được xem xét bởi các thiết kế.
- [ ] Nếu xác thực SQL được sử dụng, các thông tin được đảm bảo đầy đủ qua dây (SSL hay IPSec) và trong lưu trữ (DPAPI).
- [ ] Bản thiết kế áp dụng một chính sách sử dụng tài khoản có đặc quyền ở mức tối thiểu
- [ ] Mật khẩu tóm lược (bằng salt - pha trộn số ngẫu nhiên với password nhằm đảm bảo an toàn) được lưu trữ trong danh mục người dử dụng để xác thực.
- [ ] Mật khẩu mạnh được sử dụng.
- [ ] Xác thực cookie không được truyền qua kết nối mà không được mã hóa.

### 2.3. Phân quyền

- [ ] Các thiết kế có vai trò cung cấp phân quyền (bản thiết kế xem xét tính chất hạt cho phép)
- [ ] Đa số người gác ngoiaf được sử dụng để bảo vệ theo chiều sâu.
- [ ] Đăng nhập vào ứng dụng bị hạn chế trong cơ sở dữ liệu để lưu trữ thủ túc truy cập cụ thể.
- [ ] Đăng nhập vào ứng dụng không cho phép kết nối trực tiếp vào các bảng dữ liệu.
- [ ] Truy cập vào nguồn cấp hệ thống bị hạn chế.
- [ ] Bản thiết kế xác định mã truy cập các yêu cầu bảo mật. Nguồn tài nguyên đặc quyền và hành động đặc quyền cũng được xác định.
- [ ] Tất cả danh tính được sử dụng bởi các ứng dụng và các nguồn tài nguyên truy cập bởi mỗi danh tính đều được biết đến.

### 2.4. Quản lý cấu hình

- [ ] Giao diện cho người quản trị được bảo mật (tính xác thực mạnh và cấp quyền được sử dụng).
- [ ] Kênh điều khiển từ xa cho người quản trị được bảo mật.
- [ ] Kho lưu trữ cấu hình được bảo mật.
- [ ] Cấu hình bí mật không được tổ chức bằng dạng text trong các tệp cấu hình.
- [ ] Đặc quyền người quản trị được tách ra dựa trên vai trò (ví dụ: người phát triển nội dung trang web hoặc người quản trị hệ thồng frontend- backend).
- [ ] Least-privileged process accounts and service accounts are used.

### 2.5. Dữ liệu nhạy cảm

- [ ] Bảo mật không được lưu trữ nếu không cần thiết.(Phương thức thay thế được khám phá tại thời gian thiết kế).
- [ ] Bảo mật không được lưu trữ trong mã code.
- [ ] Kết nối cơ sở dữ liệu, mật khẩu, khóa, hoặc các bí mật khác không được lưu trữ dưới dạng văn bản gốc.
- [ ] Bản thiết kế xác định các phương pháp để lưu trữ các bảo mật an toàn. (Các thuật toán thích hợp và kích thước khóa được sử dụng để mã hóa. Nó là một lợi thế khi DPAPI được sử dụng để lưu trữ cấu hình dữ liệu để tránh việc quản lý khóa).
- [ ] Dữ liệu nhạy cảm không được đăng nhập dưới dạng văn bản rõ ràng bởi các ứng dụng.
- [ ] Bản thiết kế xác định cơ chế bảo vệ dữ liệu nhạy cảm mà được truyền tải trên mạng.
- [ ] Dữ liệu nhạy cảm không được lưu trữ trong cookie.
- [ ] Dữ liệu nhạy cảm không được truyền qua giao thức Get.

//cookie: Cookie là một đoạn văn bản ghi thông tin được tạo ra và lưu trên trình duyệt của máy người dùng. Cookie thường được tạo ra khi người dùng truy cập một website, cookie sẽ ghi nhớ những thông tin như tên đăng nhâp, mật khẩu, các lựa chọn do người dùng lựa chọn đi kèm.

### 2.6. Quản lý session

//session: là 1 phiên làm việc trong đó người sử dụng giao tiếp với 1 ứng dụng. Session bắt đầu khi người sử dụng truy cập vào ứng dụng lần đầu tiên, và kết thúc khi người sử dụng thoát khỏi ứng dụng.

- [ ] SSl được sử dụng để bảo vệ các tệp cookie xác thực.
- [ ] Nội dung của các tệp tin cookie xác thực phải được mã hóa.
- [ ] Thời gian tồn tại của session phải bị giới hạn.
- [ ] Trạng thái session được bảo vệ khỏi các truy cập trái phép.
- [ ] Xác thực session không được thông qua trong chuỗi truy vấn.

### 2.7. Mã hóa

Mã hóa là một lĩnh vực liên quan với các kỹ thuật ngôn ngữ và toán học để đảm bảo an toàn thông tin.

- [ ] Mã hóa tầng nền tảng được sử dụng và nó không được thực thi tùy chỉnh.
- [ ] Bản thiết kế xác định các thuật toán mã hóa chuẩn (và kích thước khóa) cho các yêu cầu mã hóa dữ liệu ứng dụng.
- [ ] Các phương thức để bảo mật khóa mã hóa phải được xác định.
- [ ] Bản thiết kế xác định chính sách tái sử dụng khóa cho ứng dụng.
- [ ] Mã hóa khóa phải được bảo mật.
- [ ] DPAPI được sử dụng bất cứ đâu có thể để tránh các vấn đề quản lý khóa.
- [ ] Các khóa được tái sử dụng định kỳ.

### 2.8. Điều khiển các tham số

- [ ] Tất cả các tham số đầu vào đều được kiểm chứng (bao gồm các trường dữ liệu theo form, các câu truy vấn, cookie và HTTP headers-kèm thông tin phản hồi và yêu cầu của phía client và server)
- [ ] Cookie chứa các dữ liệu nhạy cảm phải được mã hóa.
- [ ] Dữ liệu nhạy cảm không được thông qua các câu truy vấn hoặc từ các trường theo form.
- [ ] Không tin vào các thông tin của HTTP header để đưa ra các quyết định bảo mật.
- [ ] Trạng thái hiển thị phải được bảo vệ bằng việc sử dụng MACs.

//MACs: “điều khiển truy nhập môi trường” là giao thức truyền dữ liệu, cung cấp các cơ chế đánh địa chỉ và điều khiển ruy cập kênh.

### 2.9. Quản lý ngoại lệ

- [ ] Bản thiết kế phác thảo một phương pháp theo tiêu chuẩn để xử lý ngoại lệ có cấu trúc xảy ra trên ứng dụng.
- [ ] Xử lý ngoại lệ ứng dụng giảm thiểu việc tiết lộ thông tin trong các trường hợp ngoại lệ.
- [ ] Bản thiết kế nhận diện các thông báo lỗi chung mà được trả lại cho phía người dùng client.
- [ ] Lỗi ứng dụng được lưu lại trong tệp lưu trữ error log.
- [ ] Dữ liệu cá nhân (ví dụ như mật khẩu) không được lưu lại.

### 2.10. Kiểm tra và lưu lại (auditing and logging)

- [ ] Bản thiết kế xác định mức độ kiểm tra và lưu lại khi cần thiết cho ứng dụng và xác định tham số khóa để đăng nhập và kiểm tra.
- [ ] Bản thiết kế xem xét làm thế nào để lưu danh tính người gọi qua nhiều tầng cho việc kiểm tra (ở hệ điều hành hoặc ở mức độ ứng dung).
- [ ] Bản thiết kế xác định phần lưu trữ, bảo mật và phân tích các tệp tin lưu trữ ứng dụng.
