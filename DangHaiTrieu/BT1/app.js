'use strict';

module.exports = {
    /*
    * Description: Count number of even integers in input array
    * Return: number of even integers in input array
    * */
    numberOfEvens: function (arr) {
        if (!Array.isArray(arr)) {
            return 0;
        }
        else {
            var numberOfEvens = 0;
            for (var i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    numberOfEvens++;
                }
            }
            return numberOfEvens;
        }
    }
};