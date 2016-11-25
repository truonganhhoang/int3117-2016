# Ví dụ sử dụng công cụ jshint (lint cho javascript)

## Cài đặt jshint

Sử dụng `npm` để cài đặt: `npm install -g jshint`

## Cài đặt các tùy chọn cho kiểm thử

Mỗi cá nhân, nhóm, hoặc doanh nghiệp đều có những quy chuẩn riêng về coding, do đó cần mô tả các quy định, quy ước riêng về code để jshint có thể hiểu được code như thế nào mới là "đúng" với bạn.
Tạo một file mô tả các quy chuẩn áp dụng cho kiểm thử, tên là `.jshintrc` đặt tại cùng cấp thư mục với file cần kiểm thử
File này có định dạng json, ví dụ như sau:
```json
{
    "node": true,
    "eqeqeq": true,
    "esversion": 6,
    "maxdepth": 5
}
```
Xem đầy đủ các tùy chọn kiểm tra tại: http://jshint.com/docs/options
Xem ví dụ mẫu `.jshintrc` tại: https://github.com/jshint/jshint/blob/master/examples/.jshintrc

## Chạy jshint

Từ commandline (hoặc terminal) chạy: `jshint <file-name>`
Ví dụ: `jshint app.js`

Kết quả: