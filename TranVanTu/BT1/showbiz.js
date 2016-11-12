module.exports = (function () {
    return {
        get_hot_song: get_hot_song,
        find_singer: find_singer
    };

    function get_hot_song(singer) {
        if (singer === 'SonTungMTP') {
            return 'Chung ta khong luoc duoc rau';
        }

        if (singer === 'CharliePuth') {
            return "We don't talk any more";
        }

        return 'Say oh yeah!';
    }

    function find_singer(text) {
        var tung_nui_songs = [
            'Chung ta khong luoc duoc rau',
            'Say oh yeah',
            'Em cua ngay hom kia',
            'Khong phai dau vua rang',
            'Chac ai do se ve'
        ];
        var detect_tung_nui = _detect_string(tung_nui_songs, text);
        if (detect_tung_nui !== false) {
            return 'SongTungMTP';
        }

        var m5_songs = [
            'Sugar',
            'Payphone',
            'Maps',
            'This love',
            'Animals'
        ];
        var detect_m5 = _detect_string(m5_songs, text);
        if (detect_m5 !== false) {
            return 'Maroon5';
        }

        return false;
    }

    function _detect_string(arrayStr, str) {
        str = str.toLowerCase();

        for (var i = 0; i < arrayStr.length; i++) {
            var song = arrayStr[i];
            song = song.toLowerCase();

            if (song.indexOf(str) !== -1) {
                return i;
            }
        }

        return false;
    }
})();