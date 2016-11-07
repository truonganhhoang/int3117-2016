'use strict';

const mocha = require('mocha'),
    mainApp = require('../app'),
    chai = require('chai'),
    assert = chai.assert;

describe('Function', () => {
    describe('#fibonacci with input is not an integer', () => {
        it('should return an error "INVALID_INPUT_VALUE"', () => {
            assert.equal('INVALID_INPUT_VALUE', mainApp.fibonacci(2.001));
        });
    });
});

describe('Function', () => {
    describe('#fibonacci with n = 1476', () => {
        it('should produce maximum Fibonacci number that javascript can handle/perform', () => {
            assert.equal(1.3069892237633987e+308, mainApp.fibonacci(1476));
        });
    });
});

describe('Function', () => {
    describe('#fibonacci with n < 3', () => {
        it('should return 1', () => {
            assert.equal(1, mainApp.fibonacci(0));
        });
    });
});

describe('Function', () => {
    describe('#fibonacci if n is bigger than 1476', () => {
        it('should return Infinity', () => {
            assert.equal(Infinity, mainApp.fibonacci(1477));
        });
    });
});

describe('Function', () => {
    describe('#fibonacci with n = 80 (fibonacci that is out of safe limit number in javascript)', () => {
        it('should return 23416728348467684', () => {
            assert.equal(23416728348467684, mainApp.fibonacci(80));
        });
    });
});