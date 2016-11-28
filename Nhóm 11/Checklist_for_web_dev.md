*Dịch từ http://yellowshoe.com.au/standards/*

# Guide for front-end Web Developer

##TABLE OF CONTENTS

  1. Browsers 

  2. HTML

  3. CSS

  4. Javascript

  5. Frameworks

  6. Performance

  7. HTML5 / CSS3

  8. Accessibility

## 1. CÁC TRÌNH DUYỆT 

###Thống kê
Thống kê truy cập của người dùng sẽ quyết định chúng ta nên hỗ trợ trình duyệt nào một cách chính thức. Tuy nhiên nếu ta cho khách hàng lý do tốt để nâng cấp hoặc chuyển sang một trình duyệt mới hơn, hỗ trợ các chuẩn nhiều hơn thì công việc của ta sẽ dễ dàng hơn, không tốn thêm thời gian sửa lỗi ở các bản trình duyệt cũ.
    
###Web sites có cần giống nhau ở mọi trình duyệt?  
Không. Một trang web cần phục vụ mục đích của nó và không tỏ ra hỏng hóc.
Trình duyệt không quan trọng, mà quan trọng là phần mềm phục vụ người dùng một cách hữu hiệu.
    
###Chuẩn của web
  
Chiến lược “Viết một lần, dùng mọi nơi” là mục tiêu hàng đầu cho các chuẩn web. Nhờ vào nỗ lực của các nhà thiết kế web và công ty phát triển trình duyệt hỗ trợ các chuẩn web, tương hợp giữa các trình duyệt ngày nay dễ dàng hơn rất nhiều.
W3C và WHATWG là các nhóm tranh luận “Web nên trở thành thế nào”, về vấn đề APIs và công bố các chuẩn để công ty phát triển trình duyệt và người phát triển phần mềm áp dụng. Đây là các nhóm mở, bất kỳ ai quan tâm đều có thể tham gia đóng góp.
•	http://www.w3.org/TR/
•	http://www.whatwg.org/specs/
    
###Công cụ kết xuất (Rendering Engines) 
Các công cụ kết xuất trong trình duyệt đọc HTML, CSS, một số chuẩn khác như XSLT, SVG, và tô màu các pixel trên màn hình.
    
####Bốn ông lớn
    
- Trident:   		IE    
- Gecko:    		  Firefox   
- Webkit:      	Chrome, Safari, Apple & Android mobile devices. 
- Presto:    		Opera, Opera mini   
Hiểu được sự khác biệt và những thứ nhập nhằng giữa 4 công cụ kết xuất này sẽ giảm thời gian cần để kiểm thử giao diện và việc kết xuất

## 2. HTML

*“HTML là ngôn ngữ chung của World Wide Web. Chỉ sử dụng các thẻ (tags) đơn giản, nhân loại đã tạo ra một mạng lưới vô cùng đa dạng những văn bản siêu lien kết, từ Amazon, eBay và Wikipedia, đến những blogs cá nhân và trang web với mục đích giải trí.” - @adactio*
  
### Cú pháp
  
 HTML làm nội dung có ý nghĩa để trình duyệt và thiết bị có thể truyền ý nghĩa đó cho người dùng. Ví dụ: 
- Headings h1 đến h5 trong bố cục văn bản có thể tạo mục lục cho định hướng đơn giản hơn.
- Dùng thẻ `<table>` để tạo bảng cho người dùng dễ đọc với các dòng, cột.
- Khi người dùng nhấn vào `<lable for=”email”>` phần điều khiển đầu vào sẽ nhận được `<input id=”email”>`.

  
### HTML đơn
  
HTML có thể hoạt động mà không cần CSS hay Javascript. Nội dung vẫn có thể truy cập, các bản mẫu vẫn có thể được gửi, chỉ mình HTML cũng vẫn có giá trị.
Một các tốt để kiểm tra chất lượng của HTML là vô hiệu hóa hình ảnh, CSS và javascript để thấy nó còn có ý nghĩa thế nào.   
Dưới đây là một chuẩn cho HTML để khi làm theo nó các bạn sẽ không phải kiểm tra lại.
    
### Phiên bản nào?
  
