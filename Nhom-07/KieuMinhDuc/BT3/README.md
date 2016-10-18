# KTPM2016
Bài tập môn kiểm thử phần mềm 2016

## Thông tin
```
Họ và tên : Kiều Minh Đức 
Mã sinh viên : 13020121
```
## Bài tập 3 :  Áp dụng tiêu chuẩn kiểm thử All-DU-Path

### 1. Bài toán
```
   Chương trình được đánh số thứ tự như sau:
1. initialize(n)   
2. isValidate(n)
	/*if ( isDivisibleBy4Number(n)&& !isDivisible100Number(n)|| isDivisible400Number(n)){
			return true;			
		}else{
			return false;
		}*/
3.	isDivisibleBy4Number(n)
	/*if ( number%4 == 0){
			return true;
		}else{
			return false;
		} */
4.	isDivisible400Number(n)
	/*if ( number%400 == 0){
			return true;
		}else{
			return false;
		}*/
5.	isDivisible100Number(n)
	/*if ( number%100 == 0){
			return true;
		}else{
			return false;
		}
	}*/
	
6. False
7. True
```


### 2. So sánh và rút ra nhận xét về All-DU-Path và MCDC.

```
- MCDC: test tất cả các biểu thức condition và decicions của hàm isValidate.
- All-Du-path: test tất cả các definition và các trường hợp sử dụng của biến n.
```
  

