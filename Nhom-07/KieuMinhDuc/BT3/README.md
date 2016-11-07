# Bài tập tuần 7 - BT3
Kiểm thử luồng dữ liệu: áp dụng tiêu chuẩn kiểm thử All-DU-Path

## Hàm cần kiểm thử
` Đếm số lượng của số "nhuận" ( số nhuận : tương tự như năm nhuận ) . Nếu kết quả là số chẵn thì trả về true hoặc ngược lại `
```java
public boolean isCountingEvenLeapNumber( int n ){
    int count = 0 , i = 0;                                              // 1
    while ( i  <= n ){                                                  // 2
        if ( ( n % 4 == 0 ) && ( n % 100 != 0) || ( n % 400 == 0 ) ){   // 3
            count++;                                                    // 4
        }
        i++;                                                            // 5
    }
    if ( count % 2 == 0){                                               // 6
        return true;                                                    // 7
    }else{
        return false;                                                   // 8
    }
}
```

## Đồ thị chu trình
![flow-graph](http://i.imgur.com/f2VMGFj.png)

## Xác định các đường đi DU và sinh các bộ kiểm thử tương ứng
Biến `n`:
   `1 (d) --> 2 (c) --> 3 (c)`
   
## Các ca kiểm thử tương ứng
Cần 1 ca kiểm thử để bao phủ được DU-path :

```java
public void testCountingLeapNumber() {		
		FindingLeapNumber findingLeapNumber = new FindingLeapNumber();
		int a = 300;
		assertEquals(true, findingLeapNumber.isCountingEvenLeapNumber(a));
	}
```
## Kết quả kiểm thử (test) và bao phủ

![bt3-coverage-summary](http://i.imgur.com/AG4BrgG.png)

## So sánh kết quả khi áp dụng All-DU-Path và MCDC
- MCDC chặt chẽ hơn về bao phủ nhánh (branch) .
- All-DU-Path chặt chẽ hơn về giúp kiểm tra bao phủ dòng lệnh (statement).
