# Google JavaScript Style Guide
Bài viết được dịch từ: https://google.github.io/styleguide/jsguide.html

## Mục lục


* 1. Giới thiệu
  * 1.1	Chú thích thuật ngữ
  * 1.2	Chú thích hướng dẫn
* 2.	Tập tin mã nguồn cơ bản
  * 2.1	Tên thư mục
  * 2.2	Mã hoá thư mục: UTF – 8
  * 2.3	Các kí tự đặc biệt
* 3.	Cấu trúc tập tin
  * 3.1	Giấy phép hoặc bản quyền thông tin (Nếu có)
  * 3.2	@fileoverview JSDoc (Nếu có)
  * 3.3	Câu lệnh goog.module
  * 3.4	Các câu lệnh goog.require
  * 3.5	Hệ thống xử lí tập tin
* 4.	Định dạng
  * 4.1	Các dấu ngoặc
  * 4.2	Lùi dòng: +2 khoảng cách
  * 4.3	Các câu lệnh
  * 4.4	 Giới hạn cột: 80
  * 4.5	Xuống dòng
  * 4.6	Khoảng trắng
  * 4.7	Nhóm dấu ngoặc đơn: Khuyến cáo
  * 4.8	Các Bình Luận
* 5.	Các đặc trưng ngôn ngữ
  * 5.1	Khai báo biến cục bộ
  * 5.2	Mảng kí tự
  * 5.3	Đối tượng kí tự
  * 5.4	Các lớp
  * 5.5	Các Hàm
  * 5.6	Chuỗi kí tự
  * 5.7	Số kí tự
  * 5.8	Cấu trúc điều khiển
  * 5.9	This
  * 5.10	Tính năng không cho phép
* 6.	Đặt tên
  * 6.1	Quy định chung cho tất cả định danh
  * 6.2	Quy định theo loại định danh
  * 6.3	Camel Case: Được xác định

## 1.	Giới thiệu

Tài liệu này phục vụ như định nghĩa hoàn chỉnh các tiêu chuẩn mã hoá của Google cho mã nguồn trong ngôn ngữ lập trình Java Script. Một tập tin mã nguồn JavaScript được mô tả như Google Style khi và chỉ khi nó tuân thủ những quy tắc trong tài liệu này.

Giống như những hướng dẫn phong cách lập trình khác, các vấn đề bao quát không chỉ là vấn đề thẩm mĩ định dạng mà còn nằm ở quy ước và tiêu chuẩn mã hoá. Tuy nhiên, tài liệu này tập trung chủ yếu vào các tiêu chuẩn bất di bất dịch mà chúng ta theo đuổi ở bậc đại học và tránh đưa ra những lời tư vấn không rõ ràng hoặc không thực thi (dù là con người hay công cụ).
### 1.1	Thuật ngữ chú thích

Trong tài liệu này, trừ trường hợp làm rõ, ta quy ước:

-	Những thuật ngữ chú thích luôn để cập tới sự bổ sung chú thích. Chúng tôi không sử dụng những chú thích cụm từ tham khảo, thay vì sử dụng thuật ngữ chung “JSDoc” cho cả chú thích văn bản thô lẫn thuật ngữ máy tính trong /**… */.

-	Hướng dẫn Style này sử dụng thuật ngữ RFC 2119 khi sử dụng các cụm từ phải, không được, nên, không nên và có thể. Các thuật ngữ ưa thích và cần tránh tương ứng lần lượt với nên và không nên. Các câu lệnh khai báo không điều kiện là quy tắc phải được thoả mãn.

-	Các ghi chú khác sẽ thỉnh thoảng được xuất hiện trong tài liệu

### 1.2	Hướng dẫn chú thích

Code ví dụ trong tài liệu này là không quy chuẩn. Đó trong các ví dụ thuộc Google Style, chúng có thể không minh hoạ kiểu cách duy nhất để biểu diễn code. Các lựa chọn định dạng không bắt buộc thực hiện trong ví dụ không được thực thi như các quy tắc.

## 2.	Tập tin mã nguồn cơ bản

### 2.1	Tên tập tin

Tên tập tin phải chứa các kí tự thường và có thể chứa dấu gạch dưới (_) hoặc gạch ngang (-) nhưng không có dấm chấm câu thêm vào. Thực hiện theo các quy ước mà project của bạn sẽ sử dụng. Đuôi File phải chứa .js.

### 2.2	Mã hoá File: UTF -8 

Tập tin mã nguồn được mã hoá trên UTF-8

### 2.3	Kí tự đặc biệt

#### 2.3.1	Kí tự khoảng trắng

Bên cạnh các chuỗi nhiều dòng kết thúc, các kí tự ASCII theo chiều ngang (0x20) chỉ là các kí tự khoảng trắng xuất hiện bất cứ nơi đâu trong file nguồn. Điều này có ý nghĩa rằng:

-	Tất cả các ký tự khoảng trắng khác trong chuỗi sẽ bị biến mất.

-	Kí tự Tab không được sử dụng để thụt đầu dòng.

### 2.3.2	Các kí tự dừng đặc biệt

Đối với bất cứ kí tự nào nằm trong nhóm kí tự dừng (\, \”, \\, \ b, \ f \ n, \ r, \ t \ v), chuỗi được sử dụng hơn là thuộc số … (e.g \x0a, \u000a, or \u{a}). Những kí tự dừng bát phân không bao giờ được sử dụng.

### 2.3.3	Kí tự không thuộc mã ASCII

Đối với các kĩ tự không phải ASCII còn lại, hoặc là kí tự Unicode có thực (Ví dụ ∞) hoặc kí tự hex tương đương hoặc kí tự Unicode dừng (ví dụ \ u221e) được sử dụng, chúng chỉ tuỳ thuộc vào mục đích để làm code dễ hiểu và dễ học hơn.

