# Kiểm tra số Fibonaci

##Cài đặt thư viện mocha
```
npm install -g mocha
```

##Run
```
mocha test.js
```

## Nhận xét
### Đối với bài tập 2 (tại sao dùng phương pháp kiểm thử biên)? 
- Ở bài toán tìm số fibonaci, giới hạn miền giá trị đúng là [0, +vô cùng), nên nếu giá trị âm thì sẽ không thể tìm được số fibonaci -> dễ xảy ra lỗi

- Vì thế, các ca kiểm thử có thể xoay quanh một số giá trị biên nhỏ nhất để chắc chắn rằng chương trình chạy đúng khi đầu vào là số âm (các ca kiểm thử có được chú thích trong file test.js)

## Độ bao phủ
```
Statements   : 91.43% ( 32/35 )
Branches     : 66.67% ( 4/6 )
Functions    : 92.31% ( 12/13 )
Lines        : 91.43% ( 32/35 )
```
