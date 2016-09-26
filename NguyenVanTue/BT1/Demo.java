package baitaptuan1;

public class Demo {
	public int DemSoLe(int[] mang) {
		int a=0;
		for(int i=0;i<mang.length;i++){
			if(mang[i]%2 !=0) a=a+1;
		}
		return a;
	}
}
