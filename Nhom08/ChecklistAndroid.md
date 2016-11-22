# Coding Style Guide
Tài liệu xây dựng trên tài liệu tham khảo https://source.android.com/source/code-style.html

## 1. Luật trong ngôn ngữ (Java language rules)

### 1.1 Đừng bỏ qua trường hợp ngoại lệ

Bạn không bao giờ được làm như sau:

```java
void setServerPort(String value) {
    try {
        serverPort = Integer.parseInt(value);
    } catch (NumberFormatException e) { }
}
```

Theo bạn nghĩ nó có thể không bao giờ xảy ra, nhưng một ngày nào đó bạn của bạn sẽ gặp vấn đề này. Bạn phảixử lý các ngoại lệ theo nguyên tắc tùy thuộc vào từng trường hợp có xử lý khác nhau.
#### Có thể lựa chọn các thay thế sau theo thứ tự ưu tiên:
* Ném ngoại lệ cho người gọi phương thức

```java
void setServerPort(String value) throws NumberFormatException {
    serverPort = Integer.parseInt(value);
}
```
* Ném lại ngoại lệ với lớp trừu tượng của bạn

```java
void setServerPort(String value) throws ConfigurationException {
    try {
        serverPort = Integer.parseInt(value);
    } catch (NumberFormatException e) {
        throw new ConfigurationException("Port " + value + " is not valid.");
    }
}
```

* Thay thế một giá trị thích hợp, như giá trị mặc định chẳng hạn

```java
void setServerPort(String value) {
    try {
        serverPort = Integer.parseInt(value);
    } catch (NumberFormatException e) {
        serverPort = 80;  // default port for server 
    }
}
```

* Ném ngoại lệ vào một RuntimeException mới. Nhưng bạn chắc chắn rằng bạn muốn làm điều này, vì nó sẽ gây lỗi ứng dụng

```java
void setServerPort(String value) {
    try {
        serverPort = Integer.parseInt(value);
    } catch (NumberFormatException e) {
        throw new RuntimeException("port " + value " is invalid, ", e);
    }
}
```

* Cuối cùng bạn sẽ loại bỏ nó nhưng phải có một lý do chính đáng

```java
void setServerPort(String value) {
    try {
        serverPort = Integer.parseInt(value);
    } catch (NumberFormatException e) {
        // Method is documented to just ignore invalid user input.
        // serverPort will just be unchanged.
    }
}
```

### 1.2 Không được bắt ngoại lệ chung(Don't Catch Generic Exception)
Không làm điều này. Trong hầu hết các trường hợp, nó là không thích hợp để bắt ngoại lệ chung chung hoặc Throwable (tốt hơn là không Throwable vì nó bao gồm các trường hợp ngoại lệ Lỗi). Nó là rất nguy hiểm bởi vì nó có nghĩa là trường hợp ngoại lệ, bạn không bao giờ mong đợi (kể cả RuntimeExceptions như ClassCastException) bị bắt trong xử lý lỗi ở cấp ứng dụng.

```java
try {
    someComplicatedIOFunction();        // may throw IOException 
    someComplicatedParsingFunction();   // may throw ParsingException 
    someComplicatedSecurityFunction();  // may throw SecurityException 
    // phew, made it all the way 
} catch (Exception e) {                 // I'll just catch all exceptions 
    handleError();                      // with one generic handler!
}
```
Lựa chọn thay thế để bắt ngoại lệ chung:

* Nắm bắt từng ngoại lệ riêng như bắt khối riêng biệt sau khi một thử duy nhất. Đây có thể là vụng về nhưng vẫn còn thích hợp hơn để bắt tất cả các trường hợp ngoại lệ. Hãy coi chừng lặp đi lặp lại quá nhiều mã trong khối catch.

* Refactor mã của bạn để có xử lý lỗi nhiều hạt mịn, với nhiều khối try. Phân ra IO từ các phân tích, xử lý lỗi riêng trong từng trường hợp.

* Rethrow ngoại lệ. Nhiều lần bạn không cần phải bắt ngoại lệ ở cấp độ này dù sao, chỉ cần để cho phương pháp ném nó

### 1.3 Không sử dụng finalizers
Finalizers là một cách để có một đoạn mã thực thi khi một đối tượng là thu gom rác. 
Trong khi họ có thể thuận tiện cho việc dọn dẹp (đặc biệt là các nguồn lực bên ngoài), không có bảo đảm như khi một finalizer sẽ được gọi (hoặc thậm chí là nó sẽ được gọi ở tất cả)


