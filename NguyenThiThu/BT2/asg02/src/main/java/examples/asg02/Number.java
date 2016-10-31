package examples.asg02;

public class Number
{
	 public static void main(String[] args){
		Number x = new Number();
		int ta = x.foo(6, 7, 6);
			System.out.println("so tien thuong  :" + ta);
		}
    public int foo(int a, int b, int c)
    {
    	int result=0;
    	if(a>0 && b<10){
    		if(a==c || b==c){
    			int i=0;
        		for(i=0;i<c;i++){
        			if(a%2 == 0){
        				result = a+i;
        			}
        			else
        				result = b+i;
        		}  	
    		}	
    	}
    	else result=0;
    	return result;
    }
}
