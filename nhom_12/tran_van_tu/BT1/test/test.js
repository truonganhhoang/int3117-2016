var assert = require('assert');
var xo_chau = require('./../showbiz');

describe('Xo Chau', function () {
    describe('#hot_song', function () {
        it("Should return 'Chung ta khong luoc duoc rau'", function () {
            assert.equal('Chung ta khong luoc duoc rau', xo_chau.get_hot_song('SonTungMTP'));
        });

        it("Should return 'Say oh yeah!'", function () {
            assert.equal('Say oh yeah!', xo_chau.get_hot_song('Tu dep zai!'));
        });

        it("Should return 'We don't talk any more'", function () {
            assert.equal("We don't talk any more", xo_chau.get_hot_song('CharliePuth'));
        });
    });

    describe('#hot_song', function () {
        it("Should return 'SongTungMTP'", function () {
            assert.equal('SongTungMTP', xo_chau.find_singer('luoc duoc rau'));
        });

        it("Should return 'Maroon5'", function () {
            assert.equal('Maroon5', xo_chau.find_singer('love'));
        });

        it("Should return false", function () {
            assert.equal(false, xo_chau.find_singer('say goodbye'));
        });

        it("Should return false", function () {
            assert.equal(false, xo_chau.find_singer('Payone'));
        });

        it("Should return 'Maroon5'", function () {
            assert.equal('Maroon5', xo_chau.find_singer('payphone'));
        });
    });
});