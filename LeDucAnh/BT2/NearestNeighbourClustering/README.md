# Báo cáo bài tập tuần 5

## Mô tả
- Chương trình viết bằng java với maven.
- Giải thuật tìm các hàng xóm gần nhất trong việc xử lý điểm ảnh. (Nearest Neighbour Clustering)

## Hàm cần kiểm thử
```java
public static List<Point> neigbors(Point p, int w, int h) 
	throws Exception {
			
			List<Point> res = new ArrayList<Point>();
			
			int cx = 7, cy = 7;
			
			int dx = -cx, dy = -cy;
			
			while(dx<=cx) {
				while(dy<=cy) {
					int x = p.x + dx;
					int y = p.y + dy;
					if(dx==0 && dy==0 || x<0 || y<0 || w>=w || y>=h) continue;
					else 
						res.add(new Point(x, y));
					dy++;
				}
				dx++;
			}
			
			return res;
		}
```
Biểu thức Branch = 
```(dx==0 && dy==0 || x<0 || y<0 || w>=w || y>=h)```



## Áp dụng tiêu chuẩn MCDC, ta có bảng sau:
\#       | dx = 0 | dy = 0 | x < 0 | y < 0 | x>=w | y>=h  | Branch1
-------- |------|------|-----| ----|---------------|------------------| -------
1.       |T       |T       | T     | T     | F                 |F                   | F
2.       |T       |T       | F     | T     | T                 |F                   | F
3.       |T       |T       | T     | F     | F                 |T                   | F       
4.       |T       |T       | T     | T     | F                 |F                   | F
5.       |F       |F       | F     | F     | F                 |F                   | T


## Unit tests cho các ca kiểm thử đã tính trên

## Đo mức độ bao phủ
