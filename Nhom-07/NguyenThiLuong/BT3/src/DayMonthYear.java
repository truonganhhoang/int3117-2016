import java.util.Date;
public class DayMonthYear {
	public boolean  isDate (String ddmmyyyy)
	{
		boolean result= false;
		String[] valueSplitted = ddmmyyyy.split("/");
		int day = Integer.parseInt(valueSplitted[0]);
		int month = Integer.parseInt(valueSplitted[1]);
		int year = Integer.parseInt(valueSplitted[2]);
		
		if (day > 0 && day <=31 && month >0 && month <= 12 && year > 0)
		{
			if (month == 2)
			{
				if (day <= 28 || (day == 29 && ( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 ) ) ) ) {				
				
					result = true;
				}
				else {
					result =  false;
				}				
			}
		
			if (month == 1 || month == 3 || month == 5 || month == 7 ||month ==8|| month ==11 || month ==12 )
			{
				if (day <= 31 && day > 0)
				{
					return true;
				}
				else 
				{
					return false;
				}
			}
			if (month == 4||month ==6 || month == 9|| month==11)
			{
				if (day <= 30 && day > 0)
				{
					return true;
				}
				else 
				{
					return false;
				}
				
			}
		
		}	
		return result; 
		
	}
}