Mẹo: Trong các kí tự Unicode dừng, và đôi khi ngay cả các kí tự Unicode thực được sử dụng, một chú thích có thể rất hữu ích.

 
Mẹo: Đừng bao giờ làm Code của bạn dễ đọc hơn bởi đơn giản một số chương trình có thể xử lí mã phi ASCII chuẩn xác. Nếu điều đó xảy ra, chương trình sẽ bị lỗi và phải chỉnh sửa.

## 3.	Cấu trúc tập tin nguồn

Một tập tin nguồn bao gồm những yếu tố theo thứ tự sau:
1.	Giấy phép hoặc bản quyền thông tin (Nếu có)
2.	@fileoverview JSDoc (Nếu có)
3.	Một câu lệnh goog.module
4.	Các câu lệnh Goog.require 
5.	Hệ thống xử lí file

Mỗi phần có thể được tách bằng một dòng khoảng trống, ngoại trừ hệ thống xử lí file, chúng có thể có 1 hoặc 2 khoảng trống.

### 3.1	Giấy phép hoặc bản quyền thông tin (Nếu có)

Nếu giấy phép hoặc bản quyền thông tin thuộc về file, chúng sẽ thuộc về đây.

### 3.2	@fileoverview JSDoc (Nếu có)

Đọc 7.5 (Chú giải 5 cấp độ đầu) để hiểu rõ nội dung quy tắc.

### 3.3	Một câu lệnh goog.module

Tất cả các tập tin phải khai báo chính xác một tên goog.module ở trên dòng đơn duy nhất: các dòng chứa khai báo goog.module phải không được xuống dòng và đo đó có một ngoại lệ với giới hạn 80 kí tự trên 1 cột.
Ví dụ:

```javascript
goog.module('my.test.helpers');
goog.module.declareLegacyNamespace();
goog.setTestOnly();
```



#### 3.3.1	goog.module.declareLegacyNamespace

