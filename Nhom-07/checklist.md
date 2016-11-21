*Translated from https://github.com/airbnb/javascript/blob/master/react/README.md*

# Airbnb React/JSX Style Guide

*Một phương cách tiếp cận hợp lý nhất với React và JSX*

## Nội dung

  1. [Nguyên tắc cơ bản](#nguyên-tắc-cơ-bản)
  1. [Lớp vs `React.createClass` vs Phi trạng thái](#lớp-vs-reactcreateclass-vs-phi-trạng-thái)
  1. [Quy tắc đặt tên](#quy-tắc-đặt-tên)
  1. [Khai báo](#khai-báo)
  1. [Căn chỉnh](#căn-chỉnh)
  1. [Dấu ngoặc kép](#dấu-ngoặc-kép)
  1. [Sự cách khoảng](#sự-cách-khoảng)
  1. [Props](#props)
  1. [Refs](#refs)
  1. [Dấu ngoặc đơn](#dấu-ngoặc-đơn)
  1. [Tags](#tags)
  1. [Phương thức](#phương-thức)
  1. [Thứ tự phương thức](#thứ-tự-phương-thức)
  1. [`isMounted`](#ismounted)

## Nguyên tắc cơ bản

  - Chỉ bao gồm một thành phân React trong mỗi file
    - Tuy nhiên, nhiều [Stateless, or Pure, Components](https://facebook.github.io/react/docs/reusable-components.html#stateless-functions) có thể được bao gồm trong cùng một file. eslint: [`react/no-multi-comp`](https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/no-multi-comp.md#ignorestateless).
  - Luôn luôn sử cú pháp của JSX.
  - Đừng sử dụng `React.createElement` trừ khi bạn đang khởi tạo ứng dụng từ một file không phải là JSX.

## Lớp vs `React.createClass` vs Phi trạng thái

  - Nếu bạn có state (trạng thái) cục bộ và/hoặc refs (trả về một tham chiếu đến các thành phần DOM), ưu tiên `class extends React.Component` hơn `React.createClass` trừ khi bạn có lí do phù hợp để sử dụng mixins. eslint: [`react/prefer-es6-class`](https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/prefer-es6-class.md) [`react/prefer-stateless-function`](https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/prefer-stateless-function.md)

    ```jsx
    // bad
    const Listing = React.createClass({
      // ...
      render() {
        return <div>{this.state.hello}</div>;
      }
    });

    // good
    class Listing extends React.Component {
      // ...
      render() {
        return <div>{this.state.hello}</div>;
      }
    }
    ```

    Và nếu bạn không quản lý trạng thái hay refs, thì hãy ưu tiên các hàm thông thường (không phải hàm con trỏ) hơn các lớp:

    ```jsx
    // bad
    class Listing extends React.Component {
      render() {
        return <div>{this.props.hello}</div>;
      }
    }

    // bad (relying on function name inference is discouraged)
    const Listing = ({ hello }) => (
      <div>{hello}</div>
    );

    // good
    function Listing({ hello }) {
      return <div>{hello}</div>;
    }
    ```

## Quy tắc đặt tên

  - **Phần mở rộng**: Dùng `.jsx` cho các thành phân của React.
  - **Tên tệp**: áp dụng PascalCase cho tên tệp. E.g., `ReservationCard.jsx`.
  - **Đặt tên cho tham chiêu**: áp dụng PascalCase cho tên các thành phần React và camelCase cho tên thực thể của chúng. eslint: [`react/jsx-pascal-case`](https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/jsx-pascal-case.md)

    ```jsx
    // bad
    import reservationCard from './ReservationCard';

    // good
    import ReservationCard from './ReservationCard';

    // bad
    const ReservationItem = <ReservationCard />;

    // good
    const reservationItem = <ReservationCard />;
    ```

  - **Đặt tên thành phần**: sử dụng tên file như là tên của thành phần. Ví dụ, `ReservationCard.jsx` nên có tên tham chiếu là tên của `ReservationCard`. Tuy nhiên, với các thành phần gốc của thư mục, sử dụng `index.jsx` như tên file và sử dụng tên thư mục như tên của thành phần:

    ```jsx
    // bad
    import Footer from './Footer/Footer';

    // bad
    import Footer from './Footer/index';

    // good
    import Footer from './Footer';
    ```
  - **Đặt tên thành phần có thứ tự ưu tiên cao hơn**: Sử dụng sự kết hợp của tên thành phần có thứ tự ưu tiên cao hơn và tên của thành phần được truyền vào như `displayName` ở thành phần được tạo. Ví dụ, Thành phần ưu tiên `withFoo()`, khi truyền một thành phần `Bar` nên tạo ra một thành phần với `displayName` của `withFoo(Bar)`.

  > Tại sao? Vì `displayName` của một thành phần có thể được dùng bởi các công cụ phát triên hoặc các tin nhắn báo lỗi, và có một giá trị mà biểu đạt rõ ràng rằng mỗi quan hệ này giúp người dùng hiểu điều gì đang diễn ra.

    ```jsx
    // bad
    export default function withFoo(WrappedComponent) {
      return function WithFoo(props) {
        return <WrappedComponent {...props} foo />;
      }
    }

    // good
    export default function withFoo(WrappedComponent) {
      function WithFoo(props) {
        return <WrappedComponent {...props} foo />;
      }

      const wrappedComponentName = WrappedComponent.displayName
        || WrappedComponent.name
        || 'Component';

      WithFoo.displayName = `withFoo(${wrappedComponentName})`;
      return WithFoo;
    }
    ```

  - **Đặt tên Props**: Props được sử dụng khi người dùng cần lưu trữ dữ liệu chỉ để đọc, không thể cập nhật thay đổi. Tránh sử dụng các tên prop của thành phần DOM cho các mục đích khác nhau.

  > Tại sao? Chúng ta kỳ vong prop như `style` và `className` để định nghĩa một thứ cụ thể. Biến đối API này cho một tập con của ứng dụng khiến cho các đoạn mã khó đọc và giảm khả năng duy trì, và có thể gây ra các lỗi.

    ```jsx
    // bad
    <MyComponent style="fancy" />

    // good
    <MyComponent variant="fancy" />
    ```

## Khai báo

  - Không sử dụng `displayName` cho việc đặt tên thành phần. Thay vào đó, đặt tên thành phần bằng tham chiếu.

    ```jsx
    // bad
    export default React.createClass({
      displayName: 'ReservationCard',
      // stuff goes here
    });

    // good
    export default class ReservationCard extends React.Component {
    }
    ```

## Căn chỉnh

  - Tuân theo phương cách căn chỉnh này cho cú pháp của JSX. eslint: [`react/jsx-closing-bracket-location`](https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/jsx-closing-bracket-location.md)

    ```jsx
    // bad
    <Foo superLongParam="bar"
         anotherSuperLongParam="baz" />

    // good
    <Foo
      superLongParam="bar"
      anotherSuperLongParam="baz"
    />

    // if props fit in one line then keep it on the same line
    <Foo bar="bar" />

    // children get indented normally
    <Foo
      superLongParam="bar"
      anotherSuperLongParam="baz"
    >
      <Quux />
    </Foo>
    ```

## Dấu ngoặc kép

  - Luôn luôn dùng dấu ngoặc kép (`"`) cho các biến JSX, dấu ngoặc đơn (`'`) cho tất cả các trường hợp khác của JS. eslint: [`jsx-quotes`](http://eslint.org/docs/rules/jsx-quotes)

  > Tại sao? Biến HTML thông thưỡng cũng sử dụng dấu ngoặc kép thay cho ngoặc đơn, vì thế biến của JSX cũng áp dụng quy ước này.

    ```jsx
    // bad
    <Foo bar='bar' />

    // good
    <Foo bar="bar" />

    // bad
    <Foo style={{ left: "20px" }} />

    // good
    <Foo style={{ left: '20px' }} />
    ```

## Sự cách khoảng

  - Luôn luôn bao hàm dấu cách đơn trong các thẻ tự đóng. eslint: [`no-multi-spaces`](http://eslint.org/docs/rules/no-multi-spaces), [`react/jsx-space-before-closing`](https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/jsx-space-before-closing.md)

    ```jsx
    // bad
    <Foo/>

    // very bad
    <Foo                 />

    // bad
    <Foo
     />

    // good
    <Foo />
    ```

  - Không nên thêm khoảng cách bên trong dấu ngoặc nhọn. eslint: [`react/jsx-curly-spacing`](https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/jsx-curly-spacing.md)

    ```jsx
    // bad
    <Foo bar={ baz } />

    // good
    <Foo bar={baz} />
    ```

## Props

  - Luôn luôn áp dụng camelCase cho đặt tên prop.

    ```jsx
    // bad
    <Foo
      UserName="hello"
      phone_number={12345678}
    />

    // good
    <Foo
      userName="hello"
      phoneNumber={12345678}
    />
    ```

  - Lược bỏ giá trị của prop khi giá trị của prop rõ ràng là `true`. eslint: [`react/jsx-boolean-value`](https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/jsx-boolean-value.md)

    ```jsx
    // bad
    <Foo
      hidden={true}
    />

    // good
    <Foo
      hidden
    />
    ```

  - Luôn luôn bao gồm thuộc tính `alt` vào thẻ `<img>`. Nếu hình ảnh được biểu diễn, `alt` có thể là chuỗi trống hoặc `<img>` phải có `role="presentation"`. eslint: [`jsx-a11y/img-has-alt`](https://github.com/evcohen/eslint-plugin-jsx-a11y/blob/master/docs/rules/img-has-alt.md)

    ```jsx
    // bad
    <img src="hello.jpg" />

    // good
    <img src="hello.jpg" alt="Me waving hello" />

    // good
    <img src="hello.jpg" alt="" />

    // good
    <img src="hello.jpg" role="presentation" />
    ```

  - Không sử dụng các từ như "image", "photo", hoặc "picture" trong thuộc tính `alt`. eslint: [`jsx-a11y/img-redundant-alt`](https://github.com/evcohen/eslint-plugin-jsx-a11y/blob/master/docs/rules/img-redundant-alt.md)

  > Tại sao? Trình đọc màn hình đã công bố `img` được coi là images, do đó không cần bao hàm thông tin trên vào `alt`.

    ```jsx
    // bad
    <img src="hello.jpg" alt="Picture of me waving hello" />

    // good
    <img src="hello.jpg" alt="Me waving hello" />
    ```

  - Sử dụng hợp lệ, không tóm tắt [ARIA roles](https://www.w3.org/TR/wai-aria/roles#role_definitions). eslint: [`jsx-a11y/aria-role`](https://github.com/evcohen/eslint-plugin-jsx-a11y/blob/master/docs/rules/aria-role.md)

    ```jsx
    // bad - not an ARIA role
    <div role="datepicker" />

    // bad - abstract ARIA role
    <div role="range" />

    // good
    <div role="button" />
    ```

  - Không sử dụng `accessKey` trên các element. eslint: [`jsx-a11y/no-access-key`](https://github.com/evcohen/eslint-plugin-jsx-a11y/blob/master/docs/rules/no-access-key.md)

  > Tại sao? Mâu thuẫn giữa các phím tắt và lệnh bàn phím được sử dụng bởi người sửng dụng trình đọc màn hình và bàn phím làm phức tạp khả năng tiếp cận.

  ```jsx
  // bad
  <div accessKey="h" />

  // good
  <div />
  ```

  - Tránh sử dụng  mảng index là thuộc tính `key, ưu tiên một mã ID độc nhất. ([why?](https://medium.com/@robinpokorny/index-as-a-key-is-an-anti-pattern-e0349aece318))

  ```jsx
  // bad
  {todos.map((todo, index) =>
    <Todo
      {...todo}
      key={index}
    />
  )}

  // good
  {todos.map(todo => (
    <Todo
      {...todo}
      key={todo.id}
    />
  ))}
  ```

  - Luôn định nghĩa rõ ràng `defaultProps` cho tất cả các props không bắt buộc.

  > Tại sao? propTypes là một mẫu của tài liệu, và việc cung cấp defaultProps nghĩa là người đọc mã của bạn không phải giả định quá nhiều. Hơn nữa, nó có thể hàm ý rằng mã của bạn có thể lược bỏ các kiểu kiểm tra cụ thể. 

  ```jsx
  // bad
  function SFC({ foo, bar, children }) {
    return <div>{foo}{bar}{children}</div>;
  }
  SFC.propTypes = {
    foo: PropTypes.number.isRequired,
    bar: PropTypes.string,
    children: PropTypes.node,
  };

  // good
  function SFC({ foo, bar }) {
    return <div>{foo}{bar}</div>;
  }
  SFC.propTypes = {
    foo: PropTypes.number.isRequired,
    bar: PropTypes.string,
  };
  SFC.defaultProps = {
    bar: '',
    children: null,
  };
  ```

## Refs

  - Luôn luôn sử dụng ref callbacks. eslint: [`react/no-string-refs`](https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/no-string-refs.md)

    ```jsx
    // bad
    <Foo
      ref="myRef"
    />

    // good
    <Foo
      ref={ref => { this.myRef = ref; }}
    />
    ```

## Dấu ngoặc đơn

  - Đóng gói các thẻ JSX trong dấu ngoặc đơn khi chúng được viết nối nhau nhiều hơn một dòng. eslint: [`react/wrap-multilines`](https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/wrap-multilines.md)

    ```jsx
    // bad
    render() {
      return <MyComponent className="long body" foo="bar">
               <MyChild />
             </MyComponent>;
    }

    // good
    render() {
      return (
        <MyComponent className="long body" foo="bar">
          <MyChild />
        </MyComponent>
      );
    }

    // good, when single line
    render() {
      const body = <div>hello</div>;
      return <MyComponent>{body}</MyComponent>;
    }
    ```

## Tags

  - Luôn luôn để thẻ tự đóng nếu không có thẻ con. eslint: [`react/self-closing-comp`](https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/self-closing-comp.md)

    ```jsx
    // bad
    <Foo className="stuff"></Foo>

    // good
    <Foo className="stuff" />
    ```

  - Nếu thành phần có các thuộc tính phải viết trên nhiều dòng, đóng thẻ ở một dòng mới. eslint: [`react/jsx-closing-bracket-location`](https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/jsx-closing-bracket-location.md)

    ```jsx
    // bad
    <Foo
      bar="bar"
      baz="baz" />

    // good
    <Foo
      bar="bar"
      baz="baz"
    />
    ```

## Phương thức

  - Sử dụng hàm trỏ để đóng các biến địa phương.

    ```jsx
    function ItemList(props) {
      return (
        <ul>
          {props.items.map((item, index) => (
            <Item
              key={item.key}
              onClick={() => doSomethingWith(item.name, index)}
            />
          ))}
        </ul>
      );
    }
    ```

  - Nối các xử lý sự kiện cho phương thức `render` trong `contructor`. eslint: [`react/jsx-no-bind`](https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/jsx-no-bind.md)

  > Tại sao? Một cuộc gọi nối trong đường dẫn render tạo một phương thức có nhãn mới lên mỗi render.

    ```jsx
    // bad
    class extends React.Component {
      onClickDiv() {
        // do stuff
      }

      render() {
        return <div onClick={this.onClickDiv.bind(this)} />
      }
    }

    // good
    class extends React.Component {
      constructor(props) {
        super(props);

        this.onClickDiv = this.onClickDiv.bind(this);
      }

      onClickDiv() {
        // do stuff
      }

      render() {
        return <div onClick={this.onClickDiv} />
      }
    }
    ```

  - Không sử dụng tiền tố dấu gạch chân dưới cho các phương thức cục bộ của một thành phần React.
  > Tại sao? Tiền tố gạch chân dưới đôi khi được dùng như một quy ước trong ngôn ngữ khác để biểu thị sự riêng tư. Nhưng, không như những ngôn ngữ khác, không có một sự hỗ trợ sẵn có nào trong Javascript, mọi thứ đều là công khai. Không như ý định của bạn, việc thêm các tiền tố dầu gạch dưới không thực sự làm chúng trở thành riêng tư, và bấy kỳ thuộc tính (có hoặc không có tiền tố gạch chân dưới) nên được sử dụng một cách công khai. Xem thêm tại [#1024](https://github.com/airbnb/javascript/issues/1024), và [#490 (https://github.com/airbnb/javascript/issues/490) để hiểu chi tiết hơn.

    ```jsx
    // bad
    React.createClass({
      _onClickSubmit() {
        // do stuff
      },

      // other stuff
    });

    // good
    class extends React.Component {
      onClickSubmit() {
        // do stuff
      }

      // other stuff
    }
    ```

  - Đảm bảo rằng có trả về giá trị trong phương thức `render`. eslint: [`react/require-render-return`](https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/require-render-return.md)

    ```jsx
    // bad
    render() {
      (<div />);
    }

    // good
    render() {
      return (<div />);
    }
    ```

## Thứ tự phương thức

  - Thứ tự cho `class extends React.Component`:

  1. Phương thức tùy chọn `static`
  1. `constructor`
  1. `getChildContext`
  1. `componentWillMount`
  1. `componentDidMount`
  1. `componentWillReceiveProps`
  1. `shouldComponentUpdate`
  1. `componentWillUpdate`
  1. `componentDidUpdate`
  1. `componentWillUnmount`
  1. *clickHandlers hoặc eventHandlers* như `onClickSubmit()` hoặc `onChangeDescription()`
  1. *các phương thức get cho `render`* như `getSelectReason()` hoặc `getFooterContent()`
  1. *các phương thức render tùy chọn* like `renderNavigation()` hoặc `renderProfilePicture()`
  1. `render`

  - Cách định nghĩa `propTypes`, `defaultProps`, `contextTypes`,...

    ```jsx
    import React, { PropTypes } from 'react';

    const propTypes = {
      id: PropTypes.number.isRequired,
      url: PropTypes.string.isRequired,
      text: PropTypes.string,
    };

    const defaultProps = {
      text: 'Hello World',
    };

    class Link extends React.Component {
      static methodsAreOk() {
        return true;
      }

      render() {
        return <a href={this.props.url} data-id={this.props.id}>{this.props.text}</a>
      }
    }

    Link.propTypes = propTypes;
    Link.defaultProps = defaultProps;

    export default Link;
    ```

  - Thứ tự cho `React.createClass`: eslint: [`react/sort-comp`](https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/sort-comp.md)

  1. `displayName`
  1. `propTypes`
  1. `contextTypes`
  1. `childContextTypes`
  1. `mixins`
  1. `statics`
  1. `defaultProps`
  1. `getDefaultProps`
  1. `getInitialState`
  1. `getChildContext`
  1. `componentWillMount`
  1. `componentDidMount`
  1. `componentWillReceiveProps`
  1. `shouldComponentUpdate`
  1. `componentWillUpdate`
  1. `componentDidUpdate`
  1. `componentWillUnmount`
  1. *clickHandlers hoặc eventHandlers* như `onClickSubmit()` hoặc `onChangeDescription()`
  1. *các phương thức get cho `render`* như `getSelectReason()` hoặc `getFooterContent()`
  1. *các phương thức render tùy chọn* like `renderNavigation()` hoặc `renderProfilePicture()`
  1. `render`

## `isMounted`

  - Không sử dụng `isMounted`. eslint: [`react/no-is-mounted`](https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/no-is-mounted.md)

  > Tại sao? [`isMounted` không tuân theo mẫu][anti-pattern], nó không được sử dụng khi dùng các lớp ES6, và đang trong quá trình chính thức bị bác bỏ.

  [anti-pattern]: https://facebook.github.io/react/blog/2015/12/16/ismounted-antipattern.html

## Các bản dịch

  Tài liệu JSX/React style guide này cũng đã được dịch ở cho các ngôn ngữ khác:

  - ![cn](https://raw.githubusercontent.com/gosquared/flags/master/flags/flags/shiny/24/China.png) **Chinese (Simplified)**: [JasonBoy/javascript](https://github.com/JasonBoy/javascript/tree/master/react)
  - ![pl](https://raw.githubusercontent.com/gosquared/flags/master/flags/flags/shiny/24/Poland.png) **Polish**: [pietraszekl/javascript](https://github.com/pietraszekl/javascript/tree/master/react)
  - ![kr](https://raw.githubusercontent.com/gosquared/flags/master/flags/flags/shiny/24/South-Korea.png) **Korean**: [apple77y/javascript](https://github.com/apple77y/javascript/tree/master/react)
  - ![Br](https://raw.githubusercontent.com/gosquared/flags/master/flags/flags/shiny/24/Brazil.png) **Portuguese**: [ronal2do/javascript](https://github.com/ronal2do/airbnb-react-styleguide)
  - ![jp](https://raw.githubusercontent.com/gosquared/flags/master/flags/flags/shiny/24/Japan.png) **Japanese**: [mitsuruog/javascript-style-guide](https://github.com/mitsuruog/javascript-style-guide/tree/master/react)

**[⬆ quay trở lại đầu trang](#nội-dung)**
