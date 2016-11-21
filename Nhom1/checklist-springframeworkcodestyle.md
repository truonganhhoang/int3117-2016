# Tiêu chuẩn mã nguồn cho Spring Framework

_Tài liệu này dịch từ tài liệu [Spring Framework Code Stype](https://github.com/spring-projects/spring-framework/wiki/Spring-Framework-Code-Style)._

## Giới thiệu

Tài liệu này định nghĩa những tiêu chuẩn mã nguồn cho Spring Framework. Ban đầu nó được áp dụng cho đội phát triển Spring Framework, nhưng có thể được những người đóng góp tham khảo.

Cấu trúc của tài liệu này dựa trên tài liệu tham khảo [Google Java Style](https://google.github.io/styleguide/javaguide.html) và _đang trong quá trình hoàn thiện_.

## Những điều căn bản về tệp mã nguồn

### Chuẩn mã hóa tệp: UTF-8

Tệp mã nguồn phải được mã hóa sử dụng `UTF-8`.

### Căn chỉnh mã nguồn

* Căn chỉnh mã nguồn sử dụng _tab_ (không dùng cách trống)
* Ký tự kết thúc dòng chuẩn Unix (LF), không dùng DOS (CRLF)
* Loại bỏ toàn bộ ký tự cách trống thừa
  * Trên Linux, Max, v.v.: `find . -type f -name "*.java" -exec perl -p -i -e "s/[ \t]$//g" {} \;`

## Cấu trúc tệp mã nguồn

Một tệp mã nguồn bao gồm những phần sau, theo đúng thứ tự:

* Giấy phép (License)
* Dòng lệnh khai báo package
* Các dòng import
* Đúng một lớp bậc cao nhất

Đúng một dòng trống chia cách mỗi phần trên.

### Giấy phép

Mỗi tệp mã nguồn phải nêu rõ giấy phép sau tại đầu mỗi tệp:

    /*
     * Copyright 2002-2016 the original author or authors.
     *
     * Licensed under the Apache License, Version 2.0 (the "License");
     * you may not use this file except in compliance with the License.
     * You may obtain a copy of the License at
     *
     *      http://www.apache.org/licenses/LICENSE-2.0
     *
     * Unless required by applicable law or agreed to in writing, software
     * distributed under the License is distributed on an "AS IS" BASIS,
     * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * See the License for the specific language governing permissions and
     * limitations under the License.
     */

Luôn kiểm tra khoảng thời gian trong tiêu đề giấy phép. Ví dụ, nếu có thay đổi một tệp trong năm 2016 những tiêu đề vẫn là:
```   
* Copyright 2002-2013 the original author or authors.
```
Phải được sửa đổi năm thành 2016:
```
* Copyright 2002-2016 the original author or authors.
```

### Các dòng import

Các dòng import được cấu trúc như sau:

* import `java.*`
* import `javax.*`
* dòng trống
* import all other imports
* dòng trống
* import `org.springframework.*`
* dòng trống
* import static all other imports

Đồng thời, những import tĩnh (static) không nên sử dụng trong mã nguồn chạy. Nên sử dụng chúng trong mã kiểm thử, đặc biệt những thứ như `org.junit.Assert`.

### Tổ chức tệp mã nguồn Java

Dưới đây là những điều chỉnh cách các thành phần của tệp mã nguồn được tổ chức:

1. các trường tĩnh
1. các trường bình thường
1. các hàm khởi tạo
1. các phương thức (private) được gọi từ hàm khởi tạo
1. static factory methods
1. các thuộc tính của JavaBean (ví dụ, getters and setters)
1. các phương thức cài đặt từ giao diện
1. private hay protected templates mà được gọi từ các phương thức cài đặt từ giao diện
1. các phương thức khác
1. `equals`, `hashCode`, và `toString`

Để ý rằng phương thức private hay protected gọi từ phương thức cài đặt từ giao diện nên được đặt ngay dưới phương thức nơi mà chúng được sử dụng. Hay nói cách khác nếu có 3 phương thức cài đặt giao diện với 3 phương thức private (tương ứng), thì thứ tự của các phương thức nên là 1 giao diện và 1 phương thức private liền nhau, không phải 3 giao diện rồi 3 phương thức private sau đó.

Trên hết, cách tổ chức của mã nguồn nên cảm thấy _tự nhiên_.

## Định dạng

### Dấu ngoặc nhọn

#### Tạo dạng khối: kiểu K&R 

Đa phần các dấu ngoặc nhọn được theo _kiểu Kernighan và Ritchie_ (hay, "Dấu ngoặc kiểu Ai Cập") áp dụng cho những không không rỗng và tạo dạng:

* Không có xuống dòng trước dấu mở ngoặc nhọn nhưng có một dấu cách trống phía trước
* Một dấu xuống dòng sau dấu mở ngoặc nhọn
* Một dấu xuống dòng trước dấu đóng ngoặc nhọn
* Một dấu xuống dòng sau dấu đóng ngoặc nhọn nếu nó kết thúc câu lệnh hoặc thân của phương thức, hàm khởi tạo, hay tên lớp
* Một dấu xuống dòng trước lệnh else, catch và finally.

Ví dụ:

```
return new MyClass() {
    @Override 
    public void method() {
        if (condition()) {
            something();
        }
        else {
            try {
                alternative();
            } 
            catch (ProblemException ex) {
                recover();
            }
        }
    }
};
```

### Ngắt dòng

Một dòng tiêu chuẩn chứa khoảng 90 ký tự. Trong một số trường hợp có thể tối ưu số lượng ký tự bằng cách refactor mã lệnh. Một số trường hợp không thể làm vậy.

90 ký tự không phải là giới hạn bắt buộc. Một dòng chứa 90-105 ký tự có thể được chấp nhận trong nhiều trường hợp khi dòng đó dễ đọc và nơi việc đóng gói có tác động không tốt đến việc đọc mã lệnh. Đây cũng là trường hợp khó để tìm được sự nhất quán. Bạn có thể linh hoạt điều chỉnh giữa 2 cách trên.

Một dòng chứa khoảng 105-120 ký tự được chấp nhận nhưng nên hạn chế.

Một dòng không nên chứa quá 120 ký tự.

Một ngoại lệ cho các quy tắc ngắt dòng khi viết Javadoc, chỉ cho phép tối đa 80 ký tự trong tất cả các trường hợp, ví dụ: trên Github, trên điện thoại,...

Khi đóng gói những biểu hiện dài, 90 ký tự là độ dài đúng tiêu chuẩn. Nên thêm ký tự ngắt khi kết thúc một dòng, không nên thêm ở đầu dòng tiếp theo. Ví dụ:

```
if (thisLengthyMethodCall(param1, param2) && anotherCheck() &&
        yetAnotherCheck()) {

    // ....
}
```

### Dòng trống

Thêm hai dòng trống trước mỗi phần tử sau:

* Khối lệnh `static {}`
* Thuộc tính
* Phương thức khởi tạo
* Inner classes

Thêm một dòng trống sau mỗi câu lệnh khai báo phương thức nếu phương thức đó được khai báo trên nhiều dòng. Ví dụ:

```
@Override
protected Object invoke(FooBarOperationContext context, 
        AnotherSuperLongName name) {

    // code here
}
```

## Khai báo lớp

Cố gắng hết mức có thể đặt các phần `implements`, `extends` trên cùng một dòng khai báo.

Sắp xếp các lớp sao cho những lớp quan trọng nhất xếp trước.

## Đặt tên

### Đặt tên hằng

Đặt tên cho hằng sử dụng `CONSTANT_CASE`: tất cả các chữ viết hoa, các từ được cách nhau bởi dấu gạch dưới.

Mọi hằng đều là một trường `static final`, nhưng không phải tất cả trường `static final` là hằng. Vậy nên chỉ áp dụng kiểu đặt tên hằng nếu trường **thực sự** là hằng.

Ví dụ:

```
// Constants
private static final Object NULL_HOLDER = new NullHolder();
public static final int DEFAULT_PORT = -1;

// Not constants
private static final ThreadLocal<Executor> executorHolder = new ThreadLocal<Executor>();
private static final Set<String> internalAnnotationAttributes = new HashSet<String>();
```

### Đặt tên biến

Tránh sử dụng một ký tự để đặt tên biến. Ví dụ sử dụng `Method method` thay cho `Method m`.

## Một số bài học thực tiễn (Programming Practices)

### Lịch sử tệp

* Một tệp nên thể hiện ra là nó chỉ được tạo bởi một tác giả duy nhất, không phải là một lịch sử các thay đổi
* Không nên dàn trải những thứ thuộc về nhau

### Tổ chức các phương thức setter

Chọn khôn ngoan vị trí để thêm một phương thức setter; không nên đơn giản them nó vào cuối danh sách. Có thể phương thức setter này liên quan đến một phương thức setter khác hoặc một nhóm nào đấy. Trong trường hợp đó nó nên được đặt gần những phương thức đó.

* Thứ tự các phương thức setter phản ánh thứ tự quan trọng, không phải thứ tự lịch sử
* Thứ tự của các _fields_ và _setters_ nên **nhất quán**

### Toán tử ba ngôi

Đặt toán tử ba ngôi trong ngoặc, ví dụ: `return (foo != null ? foo: "default");`

Đồng thời đảm bảo rằng điều kiện _not null_ được đặt lên trước.

### Kiểm tra Null

Sử dụng phương thức tĩnh `org.springframework.util.Assert.notNull` để kiểm tra xem một tham số không phải `null`. Định dạng tin nhắn ngoại lệ sao cho tên của tham số đặt lên trước theo sau là cụm "_must not be null_". Ví dụ:

```
public void handle(Event event) {
    Assert.notNull(event, "Event must not be null");
    //...
}
```

### Sử dụng @Override

Luôn luôn thêm `@Override` vào trước phướng thức cài đè hoặc cài đặt một phương thức được khai báo trong lớp cha.

### Sử dụng @since

* `@since` nên được thêm vào mỗi một lớp mới đi kèm với số phiên bản của framework mà nó được giới thiệu
* `@since` nên được thêm vào mỗi phương thức **public** và **protected** *mới* của một lớp đã tồn tại

### Các lớp tiện ích

Một lớp mà chỉ bao gồm những hàm tiện ích tĩnh phải được đặt tên với hậu tố `Utils`, phải có hàm khởi tạo mặc định là private, và phải là lớp trừu tượng. Làm một lớp trừu tượng và cung cấp một hàm khởi tạo _mặc định_ `private` ngăn chặn việc ai đó khởi tạo nó. Ví dụ:

```
public abstract MyUtils {

    private MyUtils() {
        /* prevent instantiation */
    }

    // static utility methods
}
```
### Thuộc tính và Phương thức

Một thuộc tính của một lớp nên được sử dụng cùng với từ `this`. Tuy nhiên một phương thức không nên sử dụng với từ `this`.

## Javadoc

### Đinh dạng Javadoc

Mẫu dưới đây là ví dụ cho việc sử dụng Javadoc của một phương thức.

```
/**
 * Parse the specified {@link Element} and register the resulting
 * {@link BeanDefinition BeanDefinition(s)}.
 * <p>Implementations must return the primary {@link BeanDefinition} that results
 * from the parsing if they will ever be used in a nested fashion (for example as
 * an inner tag in a {@code <property/>} tag). Implementations may return
 * {@code null} if they will <strong>not</strong> be used in a nested fashion.
 * @param element the element that is to be parsed into one or more {@link BeanDefinition BeanDefinitions}
 * @param parserContext the object encapsulating the current state of the parsing process;
 * provides access to a {@link org.springframework.beans.factory.support.BeanDefinitionRegistry}
 * @return the primary {@link BeanDefinition}
 */
BeanDefinition parse(Element element, ParserContext parserContext);
```

Đặc biệt, lưu ý:

* Sử dụng chuẩn bắt buộc (ví dụ: _Return_ và not _Returns_) ở dòng đầu tiên.
* Không có dòng trống giữa mô tả phương thức và mô tả tham số.
* Nếu mô tả được định nghĩa trong nhiều đoạn, nên bắt đầu mỗi đoạn bằng thẻ `<p>`.
* Nếu mô tả tham số cần được đóng gói, không lùi ở dòng tiếp theo (xem `parserContext`).

Javadoc của một lớp có thêm một số quy định được mô tả ở ví dụ sau đây:

```
/*
 * Interface used by the {@link DefaultBeanDefinitionDocumentReader} to handle custom,
 * top-level (directly under {@code <beans/>}) tags.
 *
 * <p>Implementations are free to turn the metadata in the custom tag into as many
 * {@link BeanDefinition BeanDefinitions} as required.
 *
 * <p>The parser locates a {@link BeanDefinitionParser} from the associated
 * {@link NamespaceHandler} for the namespace in which the custom tag resides.
 *
 * @author Rob Harrop
 * @since 2.0
 * @see NamespaceHandler
 * @see AbstractBeanDefinitionParser
 */
```

* Mỗi lớp phải có thẻ `@since` kèm theo là phiên bản của lớp.
* Thứ tự các thẻ mô tả lớp trong Javadoc là `@author`, `@since` và `@see`.
* Ngược lại với thứ tự các thẻ mô tả phương thức trong Javadoc, mỗi đoạn mô tả của lớp được ngăn cách nhau bởi dòng trống.

Sau đây có thêm một số quy định khi viết Javadoc:

* Sử dụng thẻ `{@code}` để nhóm các câu mã lệnh hoặc giá trị ví dụ `null`.
* Nếu một đối tượng chỉ sử dụng một phần tử hãy dùng thẻ `{@link}` và sử dụng tên đầy đủ để tránh `import` một khai báo không cần thiết.

## Kiểm thử

### Đặt tên

Mỗi lớp Test phải được đặt tên kết thúc với từ `Tests`.