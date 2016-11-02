'use strict';

var FibonaciNumberChecker = require('./FibonaciNumberChecker');
const assert = require('assert');

let fibonaciChecker = new FibonaciNumberChecker();

describe('get fibonaci number at order number', function () {

    /**
     * Áp dụng kiểm thử biên (bổ sung)
     */
    // it('try with: -1', function () {
    //     assert.equal(-1, fibonaciChecker.fibonaciNumberInOrder(-1));
    // });
    //
    // it('try with: -2', function () {
    //     assert.equal(-1, fibonaciChecker.fibonaciNumberInOrder(-2));
    // });

    it('try with: 0', function () {
        let orderNumb = 0;
        assert.equal(orderNumb, fibonaciChecker.fibonaciNumberInOrder(orderNumb));
    });

    it('try with: 1', function () {
        assert.equal(1, fibonaciChecker.fibonaciNumberInOrder(1));
    });

    // end kiểm thử biên (bổ sung)

    it('try with: 2', function () {
        assert.equal(1, fibonaciChecker.fibonaciNumberInOrder(2));
    });

    it('try with: 3', function () {
        assert.equal(2, fibonaciChecker.fibonaciNumberInOrder(3));
    });

    // it('try with: 1476', function () {
    //     console.log(fibonaciChecker.fibonaciNumberInOrder(1476));
    //     console.log('end');
    //     // assert.equal(2, fibonaciChecker.fibonaciNumberInOrder(1476));
    // });
});


describe('check fibonaci number', function () {
    it('try with 0', function () {
        assert.ok(fibonaciChecker.isFibonaciNumber(0))
    });

    it('try with 1', function () {
        assert.ok(fibonaciChecker.isFibonaciNumber(1))
    });

    it('try with 3', function () {
        assert.ok(fibonaciChecker.isFibonaciNumber(3))
    });
});