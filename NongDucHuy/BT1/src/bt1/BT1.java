/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author Huy
 */
public class BT1 {
    //Tinh tong cac so nguyen duong chia het cho 8 trong n chu so dau (n<=100000)
    
    public static int n = 0;
    public int sum = 0;
    
    public BT1(int n) {
        this.n = n;
        if (n >= 0 && n <= 100000) {
            for (int i = 0; i <= n; i++) {
                if (i%8 == 0) {
                    sum += i;
                }
            }
        }
        else if (n<0) System.out.println("N phai la so nguyen duong");
        else System.out.println("N qua lon");
    }
    
    public static void main (String[] args) {
        BT1 bt1 = new BT1(100000);
        System.out.println(bt1.sum);
    }
}
