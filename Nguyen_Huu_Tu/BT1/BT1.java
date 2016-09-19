package bt1;

import java.util.Scanner;

public class BT1 {
    public static int UCLN(int a, int b){
        while(a!=b){
            if(a==0||b==0)return a+b;
            if(a>b){ 
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
      System.out.println("Hello world");
    }    
}
