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
public class TinhTongChiaHetCho8 {
    //Tinh tong cac so nguyen duong chia het cho 8 trong n chu so dau
    
    private int n = 0;
    private int sum = 0;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    
    public TinhTongChiaHetCho8(int n) {
        this.n = n;
        tinhtong();
    }
    
    public static void main (String[] args) {
        TinhTongChiaHetCho8 tong = new TinhTongChiaHetCho8(100000);
        System.out.println(tong.getSum());
    }
    
    private void tinhtong() {
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
}
