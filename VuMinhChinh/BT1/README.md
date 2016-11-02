Bài toán: Đầu vào là một ngày, đầu ra là thuộc ngày thứ bao nhiêu trong năm.

### Áp dụng

#### Kiểm thử theo giá trị biên:
- Kiểm tra với ngày cuối cùng, ngày cuối cùng + 1, ngày cuối cùng -1
- Kiểm tra với ngày đầu tiên, ngày đầu -1, ngày đầu +1
- Kiểm tra trong 2 trường hợp năm nhuận và không nhuận.

##### Lập bảng:

Đầu vào | Đầu ra
---- | ----
1/1/1999 | 1
0/1/1999 | false
2/1/1999 | 2
31/12/1999 | 365
32/12/1999 | false
30/12/1999 | 364
1/1/2004 | 1
0/1/2004 | false
2/1/2004 | 2
31/12/2004 | 366
32/12/2004 | false
30/12/2004 | 365


