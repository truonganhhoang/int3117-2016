# Jasmine Unit Testing for Javascript
## Giới thiệu
### BDD là gì?
BDD (Behavior Driven Development) là môt quá trình phát triển phần mềm dựa trên thử nghiệm hướng phát triển. BDD quy định rằng các developer và product owner cần hợp tác và xác định các hành vi của người sử dụng, nó sinh ra hướng tới các feature test mà người dùng thực hiện là các Acceptance Tester.
 -	Thay vì chờ đợi sản phẩm hoàn thành và kiểm thử, người tester/analyst tham gia vào quá trình xây dựng mã nguồn với vai trò phân tích và xây dựng hệ thống kịch bản kiểm thử dưới góc độ ngôn ngữ tự nhiên dễ hiểu từ các yêu cầu (requirement).
 -	Đồng thời, họ giúp đỡ developer trong việc giải thích và đưa ra các phương án xây dựng mã nguồn mang tính thực tiễn với người dùng ngay trước khi ta bắt đầu xây dựng.
 -	Người developer liên hệ mật thiết với người tester và xây dựng mã nguồn với những phương án mà tester cung cấp.
 -	Kịch bản kiểm thử được phân chia làm 2 lớp: Lớp chấp nhận (feature/acceptance test) và lớp đơn vị (unit test).
 -	Theo đó, kịch bản kiểm thử lớp đơn vị mang thuần tính thiết kế và phục vụ cho việc kiểm thử lớp đơn vị (Unit test) còn kịch bản kiểm thử lớp chấp nhận có thể được tái sử dụng cho quá trình kiểm thử hồi quy về sau (regession test).

### Jasmine là gì?
Jasmine là một framework mã nguồn mở sử dụng để test code cho javascript theo mô hình BDD. Nó không phụ thuộc vào bất kỳ framework nào của Javascript. Nó không đòi hỏi một DOM và nó có một cú pháp rõ ràng và sạch sẽ để bạn có thể viết các test case.

### Ví dụ
Jasmine nhằm mục đích dễ đọc, một ví dụ đơn giản với với hàm trả về chuỗi “Hello world”:
```javascript
function helloWorld() {
  return 'Hello world!';
}

```
Và chứng minh rằng đầu ra của nó thực sự là văn bản “Hello world”.
```javascript
describe('Hello world', function() {
  it('says hello', function() {
    expect(helloWorld()).toEqual('Hello world!');
  });
});
```
Một bộ kiểm tra bắt đầu với một cuộc gọi đến các chức năng Jasmine cục bộ mô tả với 2 tham số: một chuỗi hoặc một hàm. Chuỗi là một tên hoặc tiêu đề cho một spec – thường những gì đang được thử nghiệm. Các hàm là một khối thực hiện bộ test. Jasmine cũng có một số tính năng hỗ trợ khác như custom matchers, spies và sử dụng cho việc hỗ trợ các thông số kỹ thuật không đồng bộ.

### Specs
Thông số kỹ thuật được xác định bằng cách gọi hàm Jasmine toàn cục, như mô tả phải mất một chuỗi và một hàm. Chuỗi là tiêu đề của đặc tả và chức năng là các đặc tả. Một đặc tả chứa một hoặc nhiều kỳ vọng rằng kiểm tra trạng thái của các mã. Một kỳ vọng trong Jasmine là một sự khẳng định đó là đúng hoặc sai. Từ mô tả và nó chặn được các chức năng, chúng có thể chứa bất kỳ mã thực thi cần thiết để thực hiện các test case. 

## Cài đặt
-	Cho Jasmine NPM module: https://github.com/jasmine/jasmine-npm
-	Cho Jasmine Ruby Gem: https://github.com/jasmine/jasmine-gem
-	Cho Jasmine Python Egg: https://github.com/jasmine/jasmine-py
-	Các phiên bản Jasmine: https://github.com/jasmine/jasmine/releases

Chúng ta bắt đầu làm demo nào, đầu tiên, các bạn tải jasmine bản mới nhất về ở đây: https://github.com/jasmine/jasmine/releases Giải nén, vào thư mục dist và giải nén bản mới nhất nhé: 
Sau khi giải nén, ta được 1 thư mục mới, chạy file SpecRunner.html

Xem source file html này, ta thấy gồm những file thư viện, file code và spec. Những unit test được viết trong file PlayerSpec.js:

```html
<html>
<head>
    <meta charset="utf-8">
    <title>Jasmine Spec Runner v2.2.0</title>
    <link rel="shortcut icon" type="image/png" href="lib/jasmine-2.2.0/jasmine_favicon.png">
    <link rel="stylesheet" href="lib/jasmine-2.2.0/jasmine.css">

    <script src="lib/jasmine-2.2.0/jasmine.js"></script>
    <script src="lib/jasmine-2.2.0/jasmine-html.js"></script>
    <script src="lib/jasmine-2.2.0/boot.js"></script>

    <!-- include source files here... -->
    <script src="src/Player.js"></script>
    <script src="src/Song.js"></script>

    <!-- include spec files here... -->
    <script src="spec/SpecHelper.js"></script>
    <script src="spec/PlayerSpec.js"></script>
</head>
<body>
</body>
</html>
```
Để đơn giản, chúng ta sẽ tạo 1 file spec mới làm ví dụ, đặt tên là MySpec.js. Ta sửa lại file html như sau:
```html
<html>
<head>
    <meta charset="utf-8">
    <title>Jasmine Spec Runner v2.2.0</title>

    <link rel="shortcut icon" type="image/png" href="lib/jasmine-2.2.0/jasmine_favicon.png">
    <link rel="stylesheet" href="lib/jasmine-2.2.0/jasmine.css">

    <script src="lib/jasmine-2.2.0/jasmine.js"></script>
    <script src="lib/jasmine-2.2.0/jasmine-html.js"></script>
    <script src="lib/jasmine-2.2.0/boot.js"></script>

    <!-- include spec files here... -->
    <script src="spec/MySpec.js"></script>

</head>

<body>
</body>
</html>
```

Trong file spec mới, ta sẽ viết 1 class Calculator, chuyên thực hiện các phép toán cộng trừ nhân chia, sau đó viết test case cho nó (Viết trong cùng file MySpec.js nhé) . Class Calculator:
```javascript
function Calculator()
{
  this.add = function(a, b) { return a+b;};
  this.minus = function(a, b) { return a-b;};
  this.multiply = function(a, b) { return a*b;};
  this.divide = function(a,b) {return a/b;} ;
}
```
Một số unit test cộng trừ nhân chia:
-	Hàm describe dùng để gom nhóm, ghi chú cho nhiều unit test.
-	Hàm it tương đương với 1 unit test.
-	Hàm expect chính là hàm assert để kiểm tra tính đúng đắn của unit test

```javascript
describe("Cộng trừ", function() {
  var cal = new Calculator();

  it("Một với một là hai", function() {
    expect(2).toBe(cal.add(1,1));
  });

  it("Hai với hai là bốn", function() {
    expect(4).toBe(cal.add(2,2));
  });

  it("Năm trừ hai bằng ba", function() {
    expect(3).toBe(cal.minus(5,2));
  });

});

describe("Nhân chia", function() {
  var cal = new Calculator();

  it("Năm nhân hai bằng mười", function() {
    expect(10).toBe(cal.multiply(5,2));
  });

  it("Sáu chia hai bằng ba", function() {
    expect(3).toBe(cal.divide(6,2));
  });
});
```
Chạy lại file SpecRunner.html, ta được kết quả.
