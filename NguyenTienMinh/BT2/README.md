# Number validation
Chương trình này dùng để kiểm tra một số nhập vào với quy tắc sau:

Nếu một số chia hết cho (2 && 3) || 5 thì trả về một số hơn số ban đầu 1 đơn vị, nếu không thì trả về một số hơn số đó 2 đơn vị

### Test case khi dùng phương pháp bao phủ điều kiện (Condition coverage)
STT | % 2 = 0 | % 3 = 0 | % 5 = 0 | Result|
---|---|---|---|---|
1|T|T|T|r+1
2|F|T|T|r+1
3|T|F|T|r+1
4|T|T|F|r+1
5|F|F|T|r+1
6|T|F|F|r+2
7|F|T|F|r+2
8|F|F|F|r+2

### Test case khi dùng phương pháp MC/DC
4, 5, 6, 7, 8

-> sử dụng MC/DC tiết kiệm được 3 test case

### Chạy test:
```
mocha test.js
```

### Đo độ bao phủ
```
istanbul cover _mocha -- -u exports -R spec
```