# Đồ thị luồng

![flowchart](https://github.com/longdt03/int3117-2016/blob/master/VuTrungKien/BT2/screenshots/flowchart.png)

# Phân tích

Dựa vào đồ thị luồng (flowchart) ta xác định được có quyết định (decision) trong chương trình.
Trong đó có một quyết định chứa 3 điều kiện (condition) thành phần.
Quyết định là đối tượng quan tâm chính khi áp dụng chuẩn MCDC. Ta có bảng chân lý cho quyết định này:

| No.       | is_crazy_level_positive | is_crazy_level_even | is_crazy_level_normal | Outcome |
|-----------|-------------------------|---------------------|-----------------------|---------|
| 1         | T                       | T                   | T                     | T       |
| 2         | T                       | T                   | F                     | F       |
| 3         | T                       | F                   | T                     | T       |
| 4         | T                       | F                   | F                     | F       |
| 5         | F                       | T                   | T                     | T       |
| 6         | F                       | T                   | F                     | F       |
| 7         | F                       | F                   | T                     | T       |
| 8         | F                       | F                   | F                     | F       |

Từ bảng xác định được 3 trường hợp 1, 4, và 6 là đủ để bao phủ các cách kết hợp theo MCDC.
Để thỏa mãn MCDC, ta cần phải bao phủ hết các nhánh điều kiện.
Dựa vào chương trình ta có thể xác định được các ca kiểm thử cần phải có như sau để thỏa mãn MCDC:

# Các ca kiểm thử

| Test Case | x | y  | crazy_level | Expected Output |
|-----------|---|----|-------------|-----------------|
| TC1       | 1 | 23 | 8000        | False           |
| TC2       | 1 | 23 | 9999        | True            |
| TC3       | 1 | 23 | -1111       | False           |
| TC4       | 1 | 1  | 1           | False           |

# Đo độ bao phủ

![test_coverage](https://github.com/longdt03/int3117-2016/blob/master/VuTrungKien/BT2/screenshots/test_coverage.png)