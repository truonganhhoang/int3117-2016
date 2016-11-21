# Bài tập 2:
### Mã nguồn chương trình

``` Java
package findnumber;

/**
 * Created by Nhahv on 10/3/2016.
 * <></>
 */
public class FindNumber {
    public Number findNumberDivisibleBy8(int numberStart) {
        if (numberStart == 0) {
            return new Number(-1, -1);
        }
        if (numberStart < 0) {
            numberStart = Math.abs(numberStart);
        }
        Number result = new Number(-1, -1); // result of program
        int index = 1; // index run in while
        while ((numberStart - index) > 0) {
            int number1 = numberStart - index;
            int number2 = numberStart + index;
            if (checkCondition(number1, number2)) {
                result.number1 = number1;
                result.number2 = number2;
                return result;
            }
            index++;
        }
        return result;
    }

    boolean checkCondition(int number1, int number2) {
        return (number1 % 3 == 0 && number2 % 5 == 0
            && ((number1 + number2) % 8 == 0));
    }
    public static class Number {
        int number1, number2;
        public Number(int number1, int number2) {
            this.number1 = number1;
            this.number2 = number2;
        }
    }
}
```
## Mô tả bài toán

- Bài toán yêu cầu nhập truyền vào 1 số nguyên dương N(N > 0) nếu nhập vào số nguyên âm( N < 0) thì chương trình sẽ tự động chuyển số nguyên âm đó về số nguyên dương N. 
- Yêu cầu bài toán là tìm ra cặp số nguyên dương (Number) thỏa mãm điều kiện sau đây:
    - Số bên trái (number1) của sô nguyên dương N chia hết cho 3, số bên phải (number2) của số nguyên dương N chỉ hết cho 5 và tổng 2 số (number1 + number2) này phải chia hết cho 8 
    `((number1 %3 == 0) && number2 % 5 == 0 && (number1 + number2) % 8 =0)`
            
    - Khi số bên trái bằng 0 hoặc nhỏ hơn 0 mà vẫn chưa tìm được cặp số thích hợp thì chương trình trả về cặp số -1, -1
    - Bài toán kết thúc khi và chỉ khi tìm được cặp số nguyên dương thỏa mãn điều kiện đề bài cho.

### Kiểm thử MCDC
- Thuật toán với mỗi điểu kiện thì MCDC yêu cầu mệnh đề nguyên tử phải được kiểm tra với cả true và false
- Ví dụ if (a && b) thì ta có 4 ca kiểm thử
    + a = true, b = false
    + a = true, b = true
    + a = false, b = false
    + a = false, b = true
    + 
     => nếu có n điều kiện thì có 2^n ca kiểm thử
    - Như vậy trong chương trình ta có điều kiện :
        `if ((number1 % 3 == 0 && number2 % 5 == 0) && ((number1 + number2) % 8 == 0))`
    Ta thấy điều kiện trên có 3 kiện nên ta có 2^3 ca kiểm thử

    + Đo độ bao phủ
        - Sử dụng Emma Coverage trong intellij để đo độ bao phủ
        - Kết quả được 100%

     + Thảo luận, với chương trình của em thì dùng bao phủ nào đơn giản nhất mà vẫn tạo bộ kiểm thử chất lượng như MCDC
        - Với chương trình theo đề bài toán trên ta có thể sử dụng phương pháp kiểm thử lớp tương đương
         - Chia thành lớp kiểm thử làm 3 lớp
            + Lớp thứ 1:  N = {-∞, 0}
            + Lớp thứ 2:  N = 0
            + Lớp thứ 3:  N = {0, +∞}

## Hình ảnh

- ![alt text](https://raw.githubusercontent.com/truonganhhoang/int3117-2016/master/HoangVanNha/BT2/image/Graph-BT2.png "Image Graph")
-  ![alt text](https://raw.githubusercontent.com/truonganhhoang/int3117-2016/master/HoangVanNha/BT2/image/Coverage-1%20(2).png "Image coverage 1")

-  ![alt text](https://raw.githubusercontent.com/truonganhhoang/int3117-2016/master/HoangVanNha/BT2/image/Coverage-2%20(2).png "Image coverage 2")
-  ![alt text](https://raw.githubusercontent.com/truonganhhoang/int3117-2016/master/HoangVanNha/BT2/image/Coverage-3%20(2).png "Image coverage 3")
-  ![alt text](https://raw.githubusercontent.com/truonganhhoang/int3117-2016/master/HoangVanNha/BT2/image/Screenshot%20(2).png "Image ca kiểm thử")