### 1.4 Fully qualify imports
Khi bạn muốn sử dụng lớp Bar từ gói foo, có hai cách để có thể import nó:

Không tốt: `import foo.*;`

* Có khả năng làm giảm số lượng các báo cáo imports.

Tốt: `import foo.Bar;`

* Làm cho nó rõ ràng những gì các lớp học được thực tế sử dụng và mã là có thể đọc được nhiều hơn cho bảo trì.

## 2 Java style rules

### 2.1 Định nghĩa và đặt tên

Các trường cần được định nghĩa ở đầu file và tuân theo cú pháp đặt tên như sau.


* Non-public, non-static tên trường bắt đầu bằng chữ __m__.
* static tên trường bắt đầu bằng chữ s __s__.
* Các trường hợp khác bắt đầu bằng chữ viết thường(lower case).
* Public static final đây là một hằng số chúng sẽ sử dụng cú pháp ALL_CAPS_WITH_UNDERSCORES.

Ví dụ:

```java
public class MyClass {
    public static final int SOME_CONSTANT = 42;
    public int publicField;
    private static MyClass sSingleton;
    int mPackagePrivate;
    private int mPrivate;
    protected int mProtected;
}
```

### 2.2 Treat Acronyms as Words

Đặt tên biến, phương thức và lớp. Cần viết tắn như lời nói.

| Tốt          | Xấu           |
| -------------- | -------------- |
| `XmlHttpRequest` | `XMLHTTPRequest` | 
| `getCustomerId`  | `getCustomerID`  | 
| `String url`     | `String URL`     |
| `long id`        | `long ID`        |

### 2.3 Sử dụng khoảng trống(trắng)

Sử dụng 4 khoảng trống cho một khối:

```java
if (x == 1) {
    x++;
}
```

Sử dụng 8 khoảng trống cho việc xuống dòng

```java
Instrument i =
        someLongExpression(that, wouldNotFit, on, one, line);
```

### 2.4 Sử dụng ngoặc kép chuẩn trong Java

```java
class MyClass {
    int func() {
        if (something) {
            // ...
        } else if (somethingElse) {
            // ...
        } else {
            // ...
        }
    }
}
```

Trong một số trường hợp ___không sử dụng ngoặc kép___

```java
if (condition) body();
```
Không nên 

```java
if (condition)
    body();  // không tốt!
```

### 2.5 Tiêu chuẩn mặc định chú thích (annotations) trong Java

Theo hướng dẫn trong Android code style guide, Tiêu chuẩn cho chú thích được xác định như sau:

* `@Override`: Phải được sử dụng bất cứ khi nào muốn ghi đè một phương thức từ lớp cha. Ví dụ bạn cần sử dụng phương thức onCreate từ lớp cha Activity thì bạn cần phải ghi đè nó @Override
* `@ SuppressWarnings `: Chú thích này chỉ sử dụng khi mà không thể loại bỏ một cảnh báo

### 2.6 Giới hạn phạm vi của biến

Phạm vi của biến nên giữ một cách tối thiểu. Bởi nếu làm điều đó thì code của bạn dễ đọc, dễ sửa chữa và giảm thiểu lỗi. Mỗi biến cần khái báo trong khối bên trong nhất mà có ứng dụng có thể sử dụng nó.

Biến cục bộ sẽ tồn tại khi lần đầu tiên chúng ta sử dụng. và các biết cục bộ cần phải khai báo. Nếu chưa đủ thông tin để khởi tạo bạn cần chờ đến khi có thể làm. [Xem thêm](https://source.android.com/source/code-style.html#limit-variable-scope)

### 2.7 Hướng dẫn Log

`Log` là một class in ra kết quả lỗi hoặc thông tin nào đó giúp lập trình viên gỡ rối vấn đề:

* `Log.v(String tag, String msg)` (verbose)
* `Log.d(String tag, String msg)` (debug)
* `Log.i(String tag, String msg)` (information)
* `Log.w(String tag, String msg)` (warning)
* `Log.e(String tag, String msg)` (error)

Như một quy định chung, chúng ta khai báo một TAG ở mỗi một file:

```java
public class MyClass {
    private static final String TAG = "MyClass";

    public myMethod() {
        Log.e(TAG, "Thông báo lỗi");
    }
}
```

Và bạn muốn hủy Log khi `Release` và chỉ muốn hiện khi `Debug`:

```java
if (BuildConfig.DEBUG) Log.d(TAG, "Giá trị của bạn X là " + x);
```

