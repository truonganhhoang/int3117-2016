#Mô tả bài toán : viết chương trình kiểm thử các trường hợp của tam giac bằng Junit trên ngôn ngữ Java.
----
##*input: đầu vào là độ dài các cạnh của tam giác: s1, s2, s3*
##*output: xem xét tam giác đó là tam giác gì.*
##*Xét các trường tam giác:* 
-nếu tổng số đo 2 cạnh <= cạnh còn lại hoặc một trong ba cạnh của nó < 0 thì đó không phải tam giac (-1)
-nếu số đo hai cạnh bằng nhau thì tam giác cân (1)
-nếu số đo ba cạnh bằng nhau thi tam giác đều (2)
-nếu bình phương một cạnh bằng tổng bình phương hai cạnh còn lại thì là tam giác vuông (4)
-nếu là tam giác vuông và có hai cạnh của góc vuông bằng nhau thi là tam giác vuông cân (3)
-còn lại là tam giác bình thường (5)
----
##*áp dụng MC/DC cho các điều kiện của một số trường hợp cụ thể:*
```sh
if (condition1 == false || condition2 == false) {
			System.out.println("Khong phai tam giac");
			result = -1;
		}
```

| TC | condition1 == false | condition2 == false | KQ |
|----|---------------------|---------------------|----|
| 1 | T | T | T |
| 2 | T | F | T |
| 3 | F | T | T |
| 4 | F | F | F |
----
```sh
if ((side1 == side2) || (side2 == side3) || (side3 == side1)) {
				System.out.println("tam giac can!");
				result = 1;
				break;
		}
```
| TC | side1 == side2 | side2 == side3 | side3 == side1 | KQ |
|----|----------------|----------------|----------------|----|
| 1 | T | T | T | T |
| 2 | T | T | F | T |
| 3 | T | F | T | T |
| 4 | F | T | T | T |
| 5 | T | T | F | T |
| 6 | T | F | F | T |
| 7 | F | T | F | T |
| 8 | F | F | T | T |
| 9 | F | F | F | F |
----
<img src="https://www.google.com/search?tbs=sbi:AMhZZisCmEFrZ8QqxOQwYyNYxWLhbQY8bLWIz5HtQTyEzj5KR5OqkL0rLhnqNsgrdUD2MKF3QqgTVbh3c0hFM8vP_1XCmG3ztqxJKzUQne-pRmvW3x5cSMOtQ_1AVvFes-A5sU0s_1KNMGutNdaG_1uF29nO4A67q84uHl8gA5Vtt44PqeFXo9AUW9sLwum70IlCSYKhXLAeoM81F9Wl_1YEMhEEL0sY84qMaUfPsqHlRhxRkKbviHEehOkTQT2kzDnYHyEXrnzNz9KN8cCOtxuou38unnrcM4Ry_11_12WxKNg0Lr7n34jZ1jHstA1sZzDRou4brq2HmwbvWlMkUa5pRSFa6uDYDd4sRDpTkOzLu8RMO-4X302kcLabg0xhynyApLxF_1W0IVMsqX5hC2zGsT6jWhTZap6Z7eiWvoIQypSbaYGiRfFioMNww1c_1DBMWHfs8dythI0TtBX-Bx8cxRFMarJDliDn5rzTbzda0Yb8ElECc9ucolHL4eqpMGdkcfr081kd3kM_1QaGE3Ooxvfu6_1LL8uhQfXgGh3EdfWksOx4qnt0DA0OSFC4W2G9sxTMHQU-B9cjyP-4A51IRY6JvT8Ui64Ahkc_1pTDHLLfighr32LK_1j31ij9IhdY-E3p11mZmJTz4DVqiWOcfb_1C2Y7w7D_1IG_1DT30XGD2E4KoByQFKp-AhudkV5CLKzmDJkxZUNA0cyzZOWw24wnoNm_1UGYr4-LKiX3ktIz7uoUn0VlWdGT0TVQeDjGpusKAtoJOpYBE1FAYZS88Npno_1UJTKfe-HwormvHKr1hnC9s5pZVYYxEaFiRCST6acLHJJS4kY_1qaolJ0HBzGw_1SY4jfTEcu3aBaSZlVvcErl_18cxIaBkZgdcfJ42mfMdozbKMhw2bBgrhJ5iRT9LRjRrS-2hV8LXClRSFGMiqvdP0k-L1PGKgWpJM2lNa5KUEOghECTDnTr4fdhD1RUnfQ4p8E-aHQPiefzvArUQ9tSn3T-KKD8PWPIvwsvunozDlD0Z5pVBt78pmgqsposk3nG2YIpWu0ZECWjBx4Qrg1t9Lg&gws_rd=ssl">

