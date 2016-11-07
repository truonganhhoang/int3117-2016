## Bài toán:

In dãy FizzBuzz từ 1 -> số giới hạn limit nhập từ bàn phím thỏa mãn:
- Khi số chia hết cho 3 thì in ra "Fizz"
- Khi số chia hết cho 5 thì in ra "Buzz"
- Khi số chia hết cho cả 3 và 5 hoặc chia hết cho 7 thì in "FizzBuzz"
- Trường hợp còn lại thì in ra chính số đó

## Ví dụ: In dãy FizzBuzz từ 1-5<br>
1 2 Fizz 4 Buzz

## Hướng giải quyết
- Hàm phân loại getResult(int i) => trả về kết quả in ra của số tự nhiên i
- Hàm in ra kết quả printResult() => nhập số giới hạn limit >= 1, xong in dãy số từ 1-limit

## Tiêu chuẩn MDCD
Xét điều kiện if (i%3 == 0 && i%5 == 0) || (i%7 == 0)


|No.|  i%3 |  i%5 |  i%7 | Kết quả
|---|------|------|------|:-------:
| 1 |   T  |   T  |   F  |    T
| 2 |   T  |   F  |   T  |    T
| 3 |   T  |   F  |   F  |    F
| 4 |   F  |   T  |   F  |    F
