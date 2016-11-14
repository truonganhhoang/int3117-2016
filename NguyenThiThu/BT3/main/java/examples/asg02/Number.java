package examples.asg02;

public class Number
{
    public int foo(int a, int b, int c)
    {
    	int result=0;
    	int i=0;
    	if(a>0 && b<10){
    		if(a==c || b==c){		
        		for(i=0; i<c; i++){
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
