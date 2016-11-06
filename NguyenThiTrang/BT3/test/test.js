var assert = require('assert');
var checkSum = require('./../CheckSum').checkSum;

describe('#LuongDuLieuBienI()', function() {
  it('checkSum([35,4])', function() {
     assert.equal(1, checkSum([35,4]));
  });

  it('checkSum([])', function() {
     assert.equal(1, checkSum([]));
  });
});

describe('#LuongDuLieuBienSum()', function() {
  it('checkSum([1,10,10])', function() {
     assert.equal(1, checkSum([1,10,10]));
  });

  it('checkSum([30,0])', function() {
     assert.equal(2, checkSum([30,0]));
  });

  it('checkSum([30,3])', function() {
     assert.equal(false, checkSum([30,3]));
  });
});

describe('#LuongDuLieuBienArr()', function() {
  it('checkSum([60,4,2])', function() {
     assert.equal(2, checkSum([60,4,2]));
  });

  it('checkSum("aaa")', function() {
     assert.equal(false, checkSum("aaa"));
  });
});


