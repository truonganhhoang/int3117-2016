package pkBT1;

public class Demotest {
	public int nhan(int a, int b){
		return a*b;
	}
	public int demKiTu(String x, char y){
		int count=0;
		for(int i=0;i<x.length();i++){
			if (x.charAt(i)== y ){
				count++;
			}
		}
		return count;
	}
	
}
