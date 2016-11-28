Ở bài viết này, tôi giả định bạn đã có những ý niệm về coding-style của JavaScript trước rồi. Vì thế, tôi sẽ tập trung vào Node, những điều mà tôi cảm thấy quan trọng

###Dàn ý:
  1. [Tránh xa 'this' và 'new'](#1-tránh-xa-this-và-new)
  2. [Phân chia thành nhiều hàm nhỏ](#2-phân-chia-thành-nhiều-hàm-nhỏ)
  3. [Nhất quán khi viết hàm bất đồng bộ](#3-nhất-quán-khi-viết-hàm-bất-đồng-bộ)
  4. [Luôn luôn kiểm tra lỗi trong hàm callbacks](#4-luôn-luôn-kiểm-tra-lỗi-trong-hàm-callbacks)
  5. [Trả về callbacks](#5-trả-về-callbacks)
  6. [Chỉ ném ngoại lệ (throw error) trong hàm đồng bộ (synchronous functions)](#6-chỉ-ném-ngoại-lệ-throw-error-trong-hàm-đồng-bộ-synchronous-functions)
  7. [Bắt lỗi trong lời gọi đồng bộ](#7-bắt-lỗi-trong-lời-gọi-đồng-bộ)
  8. [Gắn bó với chuẩn callback](#8-gắn-bó-với-chuẩn-callback)



##1. Tránh xa 'this' và 'new'
Vì lập trình với Node không tránh khỏi việc phải thực hiện nhiều callbacks lồng nhau, hàm này gọi hàm kia theo quan hệ phân cấp; bạn nên đảm bảo rằng các hàm dễ dàng được sử dụng khi được đặt vào những ngữ cảnh khác nhau. 

```
// ví dụ sử dụng prototypes và 'this'

function DB(url) {
    this.url = url;
}

DB.prototype.info = function (callback) {
    http.get(this.url + '/info', callback);
};

async.parallel([
    function (cb) {
        new DB('http://foo').info(cb);
    },
    function (cb) {
        new DB('http://bar').info(cb);
    }
], ...);


// tương tự với sử dụng closures

function DB(url) {
    return { info: async.apply(http.get, url + '/info') };
}

async.parallel([
    DB('http://foo').info,
    DB('http://bar').info
], ...);


// làm cho các đối số trở nên rõ ràng

var dbInfo = function (url, callback) {
    http.get(url + '/info', callback);
};

async.map(['http://foo', 'http://bar'], dbInfo, ...);
```

Ở style cuối, các đối số truyền vào hàm trở nên rõ ràng, việc thực hiện lời gọi hàm khiến các đối số được sử lí giống nhau (vì được thực hiện cùng 1 hàm). Tách hàm khiến lập trình đơn giản hơn và việc sử dụng lại hàm hiệu quả hơn, các dòng mã sẽ ít hơn





##2. Phân chia thành nhiều hàm nhỏ
Trước khi bắt đầu làm việc với những thư viện kiểm soát luồng hoạt động như async, hẳn là bạn đã gặp tình trạng 'callback hell' (các hàm gọi lồng nhau quá nhiều)

```
// callback hell

function convertJsonToCsv(filename, target, callback) {
    readFile(filename, function (err, content) {
        if (err) {
            return callback(err);
        }
        parseJson(content, function (err, data) {
            if (err) {
                return callback(err);
            }
            convertToCsv(data, function (err, csv) {
                if (err) {
                    return callback(err);
                }
                writeFile(target, csv, callback);
            });
        });
    });
}


// viết lại thành các hàm nhỏ hơn

function convertJsonToCsv(filename, target, callback) {
    readJsonFile(filename, function (err, data) {
        if (err) {
            return callback(err);
        }
        writeCsvFile(target, data, callback);
    });
}

function readJsonFile(filename, callback) {
    readFile(filename, function (err, content) {
        if (err) {
            return callback(err);
        }
        parseJson(content, callback);
    });
}

function writeCsvFile(target, data, callback) {
    convertToCsv(data, function (err, csv) {
        if (err) {
            return callback(err);
        }
        writeFile(target, csv, callback);
    });
}
```

Tôi khuyên bạn nên giữ các hàm của mình ở 2 hoạt động bất đồng bộ tại cùng một thời điểm, như ví dụ ở trên, hoặc một hoạt động trong một danh sách (sử dụng async.map hoặc thư viện khác cung cấp hàm tương tự). Ngoài ra, những hàm nhỏ sẽ dễ dàng hơn khi kết hợp chúng với nhau hoặc sử dụng lại

Tất nhiên, bạn có thể làm sạch mã mình viết bằng việc sử dụng những thư viện cung cấp luồng điều khiển bất đồng bộ (như async). Nhưng điều đầu tiên phải làm là cho chúng dễ đọc trước.





##3. Nhất quán khi viết hàm bất đồng bộ

Để giữ cho mã của bạn nhất quán, các hàm nên được viết luôn luôn theo 1 cơ chế: luôn BẤT ĐỒNG BỘ hoặc luôn ĐỒNG BỘ 
Xem xét mã dưới đây:

```
var CACHE = {};

function getRecord(id, callback) {
    if (CACHE[id]) {
        return CACHE[id];
    }
    http.get('http://foo/' + id, callback);
}
```

Sẽ rất dễ bỏ qua cached và đoạn mã sẽ không bao giờ chạy khi có người sử dụng hàm getRecord như này:

```
function getMyRecord(user, callback) {
    getRecord('record-' + user.id, callback);
}
```

Sau lần đầu tiên thực hiện việc gọi hàm thành công, các lần sau sẽ không bao giờ gọi callback (bởi vì getRecord đã thực hiện việc gọi cached)

Một cách viết khác của hàm trên:
```
function getMyRecord(user, callback) {
    var r = getRecord('record-' + user.id, function (err, record) {
        if (record) {
            record.got = true;
        }
        return callback(err, record);
    });
    if (r) {
        r.got = true;
    }
    return r;
}
```

Đoạn mã như này rất khó để suy đoán. Để sử dụng hàm này, bạn phải viết mã trong hàm callback của getRecord, và cho giá trị trả về (trong trường hợp nó là đồng bộ). Và bạn phải làm việc tương tự bất cứ khi nào bạn gọi getMyRecord. Việc này rất dễ trở nên cồng kềnh và rối rắm
Cách đúng đắn để sử lí là sử dụng process.nextTick để gọi bất đồng bộ hàm getRecord trong khi nó vẫn trả lại kết quả cached

```
var CACHE = {};

function getRecord(id, callback) {
    if (CACHE[id]) {
        return process.nextTick(function () {
            return callback(null, CACHE[id]);
        });
    }
    http.get('http://foo/' + id, callback);
}
```

Và bây giờ ta chỉ việc xem xét khi gọi lại bất đồng bộ và đoạn mã trở nên dễ xử lí hơn rất nhiều.






##4. Luôn luôn kiểm tra lỗi trong hàm callbacks

Bỏ sót việc kiểm tra lỗi trong hàm callback là lỗi phổ biến khiến việc debug trở nên rất rối rắm. Vấn đề là ở chỗ chương trình vẫn thực thi khi một hàm gọi lại nào đó trả lại một lỗi và chính lỗi đó lại gây nên lỗi ở một chỗ khác trong chương trình. Bạn sẽ mất nhiều công để dò được lỗi đó và thường thì bạn sẽ phải dò nó từ điểm ban đầu khi chạy chương trình

Bỏ sót việc kiểm tra lỗi trong hàm callback nên được coi là một lỗi khi lập trình Node. Tôi khuyên các bạn hãy coi việc này là một công đoạn trong quá trình viết mã bởi vì nó rất hay bị bỏ quên

```
// sai!

function writeCsvFile(target, data, callback) {
    convertToCsv(data, function (err, csv) {
        writeFile(target, csv, callback);
    });
}


// đúng

function writeCsvFile(target, data, callback) {
    convertToCsv(data, function (err, csv) {
        if (err) {
            return callback(err);
        }
        writeFile(target, csv, callback);
    });
}
```

Nếu bạn muốn giảm thiểu số dòng mã, bạn có thể viết khối if trong một dòng khi kiểm tra err:
```
if (err) return callback(err);
```

Tùy việc phong cách viết mã mà bạn thích, nhưng phải nhất quán, bởi vì những phần nhỏ trong mã của bạn có thể dễ dàng nhận ra và cảnh báo khi nó bị thiếu sót.




##5. Trả về callbacks

Hàm callback thường là điều cuối cùng được gọi ở trong một hàm nào đó. Bạn có thể xem xét thực hiện việc gọi đồng bộ với câu lệnh return (tất nhiên là tùy vào ngữ cảnh và mục đích mà các dòng mã còn lại bạn có muốn chạy tiếp khi gọi callback hay không)
```
// sai!

function writeCsvFile(target, data, callback) {
    convertToCsv(data, function (err, csv) {
        if (err) {
            callback(err); // oops! không có return
        }
        // this line gets called even when theres an error
        writeFile(target, csv, callback);
    });
}


// đúng

function writeCsvFile(target, data, callback) {
    convertToCsv(data, function (err, csv) {
        if (err) {
            return callback(err); // hàm dừng lại ở đây
        }
        writeFile(target, csv, callback);
    });
}
```




##6. Chỉ ném ngoại lệ (throw error) trong hàm đồng bộ (synchronous functions)

Thật không may, bạn không thể sử dụng khối try-catch xung quanh những hàm đồng bộ (synchronous functions). Điều đó còn có nghĩa rằng bạn ném ngoại lệ sẽ không thể bắt được và xử lí nó; Điều này sẽ khiến toàn bộ server của bạn sập.

Luôn luôn truyền lỗi về cho hàm callback khi thực hiện gọi hàm bất đồng bộ

```
// sai!

function getRecord(id, callback) {
    http.get('http://foo/' + id, function (err, doc) {
        if (err) {
            return callback(err);
        }
        if (doc.deleted) {
            // không thể bắt bởi hàm gọi getRecord
            throw new Error('Record has been deleted');
        }
        return callback(null, doc);
    });
}


// đúng

function getRecord(id, callback) {
    http.get('http://foo/' + id, function (err, doc) {
        if (err) {
            return callback(err);
        }
        if (doc.deleted) {
            return callback(new Error('Record has been deleted'));
        }
        return callback(null, doc);
    });
}
```




##7. Bắt lỗi trong lời gọi đồng bộ

Điều này về cơ bản là giống quy tắc trước đó. Nếu bạn đang gọi một hàm đồng bộ mà có thể ném một ngoại lệ, bên trong mã bất đồng bộ, rồi gọi hàm bất đồng bộ cũng có thể dẫn tới ngoại lệ.

ví dụ:

```
// sai!

function readJson(filename, callback) {
    fs.readFile(filename, function (err, content) {
        if (err) {
            return callback(err);
        }

        // uh-oh! dòng này có thể ném ra ngoại lệ nếu content không phù hợp với định dạng JSON
        var data = JSON.parse(content.toString());

        return callback(null, data);
    });
}


// đúng

function readJson(filename, callback) {
    fs.readFile(filename, function (err, content) {
        if (err) {
            return callback(err);
        }
        try {
            var data = JSON.parse(content.toString());
        }
        catch (e) {
            return callback(e);
        }
        return callback(null, data);
    });
}
```





##8. Gắn bó với chuẩn callback

Tồn tại một số chiến lược khác khi sử lí mã bất đồng bộ. Một vài nơi cung cấp những kiểu chặn (blocking-style) APIs. Trong khi nhiều người hứng thú và bạn đang hạnh phúc với việc sử dụng promise hoặc fibers trong đội phát triển Node, hãy xem xét việc sử dụng Node-style callback; với việc gọi callback ở đối số cuối cùng và đối số đầu tiên truyền vào callback là một error

Phần lớn các nhà phát triển Node đồng thuận với các điều này. Nếu bạn mong đợi các nhà phát triển khác gắn bó với các module của bạn, thì bạn nên xem xét sử dụng những chuẩn coding-style như này

[Bài viết gốc](https://caolan.org/posts/nodejs_style_and_structure.html)


