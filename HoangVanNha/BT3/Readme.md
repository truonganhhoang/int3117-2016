- Bài tập 3 : Áp dụng tiêu chuẩn kiểm thử All-DU-Path cho chương trình ở BT2
- Mã nguồn chương trình
	
/**
 * Created by Nhahv on 10/3/2016.
 * <></>
 */
public class FindNumber {

    public static void main(String[] args) {

        FindNumber find = new FindNumber();
        Number number = find.findNumberDivisibleBy8(1);
        System.out.printf("Result : " + "number1 = " + number.number1 + ", number2 = " + number.number2);
    }


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



- Chương trình bt3.html
- Luồng path của chương trình luong_dk.png
- Theo tiên chuẩn kiểm thử All-DU-PATH ta có các luồng đi với biến: numberStart
- Luồng điều khiển xuất phát từ dòng thứ 2
 1: 2 - 4 (use) - 5
 2: 4 - 7(use) - 8 (def)- 15(use) -28
 3: 4 - 7(use) - 8 (def)- 15(use) -17 (use)- 18 (use)- 20 (use) - 23
 4: 4 - 7 -  15 (use) -  17 (use)- 18 (use) -28

* So sánh và rút ra nhận xét về All-DU-Path và MCDC

- All-Du-Path cần ít test case hơn MCDC, các test case rõ ràng và ít cần phải suy luận hơn MCDC
- Nhưng với các biểu thức điều kiện phức hợp thì dùng MCDC sẽ chặt chẽ hơn so với All-DU-Path