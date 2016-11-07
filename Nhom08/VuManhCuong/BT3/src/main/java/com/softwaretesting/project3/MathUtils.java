/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwaretesting.project3;

/**
 *
 * @author DangThanh
 */
public class MathUtils {

    public int findGreatestCommonDivisor(int a, int b) {
        if (a == b || a != 0 && b == 0) {
            return Math.abs(a);
        }
        if (b != 0 && a == 0) {
            return Math.abs(b);
        }
        int temp = 0;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
