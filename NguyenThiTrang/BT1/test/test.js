var assert = require('assert');
var ucln = require('./../ucln').ucln;

describe('#equivalence()', function() {
  it('should return 4 is ucln(12,16)', function() {
     assert.equal(4, ucln(12,16));
  });

  it('should return 5 is ucln(75,20)', function() {
    assert.equal(5, ucln(75,20));
  });

  it('should return false with invalid input', function() {
    assert.equal(false, ucln(3,3.2));
  });
 
});

describe('#boundary()', function() {
  it('should return 1 is ucln(2,Number.MAX_SAFE_INTEGER)', function() {
    assert.equal(1, ucln(2, Number.MAX_SAFE_INTEGER));
  });

  it('should return 2 is ucln(2,Number.MAX_SAFE_INTEGER-1)', function() {
    assert.equal(2, ucln(2, Number.MAX_SAFE_INTEGER-1));
  });

  it('should return false is ucln(Number.MAX_SAFE_INTEGER-1,Number.MAX_SAFE_INTEGER+1)', function() {
    assert.equal(false, ucln(Number.MAX_SAFE_INTEGER-1, Number.MAX_SAFE_INTEGER+1));
  });


   it('should return 1 is ucln(2, Number.MIN_SAFE_INTEGER)', function() {
    assert.equal(1, ucln(2, Number.MIN_SAFE_INTEGER));
  });

  it('should return 2 is ucln(2, Number.MIN_SAFE_INTEGER-1)', function() {
    assert.equal(false, ucln(2, Number.MIN_SAFE_INTEGER-1));
  });
  
  it('should return false is ucln(2, Number.MIN_SAFE_INTEGER + 1)', function() {
    assert.equal(2, ucln(2, Number.MIN_SAFE_INTEGER + 1));
  });

  it('should return 7 is ucln(14,7)', function() {
    assert.equal(7, ucln(14,7));
  });

});