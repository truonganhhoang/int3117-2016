package org.testng;

/**
 * @author Nguyen Thi Cam Van Finding the greatest common divisor of 2 integer number
 */
public class GreatestCommonDivisor {
  public int greatestCommonDivisor(int num1, int num2) {
    num1 = Math.abs(num1);
    num2 = Math.abs(num2);
    while (num1 != num2) {
      if (num1 == 0 || num2 == 0) {
        return (num1 + num2);
      }
      if (num1 == 1 || num2 == 1) {
        return 1;
      }
      if (num1 > num2) {
        num1 = num1 - num2;
      } else {
        num2 = num2 - num1;
      }
    }
    return num1;
  }

  public static void main(String[] args) {
    System.out.println(Integer.MAX_VALUE);
  }
}
