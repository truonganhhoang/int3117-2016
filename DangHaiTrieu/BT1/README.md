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
```

## Test cases
```javascript
// #1
describe('Function', () => {
    describe('#fibonacci', () => {
        it('should return an error "INVALID_INPUT_VALUE" if the input is not integer', () => {
            assert.equal('INVALID_INPUT_VALUE', mainApp.fibonacci(2.001));
        });
    });
});
```
```javascript
// #2
describe('Function', () => {
    describe('#fibonacci', () => {
        it('should run exactly with large number like 1476', () => {
            assert.equal(1.3069892237633987e+308, mainApp.fibonacci(1476));
        });
    });
});
```
```javascript
// #3
describe('Function', () => {
    describe('#fibonacci', () => {
        it('should return Infinity if n is bigger than 1476', () => {
            assert.equal(Infinity, mainApp.fibonacci(1477));
        });
    });
});
```
```javascript
// #4
describe('Function', () => {
    describe('#fibonacci', () => {
        it('should return fibonacci(80) = 23416728348467684', () => {
            assert.notEqual(23416728348467683, mainApp.fibonacci(80));
        });
    });
});
```
