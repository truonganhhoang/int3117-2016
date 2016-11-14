Phan Đoàn Cương - 13020048

Hàm cần kiểm thử:

1 public String countLetter(String source) {
2		String result = "";
3		if (source == null || source.length() == 0) {
4			return result;
5		} else {
6			while (source.length() != 0) {
7				int i = 0;
8				char letter = source.charAt(i);
9				if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122)) {
10					result += letter;
11				}
12				source = source.substring(i + 1);
13				i++;				
14			}
15		}
16		return result;
17	}

All-Du-Paths của biến result:
+ Đường thứ nhất: 1-2-3-4.
+ Đường thứ 2: 1-2-5-6-7-8-9-10-11.
+ Đường thứ 3: 1-2-5-6-7-8-12-13-14-15-16.

All-Du-Paths của biến source:
+ Đường thứ nhất: 1-2-3.
+ Đường thứ 2: 1-2-5-6.

Các ca kiểm thử cần xây dựng:
+ Ca 1: source = null phủ đường thứ nhất của result và source.
+ Ca 2: source = "123{}" phủ đường thứ 2 của result.
+ Ca 3: source = "0A-a}" phủ đường thứ 3 của result và đường thứ 2 của source.

So sánh với MCDC:

Giống nhau:

Để sử dụng cả 2 đều phải vẽ đồ thị bài toán.
Phải tính các giá trị đầu vào để chương trình chạy theo các đường đã tìm được.
Khác nhau:

MCDC sẽ thiết kế các ca kiểm thử đảm bảo phủ hết các luồng điều khiển trong chương trình (các lệnh rẽ nhánh, lặp) còn All-DU-Paths phủ luồng dữ liệu (tức là từ khi biến được khai báo đến khi được sử dụng tính toán).
MCDC có độ bao phủ tốt hơn so với All-DU-Paths. Ví dụ ở lệnh if có nhiều điều kiện so sánh, khi áp dụng MCDC sẽ thiết kế mỗi ca kiểm thử tương ứng với 1 điều kiện, còn khi áp dụng All-DU-Paths thì chỉ cần 1 ca kiểm thử thỏa mãn là được.
Áp dụng MCDC để tính ra đầu vào cho các ca kiểm thử dễ dàng hơn so với áp dụng All-DU-Paths vì sử dụng All-DU-Paths phải xác định tất cả các đường du cho tất cả các biến có trong chương trình, bao gồm cả tham số đầu vào và các biến được khởi tạo bên trong thân hàm => số ca kiểm thử có thể nhiều hơn tuy nhiên có thể trùng nhau mà độ phủ không cao được như MCDC.