# Demo Nightwatchjs (ngày 25/10/2016)

## Cài đặt thư viện

Tải các thư viện dưới đây và để vào thư mục `bin/` tại thư mục gốc của project. 

### Tải selenium server
- [Tải bản 2.53 tại đây](http://selenium-release.storage.googleapis.com/index.html)

### Tải các browser driver
- [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/downloads)
- [GeckoDriver (cho Firefox)](https://github.com/mozilla/geckodriver/releases)
- [MicrosoftWebDriver (cho Edge)](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver)

## Tạo các ca kiểm thử và chạy thử
- Tạo file `nightwatch.json`
    ```json
    {
    "src_folders" : ["tests"],
    "output_folder" : "reports",
    "custom_commands_path" : "",
    "custom_assertions_path" : "",
    "page_objects_path" : "",
    "globals_path" : "",

    "selenium" : {
        "start_process" : true,
        "server_path" : "bin/selenium-server-standalone-2.53.1.jar",
        "log_path" : "",
        "port" : 4444,
        "cli_args" : {
        "webdriver.chrome.driver" : "bin/chromedriver",
        "webdriver.gecko.driver" : "bin/geckodriver",
        "webdriver.edge.driver" : "bin/MicrosoftWebDriver.exe"
        }
    },
    
    "test_workers": true,

    "test_settings" : {
        "default" : {
        "launch_url" : "http://localhost",
        "selenium_port"  : 4444,
        "selenium_host"  : "localhost",
        "silent": true,
        "screenshots" : {
            "enabled" : true,
            "path" : "screenshots"
        },
        "desiredCapabilities": {
            "browserName": "firefox",
            "marionette": true
        }
        },

        "chrome" : {
        "desiredCapabilities": {
            "browserName": "chrome"
        }
        },

        "edge" : {
        "desiredCapabilities": {
            "browserName": "MicrosoftEdge"
        }
        }
    }
    }
    ```
- Tạo các ca kiểm thử: tạo file `tests/googleTest.js`:
    ```javascript
    module.exports = {
        'step one' : function (browser) {
            browser
            .url('http://www.google.com')
            .waitForElementVisible('body', 1000)
            .setValue('input[type=text]', 'nightwatch')
            .waitForElementVisible('button[name=btnG]', 1000)
        },

        'step two' : function (browser) {
            browser
            .click('button[name=btnG]')
            .pause(1000)
            .assert.containsText('#main', 'Night Watch')
            .end();
        }
    };
    ```
- Chạy kiểm thử bằng câu lệnh: `nightwatch`

- Tính năng nâng cao:
  + Test reports
  + Chụp ảnh màn hình nếu có lỗi
  + Kiểm thử theo nhóm, theo tag
  + Kiểm thử trên nhiều trình duyệt
  + Kiểm thử song song