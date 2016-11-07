'use strict';

module.exports = {
    /*
    * Description: Calculate n-th number of fibonacci sequence
    * Params:
    *   - n: positive number
    * Return: n-th number of fibonacci sequence
    * */
    fibonacci: (n) => {
        let fn1 = 0,
            fn2 = 1,
            fn3;
        if (!Number.isInteger(n)) {
            return 'INVALID_INPUT_VALUE';
        }
        else if (n < 3) {
            return 1;
        }
        while (--n) {
            fn3 = fn1 + fn2;
            fn1 = fn2;
            fn2 = fn3;
        }
        return fn3;
    }
};