# Bài tập tuần 4
* Độ bao phủ: Sử dụng EclEmma Java Code Coverage 2.3.3 (Eclipse Tools)
- Kết quả:
 - Test coverage detail
![test-coverage-1](https://github.com/ducanhk58uet/int3117-2016/blob/master/LeDucAnh/BT1/JaccardEngine/screenshots/test_coverage_1.PNG)
 - Test coverage in code
![test-coverage-2](https://github.com/ducanhk58uet/int3117-2016/blob/master/LeDucAnh/BT1/JaccardEngine/screenshots/test_coverage_2.PNG)

* Vẽ đồ thị chương trình cho chương trình BT1:
- Sử dụng google draw.io tự vẽ tay sơ đồ khối:
![flow-chart](https://github.com/ducanhk58uet/int3117-2016/blob/master/LeDucAnh/BT1/JaccardEngine/screenshots/flowchart.PNG)

# Bài tập tuần 3

# Bài tập tuần 1:
- Chương trình java với maven, sử dụng JUnit Test.

## Mô tả:
- Chương trình tính hệ số độ tương tự giữa 2 văn bản (Jaccard Index).
- Tham khảo tại: https://en.wikipedia.org/wiki/Jaccard_index

## Phân tích
- Hàm so sánh độ tương tự của 2 văn bản. Do vậy độ đo tương tự Jaccard Index sẽ nằm trong đoạn [0, 1]
- Các trường hợp kiểm thử cho 2 biên trên sẽ là
 + 2 văn bản y hệt như nhau
 + 2 văn bản gần giống nhau
 + 2 văn bản khác hoàn toàn nhau
