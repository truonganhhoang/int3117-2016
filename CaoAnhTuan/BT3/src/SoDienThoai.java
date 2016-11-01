package KiemThu;

public class SoDienThoai {
	public static String s1 = "La mot so dien thoai hop le";
    public static String s2 = "Khong phai la mot so dien thoai hop le";

    public String ktraSDT(String s3) {
        boolean dk1 = (s3.charAt(0)=='0');
        boolean dk2 = (s3.length()==10 || s3.length()==11);

        int i=1;
        if (dk1 && dk2){
            while (i < s3.length()) {
                if (s3.charAt(i)>=48 && s3.charAt(i)<=57);else {
                    break;
                }
                if (i + 1 == s3.length()) {
                    return s1;
                }
                i++;
            }
        }return s2;
    }
}
