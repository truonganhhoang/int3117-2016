'use strict';

const MyNumberValidate = require('./my-number-validate');
const assert = require('assert');

let numberValidate = new MyNumberValidate();

// 1: 30
// 2: 15
// 3: 10
// 4: 6
// 5: 5
// 6: 2
// 7: 3
// 8: 7

// describe('CC', function () {
//     it('1. try with: 30', function () {
//         assert.equal(31, numberValidate.validate(30));
//     });
//     it('2. try with: 15', function () {
//         assert.equal(16, numberValidate.validate(15));
//     });
//     it('3. try with: 10', function () {
//         assert.equal(11, numberValidate.validate(10));
//     });
//     it('4. try with: 6', function () {
//         assert.equal(7, numberValidate.validate(6));
//     });
//     it('5. try with: 5', function () {
//         assert.equal(6, numberValidate.validate(5));
//     });
//     it('6. try with: 2', function () {
//         assert.equal(4, numberValidate.validate(2));
//     });
//     it('7. try with: 3', function () {
//         assert.equal(5, numberValidate.validate(3));
//     });
//     it('8. try with: 7', function () {
//         assert.equal(9, numberValidate.validate(7));
//     });
// });

describe('MCDC', function () {
    // it('1. try with: 30', function () {
    //     assert.equal(31, numberValidate.validate(30));
    // });
    // it('2. try with: 15', function () {
    //     assert.equal(16, numberValidate.validate(15));
    // });
    // it('3. try with: 10', function () {
    //     assert.equal(11, numberValidate.validate(10));
    // });
    it('4. try with: 6', function () {
        assert.equal(7, numberValidate.validate(6));
    });
    it('5. try with: 5', function () {
        assert.equal(6, numberValidate.validate(5));
    });
    it('6. try with: 2', function () {
        assert.equal(4, numberValidate.validate(2));
    });
    it('7. try with: 3', function () {
        assert.equal(5, numberValidate.validate(3));
    });
    it('8. try with: 7', function () {
        assert.equal(9, numberValidate.validate(7));
    });
});