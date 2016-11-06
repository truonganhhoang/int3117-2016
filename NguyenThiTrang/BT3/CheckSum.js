function checkSum(arr) {
	if (Array.isArray(arr) == false) 
		return false;
	var sum = 0;
	var i = 0;
	while (i < arr.length) {
		sum += arr[i];
		i++;
	}
	if (((sum % 3 == 0) && (sum % 13 == 0)) || (sum % 7 == 0))
	 return 1;
	if (((sum % 5 == 0) || (sum % 11 == 0)) && (sum % 2 == 0)) 
		return 2;
	return false;
}

module.exports.checkSum = checkSum;