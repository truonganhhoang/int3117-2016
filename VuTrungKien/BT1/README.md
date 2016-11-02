#Kiểm thử hàm get_most_popular_word(sentence)

##Mô tả hàm get_most_popular_word(sentence):

- Nhận giá trị đầu vào là một chuỗi, phân biệt chữ hoa chữ thường. Chuỗi đầu vào là một câu, các từ được ngăn bởi dấu cách.
- Trả về một chuỗi là từ xuất hiện nhiều nhất trong chuỗi. Nếu có 2 từ có cùng tần suất, trả về từ đứng trước khi sắp xếp theo bảng chữ cái thứ tự tăng dần.

##Kiểm thử:

Chọn phương pháp kiểm thử phân lớp tương đương yếu.

###Lý do:

- Không xác định được các ca kiểm thử khi sử dụng kiểm thử giá trị biên.
- Kiểm thử sử dụng bảng quyết định tốn thời gian xây dựng, khó trình bày, nếu trình bày thì cũng tương tự như kiểm thử lớp tương đương.
- Phương pháp kiểm thử lớp tương đương yếu là đủ trong trường hợp này, vì biến đầu vào chỉ có 1 input nên không có giả sử "multiple fault".

###Thực hiện:

Ta xác định được được các lớp input như sau:
- R1 = {sentence: sentence là câu chứa các từ khác nhau về tần suất}
- R2 = {sentence: sentence là câu chứa 2 từ có tần suất cao nhất giống nhau}
- R3 = {sentence: sentence là câu rỗng}

Kiểm thử lớp tương đương yếu các giá trị hợp lệ (Weak normal equivalence class):

| Test Case | sentence                           | Expected Output |
|-----------|------------------------------------|-----------------|
| WN1       | "Smile! Smile! Please!"            | "Smile"         |
| WN2       | "This is madness. This is Sparta!" | "is"            |

Kiểm thử lớp tương đương yếu các giá trị không hợp lệ (Weak robust equivalence class):

| Test Case | sentence | Expected Output |
|-----------|----------|-----------------|
| WR1       | ""       | None            |

###Kết quả

####Chạy lần 1:
![alt tag](https://github.com/longdt03/int3117-2016/blob/master/VuTrungKien/BT1/screenshots/result_1.PNG)
Phát hiện được một lỗi khi nhập câu rỗng, sửa lại hàm.
####Chạy lần 2:
![alt tag](https://github.com/longdt03/int3117-2016/blob/master/VuTrungKien/BT1/screenshots/result_2.PNG)

####Độ bao phủ (test coverage) theo câu lệnh
![alt tag](https://github.com/longdt03/int3117-2016/blob/master/VuTrungKien/BT1/screenshots/test_coverage.png)
####Đồ thị chương trình
![alt tag](https://github.com/longdt03/int3117-2016/blob/master/VuTrungKien/BT1/screenshots/program_flowchart.png)
