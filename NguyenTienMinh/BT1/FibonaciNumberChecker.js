'use strict';

module.exports = class FibonaciNumberChecker {
    constructor() {

    }

    fibonaciNumberInOrder(inputOrderNumb) {
        // console.log(inputOrderNumb);
        if (inputOrderNumb == 0) {
            return 0;
        } else if (inputOrderNumb == 1) {
            return 1;
        } else {
            return this.fibonaciNumberInOrder(inputOrderNumb - 1) + this.fibonaciNumberInOrder(inputOrderNumb - 2);
        }
    }

    isFibonaciNumber(inputNumber) {
        let tempFiboNumb = 0;
        let orderNumb = 0;

        while (inputNumber > tempFiboNumb) {
            tempFiboNumb = this.fibonaciNumberInOrder(orderNumb);
            orderNumb++;
        }

        return inputNumber == tempFiboNumb;
    }

    validateInput(inputNumber){
        if (inputNumber < 0){
            return false;
        } else {
            return true;
        }
    }
};
