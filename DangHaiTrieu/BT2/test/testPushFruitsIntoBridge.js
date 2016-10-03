'use strict';

const mocha = require('mocha'),
    pushFruitsIntoBridge = require('../app').pushFruitsIntoBridge,
    chai = require('chai'),
    assert = chai.assert;

describe('#2 case - Function #pushFruitsIntoBridge: ', () => {
    describe('push ["coconut"] into bridge.container with True name, True personalKey, True fruits, and False superKey', () => {
        it('should return new bridge.container with a \'coconut\' inside => [\'meat\', \'banana\', \'egg\', \'coconut\']', () => {
            let brandNewBridge = require('../bridge')(['meat', 'banana', 'egg'], '!@#123');
            assert.sameMembers(['meat', 'banana', 'egg', 'coconut'], pushFruitsIntoBridge(brandNewBridge, 'trieudh', '1', ['coconut'], 'falseSuperKey'));
        });
    });
});

describe('#10 case - Function #pushFruitsIntoBridge: ', () => {
    describe('push ["coconut"] into bridge.container with False name, True personalKey, False fruits, and True superKey', () => {
        it('should return the old bridge.container [\'meat\', \'banana\', \'egg\']', () => {
            let brandNewBridge = require('../bridge')(['meat', 'banana', 'egg'], '!@#123');
            assert.sameMembers(['meat', 'banana', 'egg'], pushFruitsIntoBridge(brandNewBridge, 'trieudh-false', '1', 'thisFruitIsNotInArray', '123!@#'));
        });
    });
});

describe('#6 case - Function #pushFruitsIntoBridge: ', () => {
    describe('push ["coconut"] into bridge.container with True name, False personalKey, False fruits, and True superKey', () => {
        it('should return the old bridge.container [\'meat\', \'banana\', \'egg\']', () => {
            let brandNewBridge = require('../bridge')(['meat', 'banana', 'egg'], '!@#123');
            assert.sameMembers(['meat', 'banana', 'egg'], pushFruitsIntoBridge(brandNewBridge, 'trieudh', '1-false', 'thisFruitIsNotInArray', '123!@#'));
        });
    });
});

describe('#4 case - Function #pushFruitsIntoBridge: ', () => {
    describe('push ["coconut"] into bridge.container with True name, True personalKey, False fruits, and False superKey', () => {
        it('should return the old bridge.container [\'meat\', \'banana\', \'egg\']', () => {
            let brandNewBridge = require('../bridge')(['meat', 'banana', 'egg'], '!@#123');
            assert.sameMembers(['meat', 'banana', 'egg'], pushFruitsIntoBridge(brandNewBridge, 'trieudh', '1', 'thisFruitIsNotInArray', 'falseSuperKey'));
        });
    });
});

describe('#5 - Function #pushFruitsIntoBridge: ', () => {
    describe('push ["coconut"] into bridge.container with True name, False personalKey, True fruits, and True superKey; but the fruits are already in bridge.container', () => {
        it('should return the old bridge.container [\'meat\', \'banana\', \'egg\']', () => {
            let brandNewBridge = require('../bridge')(['meat', 'banana', 'egg'], '!@#123');
            assert.sameMembers(['meat', 'banana', 'egg'], pushFruitsIntoBridge(brandNewBridge, 'trieudh', '1-false', ['banana'], '!@#123'));
        });
    });
});