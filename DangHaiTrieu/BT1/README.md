# mocha-test
## Description
Simple Node js project using Mocha as unit test framework.

## Prerequistes
- Nodejs
- Npm

## Install and run
- Open terminal/cmd/powershell at project root
- Run `npn install` to set up dependencies
- Run `npm test` to execute tests and see test results

## Function to be tested
```javascript
// Description: Count number of even integers in input array
// Return: number of even integers in input array
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
```

## Test cases
```javascript
// #1
describe('Main app', function () {
    describe('#numberOfEvens', function () {
        it('should return 0 when the input param is not an array', function () {
            assert.equal(0, mainApp.numberOfEvens(1));
        });
    });
});
```
```javascript
// #2
describe('Main app', function () {
    describe('#numberOfEvens', function () {
        it('should not count characters as even numbers', function () {
            assert.equal(0, mainApp.numberOfEvens(['a', 1, 'bcd']));
        });
    });
});
```
```javascript
// #3
describe('Main app', function () {
    describe('#numberOfEvens', function () {
        it('should run normally with big numbers', function () {
            assert.equal(2, mainApp.numberOfEvens([1000000000000000000000000000000000000000000000000000000, 1, 999999999999999999999999999999999992]));
        });
    });
});
```
