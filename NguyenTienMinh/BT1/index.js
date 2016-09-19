'use strict';

function test(arr) {
    if (!Array.isArray(arr)) {
        console.log('abc');
        return 0;
    }

    var count = 0;
    for (var i = 0; i < arr.length; i++) {
        console.info(arr[i] % 2 == 0);

        if (arr[i] % 2 == 0) {
            count++;
        }
    }

    return count;
}

var x = test([
    undefined,
    0,
    1,
    2,
    -10,
    [1, 2, 3],
]);

console.log(x);