/**
 * Created by DaoPham on 10/18/2016.
 */
function kiem_tra_snt(n) {
    // Biến cờ hiệu
    var flag = true;

    // Nếu n bé hơn 2 tức là không phải số nguyên tố
    if ((n < 2) || (n % 2 == 0) ) {
        flag = false;
    }
    else if (n == 2) {
        flag = true;
    }
    else {
        // lặp từ 3 tới n-1 với bước nhảy là 2 (i+=2)
        var i = 3;
        while (i < Math.sqrt(n)) {
            if (n % i == 0) {
                flag = false;
                break;
            }
            i += 2;
        }
    }
//    return flag;
//    n = prompt("nhap gia tri n: ")
    // Kiểm tra biến flag
    if (flag == true) {
        return "La so nguyen to!";
    }
    else {
        return "Khong la so nguyen to!";
    }
}