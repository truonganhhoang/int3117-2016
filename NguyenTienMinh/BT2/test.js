'use strict';

const MyNumberValidate = require('./my-number-validate');
const assert = require('assert');

let numberValidate = new MyNumberValidate();

describe('validate number', function () {
    it('try with: 30', function () {
        assert.equal(31, numberValidate.validate(30));
    });
});