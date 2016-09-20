package thangpvt58;

public class Triangle {
		public boolean not(int a,int b, int c){
			
			if(a>b || b>c){
				if(a < (b+c)){
					return true;
				}
				else return false;
			}
			else return false;
			
		}
}
