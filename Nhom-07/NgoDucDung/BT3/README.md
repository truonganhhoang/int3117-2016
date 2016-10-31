# KTPM2016
Bài tập môn kiểm thử phần mềm 2016

/* Javascript UNIT TESTING: Jasmine Framework */

Jasmine is a behavior-driven development framework for testing JavaScript code. It does not depend on any other JavaScript frameworks. It does not require a DOM.

1) Owner:
Fullname: Duc Dung Ngo
Student ID: 13020081
Class: QHI-2013 K58CLC

2) How to run:
- main.html: template for js application and where to show test results.
- js/calculate.js: tested js code.
- jasmine/js/caculate.js: all test suites.

/* Upgrade from BT2 */

3) Áp dụng tiêu chuẩn kiểm thử All-DU-Path

4) Áp dụng All-du-path cho hai biến minutes và pack
Chương trình được đánh số thứ tự như sau:

1. function calculate(minutes, pack){
2.	document.getElementById("warning").innerHTML = "";
	//if minutes is letter
3.	if(minutes === '' || minutes === null){
4.		document.getElementById("warning").innerHTML = "Please enter minutes";
	}
	else {
5.		if(isNaN(minutes)){
6.			document.getElementById("warning").innerHTML = "Please enter a number";
7.			return;
		} 
		else {
8.			if(minutes <= 0) {
				//print result
9.				document.getElementById("result").innerHTML = 0;
10.				document.getElementById("sum").innerHTML = 0;
11.				return 0;
			}

12.			var sum = 25000;	//sum of cost
13.			var temp = 0;		//current cost minus 50/150/200
14.			var cost50 = 600;	//cost of first 50 mins
15.			var cost150 = 400;	//cost of continuous 150 mins
16.			var cost200 = 200;	//cost of continuous 200 mins
17.			var DK3 = 20;		//20 mins free calling
18.			var KM100 = 100 	//100 mins free calling
19.			var result_text = "25000";

20.			if(pack == "DK3" || pack == "KM100"){
21.				if(pack == "DK3"){
22.					minutes -= DK3;
21'.			} else {
23.					minutes -= KM100;
				}
24.				if(minutes <= 0){ 
25.					document.getElementById("result").innerHTML = 0;
26.					document.getElementById("sum").innerHTML = 0;
27.					return 0;
				}
			}

28.			while(minutes > 0){
29.				result_text += " + ";
30.				if(minutes > 200){												//continuous 200 mins
31.					temp = minutes-200;				
32.					sum += temp*cost200;	
33.					minutes -= temp;
34.					result_text += temp + "*" + cost200 + " + ";
				}
35.				else if (minutes > 50 && minutes <= 200){								//continuous 150 mins
36.					temp = minutes-50;					
37.					sum += temp*cost150;				
38.					minutes -= temp;
39.					result_text += temp + "*" + cost150 + " + ";
				}
40.				else if(minutes <= 50){											//first 50 mins
41.					sum += minutes*cost50;				
42.					temp = minutes;
43.					minutes -= 50;				
44.					result_text += temp + "*" + cost50;
				}
			}

			//print result
45.			document.getElementById("result").innerHTML = result_text;
46.			document.getElementById("sum").innerHTML = sum;
47.			return sum;
		}
	}
}

5) Biểu đồ Đường đi All-DU-path cho hai biến minutes và  pack được thể hiện ở hình "All Du Path.png"
6) So sánh và rút ra nhận xét về All-DU-Path và MCDC.
- MCDC: test tất cả các biểu thức condition và decicions của hàm caculate(minutes, path).
- All-Du-path: test tất cả các definition và các trường hợp sử dụng của minutes.

Về cơ bản, test case của hai phương pháp này tương tự nhau. Nhưng ở MCDC sẽ đi vào chi tiết hơn khi phân chi tiết test case để test được toàn bộ các condition của hai biến minutes và path.
Với All-Du-Path thì xây dựng các test case tối thiểu đủ các trường hợp định nghĩa và sử dụng của minutes.