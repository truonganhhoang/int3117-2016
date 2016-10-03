# Number validation
Chương trình này dùng để kiểm tra một số nhập vào với quy tắc sau:

Nếu một số chia hết cho 2 & 3 | 5 thì trả về một số hơn số ban đầu 1 đơn vị, nếu không thì trả về một số hơn số đó 2 đơn vị

### Test case khi dùng phương pháp bao phủ điều kiện (Condition coverage)
STT | % 2 = 0 | % 3 = 0 | % 5 = 0 | Result|
---|---|---|---|---|
1|T|T|T|T
2|T|T|T|T
3|T|T|T|T
4|T|T|T|T
5|T|T|T|T
6|T|T|T|T

### Chạy test:
```
mocha test.js
```

### Đo độ bao phủ
```
istanbul cover _mocha -- -u exports -R spec
```