package com.nhungtth.app;

public class App {
    public int getNumber(int year) {
        int result = -1;

        if (year < 0) {
            return result;
        }

        result = 0;
        if (year % 4 == 0 && year % 100 != 0
                || year % 400 == 0) {
            while (year != 0) {
                result = result * 10 + year % 10;
                year /= 10;
            }
        }
        return result;
    }
}