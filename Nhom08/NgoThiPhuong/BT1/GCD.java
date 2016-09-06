package com.phuongnt58.gcd;


public class GCD {
    public int getGCD(int a, int b) throws Exception {
        int r;
        while (a != 0) {
            r = b % a;
            b = a;
            a = r;
        }
        if (b == 0) {
            throw new Exception("Result: Extremely");
        } else {
            return b < 0 ? -b : b;
        }
    }

}