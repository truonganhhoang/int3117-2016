/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofwaretesting.project1;

/**
 *
 * @author DangThanh
 */
public class MathUtils {
    public long factorial(int n) {
        if(n < 0) {
            return 0;
        }
        if(n == 0 || n == 1) {
            return 1;
        }
        long factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial *= i;
            if(factorial < 0) {
                return 0;
            }
        }
        return factorial;
    }
}
