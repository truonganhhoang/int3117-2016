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

## Đồ thị chu trình
![flow-graph](https://github.com/trieudh58/int3117-2016/blob/master/DangHaiTrieu/BT3/screenshots/flow-graph.png)

## Xác định các đường đi DU và sinh các bộ kiểm thử tương ứng
- Biến `bridge`:
  + `A (d) --> B (p) --> C --> D -- E (p) --> F (c) --> G --> H (c)`:
    ```javascript
    ({container: ['meat', 'banana', 'egg'], superKey: '!@#123'}, 'trieudh', '1', ['coconut'], '!@#123')
    ```
  + `A (d) --> B (p) --> C --> I (c)`:
    ```javascript
    ({container: ['meat', 'banana', 'egg'], superKey: '!@#123'}, 'trieudh', '1', 'thisIsNotAnArrayOfFruits', '!@#123')
    ```
  
- Biến `name`:
  + `A (d) --> B (p) --> C --> I`
    ```javascript
    ({container: ['meat', 'banana', 'egg'], superKey: '!@#123'}, 'trieudh', '1', 'thisIsNotAnArrayOfFruits', '!@#123') 
    ```
  
- Biến `personalKey`:
  + `A (d) --> B (p) --> C --> I`:
    ```javascript
    ({container: ['meat', 'banana', 'egg'], superKey: '!@#123'}, 'trieudh', '1', 'thisIsNotAnArrayOfFruits', '!@#123')
    ```
  
- Biến `fruits`:
  + `A (d) --> B (p) --> C --> D (p) --> E (c) --> F --> G --> H`:
    ```javascript
    ({container: ['meat', 'banana', 'egg'], superKey: '!@#123'}, 'trieudh', '1', ['coconut'], '!@#123')
    ```

- Biến `superKey`:
  + `A (d) --> B (p) --> C --> I`:
    ```javascript
    ({container: ['meat', 'banana', 'egg'], superKey: '!@#123'}, 'trieudh', '1', 'thisIsNotAnArrayOfFruits', '!@#123')    
    ```