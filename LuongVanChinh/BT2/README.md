- Ten SV: Luong Van Chinh

- MSSV: 13020034

## Bai toan
- Chuong trinh tinh so luong chu so chia het cho ca 3 va 4 hoac chia het cho 5 tren mot khoang 2 so nguyen (kieu int).
- Su dung framework PHPUnit de test.
```php
class DivisibleNumberCount
{
    public function count($a,$b)
    {
        $count = 0;
        if($a>$b){
            $m=$a;
            $a=$b;
            $b=$m;
        }
        $i=$a;
        while( $i<=$b) {
            if(( $i%4==0 && $i%3==0 ) || $i%5==0){
                $count ++;
            }
            $i++;
        }
		return $count;
    }
}
```

## Neu khong ap dung MCDC 
- Se can 2^4=16 ca kiem thu cho 2 lenh if : $a>$b va ($i%4==0 && $i%3==0 ) || $i%5==0 .

Test Case  | $a>$b | $i%4==0 | $i%3==0 | $i%5==0 
---------- | -------------- | ------------- | ------------- | -------------
1  | True | True | True | True |
2  | True | True | True | False |
3  | True | True | False | True |
4  | True | False | True | True |
5  | False | True | True | True |
6  | True | True | False | False |
7  | True | False | True | False |
8  | False | True | True | False |
9  | False | False | True | True |
10 | True | False | False | True |
11 | False | True | False | True |
12 | True | False | False | False |
13 | False | True | False | False |
14 | False | False | True | False |
15 | False | False | False | True |
16 | False | False | False | False |

- Ap dung MCDC ta se chi can thuc hien 3 ca kiem thu 4, 5, 6 la co the dam bao do bao phu tuong duong voi 16 ca kiem thu.

## Muc do bao phu

<img src="https://github.com/chinhlv95/int3117-2016/blob/master/LuongVanChinh/BT2/images/diagram.jpg">

