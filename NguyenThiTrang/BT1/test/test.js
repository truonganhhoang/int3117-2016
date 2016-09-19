var assert = require('assert');
var gcd = require('./../gcd').gcd;

describe('#normal()', function() {
  it('should return 4 is gcd(12,16)', function() {
      assert.equal(4, gcd(12,16));
  });

  it('should return 5 is gcd(75,20)', function() {
      assert.equal(5, gcd(75,20));
  });

  it('should return -2 is gcd(0,-2)', function() {
      assert.equal(-2, gcd(0,-2));
  });

  it('should return 0 is gcd(0,0)', function() {
      assert.equal(0, gcd(0,0));
  });

});

describe('#invalid()', function() {
  it('should return false is gcd(string, number)', function() {
      assert.equal(false, gcd("adsf",16));
  });
});