Chúng tôi sử dụng HTML5, nhưng phiên bản không phải điều quan trọng. Trình duyệt hiểu được những thẻ chúng hỗ trợ, bất kể định dạng doctype và phiên bản chúng ta sử dụng.
Một doctype cần thiết để bắt trình duyệt triết xuất ở trạng thái cơ bản và ngăn các trạng thái lộn xộn gây đau đầu ở, ví dụ:  
    
```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
      <meta charset="utf-8">
      <title>I ♥ HTML</title>
      <link rel="stylesheet" href="style.css">
    </head>
    <body>

    <h1>HTML5 <abbr title="For The Win">FTW</abbr>!</h1>

    <script src="script.js"></script>
    </body>
    </html>
```
    
### Thực hành
  
  - Sử dụng các “yếu tố không đóng góp” (span / div) và các loại class / id attributes càng ít càng tốt. HTML càng đơn giản thì càng dễ làm việc.
  - Sử dụng thoải mái các thẻ, đặc tính của HTML5 nhưng vẫn nhớ tính tương thích với các phiên bản cũ.
  - Dùng định dạng UTF-8.
  - Tránh các thẻ styles cùng một dòng hoặc thẻ xử lý sự kiện.

## 3.CSS

###Hãy có phong cách

- Giữ CSS hoàn toàn tách biệt với HTML
- Tái sử dụng các module đặc trung, ví dụ: reset, grid, forms, type, print
- Sử dụng cú pháp ngắn bất kỳ lúc nào có thể
- Viết  .class-names viết-thường-có-gạch-nối và #ids
- Code trên một trình duyệt hỗ trợ các chuẩn trước, rồi sửa chữa sau ở IE

###Internet Explorer WTF?

Chúng ta nên biết ơn rằng các trình duyệt không phải IE có tính nhất quán rất cao. 
Nếu không có IE phát triển web sẽ là quá dễ dàng.

####Ngăn IE chuyển sang các chế độ không hữu ích:

```css
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
```

Khi kiểm thử trên IE bắt đầu với phiên bản mới nhất rồi tiếp tục với các phiên bản cũ hơn

####Bình luận có điều kiện trên IE

```css
<!--[if lt IE 7 ]> <html class="ie6"> <![endif]-->
<!--[if IE 7 ]>    <html class="ie7"> <![endif]-->
<!--[if IE 8 ]>    <html class="ie8"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--> <html> <!--<![endif]-->
```

Nếu chúng tat hay thế thẻ html bằng ví dụ ở trên chúng ta có thể dùng các classes để chuyển styles tới một phiên bản khác. 
Ví dụ: “float to fix” a bug with #myElement in IE6.

####HASLAYOUT là gì?

Là điều quan trọng nhất cần biết khi sửa lỗi trên IE! Dùng thành phần “Layout” có thể sửa đến 99% lỗi triết xuất. 1% còn lại nhiều khả năng lien quan tới vị trí: quan hệ; hoặc trôi nổi. Dugnf “zoom: 1” để khởi động bất kỳ phiên bản IE nào cần.
```css
.ie6 #myElement, .ie7 #myElement { zoom: 1 }
```
http://www.sitepoint.com/forums/2041209-post24.html
####Media queries (Truy vấn phương tiện)
Chuyển các styles riêng biệt đến từng thiết bị khác nhau, có thể kiểm tra trên:
- màn hình hoặc máy in
- chiều rộng chiều cao
- điều hướng – thiết bị di động ở chiều dọc hay ngang
- độ phân giải

Có thể tối ưu hóa styles cho từng thiết bị:
```css
@media only screen and (max-device-width: 480px) {
  /* hide header and footer on small screen devices */
  #header, #footer { display: none }
}
@media only screen and (max-width:800px) {
  /* linearize navigation under 800px */
  nav, nav li, nav a { float: none; width: 100% }
}
```
Xem http://colly.com/ một ví dụ tuyệt vời.
Thẻ viewport cũng rất cần để định hướng cho thiết bị di động giữ được điểm nhìn với số lượng pixel nó có trên màn hình, có thể tránh việc nó phóng đại lên như phiên bản trên màn hình lớn.
```css
<meta name="viewport" content="initial-scale=1.0, width=device-width">
```
Một bài báo rất hay về nội dung này: http://dev.opera.com/articles/view/an-introduction-to-meta-viewport-and-viewport/

