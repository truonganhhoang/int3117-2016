public int demSoKyTu(String a) {
	int i = 0; 
	int total = 0;
	int len = a.length();
	while(i < len) {
		if(((a.charAt(i) >= 'A') 
		&& (a.charAt(i) <= 'Z')) 
				|| ((a.charAt(i) >= 'a') 
				&& (a.charAt(i) <= 'z'))) {
					total ++;
			}
		i++;
	}
	return total;
}

//TESTING

//All-DU-Path with total
/*
1-2-3-4-5-14 : while false 
@test: a = '', len = 0


1-2-3-4-5-6-7-10-12-14 (6,7 true)
@test: a='phuong' => len = 6; total = 6


1-2-3-4-5-6-8-9-10-12-14 (6 false 8,9 true)
@test: a=' phuong' => len = 7; total = 6


1-2-3-4-5-6-12-14(if false)
@test: a=';*' => len = 2; total = 0


1-2-3-4-5-6-7-8-9-10-12-14(6 true; 7 false; 8,9 true )





 