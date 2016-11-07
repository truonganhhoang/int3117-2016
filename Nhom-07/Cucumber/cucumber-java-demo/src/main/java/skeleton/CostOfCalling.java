package src.main.java.skeleton;

public class CostOfCalling {
	public int calculate(float minutes) {
		int sum;

		if(minutes <= 0) {
			sum = 0;
		} else {
			sum = 25000;
			float temp = 0;
			float cost50 = 600;
			float cost150 = 400;
			float cost200 = 200;

			while(minutes > 0){
				if(minutes > 200) {
						temp = minutes - 200;

						sum += temp*cost200;

						minutes -= temp;
				}
				else if(minutes > 50 && minutes <= 200){
						temp = minutes - 50;
						
						sum += temp*cost150;

						minutes -= temp;
				}
				else if(minutes <= 50) {
						sum += minutes*cost50;

						temp = minutes;

						minutes -= 50;
				}
			}
		}
		
		return sum;
	}
}

