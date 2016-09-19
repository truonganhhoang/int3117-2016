/* Owner: Ngo Duc Dung
	Last update: 04/09/2016 */



function calculate(minutes){
	document.getElementById("warning").innerHTML = "";
	//if minutes is letter
	if(minutes === '' || minutes === null){
		document.getElementById("warning").innerHTML = "Please enter minutes";
	}
	else {
		if(isNaN(minutes)){
			document.getElementById("warning").innerHTML = "Please enter a number";
			return;
		} 
		else {

			if(minutes <= 0) return 0;

			var sum = 25000;		//sum of cost
			var temp = 0;		//current cost minus 50/150/200
			var cost50 = 600;	//cost of first 50 mins
			var cost150 = 400;	//cost of continuous 150 mins
			var cost200 = 200;	//cost of continuous 200 mins

			var result_text = "25000";

			while(minutes > 0){
				result_text += " + ";

				if(minutes > 200){									//continuous 200 mins
					temp = minutes-200;
					
					sum += temp*cost200;
		
					minutes -= temp;

					result_text += temp + "*" + cost200 + " + ";
				}
				else if (minutes > 50 && minutes <= 200){					//continuous 150 mins
					temp = minutes-50;
					
					sum += temp*cost150;
					
					minutes -= temp;

					result_text += temp + "*" + cost150 + " + ";
				}
				else if(minutes <= 50){								//first 50 mins
					sum += minutes*cost50;
					
					temp = minutes;

					minutes -= 50;
					
					result_text += temp + "*" + cost50;
				}
			}

			//print result
			document.getElementById("result").innerHTML = result_text;
			document.getElementById("sum").innerHTML = sum;

			return sum;
		}
	}
}

