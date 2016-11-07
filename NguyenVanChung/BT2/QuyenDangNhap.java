package testmcdc;

public class QuyenDangNhap {
	boolean quyendangnhap = false;
	int solannhap = 3;

	public boolean dangnhap(String ten, String mk, String sochungminh) {
		while (solannhap != 0) {
			if ((ten == "nguyen van chung") && (mk == "12345") && (sochungminh == "987"))
				quyendangnhap = true;
			else if ((ten != "nguyen van chung") || (mk != "12345") || (sochungminh != "987")){
				quyendangnhap = false;
				solannhap--;
			}
			break;
		}
		return quyendangnhap;
	}
}
