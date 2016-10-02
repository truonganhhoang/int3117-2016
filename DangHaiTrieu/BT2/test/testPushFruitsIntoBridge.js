'use strict';

const mocha = require('mocha'),
    pushFruitsIntoBridge = require('../app').pushFruitsIntoBridge,
    chai = require('chai'),
    assert = chai.assert;

describe('Function #pushFruitsIntoBridge: ', () => {
    describe('push ["coconut"] into bridge.container with true identity (true name and true key)', () => {
        it('should return the old bridge.container [\'meat\', \'banana\', \'egg\'] with a new \'coconut\' inside => [\'meat\', \'banana\', \'egg\', \'coconut\']', () => {
            assert.sameMembers(['meat', 'banana', 'egg', 'coconut'], pushFruitsIntoBridge('trieudh', '1', ['coconut']));
        });
    });
});