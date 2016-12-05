# Annex O: Test Environment Readiness Report
CariGo là phần mềm hỗ trợ vận chuyển, người dùng chính là người tiêu dùng và người có nhu cầu và khả năng vận chuyển hàng hóa. Phần mềm sẽ tạo ra môi trường nơi người dùng có thể đặt các dịch vụ giao hàng và các đơn đặt hàng sẽ được đáp ứng bởi các nhân viên vận chuyển. Bên cạnh đó, phần mềm cũng là cách tiếp cận với những người muốn có thêm thu nhập và tham gia vào hệ thống để tạo ra một cộng đồng hỗ trợ vận chuyển.
Cấu hình phần cứng và phần mềm kiểm thử đã được chuẩn bị sẵn sàng cho việc kiểm thử phần mềm. Quản lý an ninh cũng được phê duyệt trên môi trường kiểm thử và được xem xét khác đi khi việc chuyển đổi dữ liệu được hoàn tất. Các công cụ kiểm thử đã được chuẩn bị đầy đủ để bắt đầu thực hiện các ca kiểm thử.

| Requirement        | Status           | Comments  |
| ------------- |:-------------:| -----:|
|Hardware      | Ready | Máy chủ được cấu hình sẵn sàng, chuẩn bị các thiết bị di động sử dụng các hệ điều hành: Android, IOS, Window phone, Black Berry. |
| Software     | Ready      |  Phần mềm đã được lập trình hoàn thành các chức năng như thiết kế: Đăng ký, đăng nhập/xuất, đặt dịch vụ vận chuyển, thay đổi yêu cầu vận chuyển, Xác nhận đơn hàng, tìm kiếm đơn hàng, hủy đơn hàng thanh toán và đánh giá thành viên.|
| Tools | Ready      | XCTest, UI Automation/ Automator,MonkeyRuner |
| Security | Ready      | Quản lý an ninh bảo mật sẽ được tiến hành mỗi khi việc chuyển đổi dữ liệu được hoàn tất. |

# Annex P: Actual Results
| Test Procedure ID        |Objective and Priority         | Estimated Duration |
| ------------- |:-------------:| -----:|
| **1-3**     | **Mục đích kiểm thử việc đăng ký tài khoản trên hệ thống** |  |
|  <br>    |     |   |
|** Relationships to other procedures:**       | 
| **Test Log**       | 	
| **Date:** | **Initials:**     | **Test item:** |  **Ok/ Not Ok** |
| <br> |      |  |   |
|**Comments:**  |
|**Procedure:** |
|**Step no. Test case** |**Activities** |**Examination of result** | **Actual results** |**OK** |
|1 |Đăng ký bằng email đã được sử dụng |Kiểm tra thông báo:“Email đã đăng ký”|Hiển thị:“Email đã đăng ký” |OK |
|2 |Đăng ký bằng email không tồn tại |Kiểm tra thông báo:“Email không hợp lệ” | Hiển thị:“Email không hợp lệ” |OK |
|3 |Đăng ký băng email chưa được tạo tài khoản nhưng mật khẩu ngắn hơn 8 ký tự |Kiểm tra thông báo: “mật khẩu ngắn hơn 8 ký tự” |Hiển thị “mật khẩu ngắn hơn 8 ký tự” |OK |
|4 |Đăng ký bằng emai chưa được tạo tài khoản và mật khẩu 8 (hoặc nhiều hơn 8) ký tự  |Kiểm tra thông báo: “Đăng ký thành công” | hiển thị thông báo : “Đăng ký thành công”|OK|

| Test Procedure ID        |Objective and Priority         | Estimated Duration  |
| ------------- |:-------------:| -----:|
| **1-3**     | **Mục đích kiểm thử việc đăng nhập/ đăng xuất tài khoản trên hệ thống** |  |
|  <br>    |     |   |
|**Relationships to other procedures: Đăng ký thành công **    | 
| **Test Log**       | 	
| **Date:** | **Initials:**     | **Test item:** |  **Ok/ Not Ok** |
| <br> |      |  |   |
|**Comments:**  |
|**Procedure:** |
|**Step no. Test case** |**Activities** |**Examination of result** | **Actual results** |**OK** |
|1 |Đăng nhập bằng email không tồn tại trong hệ thống |Kiểm tra thông báo:“Email không chính xác”|Hiển thị:“Email không chính xác” |OK |
|2 |Đăng ký bằng email tồn tại trong hệ thống nhưng mật khẩu không chính xác |Kiểm tra thông báo:“mật khẩu không chính xác ”| Hiển thị:“mật khẩu không chính xác” |OK |
|3 |Đăng ký băng email và mật khẩu chính xác |Trang Home được hiển thị |Hiển thị trang Home|OK |
|4 |Đăng xuất khỏi hệ thống (Click vào nút Đăng xuất trên màn hình)  |Màn hình đăng nhập xuất hiện | hiển thị thông báo : “Đăng ký thành công”|OK|

| Test Procedure ID        |Objective and Priority         | Estimated Duration |
| ------------- |:-------------:| -----:|
| **1-3**     | **Mục đích kiểm thử việc tạo và quản lý đơn hàng vận chuyển trong hệ thống** |  |
|  <br>    |     |   |
|**Relationships to other procedures: Đã có tài khoản và đăng nhập trên hệ thống**    | 
| **Test Log**       | 	
| **Date:** | **Initials:**     | **Test item:** |  **Ok/ Not Ok** |
| <br> |      |  |   |
|**Comments:**  |
|**Procedure:** |
|**Step no. Test case** |**Activities** |**Examination of result** | **Actual results** |**OK** |
|1 |Tạo yêu cầu vận chuyển: không cung cấp về thời gian, địa điểm |Kiểm tra thông báo gợi ý hộp thoại có biểu tượng * - thông tin chưa đầy đủ nhưng vẫn cho phép tạo giao dịch và thông báo tạo thành công|hộp thoại hiển thị biểu tượng * - thông tin chưa đầy đủ nhưng vẫn cho phép tạo giao dịch và thông báo tạo thành công |OK |
|2 |Tạo yêu cầu vận chuyển: cung cấp các thông tin đầy đủ về thời gian địa điểm và đảm bảo tính hợp pháp |Kiểm tra thông báo:“Tạo yêu cầu giao dịch thành thông”| Hiển thị:“ Tạo yêu cầu giao dịch thành thông”|OK |
|3 |Thay đổi thời gian và địa điểm của yêu cầu khi chưa có người nhận yêu cầu |Kiểm tra thông tin: các thông tin hiển thị được cập nhật |các thông tin hiển thị được cập nhật|OK |
|4 |Thay đổi thời gian và địa điểm của yêu cầu khi đã có người nhận yêu cầu  |Kiểm tra thông báo: “Đã có Shipper-A nhận hàng cần liên lạc với anh ấy”, thông tin được cập nhật | Hiển thị thông báo: “Đã có Shipper-A nhận hàng cần liên lạc với anh ấy”, thông tin được cập nhật|OK|
|5 |Hủy yêu cầu |Yêu cầu xác nhận việc xóa -> Xóa |Yêu cầu xác nhận việc xóa -> Xóa|OK|
|6 |Lưu lại yêu cầu đã được thực hiện |Yêu cầu được di chuyển vào mục các yêu cầu đã thực hiện|Yêu cầu được di chuyển vào mục các yêu cầu đã thực hiện|OK|
























