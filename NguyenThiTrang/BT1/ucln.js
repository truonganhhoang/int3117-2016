function ucln(m, n) {
	if (Number.isSafeInteger(m) == false || Number.isSafeInteger(n) == false) return false;
	
    if (m == 0 || n == 0) return m + n;
    while (n != 0) {
    	temp = n;
    	n = m % n;
    	m = temp;	
    }
    return m;
}

module.exports.ucln = ucln;