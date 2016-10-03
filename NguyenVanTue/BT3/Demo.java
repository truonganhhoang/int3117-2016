package baitaptuan1;

public class Demo {
	public int DemSoLe(int[] mang) {
		int count=0;
		for(int i=0;i<mang.length;i++){
			if(mang[i]%2 !=0) count=count+1;
		}
		return count;
	}
}
