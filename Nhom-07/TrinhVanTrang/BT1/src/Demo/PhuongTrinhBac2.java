package Demo;

//import java.util.Scanner;

public class PhuongTrinhBac2 {
	double a,b,c,x1,x2;
	double delta;
	public String giaiPT( double a,  double b, double c){
		if (a==0){
			if(b==0){
				if(c==0){
					return "Phuong trinh co vo so nghiem";
				}
				else{
					return "Phuong trinh vo nghiem";
				}
			}
			else{
				if(c==0){
					x1= (0)/b;
					return "Phuong trinh co nghiem duy nhat " +x1  ;
				}
				else{
					x1 = (-c)/b;
					return "Phuong trinh co nghiem duy nhat " +x1  ;
				}
			}
		}
		else{
			delta = Math.pow(b,2)-(4*a*c);
			if (delta < 0){
				return "Phuong trinh vo nghiem";
			}
			else{
				if(delta==0){
					x1= (-b)/(2*a);
					return "Phuong trinh co nghiem kep x1= x2= " +x1;
				}
				else{
					x1 = ((-b)+ Math.sqrt(delta))/(2*a);
				    x2 = ((-b)- Math.sqrt(delta))/(2*a);
				    System.out.println("Phuong trinh co 2 nghiem phan biet: ");
				    return ("X1= " +x1+ "X2= " +x2);
				   
				}
			}
		}
	
		
	}

}
