package com.nhungtth.sohoanhao;

public class SoHoanHao {
    public boolean kiemTraSoHoanHao(int n) {
        if (n <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        }
        return false;
    }

}