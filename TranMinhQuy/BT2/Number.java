package main;

/**
 * Created by tmq on 03/10/2016.
 */
public class Number {

    /**
     * So thu n chia het cho 2 va 3 hoac 5
     */
    public int getNumber(int n) {
        if (n <= 0) return -1;

        int count = 0;
        int index = 0;
        while (count < n) {
            if (check(index)) {
                count++;
            }
            index++;
        }

        return index;
    }

    public boolean check(int x) {
        if (x < 0) return false;

        return  (x % 2 == 0 && x % 3 == 0 || x % 5 == 0);
    }
}
