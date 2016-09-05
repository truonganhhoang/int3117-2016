
var count = 0;

function ok() {
    count ++;
    console.log('ok men');
    if (count < 10){
        return ok();
    }
}

ok();