###Thực hành
- Sử dụng các tên class có ý nghĩa và IDs
- Điều khiển lề và các dòng với tất cả yếu tố 
- Tránh đặt chỗ cố định
- Tránh !important
- Đừng dùng cách dòng `<br>` chỉ để thêm khoảng trống cho giao diện

## 4. JAVASCRIPT
###Những phần chuyển động
Javascript nằm trên nền tảng HTML và CSS và nâng cao trải nghiệm người dùng và hành vi trang web.
####Javascript tốt cho?
- tương tác với người dùng
- trải nghiệm người dùng – tính phản hồi
- hành vi động
- chuyển động
- làm trang web dễ sử dụng hơn
- hỗ trợ truy cập – ví dụ hỗ trợ bàn phím
- hỗ trợ các trình duyệt một số tính năng chúng vốn không hỗ trợ

####Nâng cấp tiếp diễn (Progressive Enhancement)
Là một khái niệm quan trọng, nghĩa là khiến một trang hoạt động mà không cần một tính năng có hoặc không được hỗ trợ từ đầu. Nếu tính năng đó được hỗ trợ người dùng có thể có lợi ích, nếu không, cả trang vẫn hoạt động được.
Nếu chúng ta sử dụng Javascript như vậy, sẽ làm chất lượng mã nguồn tốt hơn và ngăn ngừa những điều như sau:
```javascript
<a href="javascript:myKillerFunction('sucks', true);">Click here</a>
```
Có nghĩa là nếu có điều gì trục tặc trang web vẫn có thể hoạt động mà không có phần nâng cấp.
Nâng cấp tiếp diễn cũng hỗ trợ bảo trì, giữ javascript tách biệt có nghĩa là không cần tìm tất cả tài liệu cho phần gọi hàm.

#### Làm sạch API
Vì chúng ta không phải những kẻ lộn xộn ta có thể có những tên gọi ngắn cho phương thức và biến như sau:
```javascript
var Toggler = {
  open: function() {},
  close: function() {},
  toggle: function() {}
}	
```

#### Tranh luận lựa chọn (Optional Arguments)
Chỉ thêm vào những tham số quan trọng phần arg, cho tất cả các tham số lựa chọn khác vào dấu ngoặc lựa chọn
```javascript
function circle(x,y,radius,options) {
  options = options || {};
}
```

#### Điều khiển
Điều khiển bắt đầu qua một thành phần chứa có class="init", ví dụ
```javascript
<div class="init" data-control="AwesomeToggler">
```
Khi tải nó sẽ chọn thành phần ở trên và bắt đầu AwesomeToggler Control, có hai hàm khởi tạo được định danh, "initOnce" hữu ích cho các sự kiện được ủy thác, "init" không chạy cho mỗi thể hiện của điều khiển trên trâng
```javascript
Controls.AwesomeToggler = {
  initOnce: function() {
    $body.delegate('.toggler .trigger', 'click', function() {});
  },
  init: function() {
    alert('TOG');
  }
});
```

