package kiemthu2;

public class bt1 {
	public int binhphuong(int a){
		return a*a;
	}
	public int dem(String x){
		int count=0;
		for(int i=0; i<x.length(); i++){
			if(x.charAt(i)=='N' || x.charAt(i)=='n'){
				count++;
			}
		}
		return count;
	}
}
