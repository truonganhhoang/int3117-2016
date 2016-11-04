package apps.recomd;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class NearestNeighbourClustering 
{
	public static void main(String[] args)
	{
	}
	
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
	
}
