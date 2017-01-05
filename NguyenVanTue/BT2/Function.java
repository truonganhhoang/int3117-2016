package baitap2.tue;

public class Function {
	
	public int TinhTong(int a[]){
		
		int tong=0;
		for(int i=0; i<a.length;i++) {
			if(a[i]>0 || (a[i]%2!=0 && a[i]<0)) tong++;
		}
		
		return tong;
	}
	
}
