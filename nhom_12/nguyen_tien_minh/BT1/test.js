'use strict';

var FibonaciNumberChecker = require('./FibonaciNumberChecker');
const assert = require('assert');


let fibonaciChecker = new FibonaciNumberChecker();

describe('get fibonaci number at order number', function () {
    it('try with: 0', function () {
        let orderNumb = 0;
        assert.equal(orderNumb, fibonaciChecker.fibonaciNumberInOrder(orderNumb));
    });

    it('try with: 1', function () {
        assert.equal(1, fibonaciChecker.fibonaciNumberInOrder(1));
    });

    it('try with: 2', function () {
        assert.equal(1, fibonaciChecker.fibonaciNumberInOrder(2));
    });

    it('try with: 3', function () {
        assert.equal(2, fibonaciChecker.fibonaciNumberInOrder(3));
    });

    it('try with: 3', function () {
        assert.equal(2, fibonaciChecker.fibonaciNumberInOrder(3));
    });
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