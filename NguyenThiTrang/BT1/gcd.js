function gcd(a, b) {
	if (a % 1 !=0 || b %1 != 0) return false;
    if (a == 0 || b == 0) return a + b;
    while (b != 0) {
    	temp = b;
    	b = a % b;
    	a = temp;	
    }
    return a;
}

module.exports.gcd = gcd;