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
