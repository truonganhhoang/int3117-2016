
// Cho 1 day so cac bo 3 so thoa man canh cua tam giac, co bao nhieu tam giac can, deu, thuong
public class TamGiac {
/**
 * kiem tra 3 canh co thoa man la mot tam giac k?
 * @param a 
 * @param b
 * @param c
 * @return 0 khong phai tam giac, 1 tam giac thuong, 2 tam giac can, 3 tam giac deu, 4 tam giac vuong,
 */
	public static int XacDinhTamGiac(int a, int b, int c){
		if((a>0) && (b>0) && (c>0 )){
			if (((a+b)>c) && ((a+c)>b) && ((c+b)>a)){
				if((a==b)&&(a==c))
					return 3;
				else 
					 if (( a == b) || (b == c) || (a == c)) 
						 return 2;
					 else 
						 if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) 
							 return 4;
				return 1;
			}
		}
			
		return 0;
	}
/**
 * Dem so tam giac
 * @param a
 * @param n
 * @return
 */
	public  String DemTamGiac (int a[], int n){
		String kq="0 Tam giac thuong, 0 Tam giac can, 0 Tam giac deu, 0 Tam giac vuong !";
		int []tg= {0,0,0,0};
		int i=0;
		if(n<3) return kq;
		while (i<n-2){
			for(int j=i+1; j<n-1;j++)
				for(int k=j+1; k<n;k++){
					int tam=XacDinhTamGiac(a[i],a[j],a[k]);
					if(tam>0) 
						tg[tam-1]++;
				}
			i++;
		}
	    kq= tg[0] + " Tam giac thuong, "+tg[1] +" Tam giac can, "+tg[2]+" Tam giac deu, "+tg[3] +" Tam giac vuong !";
		return kq;
	}
	
}
