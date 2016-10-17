'use strict';

const mocha = require('mocha'),
    pushFruitsIntoBridge = require('../app').pushFruitsIntoBridge,
    chai = require('chai'),
    assert = chai.assert;

describe('#1 case - Function #pushFruitsIntoBridge: ', () => {
    describe('push ["coconut"] into bridge.container', () => {
        it('should return new bridge.container with a \'coconut\' inside => [\'meat\', \'banana\', \'egg\', \'coconut\']', () => {
            let brandNewBridge = require('../bridge')(['meat', 'banana', 'egg'], '!@#123');
            assert.sameMembers(['meat', 'banana', 'egg', 'coconut'], pushFruitsIntoBridge(brandNewBridge, 'trieudh', '1', ['coconut'], '!@#123'));
        });
    });
});

describe('#2 case - Function #pushFruitsIntoBridge: ', () => {
    describe('push a non-array of fruits into bridge.container', () => {
        it('should return unchanged bridge.container => [\'meat\', \'banana\', \'egg\']', () => {
            let brandNewBridge = require('../bridge')(['meat', 'banana', 'egg'], '!@#123');
            assert.sameMembers(['meat', 'banana', 'egg'], pushFruitsIntoBridge(brandNewBridge, 'trieudh', '1', 'thisIsNotAnArrayOfFruits', '!@#123'));
        });
    });
});