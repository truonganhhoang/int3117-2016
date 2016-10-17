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
  + `A (d) --> B (p) --> C --> I`:
  
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

## Triển khai (implement) các ca kiểm thử tương ứng
Chúng ta cần tối thiểu 2 ca kiểm thử để bao phủ được tất cả các đường đi DU của 5 biến trên:

- Ca kiểm thử \#1: phủ được các 1 đường đi DU của biến `bridge` và đường đi DU của biến `fruits`

```javascript
describe('#1 case - Function #pushFruitsIntoBridge: ', () => {
    describe('push ["coconut"] into bridge.container', () => {
        it('should return new bridge.container with a \'coconut\' inside => [\'meat\', \'banana\', \'egg\', \'coconut\']', () => {
            let brandNewBridge = require('../bridge')(['meat', 'banana', 'egg'], '!@#123');
            assert.sameMembers(['meat', 'banana', 'egg', 'coconut'], pushFruitsIntoBridge(brandNewBridge, 'trieudh', '1', ['coconut'], '!@#123'));
        });
    });
});
```

- Ca kiểm thử \#2: phủ được các 1 đường đi DU của biến `bridge` và đường đi DU của các biến `name`, `personalKey` và `superKey`

```javascript
describe('#2 case - Function #pushFruitsIntoBridge: ', () => {
    describe('push a non-array of fruits into bridge.container', () => {
        it('should return unchanged bridge.container => [\'meat\', \'banana\', \'egg\']', () => {
            let brandNewBridge = require('../bridge')(['meat', 'banana', 'egg'], '!@#123');
            assert.sameMembers(['meat', 'banana', 'egg'], pushFruitsIntoBridge(brandNewBridge, 'trieudh', '1', 'thisIsNotAnArrayOfFruits', '!@#123'));
        });
    });
});
```

## Kết quả kiểm thử (test) và bao phủ
Tóm tắt kết quả:

![bt3-coverage-summary](https://github.com/trieudh58/int3117-2016/blob/master/DangHaiTrieu/BT3/screenshots/bt3-coverage-summary.png)

Kết quả bao phủ chi tiết:

![bt3-coverage-detal](https://github.com/trieudh58/int3117-2016/blob/master/DangHaiTrieu/BT3/screenshots/bt3-coverage-detail.png)

## Nhận xét, đối sánh về kết quả nhận được khi áp dụng All-DU-Path và MCDC

- MCDC chặt chẽ hơn về bao phủ nhánh (branch), khi các điều kiện đơn chắc chắn sẽ được thực thi ít nhất một lần.
- All-DU-Path giúp kiểm tra bao phủ dòng lệnh (statement) rất tốt, vì để sinh ra được các ca kiểm thử thì ta cần dựa vào đồ thị chu trình của chương trình
- All-DU-Path hỗ trợ kiểm tra cách các dòng dữ liệu chạy trong chương trình.
- Tuy nhiên, trong bao phủ nhánh, All-DU-Path làm chưa thể chặt chẽ khi so với MCDC. Trong kết quả bao phủ đã nếu ở trên, bao phủ nhánh chỉ đạt 83.33% vì có một điều kiện đơn chưa được chạy qua. 
