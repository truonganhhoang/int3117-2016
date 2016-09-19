# Báo cáo bài tập về nhà tuần 3.

## Function cần test
* Mô tả: Tính giá trị fibonacci của số thứ n trong dãy fibonacci

  VD: fibonacci(1) = 1, fibonacci(2) = 1, fibonacci(3) = 2,...
* Code:

  ```javascript
  fibonacci: (n) => {
      let a = 0,
          b = 1,
          c;
      if (!Number.isInteger(n)) {
          return 'INVALID_INPUT_VALUE';
      }
      else if (n < 3) {
          return 1;
      }
      while (--n) {
          c = a + b;
          a = b;
          b = c;
      }
      return c;
  }
  ```
  
## Phương pháp kiểm thử
* Phương pháp được lựa chọn: **Kiểm thử biên mạnh**
* Lý do lựa chọn phương pháp này: Hàm fibonacci tăng theo cấp số cộng rất nhanh, giá trị của hàm có thể vượt giá trị MAX_VALUE nhanh chóng, cũng như runtime của nó không đáp ứng được hiệu năng của hệ thống (VD: hàm này yêu cầu runetime nhỏ hơn 0.1 giây)

## Kết quả kiểm thử
![Test result](https://github.com/trieudh58/int3117-2016/raw/master/DangHaiTrieu/BT1/screenshots/test-result.png)

Các ca kiểm thử (test cases) đã mô tả trong file README.md
* \#1: Pass 
  
  ```
  Function
     #fibonacci
       ✓ should return an error "INVALID_INPUT_VALUE" if the input is not integer
  ```
* \#2: Pass
  
  ```
  Function
     #fibonacci
       ✓ should run exactly with large number like 1476
  ```
* \#3: Pass
  
  ```
  Function
     #fibonacci
       ✓ should return Infinity if n is bigger than 1476
  ```
* \#4: Pass

  ```
  Function
     #fibonacci
       ✓ should has a run time less than 0.1 second
  ```
* \#5: Fail

  ```
  Function
     #fibonacci
       1) should return fibonacci(80) = 23416728348467684
  ```
  
## Phân tích lỗi
Ở ca kiểm thử \#5, do hàm fibonacci(80) return một value đã vượt quá [Number.MAX_SAFE_INTEGER](http://www.ecma-international.org/ecma-262/6.0/#sec-number.max_safe_integer) (2^53 - 1) nên phép so sánh (value == value + 1) cho kết quả true.

Vì thế `assert.notEqual(23416728348467683, mainApp.fibonacci(80));` vẫn cho kết quả assert.equal là true, mặc dù `fibonacci(80) = 23416728348467684`

Ở đây, hàm vẫn chạy đúng. Tuy nhiên, chúng ta sẽ gặp khó khăn ở phần test, vì khi assert.equal sẽ cho kết quả không chính xác đối khi kiểm thử biên đối với hai số đã bị tràn (giá trị vượt quá Number.MAX_SAFE_INTEGER)
 
======

# Bài tập tuần 1
## Description
Simple Node js project using Mocha as unit test framework.

## Prerequistes
- Nodejs
- Npm

## Install and run
- Open terminal/cmd/powershell at project root
- Run `npn install` to set up dependencies
- Run `npm test` to execute tests and see test results

## Function to be tested
```javascript
    /*
    * Description: Calculate n-th number of fibonacci sequence
    * Params:
    *   - n: positive number
    * Return: n-th number of fibonacci sequence
    * */
    fibonacci: (n) => {
        let a = 0,
            b = 1,
            c;
        if (!Number.isInteger(n)) {
            return 'INVALID_INPUT_VALUE';
        }
        else if (n < 3) {
            return 1;
        }
        while (--n) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
```

## Test cases
```javascript
// #1
describe('Function', () => {
    describe('#fibonacci', () => {
        it('should return an error "INVALID_INPUT_VALUE" if the input is not integer', () => {
            assert.equal('INVALID_INPUT_VALUE', mainApp.fibonacci(2.001));
        });
    });
});
```
```javascript
// #2
describe('Function', () => {
    describe('#fibonacci', () => {
        it('should run exactly with large number like 1476', () => {
            assert.equal(1.3069892237633987e+308, mainApp.fibonacci(1476));
        });
    });
});
```
```javascript
// #3
describe('Function', () => {
    describe('#fibonacci', () => {
        it('should return Infinity if n is bigger than 1476', () => {
            assert.equal(Infinity, mainApp.fibonacci(1477));
        });
    });
});
```
```javascript
// #4
describe('Function', () => {
    describe('#fibonacci', () => {
        it('should has a run time less than 0.1 second', () => {
            let t0 = performanceNow();
            mainApp.fibonacci(80);
            let t1 = performanceNow();
            assert.isAbove(0.1, (t1 - t0).toFixed(3));
        });
    });
});
```
```javascript
// #5
describe('Function', () => {
    describe('#fibonacci', () => {
        it('should return fibonacci(80) = 23416728348467684', () => {
            assert.notEqual(23416728348467683, mainApp.fibonacci(80));
        });
    });
});
```
