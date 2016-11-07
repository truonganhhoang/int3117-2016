package sourcecode;

public class Main {
 public static void main(String args[]) {
	 System.out.println("tìm số ước của một số cho trước");
	 
	 int number = 10;
	 int soUoc = Estimates.timSoLuongUoc(number);
	 
	 System.out.println("Số ước của số " + number + " là " + soUoc);
 }
}
