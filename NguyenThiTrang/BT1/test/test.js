var assert = require('assert');
var gcd = require('./../gcd').gcd;

describe('#equivalence()', function() {
  it('should return 4 is gcd(12,16)', function() {
     assert.equal(4, gcd(12,16));
  });

  it('should return 5 is gcd(75,20)', function() {
    assert.equal(5, gcd(75,20));
  });

  it('should return false with invalid input', function() {
    assert.equal(false, gcd(3,3.2));
  });
 
});

describe('#boundary()', function() {
  it('should return 1 is gcd(2,Number.MAX_SAFE_INTEGER)', function() {
    assert.equal(1, gcd(2, Number.MAX_SAFE_INTEGER));
  });

  it('should return 2 is gcd(2,Number.MAX_SAFE_INTEGER-1)', function() {
    assert.equal(2, gcd(2, Number.MAX_SAFE_INTEGER-1));
  });

  it('should return false is gcd(Number.MAX_SAFE_INTEGER-1,Number.MAX_SAFE_INTEGER+1)', function() {
    assert.equal(false, gcd(Number.MAX_SAFE_INTEGER-1, Number.MAX_SAFE_INTEGER+1));
  });


   it('should return 1 is gcd(2, Number.MIN_SAFE_INTEGER)', function() {
    assert.equal(1, gcd(2, Number.MIN_SAFE_INTEGER));
  });

  it('should return 2 is gcd(2, Number.MIN_SAFE_INTEGER-1)', function() {
    assert.equal(false, gcd(2, Number.MIN_SAFE_INTEGER-1));
  });
  
  it('should return false is gcd(2, Number.MIN_SAFE_INTEGER + 1)', function() {
    assert.equal(2, gcd(2, Number.MIN_SAFE_INTEGER + 1));
  });

  it('should return 7 is gcd(14,7)', function() {
    assert.equal(7, gcd(14,7));
  });

});