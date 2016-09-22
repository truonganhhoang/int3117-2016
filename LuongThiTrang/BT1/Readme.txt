Bài toán: Kiểm tra một số có phải là số nguyên tố không.
Định nghĩa số nguyên tố: Số nguyên tố là một số chỉ chia hết cho 1 và chính nó. 

Input: Một số tự nhiên
Output: - Trả về giá trị là True nếu là số nguyên tố.
	- Trả về giá trị là False nếu không là số nguyên tố.

Ki thuật kiểm thử được áp dụng: Phân vùng tương đương

Lí do sử dụng: 
              Bài toàn Kiểm tra một số có phải là số nguyên tố hay không  là bài toán khá đơn giản. 
	      Sử dụng kĩ thuật phân vùng tương đương là hợp lí nhất. 
              Vì nếu sử dụng bảng quyết định sẽ rất khó để giải quyết bài toán. 
              Bài toán này không đưa ra một giá trị đầu vào cụ thể nên không thể áp dụng kĩ thuật phân tích giá trị biên.
Cách làm: 
	Chia thành 2 miền tương đương
	M1: miền giá trị nhỏ hơn 2 (ví dụ: 1)
        M2: miền giá trị từ 2 -> vô cùng: chọn 2 giá trị (Ví dụ: 6, 7)
Ta có các testcase:
1. Testcase 1: {Input: 1, Output: False}
2. Testcase 2: {Input: 6, Output: False}
3. Testcase 3: {Input: 7, Output: True}