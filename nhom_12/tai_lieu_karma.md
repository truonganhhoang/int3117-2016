# Karmar

## I. Giới thiệu
### I.1. Karma là gì?
[Karma](https://karma-runner.github.io) là một test runner được xây dựng bởi đội ngũ phát triển [AngularJS](https://www.angularjs.org/)
>On the AngularJS team, we rely on testing and we always seek better tools to make our life easier. That's why we created Karma - a test runner that fits all our needs.


### I.2. Hoạt động 
- Karma cần có một file cấu hình để điểu khiển việc chạy test (Ví dụ: `karma-unit.conf.js`).
- Vì là một `test runner` nên Karma làm nhiệm vụ len lỏi khắp project, quet tất cả các file (được config sẵn), gom tất cả cả các unit test trong project và chạy chúng sau đó đưa ra các report.

### I.3. Plugin
- Bản thân Karma chỉ là một công cụ để chạy test, chứ nó không thể viết được các unit test. Do đó, Karma cần sử dụng các plugin khác để viết các unit test.
- Các plugin thông dụng hỗ trợ cho Karma:
	+ [Jasmine](https://jasmine.github.io/)
	+ [Mocha](https://mochajs.org/)
	+ [QUnit](https://qunitjs.com/)
	+ ... 

### I.4. Tại sao nên sử dụng Karma?
Có 6 điều sẽ thuyết phục bạn sử dụng Karma cho dự án của mình:

- **Test trên thiết bị thật**: Test code của bạn ngay trên trình duyệt và các thiết bị khác như: mobile, tablet, ...
- **Cấu hình dễ dàng**: Thông qua một file config bạn có thể tùy biến luồng chạy test của mình (thông qua terminal hoặc IDE).
- **Karma là một Open source**: Karma miễn phí và được xây dựng bởi cộng đồng sử dụng ở trên Github.
- **Hỗ trợ các Unit test phổ biến**: Jasmine, Mocha, QUnit, ...
- **Dễ dàng Debug**: Debug ngay trên IDE thông qua Webstorm hoặc browser.
- **Tiếp tục cập nhật thêm**: Jenkins, Travis, Semaphone.

## II. Cài đặt
### II.1. Environment
- Trước tiên, bạn cần cài đặt Nodejs [Nodejs](https://nodejs.org/) và npm.
- Karma và plugin:

>	$ npm install karma --save-dev

>	$ npm install karma-jasmine karma-chrome-launcher --save-dev

>	$ ./node_modules/karma/bin/karma start


- Commandline Interface
> $ npm install -g karma-cli

### II.2. Config
- Tạo file config: Gõ lệnh `karma init karma-unit.conf.js` để tạo file cấu hình.
- Cấu trúc chung cho một file config:

> module.exports = function(config) {
>  config.set({
>    basePath: '../..',
>    frameworks: ['jasmine'],
>    //...
>  });
> };

- Chạy test:

> $ karma start my.conf.js

### II.3. Thông số trong file config
Các thông số chi tiết được viết rất rõ trong [Document](https://karma-runner.github.io/1.0/config/configuration-file.html) của Karma. Trong này, chỉ có một số thống số cơ bản đủ để bạn có thể cài đặt cho test của mình.


----------


#### autoWatch
**Type**: Boolean

**Default**: `true`

**CLI**: `--auto-watch`, `--no-auto-watch`

**Description**: Tự động phát hiện các file khi chúng có sự thay đổi.


----------


#### browserDisconnectTimeout
**Type**: Number

**Default**: 2000

**Description**: Thời gian mà Karma chờ khi browser kết nối lại.


----------


#### browsers
**Type**: Array

**Default**: []

**CLI**: `--browsers Chrome`, `Firefox`

**Possible Values**:
- Chrome (launcher comes installed with Karma)
- ChromeCanary (launcher comes installed with Karma)
- PhantomJS (launcher comes installed with Karma)
- Firefox (launcher requires karma-firefox-launcher plugin)
- Opera (launcher requires karma-opera-launcher plugin)
- IE (launcher requires karma-ie-launcher plugin)
- Safari (launcher requires karma-safari-launcher plugin)

**Description**: Danh sách các browser được chạy khi chạy Karma (http://localhost:9876/).

----------


#### colors
**Type**: Boolean

**Default**: `true`

**CLI**: `--colors`, `--no-colors`

**Description**: Hiển thị hoặc ẩn đi màu của output (reporters và logs).

----------


#### exclude
**Type**: Array

**Default**: []

**Description**: Danh sách files/patterns Karma bỏ qua không duyệt.

----------


#### files
**Type**: Array

**Default**: []

**Description**: Danh sách files/patterns Karma sẽ quét và tìm ra các Unit test, đồng thời nếu các file/patterns có sự thay đổi thì sẽ được Karma phát hiện.

----------


#### frameworks
**Type**: Array

**Default**: []

**Description**: Danh sách các Framework mà bạn muốn sử dụng: Jasmine, Mocha, QUnit, ...

----------


#### hostname
**Type**: String

**Default**: 'localhost'

**Description**: Hostname sử dụng khi chạy browser.

----------


#### port
**Type**: Number

**Default**: 9876

**CLI**: `--port 9876`

**Description**: Cổng mà web server lắng nghe.

----------


#### protocol
**Type**: String

**Default**: 'http:'

**Possible Values**: `http:`, `https:`

**Description**: Giao thức chạy trên Karma webserver.

----------


#### reporters
**Type**: Array

**Default**: ['progress']

**CLI**: `--reporters progress`, `growl`

**Possible Values**: `dots`, `progress`

**Description**: Danh sách các reporter được sử dụng.

----------


#### restartOnFileChange
**Type**: Boolean

**Default**: false

**Description**: Khi Karma phát hiện các file trong project có sự thay đổi, `true` thì nó sẽ tự động khởi động lại việc chạy test, còn `false` thì ngược lại.

----------


#### retryLimit
**Type**: Number

**Default**: 2

**Description**:  Khi browser bị crash, Karma sẽ khởi động lại browser đó, `retryLimit` quy định số lần khởi động lại đó.

## III. Demo

[Source code Demo Karma](https://github.com/minhnt58/int3117-2016/blob/master/nhom_12/source_code/unit-test-karma.zip)
