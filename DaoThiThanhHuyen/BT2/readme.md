# Bài toán: FizzBuzz: in dãy số từ 1-limit thỏa mãi các yêu cầu
- Khi số chia hết cho 3 thì in ra "Fizz"
- Khi số chia hết cho 5 thì in ra "Buzz"
- Khi số chia hết cho cả 3 và 5 hoặc chia hết cho 7 thì in "FizzBuzz"
- Trường hợp còn lại thì in ra chính số đó

# Ví dụ: dãy số từ 1-5
1 2 Fizz 4 Buzz

# Hướng giải quyết
- Hàm phân loại getResult(int i) => trả về kết quả in ra của số tự nhiên i
- Hàm in ra kết quả printResult() => nhập số giới hạn limit >= 1, xong in dãy số từ 1-limit

# Tiêu chuẩn MDCD
Điều kiện if (i%3 == 0 && i%5 == 0) || (i%7 == 0)
i%3 | i%5 | i%7 | Kết quả
 T  |  T  | F   | T
 T  |  F  | T   | T
 T  |  F  | F   | F
 F  |  T  | F   | F