package pkdm;

public class SoDaoNguoc {
	public int DaoNguocSo(int a){
		int x = a;
		int y =0;
		while(x>0){
			y = y*10 + x%10;
			x=x/10;
		}
		return y;
	}
	public int SoSanh(int i, int j){
		if(i == j)
			return 1;
		else return 0;
	}
}
