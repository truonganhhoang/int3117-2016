import java.util.Random;

import static java.lang.System.out;

public class SoNguyen {
    private int soNguyen[];

    public SoNguyen(){
        soNguyen = new int[5];
        Random();
    }

    private void Random(){
        //lay so ngau nhien [0,10]
        Random random = new Random();
        for(int i=0; i<soNguyen.length; i++){
            soNguyen[i]= random.nextInt(11);
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