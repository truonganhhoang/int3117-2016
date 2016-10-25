module.exports = {
    // Kiem tra so nguyen to
    kiemTraNguyenTo: function (number) {
        if (typeof number !== "number") {
            return "Khong phai la mot so!";
        }
        else if (number <= 0 || parseInt(number) !== number) {
            return "Khong la so nguyen to";
        }
        else {
            var flag = true;
            for (var i = 0; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            return flag === true ? "La so nguyen to" : "Khong la so nguyen to";
        }
    }
};