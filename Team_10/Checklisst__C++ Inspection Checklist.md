# C++ Inspection Checklist
bài viết được dịch từ: http://www.literateprogramming.com/Baldwin-inspect.pdf

## Nội dung
1. [Khai báo biến](#1-khai-báo-biến)
2. [Sử dụng dữ liệu](#2-sử-dụng-dữ-liệu)
3. [Khởi tạo](#3-khởi-tạo)
4. [Macros](#4-macros)
5. [Kích thước dữ liệu](#5-kích-thước-dữ-liệu)
6. [Cấp phát động](#6-cấp-phát-động)
7. [Con trỏ](#7-con-trỏ)
8. [Toán tử ép kiểu](#8-toán-tử-ép-kiểu)
9. [Tính toán](#9-tính-toán)
10. [Điều kiện](#10-điều-kiện)
11. [Luồng điều khiển](#11-luồng-điều-khiển)
12. [Phép gán](#12-phép-gán)
13. [Đối số](#13-đối-số)
14. [Giá trị trả về](#14-giá-trị-trả-về) 
15. [Gọi hàm](#15-gọi-hàm)
16. [Tệp tin](#16-tệp-tin)

## 1. Khai báo biến

### 1.1 Mảng
#### 1.1.1 Kích thước của mảng có phải là hằng số cố định hay không?
```c
int intarray[13];
```
nên là:
```c
int intarray[TOT_MONTHS+1];
```
#### 1.1.2 Kích thước của mảng có phải là tổng số phần tử trong mảng?
```c
char entry[TOTAL_ENTRIES];
```
nên là:
```c
char entry[LAST_ENTRY+1];
```

### 1.2 Hằng số
#### 1.2.1 Liệu giá trị của biến sẽ luôn cố định?
```c
int months_in_year = 12;
```
nên là:
```c
const unsigned months_in_year = 12;
```
#### 1.2.2 Hằng số được khai báo với cơ chế ```#define```?
```c
#define MAX_FILES 20;
```
nên là:
```c
const unsigned MAX_FILES = 20;
```
#### 1.2.3 Hằng số chỉ được sử dụng trong một (một số) lớp (class) hay không? Nếu có thì hằng số đó có phải là hằng số toàn cục hay không?
```c
const unsigned MAX_FOOS = 1000;
const unsigned MAX_FOO_BUFFERS = 40;
```
nên là:
```c
class foo {
    public:
        enum { MAX_INSTANCES = 1000; }
        ...
    private:
        enum { MAX_FOO_BUFFERS = 40; }
        ...
};
```
Nếu kích thước của các hằng số vượt int, một cơ chế khác có sẵn:
```c
    class bar {
        public:
            static const long MAX_INSTS;
            ...
    };
    
    const long bar::MAX_INSTS = 70000L;
```

### 1.3 Biến vô hướng
#### 1.3.1 Giá trị âm có làm cho biến trở nên vô nghĩa? Nếu có, biến có được đánh dấu chưa?
```c
int age;
```
nên là:
```c
unsigned int age;
```
đây là một lỗi rất dễ mắc phải.
#### 1.3.2 Mã kiểu ```char``` không được ```signed``` cũng không ```unsigned```
```c
typedef char SmallInt;
SmallInt mumble = 280; // WRONG on Borland C++ 3.1
                       // or MSC/C++ 7.0!
```
nên là:
```c
typedef unsigned char SmallUInt;
typedef signed char SmallInt;
```
#### 1.3.3 Chương trình có cần thiết sử dụng ```float``` hay ```double```?
```c
double acct_balance;
```
nên là:
```c
unsigned long acct_balance;
```
Nói chung, phụ thuộc vào mức độ và thời gian thực thi chương trình cần thiết, ta sẽ chọn kiểu dữ liệu cho các biến phù hợp

### 1.4 Lớp (class)
#### 1.4.1 Trong lớp có bất kì hàm ảo nào không? Nếu vậy hàm destructor có phải hàm ảo không?
Class có hàm ảo (virtual functions) thì luôn nên có destructor ảo. Đây là điều cần thiết vì có khả năng bạn sẽ giữ một đối tượng trong class với một con trỏ. Làm đảm bảo rằng các destructor ảo vẫn có thể chạy được khi bạn xóa các đối tượng thông qua con trỏ.
#### 1.4.2 Trong lớp (class) có những thứ sau hay không?
- Copy-constructor
- Assignment operator
- Destructor
Nếu vậy, thường thì sẽ cần cả 3 trong class (Có một vài ngoại lệ, ta có thể tìm được class chỉ có destructor mà không có 2 cái còn lại)

## 2. Sử dụng dữ liệu

### 2.1 Strings
#### 2.1.1 String có thể không phải là null-terminated? (null-terminated là string kết thúc với một kí tự '\0' mã ASCII là 0)
#### 2.1.2 Có phải đoạn code đang cố gắng sử dụng một hàm strxxx nào đó trên một mảng kí tự non-terminated - giống như nó là một String?

### 2.2 Bộ đệm (buffers)
#### 2.2.1 Luôn kiểm tra kích thước khi thêm vào bộ đệm?
#### 2.2.2 Có thể bộ đệm quá nhỏ để chứ hết các nội dung được thêm vào?
Ví dụ, một trong những chương trình đã không kiểm tra kích thước khi đọc dữ liệu vào một bộ đệm vì các dữ liệu chính xác sẽ luôn luôn phù hợp. Nhưng khi file đó đọc bị vô tình ghi đè với dữ liệu không chính xác, chương trình bị lỗi

### 2.3 Bitfields
#### 2.3.1 một bitfield có thực sự cần thiết cho ứng dụng này?
#### 2.3.2 Có thể phát sinh ra những vấn đề nào đó không?

## 3. Khởi tạo

### 3.1 Biến cục bộ
#### 3.1.1 Biến cục bộ đã được khai báo trước khi sử dụng?
#### 3.1.2 C++ tạo ra một biến cục bộ, rồi được gán sau đó?

### 3.2 Thiếu lúc tái khởi tạo
#### 3.2.1 Một biến có thể mang một giá trị khác trước vòng lặp tiếp theo bắt đầu
Giả sử việc xử lý một phần tử dữ liệu trong một chuỗi gây nên một biến được thiết lập.
Ví dụ, một tập tin có thể được đọc, và một số biến toàn cục khởi tạo cho tập tin đó. Liệu những toàn cục có thể được sử dụng cho các tập tin tiếp theo trong chuỗi mà không được khởi tạo lại hay không??

## 4. Macros

### 4.1 Nếu tham số chính thức của một Macro được đánh giá nhiều hơn một lần, liệu răng macro đó đã từng được mở rộng với những kết quả phụ khác hay chưa?
ví du:
```c
#define max(a,b) ( (a) > (b) ? (a) : (b) )
max(i++, j);
```

### 4.2 Nếu một macro không được đóng ngoặc đơn hoàn toàn, có bao giờ nó được áp dụng trong một cách nào đó và gây nên kết quả bất ngờ?
```c
#define max(a, b) (a) > (b) ? (a) : (b)
result = max(i, j) + 3;
```
sẽ mở rộng thành:
```c
result = (i) > (j) ? (i) : (j)+3;
```

### 4.3 Nếu biểu thức macro không được đặt trong dấu ngoặc, liệu có kết quả không mong đợi nào sẽ xảy ra không?
```c
#define IsXBitSet(var) (var && bitmask)
result = IsXBitSet( i || j );
```
mở rộng thành:
```c
result = (i || j && bitmask); // not what expected!

```
cú pháp đúng:
```c
#define IsXBitSet(var) ((var) && (bitmask))
```

## 5. Kích thước dữ liệu

### 5.1 Trong một hàm gọi tới các đối số cho một bộ đệm và kích thước của nó, kích thước của tham số có khác nhau từ bộ đệm?
ví dụ: 
```c
memset(buffer1, 0, sizeof(buffer2)); // danger!
```
Đây không phải luôn luôn là một lỗi nhưng nó là một nguy cơ thực tế. Mỗi trường hợp cần được xác nhận là (a) cần thiết, và (b) chính xác, và sau đó comment code như trên.

### 5.2 Kiểu dữ liệu cho đối số không đúng?
lỗi thường gặp:
```c
sizeof(ptr) instead of sizeof(*ptr)
sizeof(*array) instead of sizeof(array)
sizeof(array) instead of sizeof(array[0])
```

## 6. Cấp phát động

### 6.1 Cấp phát dữ liệu
#### 6.1.1 Không gian được cấp phát có quá nhỏ không?
#### 6.1.2 Mã cấp phát bộ nhớ và sau đó giả định có ai đó xóa nó?
Đây không phải là luôn luôn là một lỗi, nhưng luôn luôn phải được ghi rõ ràng, cùng với lý do để thực hiện theo cách này. Constructor cấp phát, kết hợp với destructor mà hủy cấp phát, là một ngoại lệ rõ ràng, kể từ khi một đối tượng duy nhất có kiểm soát dữ liệu các class.
#### 6.1.3 ```malloc()```, ```calloc()```, hay ```realloc()``` có nên sử dụng để thay thế cho ```new```?
Các hàm cấp phát trong thư viện chuẩn của C không nên sử dụng trong C++ vì C++ cung cấp 1 toán tử cấp phát (new).

### 6.2 Giải phóng cấp phát dữ liệu
#### 6.2.1 Mảng có bị xóa như thể chúng vô hướng?
```c
delete myCharArray;
```
nên là:
```c
delete [] myCharArray;
```
#### 6.2.2 Liệu các lưu trữ đã bị xóa vẫn có con trỏ để nó?
Đó là khuyến cáo rằng con trỏ được thiết lập để NULL xóa, hoặc đến một giá trị an toàn có nghĩa là "chưa được khởi tạo." Điều này là không cần thiết và cũng không khuyến nghị trong hàm destructor, vì biến con trỏ chính nó sẽ không còn tồn tại khi thoát khỏi chương trình.
#### 6.2.3 Bạn có đang xóa dữ liệu đã bị xóa?
Điều này là không thể nếu code phù hợp với 6.2.2. Các quy định tiêu chuẩn C ++ xác định rằng luôn luôn an toàn để xóa một con trỏ NULL, do đó nó không cần thiết để kiểm tra các giá trị đó.

## 7. Con trỏ

### 7.1 Khi lấy nội dung địa chỉ, con trỏ có thể bị NULL?

### 7.2 Khi sao chép giá trị của một con trỏ, nó có nên cấp phát thay thế một bản sao của những gì mà con trỏ đầu tiên trỏ đến?

## 8. Toán tử ép kiểu

### 8.1 Ép kiểu (cast) có bị NULL khi thông qua một đối số của hàm?

### 8.2 Liệu đoạn code có dựa trên một sự chuyển kiểu ngầm không?
C++ khá dễ dàng khi đối số thông qua hàm, nếu không có hàm nào được tìm thấy tương ứng với loại đối số được cung cấp, nó sẽ áp dụng một quy tắc chuyển đổi kiểu dữ liệu nào đó để tìm lại, điều này sẽ giúp tiết kiệm toán tử ép kiểu nếu không thực sự cần thiết.
Nhưng nếu có nhiều hơn phù hợp sau khi dữ liệu được chuyển đối, nó sẽ gây ra lỗi, và tệ hơn nữa nó sẽ khiến các phần đã thực hiện trước đó bị lỗi và break.

## 9. Tính toán

### 9.1 Khi kiểm tra giá trị của 1 phép gán hay 1 phép tính toán, liệu biểu thức trong dấu ngoặc có sai gì k?
```c
if ( a = function() == 0 )
```
nên là:
```c
if ( (a = function()) == 0 )
```

### 9.2 Có thể giá trị đồng bộ nào đó chưa được cập nhật?
Đôi khi, một nhóm các biến phải được cùng sửa đổi (modified) như một nhóm để hoàn thành một giao dịch đơn lẻ. Nếu tất cả không xảy ra cùng 1 nơi, liệu có thể đảm bảo rằng tất cả các biến trong nhóm đã được cập nhật nếu có 1 giá trị trong đó có thay đổi. Hay tất cả các bản cập nhật đều đã xảy ra trước khi biến đó được kiểm tra hoặc sử dụng?

## 10. Điều kiện

### 10.1 Kiểm tra điều kiện sử dụng chính xác hay không?
```c
if ( someVar == 0.1 )
```
có thể đánh giá không bao giờ đúng. Hằng số 0,1 biểu diễn không chính xác bởi bất kỳ một cơ số và số mũ nhị phân hữu hạn nào,do đó trình biên dịch phải làm tròn đến một số khác số. Tính toán liên quan đến nhiều biến có thể không bao giờ dẫn đến giá trị
Giải pháp: sử dụng >, >=, <, hoặc <=, tùy thuộc vào hướng bạn muốn biến ràng buộc..

### 10.2 Giá trị nguyên dương thử ngiệm có lớn hơn hay bằng số không không?
```c
if ( myUnsignedVar >= 0 )
```
sẽ luôn có giá trị đúng.

### 10.3 Kiểm tra biến khai báo với giá trị không (0) hoặc một hằng số khác?
```c
if ( mySignedVar ) // không hoàn toàn tốt
if ( mySignedVar >= 0 ) // có thể sẽ tốt hơn
if ( mySignedVar <= 0 ) // như trên
```
Nếu biến được cập nhật bởi bất kì cách nào đó mà không phải phép ++ hay --, thì nó có thể làm mất hoàn toàn giá trị của hằng số kiểm thử. Điều này có thể sẽ gây ra những lỗi lớn trong điều kiện thực thi code mà chúng ta chưa có sự chuẩn bị.

### 10.4 Nếu kiểm tra thấy lỗi, có chăng "trường hợp lỗi" thực ra lại là đúng ở những trường hợp khác?

## 11. Luồng điều khiển

### 11.1 Điều khiển các biến
#### 11.1.1 Có phải giới hạn dưới là một giới hạn độc nhất?
#### 11.1.2 Có phải giới hạn trên là bao gồm các giới hạn?
Bởi ta luôn sử dụng các giới hạn dưới và một giới hạn trên, một lỗi toàn thể class của off-by-one bị loại bỏ. Hơn nữa, luôn có:
-	Kích thước khoảng giữa hai giới hạn
-	Giới hạn là bằng nhau nếu kích thước bằng không.
-	Giới hạn trên không bao giờ nhỏ hơn giới hạn dưới.

Ví dụ: thay vì nói x >= 23 và x <=42, ta sử dụng x>= 23 và x < 43

### 11.2 Biểu thức điều kiện
#### 11.2.1 Trong biểu thức ```switch``` có trường hợp nào không dừng lại với lệnh ```break``` không?
Khi một số trường hợp được đi kèm cùng một khối mã, chúng có thể bị "chồng"
với nhau và mã kết thúc với một break duy nhất. Các trường hợp cũng có thể thoát ra bằng cách ```return```
#### 11.2.2 Câu lệnh ```switch``` đã có nhánh mặc định hay chưa?
Kể cả trong trường hợp không xảy ra giá trị mặc định, thì cũng luôn phải có nhánh xử lí trường hợp đó.
#### 11.2.3 Có thể dùng ```boolean``` để kết thúc một vòng lặp
Ta cũng có thể xem xét lệnh ```break```, như vậy đoạn mã (code) sẽ trở nên đơn giản hơn.
#### 11.2.4 Vòng lặp có chứa biểu thức để tiếp diễn vòng lặp hay không?


## 12. Phép gán

### 12.1 Toán tử gán
#### 12.1.1 ```a+=b``` có khác ```a=a+b``` không ?
Người lập trình viên không (bao giờ) nên thay đổi ngữ nghĩa của các mối quan hệ giữa các toán tử. ví dụ , câu lệnh trên có ngữ nghĩa giống nhau cho các kiểu dữ liệu bên trong  (mặc dù code được tạo khác nhau). Vì vậy, khi định nghĩa lớp, chúng nên có ngữ nghĩa giống nhau, cho dù chúng có thể được cài đặt khác nhau (+= chắc sẽ hiệu quả hơn).
#### 12.1.2 Là đối số cho 1 constructor bản sao hay là toán tử gán cho non-const?
#### 12.1.3 Toán tử gán có bị lỗi trong phép tự gán?
Cú pháp toán tử =() nên bắt đầu như sau:
```c
if ( this == &right_hand_arg ) return *this;
```
#### 12.1.4 Toán tử gán có trả về cái gì đó chứ không phải tham chiếu const tới biến this?
```c
a = b = c;
```
```c
(a = b) = c;
```

### 12.2 Cách sử dụng phép gán.
#### 12.2.1 Phép gán này có thể được thay thế bởi 1 sự khởi tạo hay không ?
#### 12.2.2 Có sự không phù hợp nào giữa các đơn vị của các biểu thức và các biến không?
Ví dụ, bạn có thể tính toán số lượng bytes của 1 mảng với số các phần tử được yêu cầu. nếu các phần tử lớn (long hay struct!), bạn sẽ muốn sử dụng quá nhiều bộ nhớ.

## 13. Đối số

### 13.1 Kiểu của đối số được thông qua bởi giá trị
ví dụ: 
```c
Foo& do_something( Foo anotherFoo, Bar someThing );
```
nên làm như sau:
```c
Foo& do_something( const Foo& anotherFoo, const Bar& someThing );
```

## 14. Giá trị trả về

### 14.1 Giả trị trả về lúc gọi hàm được lưu ở một biến quá nhỏ?

### 14.2 Một hàm thành viên trả về tham chiếu không phải là hằng (non-cosnt) hoặc con trỏ đến dữ liệu thành viên?

### 14.3 Có một hàm thành viên nào trả về một tham chiếu không phải là hằng (non-cosnt) hoặc con trỏ đến dữ liệu bên ngoài đối tượng?
Đây là phép cấp các dữ liệu đã được dự định để được chia sẻ.

### 14.4 Có toán tử nào trả về một tham chiếu khi nó cần trả lại một đối tượng hay không?

### 14.5 Có đối tượng nào được trả về là giá trị thay vì tham chiếu?

## 15. Gọi hàm

### 15.1 Biến của hàm: args (printf và những hàm khác…)
#### 15.1.1 Có phải đối số tập tin (file) là fprintf bị bỏ qua? (điều này xảy ra thường xuyên)
#### 15.1.2 Đây có phải là đối số bổ sung?
#### 15.1.3 Liệu các kiểu thông số có phù hợp với chuyển đổi trong định dạng chuỗi (```string```)? (```printf``` và ```friends```)
Kiểu duyệt không xảy ra được của hàm với biến độ dài danh sách.
Cho ví dụ, một người dùng đã ngạc nhiên để về việc nhìn thấy giá trị vô lý khi theo dõi đoạn code đã chạy:
```c
	printf(" %d %ld \n", a_long_int, another_long_int);
```
Trên hệ thống cụ thể, kiểu int và long có sự khác biệt về kích thước (lần lượt là 2 và 4 bytes). Hàm printf() chịu trách nhiệm truy cập ngăn xếp thủ công ; Để ý thấy rằng “%d” chiếm lấy 2 bytes (một lần kiểu int) và  “%ld” chiếm 4 bytes(một lần kiểu long). Giá trị thứ 2 được in là MSW của a_long_int, và kết hợp ta có của a_long_int làLSW và another_long_int là MSW.
Giải pháp: đảm bảo kiểu phù hợp. Nếu cần thiết, có thể làm kích thước đối số nhỏ hơn (long thành int) nếu tác giả đảm bảo kiểu nhỏ hơn bao phủ toàn bộ giá trị có thể có.

### 15.2 Các hàm chung
#### 15.2.1 Liệu đây có phải hàm đúng? Vậy, có nên làm khác biệt cách gọi hàm? (ví dụ: nên gọi ```strchr``` thay vì là ```strrchr```?)
#### 15.2.2 Hàm này có thể vi phạm điều kiện tiên quyết của lời gọi hàm không?

## 16. Tệp tin

### 16.1 Tên tập tin là duy nhất?
Có vẻ bất ngờ, nhưng đây là 1 lỗi phổ biến

### 16.2 Con trỏ tập tin tải sử dụng mà chưa đóng tập tin trước đó?
```c
fp = fopen(...);
fp = fopen(...);
```

### 16.3 Tập tin không được đóng lại trong trường hợp lỗi trả về?
