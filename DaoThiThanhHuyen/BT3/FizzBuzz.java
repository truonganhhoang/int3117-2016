import java.util.Scanner;

public class FizzBuzz {
    
    public static String getResult(int i){
        if((i%3 == 0 && i%5 == 0) || (i%7 == 0)) return "FizzBuzz";
        else if(i%3 == 0) return "Fizz";
        else if(i%5 == 0) return "Buzz";
        else return String.valueOf(i);
    }
    
    public static void printResult(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap gioi han limit = ");
        int limit = 1;
        int i = 1;
        boolean check = false;
        while(!check) {
            try {
              limit = Integer.parseInt(input.nextLine());
              if (limit < 1) {
                  System.out.println("Limit >= 1. Nhap lai limit = ");
                  continue;
              }
              check = true;
              while(i <= limit) {
                System.out.println(getResult(i));
                i++;
              }
            } catch (Exception e) {
                System.out.println("Limit >= 1. Nhap lai limit = ");
            }
         }
    }
    
    public static void main(String[] args) {
        printResult();
    }
}
