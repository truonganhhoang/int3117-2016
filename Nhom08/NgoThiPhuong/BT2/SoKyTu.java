package phuongnt58.bt2;

public class SoKyTu {
	public int demSoKyTu(String a) {
		int i = 0; 
		int total = 0;
		int len = a.length();
		while(i < len) {
			if(((a.charAt(i) >= 'A') && (a.charAt(i) <= 'Z')) 
				|| ((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z'))) {
					total ++;
				}
			i++;
		}
		return total;
	}

}
 