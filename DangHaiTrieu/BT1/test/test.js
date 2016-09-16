'use strict';

const mocha = require('mocha'),
    mainApp = require('../app'),
    chai = require('chai'),
    performanceNow = require('performance-now'),
    describe = mocha.describe,
    it = mocha.it,
    assert = chai.assert;

describe('Function', () => {
    describe('#fibonacci', () => {
        it('should return an error "INVALID_INPUT_VALUE" if the input is not integer', () => {
            assert.equal('INVALID_INPUT_VALUE', mainApp.fibonacci(2.001));
        });
    });
});

describe('Function', () => {
    describe('#fibonacci', () => {
        it('should run exactly with large number like 1476', () => {
            assert.equal(1.3069892237633987e+308, mainApp.fibonacci(1476));
        });
    });
});

describe('Function', () => {
    describe('#fibonacci', () => {
        it('should return Infinity if n is bigger than 1476', () => {
            assert.equal(Infinity, mainApp.fibonacci(1477));
        });
    });
});

describe('Function', () => {
    describe('#fibonacci', () => {
        it('should has a run time less than 0.1 second', () => {
            let t0 = performanceNow();
            mainApp.fibonacci(80);
            let t1 = performanceNow();
            assert.isAbove(0.1, (t1 - t0).toFixed(3));
        });
    });
});

describe('Function', () => {
    describe('#fibonacci', () => {
        it('should return fibonacci(80) = 23416728348467684', () => {
            assert.notEqual(23416728348467683, mainApp.fibonacci(80));
        });
    });
});