var assert = require('assert');
var index = require('./index');

describe('Main app', function () {
    describe('#kiemTraNguyenTo', function () {
        it('should return "Khong phai la mot so!" when the input parameter is not a number', function () {
            assert.equal("Khong phai la mot so!", index.kiemTraNguyenTo('a'));
        });
    });
});

describe('Main app', function () {
    describe('#kiemTraNguyenTo', function () {
        it('should run normally with big numbers', function () {
            assert.equal("Khong la so nguyen to", index.kiemTraNguyenTo(019283401928340129480297502347502392));
        });
    });
});

describe('Main app', function () {
    describe('#kiemTraNguyenTo', function () {
        it('should return "Khong la so nguyen to" with negative numbers', function () {
            assert.equal("Khong la so nguyen to", index.kiemTraNguyenTo(-3));
        });
    });
});

describe('Main app', function () {
    describe('#kiemTraNguyenTo', function () {
        it('should run normally with float or double numbers', function () {
            assert.equal("Khong la so nguyen to", index.kiemTraNguyenTo(3.2));
        });
    });
});