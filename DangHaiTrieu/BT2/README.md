# Bài tập 2

## Hàm cần kiểm thử:
```javascript
pushFruitsIntoBridge : (name, personalKey, fruits, superKey) => {
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
```
Biểu thức điều kiện: `Branch = ((firstCondition && secondCondition) || fourthCondition) && thirdCondition`

## Nếu không áp dụng MCDC

Thông thường nếu không áp dùng MCDC, ta cần test đủ cả 16 ca kiểm thử tương ứng với các trường hợp True|False của từng điều kiện (first, second,...) và cả trường hợp True|False của 2 nhánh (branch) của câu lệnh **if**.

16 ca kiểm thử 1 bộ kiểm thử tương ứng với 16 trường hợp như trong bảng dưới đây:

\# | firstCondition | secondCondition | thirdCondition | fourthCondition | Branch
---- | --- | --- | --- | --- | ---
1. | T | T | T | T | T
2. | T | T | T | F | T
3. | T | T | F | T | F
4. | T | T | F | F | F
5. | T | F | T | T | T
6. | T | F | T | F | F
7. | T | F | F | T | F
8. | T | F | F | F | F
9. | F | T | T | T | T
10. | F | T | T | F | F
11. | F | T | F | T | F
12. | F | T | F | F | F
13. | F | F | T | T | T
14. | F | F | T | F | F
15. | F | F | F | T | F
16. | F | F | F | F | F

## Áp dụng MCDC

Khi áp dụng phương pháp kiểm thử MCDC, ta chọn được một số hữu hạn các ca kiểm thử sao cho các ca kiểm thử đó có thể bao phủ (coverage) được cả các điều kiện đơn lẻ (condition) và cả cả 2 nhánh điều kiện (decision) của chương trình.

Áp dụng vào bài trên, ta chọn được các trường hợp cần để xây dựng bộ (ca) kiểm thử là: 2 - 10 - 6 - 4 - 5.

Chỉ cần xây dựng 5 ca kiểm thử tương ứng với 5 trường hợp trên, ta có thể cover được cả 16 trường hợp, tiết kiệm được rất nhiều công sức.

## Xây dựng các ca kiểm thử

Ca kiểm thử \#2: True - True - True - False => True Branch
```javascript
describe('#2 case - Function #pushFruitsIntoBridge: ', () => {
    describe('push ["coconut"] into bridge.container with True name, True personalKey, True fruits, and False superKey', () => {
        it('should return new bridge.container with a \'coconut\' inside => [\'meat\', \'banana\', \'egg\', \'coconut\']', () => {
            let brandNewBridge = require('../bridge')(['meat', 'banana', 'egg'], '!@#123');
            assert.sameMembers(['meat', 'banana', 'egg', 'coconut'], pushFruitsIntoBridge(brandNewBridge, 'trieudh', '1', ['coconut'], 'falseSuperKey'));
        });
    });
});
```

Ca kiểm thử \#10: False - True - True - False => False Branch
```javascript
describe('#10 case - Function #pushFruitsIntoBridge: ', () => {
    describe('push ["coconut"] into bridge.container with False name, True personalKey, False fruits, and True superKey', () => {
        it('should return the old bridge.container [\'meat\', \'banana\', \'egg\']', () => {
            let brandNewBridge = require('../bridge')(['meat', 'banana', 'egg'], '!@#123');
            assert.sameMembers(['meat', 'banana', 'egg'], pushFruitsIntoBridge(brandNewBridge, 'trieudh-false', '1', 'thisFruitIsNotInArray', '123!@#'));
        });
    });
});
```

Ca kiểm thử \#6: True - False - True - False => False Branch
```javascript
describe('#6 case - Function #pushFruitsIntoBridge: ', () => {
    describe('push ["coconut"] into bridge.container with True name, False personalKey, False fruits, and True superKey', () => {
        it('should return the old bridge.container [\'meat\', \'banana\', \'egg\']', () => {
            let brandNewBridge = require('../bridge')(['meat', 'banana', 'egg'], '!@#123');
            assert.sameMembers(['meat', 'banana', 'egg'], pushFruitsIntoBridge(brandNewBridge, 'trieudh', '1-false', 'thisFruitIsNotInArray', '123!@#'));
        });
    });
});
```

Ca kiểm thử \#4: True - True - False - False => False Branch
```javascript
describe('#4 case - Function #pushFruitsIntoBridge: ', () => {
    describe('push ["coconut"] into bridge.container with True name, True personalKey, False fruits, and False superKey', () => {
        it('should return the old bridge.container [\'meat\', \'banana\', \'egg\']', () => {
            let brandNewBridge = require('../bridge')(['meat', 'banana', 'egg'], '!@#123');
            assert.sameMembers(['meat', 'banana', 'egg'], pushFruitsIntoBridge(brandNewBridge, 'trieudh', '1', 'thisFruitIsNotInArray', 'falseSuperKey'));
        });
    });
});
```

Ca kiểm thử \#2: True - False - True - True => True Branch
```javascript
describe('#5 - Function #pushFruitsIntoBridge: ', () => {
    describe('push ["coconut"] into bridge.container with True name, False personalKey, True fruits, and True superKey; but the fruits are already in bridge.container', () => {
        it('should return the old bridge.container [\'meat\', \'banana\', \'egg\']', () => {
            let brandNewBridge = require('../bridge')(['meat', 'banana', 'egg'], '!@#123');
            assert.sameMembers(['meat', 'banana', 'egg'], pushFruitsIntoBridge(brandNewBridge, 'trieudh', '1-false', ['banana'], '!@#123'));
        });
    });
});
```

## Kết quả test

![test-result](https://github.com/trieudh58/int3117-2016/blob/master/DangHaiTrieu/BT2/screenshots/test-result.PNG)

## Đo mức độ bao phủ

Tóm tắt kết quả đo bao phủ:
![test-coverage-sumary](https://github.com/trieudh58/int3117-2016/blob/master/DangHaiTrieu/BT2/screenshots/test-coverage-sumary.PNG)

Kết quả đo bao phủ trong hàm chính (main function):
![main-function-coverage](https://github.com/trieudh58/int3117-2016/blob/master/DangHaiTrieu/BT2/screenshots/main-function-coverage.PNG)
