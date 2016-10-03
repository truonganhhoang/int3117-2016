module.exports = (function () {
    return {
        is_prime_number: is_prime_number
    };

    function is_prime_number(number) {
        if (isNaN(number)) {
            return false;
        }

        if (number < 2) {
            return false;
        }

        var primitive = [2, 3, 5, 7];

        for (var i=0; i<primitive.length; i++) {
            if (number === primitive[i]) {
                return true;
            }

            if (number % primitive[i] == 0) {
                return false;
            }
        }

        return true;
    }
})();