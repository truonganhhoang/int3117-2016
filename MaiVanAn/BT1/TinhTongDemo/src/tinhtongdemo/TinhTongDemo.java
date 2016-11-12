/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtongdemo;

import java.util.Scanner;

/**
 *
 * @author An
 */
public class TinhTongDemo {

    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        long n;
        System.out.print("Nhap so n: ");
        n = scanIn.nextInt();
        System.out.print("Tong cac so chan nho hon " + n + " la:" + TinhTong(n));
    }

    public static long TinhTong(long n) {
        long TongChan = 0;
        if (n < 0) {
            return 0;
        } else {
            for (long i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    TongChan += i;
                }
            }
            return TongChan;
        }
    }
}