| TC | 1 | 2| 3 | 4 | 5 | 6 | KQ |
|----|---|--|---|---|---|---|----|
| 1 | T | T | F | F | F | F | T |
| 2 | T | F | F | F | F | F | F |
| 3 | F | T | F | F | F | F | F |
| 4 | T | T | T | T | T | T | - |
| 5 | T | F | F | T | F | F | - |
| 6 | T | F | T | F | F | F | - |
----
**Tổng quát áp dụng với trường hợp MCDC ta có 14 ca kiểm thử như sau:**
|   | condition1 | condition2 | s1=s2 | s2=s3 | s3=s1 | s3= Math.sqrt(s1*s1+s2*s2) | s2= Math.sqrt(s3*s3+s2*s2) | s1= Math.sqrt(s3*s3+s2*s2) | KQ |
|---|------------|------------|-------|-------|-------|----------------------------|----------------------------|----------------------------|----|
| 1 | T | F | - | - | - | - | - | - | -1 | 
| 2 | F | T | - | - | - | - | - | - | -1 | 
| 3 | T | T | - | - | - | - | - | - | -1 | 
| 4 | T | T | T | T | T | - | - | - |  2 | 
| 5 | T | T | T | F | F | F | F | F |  1 | 
| 6 | T | T | F | T | F | F | F | F |  1 | 
| 7 | T | T | F | F | T | F | F | F |  1 | 
| 8 | T | T | F | F | F | T | - | - |  4 | 
| 9 | T | T | F | F | F | - | T | - |  4 | 
| 10 | T | T | F | F | F | - | - | T | 4 | 
| 11 | T | T | T | F | F | T | - | - | 3 | 
| 12 | T | T | F | T | F | - | - | F | 3 | 
| 13 | T | T | F | F | T | - | T | - | 3 | 
| 14 | T | T | F | F | F | F | F | F | 5 | 
----
#Mức độ bao phủ của bài toán
<img src="https://www.google.com/search?tbs=sbi:AMhZZitUnGrlaPkBmQeR2GmuqRAqb-dsNPlURRUggOfR3p-XfA-FBzmFiE5VVbJsOXa2ne4EdGcQ2XTVWAG6onUtjZ-ogoOtroE66wrKiGlfiewb_1GdXLIoShxLG6ZO1sUQQO3QOYTG4ESkkZyl-kgOzRUw-hwMZuz56fYFw8jvplyQS-t7qrGh6QrQWWucVV2hTGlVP45Yorz6OX38PvFwKn06_104nBq2E7sJ4nLzz4EAXVWvs8sjsX91bQzP3SAnRhpcThxA7KlS-z3oUduY2u8FUcVgs7mOHA9mOvBw28i5_1EgxbWnmhVHMtCGeLkBW3Vj9Zes332Qbyz7sHLjm1BAvZFHUfbsmnVIsPxjuJP7q_1Dw_1GnoHW-fnaRn-QJVT-7O_1AytuGKz3RbIHDZitoCgXxdwLJAWTCbG8vzrELhhXSyCIOwEVphJncP1Y30phf--XtFx-iz2dJjHZ_14-1kr0NE7JPrz3aqTUEsJqcu8qQ2hGWJ8EEUq9dR9KaqpEwMY1l92mliX4Mx1RlsXLrftm4Ac4reSWPMPWt95b3ORv7COllvdqxlxV7DvLodjgrXRdqXXGoAo0BDrxLyq3FzNaXJjwlOX8yWk4SbeU940p6BZAvu6hKhKAVSRZF6l35_1WJrNtpETJimXIzNawMU7tM-RldnbARRkBwag8pDb38IFDZfhHpJbbJCNobHLcs73SC-HufCtFxpCksDEs6yXJl0YSRL5LnE7U3tWZoJ_1NgER53aRAmxxuThD3zIENIK8Tz3mETu7Gn7GL7Wm6mcbHzNeH-6hKlo890DhiQtRucNQsrnnHyN9ZosnMY25B30BcJ8qxpJs1tiBNYsxM_1w0We6U4F4rqe85ymo_1yuUMZTo_1R16umM75p6JPBYDO01yRbLwHl8xF1Mf9Ep6PiqQT3vPCKSGRhzpMGMwuKbM1fj-Gs5R1SsMygK4cvBSKOY09F4yI9iHtH_1Y4an8xZ54WP6hoXNcNIVOkaft6Wo9mfdoXxT6uhbUt68eNmoAre41EIEGeAivkLglr3pG7YQJCEE_1zjfkFEdKDgXaw03KjEVdNN5CEukRSWKYPXlMoRTjR49pvT558uSdybqg3uRakARsIQDIk0T6N1_1zOsVbZItPaxRU7Xf3Thq-pwA3T3iRRjXeCVlnQEbY2fWlKfozTLWn6oKwHivRCzfsXtj-dwBa_1yD2WwBzX-HJtgR7TczLz_1GJQB_18N501k2nR-r8-jWa14VrK1x3unz8t7p4rJExBjExC8RctGlnEvxVZ_1R1qocGZ2Vszty">