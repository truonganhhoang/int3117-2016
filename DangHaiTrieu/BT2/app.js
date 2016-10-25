'use strict';

let user = {
    name: 'trieudh',
    personalKey: '1'
};

module.exports = {
    pushFruitsIntoBridge : (bridge, name, personalKey, fruits, superKey) => {
        let
            firstCondition = (name == user.name),
            secondCondition = (personalKey == user.personalKey),
            thirdCondition = ((Array.isArray(fruits)) && fruits.length < 5),
            fourthCondition = ((superKey != null) && (superKey == bridge.superKey));

        if (((firstCondition && secondCondition) || fourthCondition) && thirdCondition) {
            while (fruits.length > 0) {
                let fruitPoppedOut = fruits.pop();
                if (bridge.container.indexOf(fruitPoppedOut) == -1) {
                    bridge.container.push(fruitPoppedOut);
                }
            }
            // console.log('Yay! All fruits are pushed into our bridge!');
            // console.log('Our bridge now has: ', bridge.container);
            return bridge.container;
        }
        else {
            // console.log('Something is wrong. Your action is canceled');
            // console.log('Our bridge has: ', bridge.container);
            return bridge.container;
        }
    }
};