package main;
import java.util.Scanner;

public class TinhDiem {
  public static String PhanLoai(int diem){
    if (80 <= diem && diem <= 100) return "A";
    else if (60 <= diem && diem < 80) return "B";
    else if (50 <= diem && diem < 60) return "C";
    else if (40 <= diem && diem < 50) return "D";
    else if (0 <= diem && diem < 40) return "F";
    else return "Khong hop le";
  }
  
  public static int NhapDiem(){
    Scanner input = new Scanner(System.in);
    System.out.println("Nhap diem tu 0 den 100: ");
        boolean check = false;
        int diem = 0;
        while (!check) {
           try {
             diem = Integer.parseInt(input.nextLine());
             if (diem < 0 || diem > 100) {
                    System.out.println("Nhap so nguyen duong 0 - 100! Hay nhap lai.");
                    continue;
             }
             check = true;
           } catch (Exception e) {
                 System.out.println("Nhap so nguyen duong 0 - 100! Hay nhap lai.");
           }
        }
        return diem;
  }
  
  public static void main(String[] args){
    int diem = TinhDiem.NhapDiem();
    System.out.println(diem);
    System.out.println(TinhDiem.PhanLoai(90));
    System.out.println(TinhDiem.PhanLoai(70));
    System.out.println(TinhDiem.PhanLoai(55));
    System.out.println(TinhDiem.PhanLoai(45));
    System.out.println(TinhDiem.PhanLoai(20));
    System.out.println(TinhDiem.PhanLoai(-5));
  }
}