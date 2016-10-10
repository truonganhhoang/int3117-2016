var assert = require('assert');
var hack = require('./hack');

describe('Hack', function () {
    describe('#is_prime_number', function () {
        var tests = [
            {args: 'abc', expected: false},
            {args: -1, expected: false},
            {args: 0, expected: false},
            {args: 1, expected: false},
            {args: 2, expected: true},
            {args: 3, expected: true},
            {args: 4, expected: false},
            {args: 5, expected: true},
            {args: 6, expected: false},
            {args: 7, expected: true},
            {args: 8, expected: false},
            {args: 9, expected: false},
            {args: 10, expected: false},
            {args: 11, expected: true},
            {args: 12, expected: false}
        ];

        tests.forEach(function(test) {
            it('number ' + test.args + ' should be ' + test.expected, function() {
                var res = hack.is_prime_number(test.args);
                assert.equal(res, test.expected);
            });
        });
    });
});