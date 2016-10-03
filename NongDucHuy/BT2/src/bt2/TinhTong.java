package bt2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HuyND
 */
public class TinhTong {
    public int a, b, c;
    
    public TinhTong(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int tinhTong() {
        int sum = 0;
        int i = 0;
        if ( ((a % 2 == 0) && (b % 2 == 0)) || (c % 2 == 0)) {
            while (i < 100) {
                if (i % a == 0) sum += i;
                i++;
            } 
        } else {
            while (i < 100) {
                if (i % b == 0) sum += i;
                i++;
            } 
        }
        return sum;
    }
}
