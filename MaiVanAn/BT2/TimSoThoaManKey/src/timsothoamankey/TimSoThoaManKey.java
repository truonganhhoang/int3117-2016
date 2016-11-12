/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timsothoamankey;

import java.util.Scanner;

/**
 *
 * @author An
 */
public class TimSoThoaManKey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        long key, num;
        System.out.print("Nhap so ngau nhien: ");
        num = scanIn.nextLong();
        System.out.print("Nhap gia tri key: ");
        key = scanIn.nextLong();
        //Kiem tra gia tri dau vao
        if (num < key) {
            System.out.print("Input is not correct. Please try again.");
        }
        //Main thread
        if (TimSo(num, key) == -1) {
            System.out.print("No number has found");
        } else {
            System.out.print("Number has found: " + TimSo(num, key) + ".");
        }
    }

    public static long TimSo(long num, long key) {
        int i = 0;
        while (i < 100) {
            if (num % key == 0 || num % (key - 1) == 0 && num % (key - 2) == 0) {
                return num;
            }
            if (num % key == 1 || num % (key - 1) == 1 || num % (key - 2) == 1) {
                num += 1;
            } else {
                num += (int) num / key;
            }
            i += 1;
        }
        return -1;
    }
}
