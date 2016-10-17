# Bài tập tuần 7 - BT3
Kiểm thử luồng dữ liệu: áp dụng tiêu chuẩn kiểm thử All-DU-Path

## Hàm cần kiểm thử
```javascript
pushFruitsIntoBridge : (bridge, name, personalKey, fruits, superKey) => { // 9
    let // 10
        firstCondition = (name == user.name), // 11
        secondCondition = (personalKey == user.personalKey), // 12
        thirdCondition = ((Array.isArray(fruits)) && fruits.length < 5), //13
        fourthCondition = ((superKey != null) && (superKey == bridge.superKey)); //14

    if (((firstCondition && secondCondition) || fourthCondition) && thirdCondition) { //16
        while (fruits.length > 0) { // 17
            let fruitPoppedOut = fruits.pop(); // 18
            if (bridge.container.indexOf(fruitPoppedOut) == -1) { // 19
                bridge.container.push(fruitPoppedOut); // 20
            } // 21
        } // 22
        return bridge.container; // 23
    } // 24
    else { // 25
        return bridge.container; // 26
    } // 27
}
```
