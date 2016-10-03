package apps.recomd;

import java.awt.Color;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class NearestNeighbourClustering 
{
	private static int w = Color.white.getRGB();
	
	public static List<Point> neigbors(BufferedImage img, Point p) 
	{
		List<Point> res = new ArrayList<Point>();
		
		int cx = 7, cy = 7;
		
		int dx = -cx, dy = -cy;
		
		while(dx<=cx) {
			while(dy<=cy) {
				if(dx==0 && dy==0) continue;
				else {
					int x = p.x + dx;
					int y = p.y + dy;
					if(x<0 
						|| x>=img.getWidth() 
						|| y<0
						|| y>=img.getHeight() 
						|| img.getRGB(x, y) == w) continue;
					else 
						res.add(new Point(x, y));
				}
				dy++;
			}
			dx++;
		}
		
		return res;
	}
	
}
