# Báo cáo bài tập tuần 5

## Mô tả
- Chương trình viết bằng java với maven.
- Giải thuật tìm các hàng xóm gần nhất trong việc xử lý điểm ảnh. (Nearest Neighbour Clustering)

## Hàm cần kiểm thử
```java
public static List<Point> neigbors(File f, Point p) 
	throws Exception {
		
		if(!getFileExtension(f).contains("png") || !getFileExtension(f).contains("jpg"))
			return null;
		else {
			BufferedImage img = ImageIO.read(f);
			
			List<Point> res = new ArrayList<Point>();
			
			int cx = 7, cy = 7;
			
			int dx = -cx, dy = -cy;
			
			while(dx<=cx) {
				while(dy<=cy) {
          int x = p.x + dx;
					int y = p.y + dy;
					if(dx==0 && dy==0 || x<0 || y<0 || x>=img.getWidth() || y>=img.getHeight() || img.getRGB(x, y) == Color.white.getRGB()) continue;
					else {					
							res.add(new Point(x, y));
					}
					dy++;
				}
				dx++;
			}
			
			return res;
		}
	}
```
Biểu thức Branch = 
```java (dx==0 && dy==0 || x<0 || y<0 || x>=img.getWidth() || y>=img.getHeight() || img.getRGB(x, y) == Color.white.getRGB())```



## Áp dụng tiêu chuẩn MCDC, ta có bảng sau:
#       | dx = 0 | dy = 0 | x < 0 | y < 0 | x>=img.getWidth() | y>=img.getHeight() | Màu trắng | Branch1
-------- |------|------|-----| ----|---------------|------------------|---------| -------
1.       |T       |T       | T     | T     | F                 |F                   |T          | F
2.       |T       |T       | F     | T     | T                 |F                   |T          | F
3.       |T       |T       | T     | F     | F                 |T                   |T          | F       
4.       |T       |T       | T     | T     | F                 |F                   |F          | F
5.       |F       |F       | T     | T     | F                 |F                   |T          | F       
6.       |F       |F       | F     | T     | T                 |F                   |T          | F
7.       |F       |F       | T     | F     | F                 |T                   |T          | F
8.       |F       |F       | T     | T     | F                 |F                   |F          | F
9.       |F       |F       | F     | F     | F                 |F                   |F          | T


## Unit tests cho các ca kiểm thử đã tính trên

## Đo mức độ bao phủ
