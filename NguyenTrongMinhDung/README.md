# Maven
Using JUnit to test

## Tiến lên kiểu Miền Nam
### Ở trong project này chỉ đặc tả một số thành phần:
 * Bộ bài: Pack
 * Quân bài: CommonCard
 * Tập các quân bài: SetOfCards

#### Quân bài gồm có các thành phần:
 * Số: (được ký hiệu bởi 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A, 2)
 * Chất: Rô (diamonds), Cơ (hearts), Bích (spades), Nhép (clubs)

**Tính chất:**
 * Mỗi quân bài có một cấp (level) khác nhau tương ứng với độ mạnh yếu đơn lẻ của quân bài đó

 * Cấp quân bài được quy định tăng dần về
    * Số theo thứ tự 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A, 2 (cùng chất)
    * Chất theo thứ tự Bích, Nhép, Rô, Cơ (cùng số)

 * Cấp của quân bài được so sánh dựa trên số trước rồi mới dựa vào chất (ví dụ con 5 Nhép mạnh hơn 4 Cơ)

#### Bộ bài gồm có 52 quân bài chia làm 4 bộ con: Rô, Cơ, Bích, Nhép, mỗi bộ con bao gồm 13 quân bài

#### Tập các quân bài: gồm các quân bài (có thể rỗng).
 1. Tính chất:
   **Tập các quân bài chỉ có thể thuộc 1 trong số các loại sau:**
    * Loại 1: Bộ 1 quân bài
    * Loại 2: Bộ đôi (gồm 2 quân bài có cùng số)
    * Loại 3: Bộ ba (gồm 3 quân bài có cùng số)
    * Loại 4: Bộ tứ quý (gồm 4 quân bài có cùng số)
    * Loại 5: Bộ dây (gồm từ 3 quân bài trở lên có số hợp thành các số liên tiếp nhau theo thứ tự từ 3 -> 2 kể trên)
    * Loại 6: Bộ thông (gồm 6 quân bài trong đó chia làm 3 bộ con, mỗi bộ 2 quân bài giống nhau về số)
   
   Tập các quân bài hợp lệ được đánh bởi mỗi người chơi khi thỏa mãn một trong các điều kiện sau:
    * Có ít nhất 1 quân bài trở lên
    * Nếu có nhiều hơn 1 quân bài, phải thuộc 1 trong số loại tập quân bài kể trên
    * Mạnh hơn tập quân bài hiện có trên bàn nếu vẫn còn lượt đánh

 2. Cấp độ của tập các quân bài
    * Cấp tập quân bài thường có thể so sánh được cấp độ khi chúng cùng loại với nhau.
      * Trường hợp ngoại lệ:
        * Bộ loại 4, 5 (gồm từ 5 quân bài trở lên), 6: đều có thể ra bài sau bộ loại 1 có quân bài số 2 (bất kể là chất gì).
	* Còn lại là không hợp lệ

    * Trong trường hợp các tập quân bài cùng loại, độ mạnh được quyết định bởi quân bài có cấp cao nhất trong các tập quân bài ấy
    (ví dụ: bộ (3 Cơ, 4 Bích, 5 Nhép) yếu hơn bộ (4 Cơ, 5 Bích, 6 Rô) do quân 5 Nhép (cấp lớn nhất bộ 1) yếu hơn quân 6 Rô (cấp lớn nhất bộ 2))
