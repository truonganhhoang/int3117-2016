Mô tả: Chương trình kiểm tra sự chênh lệch thời gian cũ với thời gian mới được viết bằng Javascript - Unit  Test với QUnit

* Giới thiệu trương trình:
	- prettyDate():  Hàm xác nhận thời gian, kiểm tra sự chênh lệch thời gian.
	- Test.js: có 11 testcase vơi các trường hợp đúng, sai.

* Phương pháp kiểm thử:
	- Giá trị biên

	- Lý do: Các gía trị đầu vào xác định là các mảng có biên là (a và b) với a,b là các giá trị điều kiện. Nên chọn kiểm thẻ giá trị biên có thể rút gọn thời gian và xác định giá trị kiểm thử dễ dàng.

	- Các test case cải tiến các: các test case với giá trị biên:

		assert.equal(prettyDate(now, "2016/09/19 22:24:59"), "just now");
	    assert.equal(prettyDate(now, "2016/09/19 22:25:00"), "just now");

	    assert.equal(prettyDate(now, "2016/09/19 22:23:01"), "1 minute ago");
	    assert.equal(prettyDate(now, "2016/09/19 22:24:00"), "1 minute ago");

	    assert.equal(prettyDate(now, "2016/09/19 21:25:00"), "1 hour ago");
	    assert.equal(prettyDate(now, "2016/09/19 21:24:59"), "1 hour ago");

	    assert.equal(prettyDate(now, "2016/09/18 22:24:59"), "Yesterday");
	    assert.equal(prettyDate(now, "2016/09/18 22:25:00"), "Yesterday");
