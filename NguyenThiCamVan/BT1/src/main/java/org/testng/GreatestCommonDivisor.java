package org.testng;

/**
 * @author Nguyen Thi Cam Van 
 * Finding the greatest common divisor of 2 integer number
 */
public class GreatestCommonDivisor {
  public static int IS_NOT_INTEGER_NUMBER = -1;

  public int greatestCommonDivisor(String str1, String str2) {
    try {
      int number1 = Integer.parseInt(str1);
      int number2 = Integer.parseInt(str2);
      number1 = Math.abs((int) number1);
      number2 = Math.abs((int) number2);

      if (number1 == 0 || number2 == 0) {
        return (number1 + number2);
      }

      while (number2 != 0) {
        int tmp = number2;
        number2 = number1 % number2;
        number1 = tmp;
      }

      return number1;

    } catch (NumberFormatException e) {
      return IS_NOT_INTEGER_NUMBER;
    }  
  }
}
