package kiemthu;

public class DemKhoangTrang {
	public int Dem(String x){
		int count=0;
		for(int i=0; i<x.length(); i++){
			if(x.charAt(i)==' '){
				count++;
			}
		}
		return count;
	}
}
