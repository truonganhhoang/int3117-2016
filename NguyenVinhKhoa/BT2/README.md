**Áp dụng tiêu chuẩn MC/DC**

### Mô tả chương trình
- Input: hai giá trị beginIndex và endIndex.
- Vòng lặp for tính tổng (sum) các số trong khoảng từ beginIndex tới endIndex.
- Điều kiện if, nếu sum chia hết cho 2 sum ++, ngược lại sum  --. **(1)**
- Trả lại kết quả (điều kiện if) sum chia hết cho 2 và 3, hoặc sum chia hết cho 4. **(2)**

### Cách tính bộ ca kiểm thử
Tiêu chuẩn MC/DC yêu cầu:
- Với mỗi mệnh đề điều kiện, kiểm thử trả lại cả giá trị true và false.
- Với mỗi mệnh đề nguyên tử, kiểm thử trả lại cả giá trị true và false.
- Mỗi mệnh đề nguyên tử được chỉ ra rằng nó **tác động độc lập** tới giá trị của mệnh đề điều kiện.

Trong đó, sự độc lập của các mệnh đề nguyên tử được chỉ ra bằng cách **thay đổi giá trị một mệnh đề nguyên tử duy nhất**.

Trong điều kiện if **(2)**, với mệnh đề phức `(sum % 2 == 0 && sum % 3 == 0 || sum % 4 == 0)` tương đương `(A and B) or C`, ta có bộ kiểm thử sau:

STT | beginIndex | endIndex | A | B | C | Outcome
--- | --- | --- | --- | --- | --- | --- |
1 | 17 | 17 | T | F | T | T
2 | 2 | 7 | T | F | F| F
3 | 3 | 4 | T | T | F | T
4 | 5 | 8 | F| T | F | F
5 | 6 | 3 | F | F | F | F

Trong đó:
- Ca kiểm thử 1-2 khác nhau giá trị của C; tương tự 2-3 là B, và 3-4 là A.
- Với điều kiện if **(1)**; ca kiểm thử 1, 2 và 3 trả lại giá trị false; ca kiểm thử 4, 5 trả lại giá trị true.
- Ca kiểm thử 5 vòng lặp `for` chạy 0 lần; ca 1 chạy 1 lần; ca 2, 3 và 4 chạy hơn 1 lần.

### Kết quả
Mức độ bao phủ cho chương trình là **100%**.

![alt text](http://i.imgur.com/wkgmlq0.png "Test Result")