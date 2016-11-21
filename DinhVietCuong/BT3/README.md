Đinh Việt Cường - 1320051

Hàm cần kiểm thử:

    1 public int countLetter(String str) {

    2		int result = 0;

    3		if (str == null || str.length() == 0) {

    4			return -1;

    5		} else {

    6			while (str.length() != 0) {

    7				int i = 0;

    8				char letter = str.charAt(i);

    9				if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122)) {

    10					result++;

    11				}

    12				str = str.substring(i + 1);

    13				i++;				

    14			}

    15		}

    16		return result;

    17	}


All-DU-Paths của biến str: 
- Đường thứ nhất: 1-2-3
- Đường thứ 2: 1-2-5-6
- Đường thứ 3: 1-2-5-6-8-9-10-12-6-8-9-....-6-14
- Đường thứ 4: 1-2-5-6-8-9-10-11-12-6-8-9-....-12-6-14

All-DU-Paths của biến result:
- Đường thứ nhất: 2-3-4-16
- Đường thứ 2: 2-3-4-6-16
- Đường thứ 3: 2-3-4-6-9-10-11-12-6-9-10-11-12-.....-6-16
- Đường thứ 4: 2-3-4-6-9-12-13-...6-16


Các ca kiểm thử xây dựng:
- Ca 1: str = null
  Phủ đường thứ nhất của biến str và đường thứ nhất của biến result
- Ca 2: str = "  abcd123ACb=.-%~`[]\\,'  "
  Phủ đường thứ 4 của biến str và đường thứ 3 của biến result
- Ca 3: str = "   _?<>.,12]'="
  Phủ đường thứ 3 của biến str và đường thứ 4 của biến result
- Không có ca kiểm thử phủ được đường thứ 2 của biến str và đường thứ 2 của biến result

So sánh với MCDC:

Giống nhau: 
+ Để sử dụng cả 2 đều phải vẽ đồ thị bài toán.
+ Phải tính các giá trị đầu vào để chương trình chạy theo các đường đã tìm được.

Khác nhau:
+ MCDC sẽ thiết kế các ca kiểm thử đảm bảo phủ hết các luồng điều khiển trong chương trình (các lệnh rẽ nhánh, lặp) còn All-DU-Paths phủ luồng dữ liệu (tức là từ khi biến được khai báo đến khi được sử dụng tính toán).
+ MCDC có độ bao phủ tốt hơn so với All-DU-Paths. Ví dụ ở lệnh if có nhiều điều kiện so sánh, khi áp dụng MCDC sẽ thiết kế mỗi ca kiểm thử tương ứng với 1 điều kiện, còn khi áp dụng All-DU-Paths thì chỉ cần 1 ca kiểm thử thỏa mãn là được.
+ Áp dụng MCDC để tính ra đầu vào cho các ca kiểm thử dễ dàng hơn so với áp dụng All-DU-Paths vì sử dụng All-DU-Paths phải xác định tất cả các đường du cho tất cả các biến có trong chương trình, bao gồm cả tham số đầu vào và các biến được 
khởi tạo bên trong thân hàm => số ca kiểm thử có thể nhiều hơn tuy nhiên có thể trùng nhau mà độ phủ không cao được như MCDC.
