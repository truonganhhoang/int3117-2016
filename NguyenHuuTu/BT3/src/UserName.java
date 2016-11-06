package BT2;

public class UserName {

		public String test(String s){
			
	        int index=1;
	        int start = s.charAt(0);
	        
	        boolean DieuKien1=(s.length()>=4 && s.length()<=16);
	        boolean DieuKien2=((start>=97 && start<=122) || (start>=65 && start<=90));
	        	        
	        if(DieuKien1 && DieuKien2){
	            
	            while(index < s.length()){
	            	
	                int check = s.charAt(index);
	                
	                if((check>=48 && check<=57) || (check>=97 && check<=122) || (check>=65 && check<=90)){
	                	index++;
	                } 
	                else{
	                    break;
	                }         
	            }
	        }
	        
	        if(index == s.length()){
                return "Ok! Ten dang nhap hop le";
            }else{
            	return "Error! Ten dang nhap khong hop le";
            }	        
    }
}
