


## Mô tả
- _Chương trình xét một năm bất kì có là năm nhuận hay không, năm nhuận dương lịch hay cả dương lịch và âm lịch_ 
_trả về 0 nếu là năm nhuận cả dương lịch và âm lịch, trả về 1 nếu là năm nhuận dương lịch và trả về 2 nếu không là năm nhuận._
- _viết bằng java, unit test sử dụng thư viện junit trên eclipse._

## Hàm cần test

'''
public int TimNamNhuan(int nam) {

		if ((nam % 400 == 0) || (nam % 100 != 0 && nam % 4 == 0)) {
			int x = nam % 19;
			if (x == 0 || x == 3 || x == 6 || x == 8 || x == 11 || x == 14 || x == 17) {

				return 0;
			} else
				return 1;
		} else
			return 2;
	}
'''

## CFG Hàm cần test:

![NamNhuan](http://imageshack.com/a/img922/9281/izhGYL.png)

## Áp dụng tiêu chuẩn All-DU-Path cho biến nam:
* đường đi all-du-path cho biến nam:
- 2-3-5-6-7
- 2-3-5-6-8

- các giá trị của "nam" thỏa mãn tc All-DU-Path: nam = 2000 ; nam = 2012.

##Coverage:
![](http://imageshack.com/a/img922/224/MPXzGH.png)
## So sánh với áp dụng MCDC:

|   |            All-DU-Path                    |                  MCDC                  |
|:-:|:-----------------------------------------:|:--------------------------------------:|
|   |Bao phủ luồng dữ liệu                      |Bao phủ luồng điều khiển                | 
|   |Quan trọng tới việc lựa chọn đường đi với mục tiêu bao phủ các cặp gán (definition) và dùng (use) dữ liệu. Sử dụng thông tin def-use và tiêu chuẩn cụ thể để nhận được các đường đi cụ thể trong đồ thị CFG,từ đó xác định các ca kiểm thử| Xét mọi tổ hợp có đủ các ca kiểm thử để kiểm tra mọi điều kiện có thể ảnh hưởng đến kết quả của biểu thức điều kiện chứa nó, Bao phủ đường đi tốt nhưng có nhiều dư thừa. |
|   |Xác định số ca kiểm thử dựa vào đường đi thỏa mãn tiêu chuẩn lựa chọn| yêu cầu số ca kiểm thử giống bao phủ điều kiện/quyết định |


# Kết luận

- MCDC có độ bao phủ cao, được áp dụng cho Unit testing, chủ yếu chỉ sử dụng cho các dự án quy mô rất lớn hoặc đặc biệt quan trọng, đòi hỏi độ chính xác tuyệt đối như công nghiệp ô tô, hàng không, vũ trụ...
- All-DU-Path khá phức tạp nếu bài toán có nhiều biến
