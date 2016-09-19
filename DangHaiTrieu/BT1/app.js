'use strict';

module.exports = {
    /*
    * Description: Calculate n-th number of fibonacci sequence
    * Params:
    *   - n: positive number
    * Return: n-th number of fibonacci sequence
    * */
    fibonacci: (n) => {
        let a = 0,
            b = 1,
            c;
        if (!Number.isInteger(n)) {
            return 'INVALID_INPUT_VALUE';
        }
        else if (n < 3) {
            return 1;
        }
        while (--n) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
};