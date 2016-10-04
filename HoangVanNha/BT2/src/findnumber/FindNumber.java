package findnumber;

/**
 * Created by Nhahv on 10/3/2016.
 * <></>
 */
class FindNumber {

//    public static void main(String[] args) {
//
//        FindNumber find = new FindNumber();
//        Number number = find.findNumberDivisibleBy8(1);
//        System.out.printf("Result : " + "number1 = " + number.number1 + ", number2 = " + number.number2);
//    }


    Number findNumberDivisibleBy8(int numberStart) {

        if (numberStart == 0) {
            return null;
        }
        if (numberStart < 0) {
            numberStart = Math.abs(numberStart);
        }

        Number result = new Number(); // result of program

        int index = 0; // index run in while
        int indexNumber1 = 1; // variable augment number 1

        boolean isFindNumber = false; // variable check found number satisfy condition
        boolean numberNegative = false; // variable check when number1 == 0

        int number1 = 0; // number run left number start
        int number2 = 0; // number run right number start

        while (!isFindNumber) {

            if (numberNegative) {
                number1 = indexNumber1;
                indexNumber1++;
            } else {
                number1 = numberStart - index;
            }
            number2 = numberStart + index;

            if (number1 == 0) {
                numberNegative = true;
            }

            if (checkCondition(number1, number2)) {
                result.number1 = number1;
                result.number2 = number2;
                isFindNumber = true;
            } else {
                index++;
            }
        }
        return result;
    }

    boolean checkCondition(int number1, int number2) {

        return (number1 % 3 == 0 && number2 % 5 == 0
                && ((number1 + number2) % 8 == 0));
    }

    static class Number {
        int number1, number2;
    }
}
