package bt1;

import java.util.Scanner;

public class BT1 {
    public static int UCLN(int a, int b){
        while(a!=b){
            if(a==0||b==0)return 0;
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }
}
