# Báo cáo bài tập tuần 5

## Mô tả
- Chương trình viết bằng java với maven.
- Giải thuật tìm kiếm các hàng xóm gần nhất. (Nearest Neighbour Clustering)

## Hàm cần kiểm thử
```java
public static List<Point> neigbors(Point p, int w, int h) 
	{
			
	List<Point> res = new ArrayList<Point>();

	int cx = 7, cy = 7;

	int dx = -cx, dy = -cy;

	while(dx<=cx) {
		dy = -cy;
		while(dy<=cy) {
			int x = p.x + dx;
			int y = p.y + dy;

			if(dx==0 && dy==0 || x<0 || y<0 || x>=w || y>=h) {
				dy++;
				continue;
			}
			else {
				res.add(new Point(x, y));
				dy++;
			}

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
```java
public void testApp()
    throws Exception {
    	
    	assertTrue(NearestNeighbourClustering.neigbors(new Point(0, 0), 100, 100).size() > 0);
    	assertTrue(NearestNeighbourClustering.neigbors(new Point(100, 0), 100, 100).size() > 0);
    	assertTrue(NearestNeighbourClustering.neigbors(new Point(0, 100), 100, 100).size() > 0);
    	assertTrue(NearestNeighbourClustering.neigbors(new Point(100, 100), 100, 100).size() > 0);
    	assertTrue(NearestNeighbourClustering.neigbors(new Point(50, 50), 100, 100).size() > 0);
    	
    }
```


## Đo mức độ bao phủ
 - Kết quả:
 ![test-coverage-3](https://github.com/ducanhk58uet/int3117-2016/blob/master/LeDucAnh/BT2/NearestNeighbourClustering/screenshots/test_coverage_3.PNG)
