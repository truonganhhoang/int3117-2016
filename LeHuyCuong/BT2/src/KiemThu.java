package kiemthu;

import java.util.Random;
import java.util.Scanner;

/*
* trong 10 lan lap
* tim trong 1 mang 3 so la so le lon hon 50 va chia het cho 7 hoac 3 tim tong
 */
public class KiemThu {

    int timso(int[] mangSo) {
        int tong = 0;
        for (int i = 0; i < mangSo.length; i++) {
            if ((boiCua_3(mangSo[i]) && mangSo[i] > 20) || (boiCua_5(mangSo[i]) && mangSo[i] < 50)) {
                tong += mangSo[i];
            }
        }
        if (tong > 0) {
            return tong;
        }
        return -1;
    }

    boolean boiCua_3(int n) {
        if (n % 3 == 0) {
            return true;
        }
        return false;
    }

    boolean boiCua_5(int n) {
        if (n % 5 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        KiemThu xx = new KiemThu();
        int[] mang = {21,67};
        System.out.println(xx.timso(mang));
    }
}
