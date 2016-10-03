'use strict';

module.exports = class MyNumberValidate {
    constructor() {
    }

    /**
     * Kiểm tra 1 số có chia hết cho 2 & 3 hoặc 5 hay không
     * @param inputNumber
     */
    validate(inputNumber) {
        let dividable2 = (inputNumber % 2) == 0;
        let dividable3 = (inputNumber % 3) == 0;
        let dividable5 = (inputNumber % 5) == 0;

        if ((dividable2 && dividable3) || dividable5){
            return inputNumber + 1;
        }

        return inputNumber + 2;
    }
};