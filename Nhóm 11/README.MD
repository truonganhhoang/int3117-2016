# Bài tập nhóm 11 :+1:

## Giới thiệu về framework Galen
  + Giới thiệu sơ lược đã có trong slide 
  + Giới thiệu chi tiết tham khảo tại http://galenframework.com/docs/getting-started-install-galen/
  + Đính chính: Galen có hỗ trợ test với các luồng bằng ngôn ngữ Galen Specs, ví dụ cụ thể:
```
@@ Table devices    
      | deviceName  | size     | tags     |   
      | mobile      | 450x700  | mobile   |   
      | tablet      | 600x800  | tablet   |
      | desktop     | 1024x768 | desktop  |
  
@@ Parameterized using devices  
Home page on ${deviceName}    
      http://example.com ${size}   
          inject custom-cookies.js  
          check homepage.spec --include ${tags}   
  
@@ Parameterized using devices    
User profile page on ${deviceName}    
      http://example.com ${size}   
          run loginAsTestUser.js   
          wait 1m until visible "css: #login-button"   
          check userProfile.spec --include ${tags} 
```
Trong ví dụ trên ta thấy phần @@ Table devices khai báo các biến thiết bị với kích thước, phần @@ Parameterized using devices sử dụng các thiết bị đã được tham số hóa, dùng các lệnh gần với ngôn ngữ tự nhiên ví dụ như "run loginAsTestUser.js", "wait 1m until visible "css: #login-button" "... Nhưng nhìn chung, vẫn phải viết những file .js (hoặc selenium) để miêu tả các luồng, Galen chỉ import các file đó để dùng cho thuận tiện, điều khiển luồng của Galen vẫn còn nhiều hạn chế. 

## Demo Test
  + Download file TestDemo.zip
  + Download và cài đặt Galen tại http://galenframework.com/download/
  + Chạy test theo hướng dẫn trong slide hoặc xem chi tiết tại http://galenframework.com/docs/reference-working-in-command-line/
