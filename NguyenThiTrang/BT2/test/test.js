var assert = require('assert');
var checkSum = require('./../CheckSum').checkSum;

describe('#isNotArray()', function() {
  it('should return false is checkSum("aaa")', function() {
     assert.equal(false, checkSum("aaa"));
  });
});

describe('#shouldReturn1()', function() {
  it('checkSum([35,4])', function() {
     assert.equal(1, checkSum([35,4]));
  });

  it('checkSum([1,10,10])', function() {
     assert.equal(1, checkSum([1,10,10]));
  });

  it('checkSum([])', function() {
     assert.equal(1, checkSum([]));
  });
});

describe('#shouldReturn2()', function() {
  it('checkSum([30,0])', function() {
     assert.equal(2, checkSum([30,0]));
  });

  it('checkSum([60,4,2])', function() {
     assert.equal(2, checkSum([60,4,2]));
  });

  it('checkSum([120,10])', function() {
     assert.equal(2, checkSum([120,10]));
  });

  it('checkSum([280,0,6])', function() {
     assert.equal(2, checkSum([280,0,6]));
  });
});

describe('#shouldReturnFalse()', function() {
  it('checkSum([30,3])', function() {
     assert.equal(false, checkSum([30,3]));
  });

  it('checkSum([1,2,3])', function() {
     assert.equal(false, checkSum([1,2,3]));
  });

   it('checkSum([140,3])', function() {
     assert.equal(false, checkSum([140,3]));
  });

  it('checkSum([10,10,6])', function() {
     assert.equal(false, checkSum([10,10,6]));
  });
});


