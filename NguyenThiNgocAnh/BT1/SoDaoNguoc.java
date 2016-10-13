package pkdm;
import java.util.*;
public class SoDaoNguoc {
	public static void main(String[] args){
       SoDaoNguoc sdn = new SoDaoNguoc();
       int n;
       Scanner ip =new Scanner(System.in);
       System.out.print("nhập số n : ");
       n = (int) ip.nextInt();
             
       System.out.println(sdn.DaoNguocSo(n));
        
	}
	/*private int nextInt(Scanner sc) {
	    try {
	          return sc.nextInt();
	    } catch (Exception e) { System.out.print("ban phai nhap so"); }
	    return -1;
	}*/
	
	public int DaoNguocSo(int a){
		int x = a;
		int y =0;
		while(x!=0){
			y = y*10 + x%10;
			x=x/10;
		}
		return y;
	}
}
