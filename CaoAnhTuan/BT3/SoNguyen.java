package tuan1;

import java.util.Random;

import static java.lang.System.out;

/**
 * Created by TuanIdol on 10/02/2016.
 */
public class SoNguyen {
    private int soNguyen[];

    public SoNguyen(){
        soNguyen = new int[30];
        Random();
    }

    private void Random(){
        //lay so ngau nhien [0,100]
        Random random = new Random();
        for(int i=0; i<soNguyen.length; i++){
            soNguyen[i]= random.nextInt(101);
        }
    }

    public void inSoNguyen(){
        out.println("Danh sach so nguyen: ");
        for(int i=0; i<soNguyen.length; i++){
            out.println("["+i+"]"+soNguyen[i]);
        }
    }

    public int inMax(){
        int max = soNguyen[0];
        for(int i=0; i<soNguyen.length; i++){
            if(max<soNguyen[i]){
                max = soNguyen[i];
            }
        }
        System.out.println("Max: "+max);
        return max;
    }
}
