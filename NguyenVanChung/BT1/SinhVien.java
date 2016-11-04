package Test;

import static org.junit.Assert.fail;
import org.junit.Test;

public class SinhVien {

	private String ten;
	private String masv;
	public int toan;
	public int van;
	public double tb;

	public String getten() {
		return this.ten;
	}

	public void setten(String ten) {
		this.ten = ten;
	}

	public String getmasv() {
		return this.masv;
	}

	public void setmasv(String ma) {
		this.masv = ma;
	}

	public String hocluc() {
		tb = (toan + van) / 2;
		if (0 < tb && tb < 4)
			return "Yeu";
		else if (4 < tb && tb < 7)
			return "Trung Binh";
		else if (7 < tb && tb < 9)
			return "Kha";
		else
			return "Gioi";
	}

}
