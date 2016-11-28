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

##1. Các trình duyệt 

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

##4. JavaScript
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
Nân cấp tiếp diễn cũng hỗ trợ bảo trì, giữ javascript tách biệt có nghĩa là không cần tìm tất cả tài liệu cho phần gọi hàm.





