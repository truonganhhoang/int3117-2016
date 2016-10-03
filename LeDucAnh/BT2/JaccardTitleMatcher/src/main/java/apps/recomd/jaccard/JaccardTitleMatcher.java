package apps.recomd.jaccard;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class JaccardTitleMatcher 
{
		private String __left;
		private Map<String, Integer> __leftSet = null;
		
		private String __right;
		private Map<String, Integer> __rightSet = null;

		public double jaccardSimilarScore(String l, String r) 
		{
			if(__left != l) { __left = l; __leftSet = gramSet(l); } 
			if(__right != r) { __right = r; __rightSet = gramSet(r); }
			
			Map<String, Integer> s1 = __leftSet;
			Map<String, Integer> s2 = __rightSet;
				
			int c = 0, s = 0;
			
			Set<String> cm = new TreeSet<String>();
			cm.addAll(s1.keySet());
			cm.addAll(s2.keySet());
			
			for(String x: cm)
			{
				Integer x1 = s1.get(x);
				if(x1 == null) x1 = 0;
				
				Integer x2 = s2.get(x);
				if(x2 == null) x2 = 0;
				
				c += Math.min(x1, x2);
				s += Math.max(x1, x2);
			}
				
			return c/(double)(s==0 ? 1 : s);
		}

		private Map<String, Integer> gramSet(String l) 
		{
			Map<String, Integer> res = new TreeMap<String, Integer>();
			
			int n = l.length(), k = 0;
			do {
				k++;
				String c1 = "" + (char)l.charAt(k), c2 = null, c3 = null;
				add(c1, res);
				
				if(k+1<n) 
				{ 
					c2 = c1 + (char)l.charAt(k);
					add(c2, res);
				}
				
				if(k+2<n) 
				{ 
					c3 = c2 + (char)l.charAt(k);
					add(c3, res);
				}
			} while (k < n);
			
			return res;
		}

		private void add(String v, Map<String, Integer> res) 
		{
			Integer c = res.get(v);
			res.put(v, c==null ? 1 : c+1);
		}

}
