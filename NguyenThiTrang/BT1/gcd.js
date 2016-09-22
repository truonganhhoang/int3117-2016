function gcd(a, b) {
	if (a < 0) a = -a;
    if (b < 0) b = -b;
	if (Number.isSafeInteger(a) == false || Number.isSafeInteger(b) == false) return false;
	
    if (a == 0 || b == 0) return a + b;
    while (b != 0) {
    	temp = b;
    	b = a % b;
    	a = temp;	
    }
    return a;
}

module.exports.gcd = gcd;