### Thực hành
- Sử dụng framework DRY (Don't Repeat Yourself)
- Tránh viết nhiều trên 1 dòng và nhúng js
- Giữ tầm nhìn cả dự án trong sạch, đặt mã vào các phần có tên như Page, Util, Controls
- Kiểm thử tính năng trên tất cả trình duyệt ở trên - dùng `console.time` để tìm ra thắc cổ chai.
- Giảm tối đã lắng nghe sự kiện trên trang, dùng ủy thác sự kiện.
- Giữ các phần càng độc lập càng tốt.

## 5.FRAMEWORKS
*"Nếu bạn muốn dùng một thư viện bạn phải đọc hết nó, hiểu nó, đồng ý với nó, và không thể viết ra một cái tốt hơn trong những ngày thành công nhất của bạn trong việc viết mã nguồn." @sentience*

Framework không phải ma quỷ, chúng tiết kiệm thời gian, sửa chữa việc tương thích các trình duyệt và giúp ta nghĩ theo hướng mới. Nhưng, chúng cũng thêm vào nhiều thứ đau đầu nên trước khi lao vào chúng, hãy đọc dòng trích ở trên.

### Javascript
Chúng ta chỉ nên có một framework chính cho javascript, những thư viện khác cho một số tính năng đặc biệt không có trong framework chính đó có thể được thêm vào nếu đáp ứng điều kiện bên trên. 
Ví dụ: Effects & animation, SVG, Charting, Shims (Thêm một số tính năng không được hỗ trợ bởi một số trình duyệt)

### Đọc, hợp tác, đóng góp cho mã nguồn mở
Những frameworks mã nguồn mở là sản phẩn của những con người vô cùng hấp dẫn. Họ tạo nên những thứ rất tốt.

Học thêm tại [jquery](https://github.com/jquery), [mootools](https://github.com/mootools/), [prototype](https://github.com/sstephenson/prototype/) [scriptaculous](https://github.com/madrobby/scriptaculous/) [raphaël](https://github.com/DmitryBaranovskiy/raphael/)

Những anh hùng [Paul Irish](http://twitter.com/paul_irish/), [Thomas Fuchs](https://twitter.com/madrobby), [John Resig](https://twitter.com/jeresig/), [Dmitry Baranovskiy](https://twitter.com/dmitrybaranovskiy/)

## 6.HIỆU NĂNG (PERFORMANCE)
### Thực hành tốt nhất của YUI
Đội nhóm YUI đã làm rất nhiều nghiên cứu vào phần hiệu năng front-end.
Dưới đây là phiên bản súc tích cho nghiên cứu của họ, dù sao đọc cả bài báo vẫn là tốt hơn. http://developer.yahoo.com/performance/rules.html

#### Tối thiểu yêu cầu HTTP
Ghép lại tất cả kịch bản và stylesheets và nén ảnh để giảm lượng truy cập đến máy chủ.

####S ử dụng mạng truyền dữ liệu
Nên chuyển tất cả các tệp css, js, hình ảnh... tới máy chủ phân tán như Akamai.

#### Đặt stylesheets lên đầu
Đặt stylesheets lên phần `<head>` giúp trang web triết xuất một cách tiếp diễn.

#### Đặt scripts xuống cuối
Thẻ `<script>` ngăn cản tải dữ liệu song song, đặt chúng ở cuối để những tài nguyên khác có thể được tải trước.

#### Tránh Expressions
Expressions là cách để chạy javascript như một phần của CSS ở IE 6-7. Nó có thể dùng để sửa một số tính năng không được hỗ trợ như cố định vị trí. Vấn đề là chúng luôn được đẩy lên nên trang web sẽ chậm lại
```javascript
e6 .fixed {
  top: expression(0+((e=document.documentElement.scrollTop)?e:document.body.scrollTop)+'px');
}
```

#### Làm Javascript và CSS ở ngoài
Bộ nhớ đệm là bạn tốt. Ngoại lệ duy nhất là các trang với một khung nhìn trên phiên làm việc có thể có lợi từ script ở trong.

#### Làm nhỏ javascript và CSS
Chúng ta nên sử dụng bộ thu gọn như JSMin, YUI Compressor hoặc Closure Complier để giảm kích cỡ file CSS, JS.
Bỏ bớt các biến toàn cục có thể tạo hiệu quả tốt hơn là nén vì tên có thể được làm ngắn không thể được truy cập bên ngoài hàm đóng của chúng.
```javascript
var canIBeShortened = 'no';
(function() {
	var willMyReallyLongVariableBeShortnedByTheMinifier = 'yes';
	alert(willMyReallyLongVariableBeShortnedByTheMinifier);
})();
```
```javascript
// Minified
var canIBeShortened="no"function(){alert("yes")})()
```

#### Tránh tái định hướng
Làm chậm lại trải nghiệm người dùng

#### Giảm số lượng phần tử DOM
Làm nhỏ trang với ít thành phần hơn sẽ nhanh hơn để truy cận và điều chỉnh.

#### Tối thiểu số lượng Iframes
Đắt đỏ kể cả trống bởi chúng là dạng cửa số mới, chúng cũng chặn các sự kiện khi tải của trang.

#### Không có lỗi 404
Nhìn một lượt và loại bỏ những tuyến đường không cần thiết đến máy chủ.

#### Làm giảm kích thướng cookie
Chuyển đến phần headers của trang, bỏ cookies không cần thiết, giữ chúng nhỏ, đặt ngày hết hạn.

#### Tránh bộ lọc IE trong CSS
Bộ lọc là tính năng đặc biệt của CSS cho IE, chúng có thể làm chậm trang, nên dùng cẩn thận.

#### Tối ưu các ảnh
Sử dụng bộ nén ảnh như ImageOptim hoặc Sprite Generator để làm ảnh càng bé càng tốt nhưng vẫn giữ chất lượng.

#### Giữ các thành phần nhỏ hơn 25k
IPhone không cho vào bộ nhớ đệm bất kỳ cái gì lớn hơn 25K không được nén.

## 7.HTML5/CSS3

### Đồ chơi mới
Dùng đồ mới, nhưng vẫn phải nhớ tính tích hợp với cải cũ và nâng cấp tiếp diễn. Làm trang web có vẻ đặc biệt không phải là mục tiên, chỉ không nên quá dựa dẫm vào HTML5/CSS3 cho một số tính năng đặc biệt trên trang.
CSS3 có thể được dùng, tuy nhiên với số đông người dùng trên IE6 chúng ta vẫn coi tính năng của CSS3 như phần thưởng thị giác cho những trình duyệt có khả năng và tiết kiệm thời gian, như gradients và border-radius. 
```css
#slides img:hover {
  -moz-transform: scale(1.6);
  -ms-transform: scale(1.6);
  -o-transform: scale(1.6);
  -webkit-transform: scale(1.6);
  transform: scale(1.6);
}
```

### Bảo trì
Bảo trì trang web với các ca kiểm thử được nâng cấp là cách tốt nhất. Nó giúp bạn biết cách sử dụng, và nếu bạn không thường luyện tập bạn sẽ quên cái đã học.

### Thực hành
- Xác định tính năg
- Coi CSS3 là phần thưởng thị giác cho trình duyệt có khả năng
- Dùng con nêm cho tính năng HTML5 nếu chúng không hoạt động đủ tốt

## 8.TÍNH TRUY CẬP (ACCESSIBILITY)
### Con người
Tính truy cận là vấn đề, nó là vấn đề với những ai cố dùng sản phẩn của ta mà họ bị khuyết tật, nó ở trong hợp đồng của ta, nó cũng trực tiếp liên quan tớn luật phân biệt ta cần biết, cũng như biết việc gì đúng phải làm.
Viết cú pháp HTML, CSS linh hoạt với giao diện và kích thước phông cũng như dùng Javascript để thêm hỗ trợ bàn phioms còn một con đường dài phải đi để khiến web app dễ truy cập nhất có thể được.
Không luôn luôn khó để làm một thứ dễ truy cập, luôn luôn hỏi mình có thể làm gì để nâng cao tính truy cập của trang.

### Khuyết tật thị giác
Hỗ trợ người dùng bị mù màu xem mành hình với phần mềm như JAWS/NVDA là trường hợp hiển nhiên, nhưng vẫn còn những điều khác nữa. Dùng mọt phông cữ dễ đọc và thêm nhưng stylesheets cho các kích thước phông khác nhau. Dùng đủ tương phản giữa các màu nền để tăng tính dễ đọc.

### Bảng và mẫu dễ truy cập
Giữ bảng đơn giản và tránh tiêu đề lồng nhau. Dùng thành phần `<th>` cho ô tiêu đề với scope đúng là bước đầu để tạo bảng.
```html
<table>
  <tr>
    <th scope="col">Name</th>
    <th scope="col">Age</th>
    <th scope="col">Birthday</th>
  </tr>
  <tr>
    <th scope="row">Jackie</th>
    <td>5</td>
    <td>April 5</td>
  </tr>
  <tr>
    <th scope="row">Beth</th>
    <td>8</td>
    <td>January 14</td>
  </tr>
</table>
```
Nối nhãn với dữ liệu đầu vào cho phần thuốc tính là bước đầu để làm mẫu đơn giản
```html
<label for="email">Email</label>
<input id="email">
```
Học thêm tại http://www.456bereastreet.com/archive/200410/bring_on_the_tables/
http://www.webstandards.org/learn/tutorials/accessible-forms/