goog.module.declareLegacyNamespace tồn tại để dễ dàng chuyển đổi tên miền không gian truyền thống nhưng đi kèm với một số hạn chế khi đặt tên. Như tên của Module con phải được tạo sau parent namespace, tên này không phải là tên con hoặc tên cha goog.module (Ví dụ goog.module('parent'); và goog.module(‘parent.child'); không thể tồn tại cả hai, cũng không thể tồn tại goog.module('parent'); và goog.module('parent.child.grandchild');).

#### 3.3.2	Những Module ES6

Không sử dụng những Module ES6 (chính xác là từ khoá nhập và xuất) như các ngữ nghĩa nếu chưa được hoàn thành trước đó. Lưu ý rằng chính sách này sẽ được xem xét lại ngữ nghĩa một lần như tiêu chuẩn đầy đủ.

### 3.4	Các câu lênh goog.require

Lệnh nhập được thực thi với các câu lệnh goog.require, được nhóm lại với nhau ngay lập tức thông qua khai báo module. Mỗi goog.require được gán cho một biệt hiệu không đổi duy nhất hoặc cấu trúc phá huỷ khác thành vài biệt hiệu không đổi. Những biệt hiệu là cách duy nhất để hướng tới phụ thuộc yêu cầu, dù ở trong code hoặc các chú thích khác: Thên đầy đủ không bao giờ sử dụng ngoại trừ đối số tới google.require. 

Nếu một Module chỉ được thêm vào cho các thành phần phụ của nó, việc chuyển đổi có thể bỏ qua nhưng tên đầy đủ có thể không xuất hiện bất cứ nơi nào trong File. Tên biệt hiệu phải phù hợp với thành phần dấu chấm độc lập cuối cùng của module được thêm vào khi có thể, mặc dù thành phần bổ sung có thể chứa đựng (với các lớp vỏ phù hợp mà lớp vỏ của biệt hiệu vẫn xác định chính xác loại của nó) nếu cần thiết để làm thành ngữ nghĩa, hoặc nếu nó cải thiện khả năng đọc một cách đáng kể. Câu lệnh goog.require có thể không xuất hiện bất cứ nơi nào trong tập tin.

Các dòng được sắp xếp thông qua thứ tự ASCII chuẩn của toàn bộ dòng, với chữ hoa, sau đó tới chữ thường, sau đó đến dấu ngoặc mở. Các biệt hiệu trong một biểu thức huỷ đều được sắp xếp theo cùng một cách.

Mẹo: Không cần ghi nhớ thứ tự này và thực thi chúng bằng tay. Bạn có thể dựa vào IDE hoặc thậm chí sép xếp nhập một cách tự động.
Nếu một bí danh hoặc tên module dài sẽ khiến một dòng vượt quá giới hạn 80 cột, nó không được bao bọc: dòng goog.require là một ngoại lệ đối với giới hạn 80 cột.
Ví dụ:

```javascript
const MyClass = goog.require('some.package.MyClass');
const NsMyClass = goog.require('other.ns.MyClass');
const googAsserts = goog.require('goog.asserts');
const testingAsserts = goog.require('goog.testing.asserts');
const than80columns = goog.require('pretend.this.is.longer.than80columns');
const {clear, forEach, map} = goog.require('goog.array');
```

Trường hợp vi phạm

```javascript
const randomName = goog.require('something.else'); // name must match

const {clear, forEach, map} = // don't break lines
    goog.require('goog.array');

function someFunction() {
  const alias = goog.require('my.long.name.alias'); // must be at top level
  // …
}
```

  
### 3.5	Hoàn tất một tập tin

Sự thực thi thực theo sau thông tin lệ thuộc được khai báo cách nhau ít nhất một dòng trống. Nó có thể bao gồm rất nhiều khai báo module toàn cục (Hằng, biến, lớp, hàm,…) như các biểu tượng xuất.

## 4.	Định dạng

Thuật ngữ ghi chú: Cấu trúc khối tương đồng (Block-like) đề cập tới thân của một lớp, hàm, phương pháp hoặc khối ngoặc phân định của code. Lưu ý rằng, bởi Mảng kí tự 5.2 và đối tượng kí tự 5.3, các mảng hoặc các đối tượng kí tự có thể được không bắt buộc để xử lí nếu nó là cấu trúc Block-like.
Mẹo: Sử dụng Clang- Format. Cộng đồng JavaScript đã nỗ lực đầu tư để đảm bảo Clang-Format

### 4.1	Dấu Ngoặc

#### 4.1.1	Dấu Ngoặc được sử dụng cho những cấu trúc điều khiển

Những dấu ngoặc cần thiết cho tất cả các cấu trúc điều khiển (if, else, for, do, while,…) kể cả trong thân chỉ chưa đúng 1 câu lệnh duy nhất. Câu lệnh đầu tiên của khối lệnh khác rỗng phải bắt đầu bằng dấu ngoặc. 

Trường hợp vi phạm
```javascripts
if (someVeryLongCondition())
  doSomething();

for (let i = 0; i < foo.length; i++) bar(foo[i]);
```

 
Ngoại lệ: Thông thường nếu câu lệnh có thể phù hợp trên một dòng duy nhất không đóng, chúng có thể không cần dấu ngoặc để cải thiện khả năng đọc. Đây là trường hợp duy nhất cấu trúc điều khiển bỏ qua dấu ngoặc để xuống dòng.
 
```javascript
if (shortCondition()) return;
```


#### 4.1.2	Chuẩn K&R style của khối lệnh khác rỗng

Các dấu ngoặc theo Kernighan và Richie style (“Egyptian brackets) cho khối lệnh không rỗng và khối lệnh tương đồng được xây dựng:

-	Không có xuống dòng trước dấu ngoặc mở đầu
-	Xuống dòng sau khi sử dụng dấu ngoặc mở
-	Xuống dòng sau khi sử dụng dấu ngoặc đóng
-	Xuống dòng trước khi sử dụng dấu ngoặc đóng nếu dấu ngoặc chấm dứt một câu lệnh hoặc thân hàm hoặc câu lệnh Class hoặc một Class. Đặc biệt, không xuống dòng sau dấu ngoặc nếu đằng sau nó có: else, catch, while, hoặc dấu phẩy, dấu chấm phẩy hoặc dấu ngoặc phải.

Ví dụ:

```javascript
class InnerClass {
  constructor() {}

  /** @param {number} foo */
  method(foo) {
    if (condition(foo)) {
      try {
        // Note: this might fail.
        something();
      } catch (err) {
        recover();
      }
    }
  }
}
```
 
#### 4.1.3: Rút gọn khối lệnh rỗng

Một khối lệnh rỗng hoặc cấu trúc Block-like  có thể đóng ngay lập tức sau khi mở với không có kí tự, khoảng trắng hoặc ngắt dòng (như {}), trừ khi nó là một phần của câu lệnh đa khối (nhiều khối lệnh).

Ví dụ:

```javascript
function doNothing() {}
```

Trường hợp vi phạm:

```javascript
if (condition) {
  // …
} else if (otherCondition) {} else {
  // …
}

try {
  // …
} catch (e) {}
```


 
### 4.2: Lùi đầu dòng khối lệnh: + 2 khoảng trắng

Mỗi lần mỗi khối lệnh hoặc cấu trúc Block-like được mở, các dòng thụt lùi bởi 2 khoảng trắng. Khi khối lệnh kết thúc, sự thụt đầu dòng trở về với mức thụt trước. Các cấp độ thụt đầu dòng áp dụng cho cả mã và chú thích trong suốt khối lệnh.

#### 4.2.1 Mảng kí tự: Block-like không bắt buộc

Bất kì mảng kí tự nào đều có thể không bắt buộc định dạng nếu chung là cấu trúc Block-like. Ví dụ, tất cả các mảng sau đây đều hợp lệ. 

```javascript
const a = [
  0, 1, 2,
];

const b =
    [0, 1, 2];
```

```javascript
const c = [0, 1, 2];

someMethod(foo, [
  0,
  1,
  2,
], bar);
```

 
#### 4.2.2 Đối tượng kí tự đơn: Block-like không bắt buộc

Bất cứ đối tượng kí tự đơn có thể không bắt buộc nếu chung là cấu trúc Block-like. Ví dụ như: 

```javascript
const a = {
  a: 0, b: 1
};

const b =
    {a: 0, b: 1};
```

```javascript
const c = {a: 0, b: 1};

someMethod(foo, {
  a: 0,
  b: 1,
}, bar);
```


#### 4.2.3 Lớp kí tự đơn

Lớp kí tự đơn (Dù khai báo hay là biểu thức) được thụt vào như một khối. Không được dùng dấu phẩy sau những phương thức hoặc một dấu chấm phẩy sau khi đóng ngoặc của khai báo lớp.

Ví dụ:

```javascript
class Foo {
  constructor() {
    /** @type {number} */
    this.x = 42;
  }

  /** @return {number} */
  method() {
    return this.x;
  }
}
Foo.Empty = class {};
```

```javascript
foo.Bar = class extends Foo {
  /** @override */
  method() {
    return super.method() / 2;
  }
};

/** @interface */
class Frobnicator {
  /** @param {string} message */
  frobnicate(message) {}
}
```


#### 4.2.4 Biểu thức hàm

Khi khai báo hàm ẩn danh trong danh sách các đối số của một hàm gọi, thân của hàm được thụt hơn 2 khoảng trống so với sự thụt đầu dòng trước.
```javascript
prefix.something.reallyLongFunctionName('whatever', (a1, a2) => {
  // Indent the function body +2 relative to indentation depth
  // of the 'prefix' statement one line above.
  if (a1.equals(a2)) {
    someOtherLongFunctionName(a1);
  } else {
    andNowForSomethingCompletelyDifferent(a2.parrot);
  }
});

some.reallyLongFunctionCall(arg1, arg2, arg3)
    .thatsWrapped()
    .then((result) => {
      // Indent the function body +2 relative to the indentation depth
      // of the '.then()' call.
      if (result) {
        result.use();
      }
    });
```

 
#### 4.2.5 Câu lệnh Switch

Như bất kì khối lệnh khác, nội dung của khối lệnh Switch được thụt đầu dòng + 2 khoảng trắng.
Sau một lệnh Switch, một dòng mới xuất hiện, thụt đầu dòng thêm 2 khoảng trắng, chuẩn chỉnh như một khối lệnh mở ra. Một khối lệnh rõ ràng có thể được sử dụng nếu được yêu cầu bằng xác định phạm vi từ vựng (Lexical Scoping). Câu lệnh Switch trả về những dòng lệnh thụt đầu dòng trước, cho đến khi kết thúc. 
Một dòng trống là không bắt buộc giữa câu lệnh Break và case trước đó.
Ví dụ:

```javascript
switch (animal) {
  case Animal.BANDERSNATCH:
    handleBandersnatch();
    break;

  case Animal.JABBERWOCK:
    handleJabberwock();
    break;

  default:
    throw new Error('Unknown animal');
}
```

### 4.3	Các câu lệnh

#### 4.3.1 Một câu lệnh trên một dòng

Mỗi câu lệnh được kết thúc và nối tiếp sau khi xuống dòng.

#### 4.3.2 Phải có dấu chấm phẩy

Mỗi câu lệnh phải kết thúc bằng dấu chấm phẩy. 

### 4.4	Giới hạn số lượng kí tự trong cột: 80

Code JavaScript tối đa số lượng kí tự trong cột là 80. Ngoại trừ các lưu ý dưới đây, bất cứ những dòng nào vượt qua giới hạn này phải được xuống dòng, giống như mục 4.5 dưới đây.

### 4.5	Xuống dòng

Ghi chú thuật ngữ: Xuống dòng được định nghĩa là bẻ vỡ một biểu thức đơn thành nhiều dòng.
Không có công thức hay quy tắc nào cho việc xuống dòng, tuy nhiên vẫn có một số quy ước chính xác nhất định dành cho công việc xuống dòng.
Lưu ý: Trong khi các nguyên nhân điển hình cho xuống dòng để tránh hiện tượng tràn giới hạn cột, thậm chí code có thể phù hợp với giới hạn cột cho xuống dòng.

### 4.5.1	Khi nào thì xuống dòng
Nhiệm vụ chính của xuống dòng là luôn dừng ở mức độ cú pháp cao hơn.

-	Khi một dòng được kết thúc bởi toán tử break thông qua các dấu hiệu. Điều này không áp dụng với dấu chấm (.) bởi nó không phải là toán tử.
-	Tên một phương thức hoặc constructor được gắn liền với dấu mở ngoặc (() theo trước nó.
-	Một dấu (,) gắn liền với các mã thông báo trước đó.

Hợp lệ
```javascript
this.foo =
    foo(
        firstArg,
        1 + someLongFunctionName());
```

Không hợp lệ

```javascript
this.foo = foo(firstArg, 1 +
    someLongFunctionName());
```

### 4.5.2	Các khối tiếp theo tăng ít nhất 4 khoảng trắng

Khi xuống dòng, mỗi dòng từ chữ cái đầu tiên được thụt vào ít nhất 4 khoảng trắng so với dòng gốc chuẩn, trừ khi nó rơi vào quy tắc thụt đầu dòng như đã đền cập trên đây.
Khi có nhiều dòng tiếp nối nhau, thụt đầu dòng có thể vượt quá 4 nếu hợp lí. Tóm lại, dòng tiếp tục được thụt lùi với cấp số nhân của 4, trừ khi 2 dòng code có giá trị tương đương nhau thì chúng ngang dòng với nhau.

### 4.6	Khoảng Trắng

#### 4.6.1	Khoảng trắng theo chiều dọc

Một dòng trông duy nhất sẽ xuất hiện khi:

-	Giữa nhiều phương thức liên tiếp nhau trong một lớp hoặc đối tượng đơn.
+ Ngoại lệ: Một khoảng trống giữa hai định nghĩa các thuộc tính trong thuộc tính đơn (Không có code giữa chúng) là tùy chọn. Dòng này được sử dụng khi cần thiết để tạo sự logic giữa nhóm của các trường.
-	Bên trong các phương thức, một cách đơn giản để tạo ra sự logic giữa các câu lệnh. Dòng bỏ trống giữa dòng đầu và dòng cuối trong một hàm là không được phép. 
-	Có thể tùy chọn có hoặc không giữa đầu hoặc cuối của một phương thức trong một lớp hoặc các đối tượng đơn.
-	Nếu được yêu cầu bởi các Section khác trong thư mục(Ví dụ như 3.4 goog.require statements)

#### 4.6.2	Khoảng trắng theo chiều ngang

Sử dụng khoảng trắng theo chiều ngang phụ thuộc vào vị trí và thường được chia thành 3 loại lớn: phần đầu (Bắt đầu một dòng), phần sau (Phần cuối một dòng) và phần thân. Khoảng trắng phía đầu (Tức thụt đầu dòng) được gửi ở một nơi khác. Khoảng trắng phần thân tuyệt đối bị cấm.

Vượt qua những yêu cầu của ngôn ngữ cũng như các quy tắc style khác, khoảng trắng giữa các chữ cái, chú thích, JSDoc, không gian nội bộ đơn ASCII được xuất hiện trong những nhiều kiện song.

-	Tách bất cứ từ riêng (Ví dụ như if, for hoặc catch) từ một dấu ngoặc mở (() theo sau nó trên dòng.
-	Tách bất cứ từ riêng (ví dụ như else hoặc catch) từ dấu ngoặc nhọn đóng (}) trước đó trong hàng.
-	Sau dấu ngoặc ngoặc nhọn mở với 2 điều kiện sau:
  + Trước một dấu là đối tượng kí tự, đối số đầu tiên của một hàm hoặc các phần tử đầu tiên trong mảng chữ (Ví dụ: foo({a: [{c: d}]}))
  + Trên 1 Template mở rộng vì nó bị cấm bởi ngôn ngữ (e.g. abc${1 + 2}def).
-	Sau một dấu phẩy (,) hoặc dấu chấm phẩy (;) Lưu ý rằng nhiều khoảng trống không được phép sau những kí tự này (Chỉ 1 thôi).
-	Sau dấu hai chấm (:) trong một đối tượng chữ cái.
-	Ở cả hai phía của dấu (//) để bắt đầu một Chú thích kết thúc dòng. Ở đây, nhiều khoảng trắng được cho phép nhưng không khuyến khích.
-	Sau khi mở kí tự chú thích JSDoc và cả ở hai phía của những kí tự đóng (Ví dụ cho khai báp kiểu dạng ngắn hoặc dạng Casts: this.foo = /** @type {number} */ (bar) hoặc hàm (/** string */ foo) {)..

#### 4.6.3	Quy tắc hình chữ nhật

Tất cả các code phải tuân theo quy tắc hình chữ nhật
Quy tắc hình chữ nhật: Khi một file nguồn được định dạng, mỗi cây con được sở hữu biên hình chữ nhật của nó, bao gồm tất cả văn bản của cây con và không chứa văn bản của cây con khác.
Chúng có nghĩa là gì? Lấy một ví dụ được định dạng dưới đây và vẽ một hình chữ nhật: x / CurrentEstimate.

```javascript
currentEstimate =
        (currentEstimate + x / currentEstimate)
            / 2.0f;
```

Nếu đúng thì ổn nhưng với các ví dụ định dạng sai, không có hình chữ nhật nào cả, chỉ có duy nhất biểu thức diễn tả. Quá tồi tệ.

```javascript
currentEstimate = (currentEstimate + x
        / currentEstimate) / 2.0f;
```
 
Trong ví dụ được định dạng tốt, mỗi cây con đều sở hữu hình chữ nhật của mình. Ví dụ như ở phía bên phải của assignments đều sở hữu hình nhật cũng được định dạng giống ví dụ chuẩn, tuy nhiên ở cây khác thì không có. Điều này tăng cường khả năng đọc bởi cấu trúc chương trình được thiết kế một cách hợp lí.

#### 4.6.4	Chú thích theo chiều Ngang: Không khuyến khích sử dụng

Chú Thích Thuật Ngữ: Chú thích theo chiều ngang là hành vi thêm một số biến của không gian bổ sung vào trong Code với mục tiêu làm mã thông báo xuất hiện trực tiếp ngay bên dưới những mã thông báo khác ở dòng code trước.
Hành vi này được cho phép nhưng không được khuyến khích bởi Google Style. Nó thậm chí không cần thiết để duy trì các liên kết theo chiều ngang nơi mà nó được sử dụng.
Dưới đây là một ví dụ không có chú thích theo chiều ngang và một ví dụ chú thích theo chiều ngang. Tất cả đều được phép sử dụng nhưng đoạn code sau không khuyến khích làm theo.

```javascript
{
  tiny: 42, // this is great
  longer: 435, // this too
};

{
  tiny:   42,  // permitted, but future edits
  longer: 435, // may leave it unaligned
};
```

 
#### 4.6.5	Chú thích hàm

Tốt nhất người dùng nên đặt chú thích hàm cùng một dòng với tên hàm. Nếu làm như vậy sẽ vượt quá giới hạn 80 từ trên một cột, các đối số phải được xuống dòng nhằm mục đích dễ đọc. Để tiết kiệm không gian, bạn có xuống dòng lúc gần 80 kí tự càng tốt hoặc đưa từng chú thích trên một dòng riêng để nâng cao khả năng đọc code. Thụt đầu dòng nên lùi vào 4 khoảng trắng. Căn chỉnh dấu ngoặc đơn là được phép nhưng không khuyến khích (đã có quy tắc). Dưới đây là những mẫu chung nhất cho chú thích xuống dòng.

```javascript
// Arguments start on a new line, indented four spaces. Preferred when the
// arguments don't fit on the same line with the function name (or the keyword
// "function") but fit entirely on the second line. Works with very long
// function names, survives renaming without reindenting, low on space.
doSomething(
    descriptiveArgumentOne, descriptiveArgumentTwo, descriptiveArgumentThree) {
  // …
}

// If the argument list is longer, wrap at 80. Uses less vertical space,
// but violates the rectangle rule and is thus not recommended.
doSomething(veryDescriptiveArgumentNumberOne, veryDescriptiveArgumentTwo,
    tableModelEventHandlerProxy, artichokeDescriptorAdapterIterator) {
  // …
}

// Four-space, one argument per line.  Works with long function names,
// survives renaming, and emphasizes each argument.
doSomething(
    veryDescriptiveArgumentNumberOne,
    veryDescriptiveArgumentTwo,
    tableModelEventHandlerProxy,
    artichokeDescriptorAdapterIterator) {
  // …
}
```

### 4.7	Nhóm ngoặc đơn: Đề xuất sử dụng

Nhóm ngoặc đơn tuỳ theo mỗi người chỉ được bỏ qua khi người viết code và người đọc hoặc khách hàng đồng ý rằng tất cả mọi người không bị hiểu sai khi không có nó nhằm mục đích đọc hiểu code dễ dàng hơn. 
Không sử dụng dấu ngoặc đơn không cần thiết xung quanh toàn bộ các biểu thức sau đây: delete, typeof, void, return, throw, case, in, or of.
Dấu ngoặc đơn yêu cầu cho kiểu casts này: /** @type {!Foo} */ (foo)

### 4.8	Chú thích

Phần này đề cập đến chú thích cài đặt. JSDoc sẽ được giải quyết trong phần 7.

#### 4.8.1	Style của khối lệnh chú thích

Khối lệnh chú thích được thụt đầu dòng đúng bằng các code xung quanh tương đương. Chúng có thể được đưa vào trong / * ... * / hoặc // -. Đối với nhiều dòng chú thích /* … */, các dòng sau phải bắt đầu bằng dấu * để phù hợp với các dòng trên đó. Tên tham số sẽ xuất hiện sau giá trị bất cứ khi nào tên giá trị và phương thức không truyền đầy đủ ý nghĩa.

```javascript
/*
 * This is
 * okay.
 */

// And so
// is this.

/* This is fine, too. */

someFunction(obviousParam, true /* shouldRender */, 'hello' /* name */);
```
 
Chú thích không được đính kèm với bất cứ dấu hoa thị hoặc kí tự nào khác.
Không sử dụng JSDoc (/** … */) cho bất cứ chú thích thể hiện nào ở phía trên.

```javascript
TODO(username): comment
TODO(b/buganizer_id): comment
```

```javascript
TODO(tashana): Remove this code after the UrlTable2 has been checked in.
TODO(b/6002235): remove the "Last visitors" feature
```
 
## 5.	Tính năng ngôn ngữ

JavaScript bao gồm nhiều tính năng mập mờ, không rõ ràng (thậm chí cả nguy hiểm). Phần này mô tả những tính năng có thể hoặc không thể sử dụng kèm một số ràng buộc thêm về JavaScript.

### 5.1	Khai Báo Biến Địa Phương

#### 5.1.1	Sử dụng Hằng và Gán

Khai báo tất cả các biến cục bộ với Hằng hoặc phép gán. Sử dụng hằng như mặc định, trừ khi một biến số cần được gán lại. Các từ khoá Var không được phép sử dụng.

#### 5.1.2	Mỗi giá trị một khai báo

Mỗi khai báo biến địa phương được khai báo một giá trị duy nhất, ví dụ như gán a = 1, b = 2; không được phép sử dụng.

#### 5.1.3	Khai báo khi cần thiết, khởi tạo càng sớm càng tốt

Các biến địa phương không có thói quen khai báo ở đầu khối lệnh hoặc cấu trúc Block-like. Thay vào đó, biến cục bộ được khi báo gần điểm đầu tiên xuất hiện để thực hiện chức năng đầu tiên nhằm tiết kiệm phạm vi.

#### 5.1.4	Khai báo các loại biến khi cần thiết

Chú thích loại JSDoc có thể được thêm vào trên dòng khai báo hoặc trực tiếp trước tên biến.
Ví dụ: 

```javascript
const /** !Array<number> */ data = [];

/** @type {!Array<number>} */
const data = [];
```

### 5.2	Mảng Kí Tự

#### 5.2.1	Sử dụng dấu phẩy ở đuôi
Bao gồm một dấu phẩy đuôi bất cứ khi nào ngắt dòng giữa phần tử cuối cùng và dấu ngoặc đóng.

Ví dụ:

```javascript
const values = [
  'first value',
  'second value',
];
```


#### 5.2.2	Không sử dụng mảng khởi tạo
Hàm khởi tạo dễ bị lỗi nếu các đối số được thêm vào hoặc xoá bỏ. Sử dụng một phần tử đơn để thay thế.

Trường hợp vi phạm:

```javascript
const a1 = new Array(x1, x2, x3);
const a2 = new Array(x1, x2);
const a3 = new Array(x1);
const a4 = new Array();
```

 
Tóm lại điều này hoạt động tương đối ổn, ngoại trừ trường hợp thứ 3: nếu x1 là một số nguyên còn a3 là một mảng có kích thước x1 thì tất cả phần tử đều không xác định. Nếu x1 là số khác bất kì thì một ngoại lệ sẽ được ném ra và nếu nó là bất cứ phần tử nào khác thì a3 sẽ là mảng 1 phần tử.

Vì vậy, hãy viết:

```javascript
const a1 = [x1, x2, x3];
const a2 = [x1, x2];
const a3 = [x1];
const a4 = [];
```

Phân bổ rõ ràng chiều dài của một mảng sử dụng new Array (length) được phép khi thích hợp.

#### 5.2.3	Phần tử không phải là số
Không định nghĩa hoặc sử dụng phần tử không phải số trên một mảng (Trừ chiều dài). Thay vào đó, sử dụng bản đồ hoặc đối tượng thay thế.

#### 5.2.4	Destructuring
Mảng kí tự có thể được sử dụng ở phía bên trái của một phép gán thể thể hiện Destructuring. Yếu tố cuối cùng bao gồm (Không khoảng trống giữa … và tên biến). Phần tử nên được bỏ qua nếu chúng không được sử dụng.

```javascript
const [a, b, c, ...rest] = generateResults();
let [, b,, d] = someArray;
```

Destructuring có thể được sử dụng cho các hàm tham số (Lưu ý rằng một tên tham số là cần thiết nhưng bỏ qua). Luôn phải ghi rõ [] là giá trị mặc định nếu tham số mảng Destructuring là không bắt buộc và cung cấp giá trị mặc định ở phía bên trái.
 
```javascript
const [a, b, c, ...rest] = generateResults();
let [, b,, d] = someArray;
```

```javascript
/** @param {!Array<number>=} param1 */
function optionalDestructuring([a = 4, b = 2] = []) { … };
```

Trường hợp vi phạm:

```javascript
function badDestructuring([a, b] = [4, 2]) { … };
```


#### 5.2.5	Spread operator
Mảng Kí Tự có thể bao gồm Spread Operator (…) để san bằng các phần tử ra khỏi một hoặc nhiều iterables khác. Spead Operator nên được sử dụng thay vì các cấu trúc bất tiện với Array.prototype. Không có khoảng trắng sau dấu …

Ví dụ:

```javascript
[...foo]   // preferred over Array.prototype.slice.call(foo)
[...foo, ...bar]   // preferred over foo.concat(bar)
```
 
### 5.3	Đối tượng kí tự

#### 5.3.1	Sử dụng dấu phẩy đuôi
Bao gồm dấu phẩy đuôi bất cứ khi nào có xuống dòng giữa thuộc tính cuối cùng và dấu ngoặc đóng.

#### 5.3.2	Không sử dụng khởi tạo Object
Trong khi Object không có những rắc rối tương tự như mảng, nó vẫn không được phép nhất quán. Sử dụng một đối tượng đơn ({} or {a: 0, b: 1, c: 2}) thay thế.

#### 5.3.3: Không được pha trộn từ khoá trích dẫn và không trích dẫn
Đối tượng kí tự có thể đại diện một trong hai cấu trúc (với từ khoá không trích dẫn và/hoặc kí hiệu). Không pha lẫn các từ khoá này với đối tượng kí tự.
Trường hợp vi phạm:

```javascript
{
  a: 42, // struct-style unquoted key
  'b': 43, // dict-style quoted key
}
```
 
#### 5.3.4: Tên thuộc tính ước tính
Tên thuộc tính ước tính (Ví dụ {['key' + foo()]: 42}) được cho phép và được coi là ….

#### 5.3.5: Phương thức shorthand
Các phương thức có thể được xác định trên đối tượng đơn sử dụng phương thức shorthand ({method() {… }}) ở vị trí sau dấu hai chấm theo sau bởi một hàm hoặc hàm mũi tên đơn.
Ví dụ: 

```javascript
return {
  stuff: 'candy',
  method() {
    return this.stuff;  // Returns 'candy'
  },
};
```

Lưu ý rằng this trong phương thức shorthand hoặc hàm dùng để chỉ chính các đối tượng đơn.

```javascript
class {
  getObjectLiteral() {
    this.stuff = 'fruit';
    return {
      stuff: 'candy',
      method: () => this.stuff,  // Returns 'fruit'
    };
  }
}
```

 
#### 5.3.6	Đặc tính Shorthand
Đặc tính Shorthand được cho phép trong đối tượng kí tự
Ví dụ:

```javascript
const foo = 1;
const bar = 2;
const obj = {
  foo,
  bar,
  method() { return this.foo + this.bar; },
};
assertEquals(3, obj.method());
```

#### 5.3.7	Destructuring
Khuôn mẫu đối tượng destructuring có thể được sử dụng ở phía trái của một phép gán để thực hiện destructuring và giải nén nhiều giá trị từ một đối tượng duy nhất.
Đối tượng bị phá huỷ cũng có thể được sử dụng như hàm tham số nhưng càng giữ được càng lâu càng tốt….
Ví dụ: 

```javascript
/**
 * @param {string} ordinary
 * @param {{num: (number|undefined), str: (string|undefined)}=} param1
 *     num: The number of times to do something.
 *     str: A string to do stuff to.
 */
function destructured(ordinary, {num, str = 'some default'} = {})
```


Trường hợp vi phạm:

```javascript
/** @param {{x: {num: (number|undefined), str: (string|undefined)}}} param1 */
function nestedTooDeeply({x: {num, str}}) {};
/** @param {{num: (number|undefined), str: (string|undefined)}=} param1 */
function nonShorthandProperty({num: a, str: b} = {}) {};
/** @param {{a: number, b: number}} param1 */
function computedKey({a, b, [a + b]: c}) {};
/** @param {{a: number, b: string}=} param1 */
function nontrivialDefault({a, b} = {a: 2, b: 4}) {};
```

 
Destructuring cũng có thể sử dụng cho câu lệnh goog.require và trong trường hợp không thể xuống dòng.

#### 5.3.8	Enums
Sự liệt kê được định nghĩa bởi thêm chú thích @enum đến một đối tượng kí tự. Thuộc tính bổ sung có thể không được thêm vào một enum sau khi nó được định nghĩa. Enums phải là đại lượng không đổi và tất cả các giá trị của Enums cũng phải bất biến.

```javascript
/**
 * Supported temperature scales.
 * @enum {string}
 */
const TemperatureScale = {
  CELSIUS: 'celsius',
  FAHRENHEIT: 'fahrenheit',
};

/**
 * An enum with two options.
 * @enum {number}
 */
const Option = {
  /** The option used shall have been the first. */
  FIRST_OPTION: 1,
  /** The second among two options. */
  SECOND_OPTION: 2,
};
```



### 5.4	Lớp

#### 5.4.1 Hàm khởi tạo

Hàm khởi tạo không bắt buộc với lớp cụ thể và khi hiện diện thì phải là phương thức đầu tiên được định nghĩa trong lớp kí tự. Hàm khởi tạo các lớp con phải gọi super() trước khi cài đặt hoặc truy cập lớp cha. Interfaces không phải là định nghĩa một hàm khởi tạo.

#### 5.4.2 Trường

Đặt tất cả trường của một đối tượng cụ thể(Tức là tất cả đặc tính ngoài các phương thức) trong hàm khởi tạo. Chú thích các trường không bao giờ được gán lại với @const. Trường Private phải được chú thích với @private và tên của chúng phải được kết thúc bằng dấu gạch dưới. Các trường không bao giờ được đặt trong lớp cụ thể prototype

```javascript
class Foo {
  constructor() {
    /** @private @const {!Bar} */
    this.bar_ = computeBar();
  }
}
```

#### 5.4.3 Thuộc tính Computed

## 6. Đặt tên

### 6.1 Quy định chung cho tất cả định danh

- Định danh chỉ sử dụng ký tự trong ASCII chữ và chữ số, and, trong một số trường hợp nêu dưới đây, gạch dưới và rất it khi sử dụng kí hiệu đô la (khi có yêu cầu của Framework như Angular).
- Một tên cần mô tả tốt chức năng, ý nghĩa của nó. Bạn đừng quá để tâm đến việc tiết kiệm không gian, ngắn gón vì việc thể hiện được ý nghĩa của tên là quan trọng hơn khi nó giúp một người đọc mới nhanh chóng hiểu được code của bạn. Không sử dụng các chữ viết tắt không rõ ràng hoặc không quen thuộc với những người ngoài dự án, không viết tắt bằng cách xóa bớt chữ trong một từ.
```javascript
   priceCountReader      // không viết tắt.
   numErrors             // "num" là một quy ước phổ biến.
   numDnsConnections     //  Mọi người đều biết viết tắn của DNS.'
```
   Không hợp lệ:
   
```javascript
   n                     // Vô nghĩa.
   nErr                  // Viết tắt không rõ ràng.
   nCompConns            // Viết tắt không rõ ràng.
   wgcConnections        // Chỉ những người trong nhóm mới có thể hiểu.
   pcReader              // Rất nhiều thứ có thể được viết tắt la "pc".
   cstmrId               // Xóa một số kí tự trong từ.
   kSecondsPerDay        // Không sử dụng kí hiệu.
```

### 6.2	Quy định theo loại định danh

#### 6.2.1 Tên gói

- Tên gói là theo dạng lowerCamelCase. Ví dụ: my.exampleCode.deepSpace, chứ không phải my.examplecode.deepspace hay my.example_code.deep_space.

#### 6.2.2 Tên lớp

- Tên lớp, giao diện, bản ghi, typedef được viết theo dạng UpperCamelCase. Lớp Unexported chỉ là địa phương: không được đánh dấu @private và do đó không được đặt tên với một dấu gạch dưới.
- Tên phải là danh từ hoặc cụm danh từ thường. Ví dụ: ImmutableList, VisibilityMode. Ngoài ra, tên của giao diện đôi khi có thể là tính từ hoặc cụm tính từ thay vào đó (ví dụ Readable).

#### 6.2.3 Tên phương thức

- Tên phương thức được được đặt theo dạng lowerCamelCase. Các phương pháp có tên đơn phải kết thúc với một dấu gạch dưới.
- Tên phương pháp là những động từ hoặc cụm động từ. Ví dụ: SendMessage, stop_.
- Gạch cũng có thể xuất hiện trong JsUnit tên phương pháp thử nghiệm để tách các thành phần logic của tên. Một kiểu điển hình là test <MethodUnderTest> _ <state>, ví dụ testPop_emptyStack.

#### 6.2.4 Enum names

- Tên Enum được viết theo kiểu UpperCamelCase, tương tự như các lớp, nói chung nên là danh từ số ít. mục riêng lẻ trong enum có tên trong CONSTANT_CASE.

#### 6.2.5 Tên hằng

- tên hằng được viết theo kiểu CONSTANT_CASE: tất cả các chữ cái viết hoa, với những từ phân cách bằng dấu gạch dưới. Không có lý do cho một hằng số được đặt tên với một dấu gạch dưới.

##### 6.2.5.1 Định nghĩa về “constant”

- Mỗi hằng là một giá trị @const tĩnh hoặc một tuyên bố const module-địa phương, nhưng không phải tất cả các thuộc tính tĩnh @const và consts module-địa phương đều là các hằng số. Trước khi lựa chọn trường hợp, xem xét nó có thực sự là một hằng số bất biến. Mới chỉ có ý định không bao giờ biến những đối tượng thường là không đủ.
- Tên các hằng số là danh từ hoặc cụm danh từ.
- Ví dụ:

```javascript
   // Constants
   const NUMBER = 5;
   /** @const */ exports.NAMES = ImmutableList.of('Ed', 'Ann');
   /** @enum */ exports.SomeEnum = { ENUM_CONSTANT: 'value' };

   // Not constants
   let letVariable = 'non-const';
   class MyClass { constructor() { /** @const */ this.nonStatic = 'non-static'; } };
   /** @type {string} */ MyClass.staticButMutable = 'not @const, can be reassigned';
   const /** Set<String> */ mutableCollection = new Set();
   const /** ImmutableSet<SomeMutableType> */ mutableElements = ImmutableSet.of(mutable);
   const Foo = goog.require('my.Foo');  // mirrors imported name
   const logger = log.getLogger('loggers.are.not.immutable');
```

#### 6.2.6  Non-constant field names

- tên của Non-constant được viết theo dạng lowerCamelCase, với một dấu gạch dưới cho tên đơn.
- Những tên này là danh từ hoặc cụm danh từ. Ví dụ: computedValues hoặc index_.

#### 6.2.7 Tên tham số

- Tên tham số được viết dưới dạng lowerCamelCase. Lưu ý rằng điều này được áp dụng ngay cả khi các thông số theo kiểu một constructor.
- Ngoại lệ: Khi yêu cầu một khuôn khổ của bên thứ ba, tên tham số có thể bắt đầu với một $. Ngoại lệ này không áp dụng đối với bất kỳ định dạng khác (ví dụ như các biến địa phương hoặc tài sản).

#### 6.2.8 Tên biến địa phương

- tên biến địa phương được viết bằng lowerCamelCase, ngoại trừ cho các hằng số mô-đun-địa phương, như mô tả ở trên. Hằng số trong phạm vi chức năng vẫn đang có tên trong lowerCamelCase. Lưu ý rằng lowerCamelCase áp dụng ngay cả khi biến giữ một constructor.

#### 6.2.9 Template parameter names

- Tên tham số mẫu nên ngắn gọn, đơn thư định danh,  chẳng hạn như TYPE hoặc THIS.

### 6.3 CamelCase: định nghĩa

- Đôi khi có nhiều hơn một cách hợp lý để chuyển đổi một cụm từ tiếng Anh sang trường hợp camel case, chẳng hạn như khi viết tắt hoặc cấu trúc khác thường như IPv6 hay iOS có mặt. Để cải thiện khả năng dự đoán, Google Style quy định cụ thể như sau.
- Beginning with the prose form of the name:
  + Chuyển đổi các cụm từ về ASCII và loại bỏ bất kỳ dấu nháy. Ví dụ, Müller's algorithm có thể trở thành Muellers algorithm.
  + Chia kết quả này thành các từ, tách về không gian và bất kỳ dấu chấm câu còn lại (thường là dấu gạch ngang).
  + Bây giờ viết thường tất cả mọi thứ (kể cả viết tắt), sau đó chữ hoa chỉ ký tự đầu tiên của:
    + mỗi từ, để mang lại camel case
    + mỗi từ trừ từ đầu tiên, để mang lại trường hợp lạc đà thấp
  + Cuối cùng, gộp tất cả các từ vào một định danh duy nhất.
