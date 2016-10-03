Mô tả: Chương trình kiểm tra sự chênh lệch thời gian cũ với thời gian mới được viết bằng Javascript - Unit  Test với QUnit

* Giới thiệu trương trình:
	- prettyDate():  Hàm xác nhận thời gian, kiểm tra sự chênh lệch thời gian.
	- Test.js: có 11 testcase vơi các trường hợp đúng, sai.

* Phương pháp kiểm thử:
	- Giá trị biên

	- Lý do: Các gía trị đầu vào xác định là các mảng có biên là (a và b) với a,b là các giá trị điều kiện. Nên chọn kiểm thẻ giá trị biên có thể rút gọn thời gian và xác định giá trị kiểm thử dễ dàng.

	- Các test case với giá trị biên:

		"just now" ("2016/09/19 22:24:59"),
	    		   ("2016/09/19 22:25:00")

	    "1 minute ago" ("2016/09/19 22:23:01"),
	    			   ("2016/09/19 22:24:00")

	   "1 hour ago" ("2016/09/19 21:25:00"),
	    			("2016/09/19 21:24:59")

	   "Yesterday": ("2016/09/18 22:24:59"),
	    			("2016/09/18 22:25:00")
#Độ bao phủ
Dựa vào sơ đồ khối (DoThiChuongTrinh.png)
=> độ bao phủ theo câu lênh: 8
=> độ bao phủ theo nhánh: 8