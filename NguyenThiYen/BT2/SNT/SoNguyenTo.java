package yen.SNT;
public class SoNguyenTo {
	public boolean KiemTraSoNguyenTo(int m) {	
		if ((m<2) || (m%2 == 0) && m!= 2) {
			return false;
		}
		else if ( m==2 || m==3) {
			return true;
		}
		else {
			int i = 2;
			while (i<Math.sqrt(m)) {
				if (m%i == 0) {
					return false;
					//break;
				}
				i++;
			}
			return true;
		}
	} 
}
