package tranglt58.songuyento; 

public class SoNguyenTo {
	public boolean kiemTraSoNguyenTo(int n) {
		if (n<2) {
			return false;
		}
		for (int i = 0; i < Math.sqrt(n); i++) {
			if (n%i==0){
				return false;
			}
		}
		return true;
	}
}